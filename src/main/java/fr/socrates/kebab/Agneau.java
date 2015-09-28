package fr.socrates.kebab;

public class Agneau implements Ikebab {
    private Ikebab innerKebab;

    public Agneau(final Ikebab innerKebab)
    {
        this.innerKebab = innerKebab;
    }

    @Override
    public boolean isVegan() {
        return false;
    }

    @Override
    public boolean isPiscivore() {
        return false ;
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
