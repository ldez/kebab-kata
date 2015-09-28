package fr.socrates.kebab;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KebabTest {

    @Test
    public void should_be_vegan_when_no_meat(){
        Ikebab kebab = new Plate();
        kebab = new Oignon(kebab);
        kebab = new Cheese(kebab);

        assertThat(kebab.isVegan()).isTrue();
    }

    @Test
    public void should_not_be_vegan_when_have_meat(){
        Ikebab kebab = new Plate();
        kebab = new Oignon(kebab);
        kebab = new Cheese(kebab);
        kebab = new Agneau(kebab);

        assertThat(kebab.isVegan()).isFalse();
    }

    @Test
    public void should_be_piscivore_when_have_sea_food(){
        Ikebab kebab = new Plate();
        kebab = new Oignon(kebab);
        kebab = new Cheese(kebab);
        kebab = new Agneau(kebab);

        assertThat(kebab.isPiscivore()).isTrue();
    }

    @Test
    public void should_have_kebab_whitout_oignons(){
        Ikebab kebab = new Plate();
        kebab = new Oignon(kebab);
        kebab = new Cheese(kebab);
        kebab = new Agneau(kebab);

        Ikebab kebabWithoutOignon = kebab.removeOignons();

        //assertThat(kebabWithoutOignon).hasCheese(Ingredient.OIGNONS);
    }


    @Test
    public void should_have_kebab_with_double_cheese(){
        Ikebab kebab = new Plate();
        kebab = new Oignon(kebab);
        kebab = new Cheese(kebab);
        kebab = new Agneau(kebab);

        Ikebab kebabDoucheCheese = kebab.doubleCheese();

        //assertThat(ingredients).containsExactly(Ingredient.AGNEAU, Ingredient.CHEESE, Ingredient.CHEESE, Ingredient.SALADE);
    }

    @Test
    public void should_have_kebab_with_double_double_cheese(){
        Ikebab kebab = new Plate();
        kebab = new Oignon(kebab);
        kebab = new Cheese(kebab);
        kebab = new Agneau(kebab);

        Ikebab kebabDoucheCheese = kebab.doubleCheese();

        //assertThat(ingredients).containsExactly(Ingredient.AGNEAU, Ingredient.CHEESE, Ingredient.CHEESE, Ingredient.SALADE, Ingredient.CHEESE, Ingredient.CHEESE);
    }

    @Test
    public void should_have_kebab_with_no_cheese(){
        Ikebab kebab = new Plate();
        kebab = new Oignon(kebab);
        kebab = new Agneau(kebab);

        Ikebab kebabDoucheCheese = kebab.doubleCheese();

        //assertThat(ingredients).containsExactly(Ingredient.AGNEAU, Ingredient.SALADE);
    }
}
