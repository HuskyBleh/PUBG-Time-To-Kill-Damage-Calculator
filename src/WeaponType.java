public enum WeaponType
{
    AR (2.35, 1.00, 0.90),
    DMR(2.35, 1.05, 0.95),
    SMG(2.10, 1.05, 1.30),
    LMG(2.30, 1.05, 0.90),
    P  (2.10, 1.00, 1.05);

    // weapon class damage multipliers
    final private double headMultiplier;
    final private double bodyMultiplier;
    final private double limbMultiplier;

    WeaponType (double headMultiplier, double bodyMultiplier, double limbMultiplier)
    {
        this.headMultiplier = headMultiplier;
        this.bodyMultiplier = bodyMultiplier;
        this.limbMultiplier = limbMultiplier;
    }

    public double getHeadMultiplier() { return headMultiplier; }

    public double getBodyMultiplier() { return bodyMultiplier; }

    public double getLimbMultiplier() { return limbMultiplier; }
}
