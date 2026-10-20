import java.util.Scanner;
import java.util.stream.IntStream;

public class Main
{
    // global scanner
    final private static Scanner INPUT = new Scanner(System.in);

    // base multipliers
    final private static double LV2_MULTIPLIER = 0.6; // 40% damage reduction
    final private static double LV3_MULTIPLIER = 0.45; // 55% damage reduction

    // number simulation targets --> higher = better accuracy
    final private static int TARGET_COUNT = 1_000_000;

    public static void main(String[] args)
    {
        // information for new users
        System.out.println();
        System.out.println("The following are weapon type abbreviations:");
        System.out.println("AR  -- Assault Rifle");
        System.out.println("DMR -- Designated Marksman Rifle");
        System.out.println("SMG -- Sub Machine Gun");
        System.out.println("LMG -- Light Machine Gun");
        System.out.println("P   -- Pistol");

        boolean repeat = true;
        while (repeat)
        {
            // sets up damage multipliers, then calls calculate() for each health and armor variation
            // to determine the average time to kill of the weapon
            // and finally asks the user if they want to calculate another weapon's damage
            Weapon gun = askInput();

            // initialize calculations
            double AVG_TTK =
            (
                calculate(gun, 100, LV2_MULTIPLIER, LV2_MULTIPLIER, TARGET_COUNT) + // lv2Helmet_lv2Vest_100
                calculate(gun, 100, LV2_MULTIPLIER, LV3_MULTIPLIER, TARGET_COUNT) + // lv2Helmet_lv3Vest_100
                calculate(gun, 100, LV3_MULTIPLIER, LV2_MULTIPLIER, TARGET_COUNT) + // lv3Helmet_lv2Vest_100
                calculate(gun, 100, LV3_MULTIPLIER, LV3_MULTIPLIER, TARGET_COUNT) + // lv3Helmet_lv3Vest_100
                calculate(gun, 75, LV2_MULTIPLIER, LV2_MULTIPLIER, TARGET_COUNT) + // lv2Helmet_lv2Vest_75
                calculate(gun, 75, LV2_MULTIPLIER, LV3_MULTIPLIER, TARGET_COUNT) + // lv2Helmet_lv3Vest_75
                calculate(gun, 75, LV3_MULTIPLIER, LV2_MULTIPLIER, TARGET_COUNT) + // lv3Helmet_lv2Vest_75
                calculate(gun, 75, LV3_MULTIPLIER, LV3_MULTIPLIER, TARGET_COUNT) // lv3Helmet_lv3Vest_75
            ) / 8; // there are 8 variations

            System.out.printf("Average TTK  : %.3f\n", AVG_TTK); // only leave 3 decimals places
            System.out.printf("Damage Score : %d\n", Math.round(1/AVG_TTK*100));

            System.out.println("Type anything to continue, or EXIT to terminate the program.");
            repeat = !INPUT.nextLine().equalsIgnoreCase("Exit");
        }
        INPUT.close();
    }

    public static Weapon askInput()
    {
        System.out.println(); // skip a line
        System.out.println("Please enter the following values");

        System.out.print("Base damage             : ");
        while (!INPUT.hasNextInt())
        {
            System.out.println("Please enter a valid number...");
            INPUT.next();
        }
        int damage = INPUT.nextInt();
        INPUT.nextLine(); // consume the new line

        System.out.print("Time between shots (s)  : ");
        while (!INPUT.hasNextDouble())
        {
            System.out.println("Please enter a valid number...");
            INPUT.next();
        }
        double fireRate = INPUT.nextDouble();
        INPUT.nextLine();

        WeaponType weaponType;
        while (true)
        {
            System.out.print("Abbreviated weapon type : ");
            String input = INPUT.nextLine().toUpperCase();
            try
            {
                weaponType = WeaponType.valueOf(input);
                break;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Invalid weapon type. Please try again...");
            }
        }

        return new Weapon(damage, fireRate, weaponType);
    }

    public static double calculate(Weapon gun, double health, double helmet, double vest, int targets)
    {
        double totalTTK = IntStream.range(0, targets).parallel().mapToDouble(_ ->
        {
            int shots = 0;
            double remainingHealth = health;
            while (remainingHealth > 0)
            {
                remainingHealth -= gun.shoot(helmet, vest); // randomly deal damage to target based on shoot()
                shots++;
            }
            return (gun.getFireRate() * (shots - 1)); // add a time to kill
        }).sum(); // .sum() means add the return value to the variable

        return (totalTTK / targets);
    }
}