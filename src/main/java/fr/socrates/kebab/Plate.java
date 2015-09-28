package fr.socrates.kebab;

public class Plate implements Ikebab {


    @Override
    public boolean isVegan() {
        return true;
    }

    @Override
    public boolean isPiscivore() {
        return true;
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
