package fr.socrates.kebab;

public class Cheese implements Ikebab {

    private Ikebab innerKebab;

    public Cheese(final Ikebab innerKebab)
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
        return innerKebab;
    }

    @Override
    public Ikebab doubleCheese() {
        return new Cheese(this);
    }
}
