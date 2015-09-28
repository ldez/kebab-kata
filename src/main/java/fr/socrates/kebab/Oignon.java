package fr.socrates.kebab;

public class Oignon implements Ikebab {

    private Ikebab innerKebab;

    public Oignon(final Ikebab innerKebab)
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
        return this;
    }
}
