package fr.socrates.kebab;

public class Salade implements Ikebab {

    private Ikebab innerKebab;

    public Salade(final Ikebab innerKebab)
    {
        this.innerKebab = innerKebab;
    }


    @Override
    public boolean isVegan() {
        return innerKebab.isVegan();
    }

    @Override
    public boolean isPiscivore() {
        return innerKebab.isPiscivore();
    }

    @Override
    public Ikebab removeOignons() {
        return this;
    }

    @Override
    public Ikebab doubleCheese() {
        return this;
    }
}
