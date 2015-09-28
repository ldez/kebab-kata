package fr.socrates.kebab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kebab {

    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredients (Ingredient ...ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public boolean isVegan() {

        boolean vegan = true;

        for (Ingredient ingredient : ingredients) {
            vegan = vegan && ingredient.isVegan();
        }
        return vegan;
    }

    public boolean isPiscivore() {
        boolean vegan = true;

        for (Ingredient ingredient : ingredients) {
            vegan = vegan && ingredient.isPiscivore();
        }
        return vegan;
    }

    public List<Ingredient> removeOignons() {
        List<Ingredient> ingredientsWithoutOignons = new ArrayList<Ingredient>();
        for (Ingredient ingredient : ingredients) {
            if (ingredient!=Ingredient.OIGNONS)
            ingredientsWithoutOignons.add(ingredient);
        }
        return ingredientsWithoutOignons;
    }

    public List<Ingredient> doubleCheese() {
        List<Ingredient> ingredientsWithDoubleCheese = new ArrayList<Ingredient>();
        for (Ingredient ingredient : ingredients) {
            if (ingredient==Ingredient.CHEESE) {
                ingredientsWithDoubleCheese.add(ingredient);
                ingredientsWithDoubleCheese.add(ingredient);
            }
            else {
                ingredientsWithDoubleCheese.add(ingredient);
            }
        }
        return ingredientsWithDoubleCheese;
    }
}
