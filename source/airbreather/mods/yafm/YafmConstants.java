package airbreather.mods.yafm;

// Some constants used throughout the mod.
final class YafmConstants
{
    // ID of the mod.
    public static final String ModID = "YAFM";

    // Current version of the mod.
    public static final String CurrentVersion = "0.2.0";

    // An ID that refers to the fried egg item.
    // NOT the actual configurable item ID, just something to use internally.
    public static final int FriedEggID;

    // The string that refers to the texture file for the fried egg item's icon.
    // Ends up being "YAFM:eggFried", which translates to assets/yafm/textures/items/eggFried.png
    public static final String FriedEggTextureID = ModID + ":eggFried";

    // The English name for the fried egg item.
    // TODO: globalize... that's a project for another day.
    public static final String FriedEggEnglishName = "Fried Egg";

    // An ID that refers to the raw mutton item.
    // NOT the actual configurable item ID, just something to use internally.
    public static final int RawMuttonID;

    // The string that refers to the texture file for the raw mutton item's icon.
    // Ends up being "YAFM:muttonRaw", which translates to assets/yafm/textures/items/muttonRaw.png
    public static final String RawMuttonTextureID = ModID + ":muttonRaw";

    // The English name for the raw mutton item.
    // TODO: globalize... that's a project for another day.
    public static final String RawMuttonEnglishName = "Raw Mutton";

    // An ID that refers to the cooked mutton item.
    // NOT the actual configurable item ID, just something to use internally.
    public static final int CookedMuttonID;

    // The string that refers to the texture file for the cooked mutton item's icon.
    // Ends up being "YAFM:muttonCooked", which translates to assets/yafm/textures/items/muttonCooked.png
    public static final String CookedMuttonTextureID = ModID + ":muttonCooked";

    // The English name for the cooked mutton item.
    // TODO: globalize... that's a project for another day.
    public static final String CookedMuttonEnglishName = "Cooked Mutton";

    static
    {
        // Set up all the internal IDs.
        int x = 0;
        FriedEggID = x++;
        RawMuttonID = x++;
        CookedMuttonID = x++;
    }
}
