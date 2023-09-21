import java.util.ArrayList;

public class ApplePieRecipe {

    ArrayList<Ingredient> ingredients = new ArrayList<>();
    public  ApplePieRecipe(){
        Ingredient i1 = new Ingredient("200", "gram", "ongezouten roomboter");
        Ingredient i2 = new Ingredient("200","gram", "witte bastaard suiker");
        Ingredient i3 = new Ingredient("400","gram", "zelfrijzend bakmeel");
        Ingredient i4 = new Ingredient("1","stuk", "ei");
        Ingredient i5 = new Ingredient("8", "gram", "vanillesuiker");
        Ingredient i6 = new Ingredient("1","snuf", "zout");
        Ingredient i7 = new Ingredient("1.5","kilo", "zoetzure appels");
        Ingredient i8 = new Ingredient("75","gram", "kristal suiker");
        Ingredient i9 = new Ingredient("3","theelepels", "kaneel");
        Ingredient i10 = new Ingredient("15","gram", "paneermeel");

        ingredients.add(i1);
        ingredients.add(i2);
        ingredients.add(i3);
        ingredients.add(i4);
        ingredients.add(i5);
        ingredients.add(i6);
        ingredients.add(i7);
        ingredients.add(i8);
        ingredients.add(i9);
        ingredients.add(i10);

    }

public void step1(){
    System.out.println("Stap 1: Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
}

    public void step2() {
        System.out.println("Stap 2: Klop het ei los en verdeel het in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void step3() {
        System.out.println("Stap 3: Meng de boter, bastaardsuiker, zelfrijzend bakmeel, een helft van het ei, vanillesuiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void step4() {
        System.out.println("Stap 4: Schil de appels en snij ze in plakjes. Meng in een kopje de suiker en kaneel.");
    }

    public void step5() {
        System.out.println("Stap 5: Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void step6() {
        System.out.println("Stap 6: Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void step7() {
        System.out.println("Stap 7: Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suikermengsel overheen. Meng de andere helft van de appels met het overgebleven kaneel-suikermengsel en leg deze in de vorm.");
    }

    public void step8() {
        System.out.println("Stap 8: Rol het laatste deel van het deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed. Leg de stroken kruislings op de appeltaart. Gebruik wat extra deegstroken om de rand rondom af te werken. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void step9() {
        System.out.println("Stap 9: Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven- en onderwarmte) gaar en goudbruin.");
    }

public void printIngredients(){
    System.out.println("Ingredienten voor Appeltaart");
    for (Ingredient ingredient : ingredients){
        System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }
}

}








