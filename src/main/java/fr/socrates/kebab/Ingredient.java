package fr.socrates.kebab;

public enum Ingredient {

    AGNEAU(false, false),
    SALADE(true, true),
    TOMATE(true, true),
    OIGNONS(true, true),
    FISH(false, true),
    CHEESE(true,true);

    private boolean vegan;
    private boolean piscivore;

    Ingredient(final boolean vegan, final boolean piscivore) {

        this.vegan = vegan;
        this.piscivore = piscivore;
    }

    public boolean isVegan() {
        return vegan;
    }
    public boolean isPiscivore() {
        return piscivore;
    }

}
