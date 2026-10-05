import java.util.concurrent.ThreadLocalRandom;

public class Weapon
{
    // base stats
    final private int damage;
    final private double fireRate;
    final private WeaponType weaponType;

    public Weapon (int damage, double fireRate, WeaponType weaponType)
    {
        this.damage = damage;
        this.fireRate = fireRate;
        this.weaponType = weaponType;
    }

    // randomized single-shot damage calculation
    public double shoot (double lvHelmet, double lvVest)
    {
        // percentages are selected as an estimation using limited in-game data I could gather
        // this may not be 100% accurate for all player skill levels, but it's my best guess

        double num = ThreadLocalRandom.current().nextDouble() * 100;
        if (num < 12.5) // headshot 12.5% chance
            return damage * weaponType.getHeadMultiplier() * lvHelmet;
        else if (num < 15.0) // neck 2.5% chance
            return damage * weaponType.getHeadMultiplier() * lvHelmet * 0.75; // neck deals 75% damage
        else if (num < 40.0) // body/shoulder deal same damage, combined 25% chance
            return damage * weaponType.getBodyMultiplier() * lvVest;
        else if (num < 52.5) // upper chest 12.5% chance
            return damage * weaponType.getBodyMultiplier() * lvVest * 1.10; // upper chest deals 110% damage
        else if (num < 65) // stomach 12.5% chance
            return damage * weaponType.getBodyMultiplier() * lvVest * 0.95; // stomach deals 95% damage
        else if (num < 85) // bicep or thigh 20% chance
            return damage * weaponType.getLimbMultiplier() * 0.60;
        else if (num < 95) // forearm or leg 10% chance
            return damage * weaponType.getLimbMultiplier() * 0.45;
        else if (num < 100) // hands or feet 5% chance
            return damage * weaponType.getLimbMultiplier() * 0.30;
        throw new IllegalStateException("Random value out of range.");
    }

    // simple getter methods
    public int getDamage() { return this.damage; }

    public double getFireRate() { return fireRate; }

    public WeaponType getWeaponType()  { return weaponType; }

    public double getHeadMultiplier() { return weaponType.getHeadMultiplier(); }

    public double getBodyMultiplier() { return weaponType.getBodyMultiplier(); }

    public double getLimbMultiplier() { return weaponType.getLimbMultiplier(); }
}
