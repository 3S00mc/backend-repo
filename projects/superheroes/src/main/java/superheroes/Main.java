package superheroes;

public class Main {

    public static void main(String[] args) {

        Hero fireFist = new Hero();
        Hero iceBlast = new Hero();

        fireFist.name = "Fire Fist";
        iceBlast.name = "Ice Blast";


        System.out.println("Name of the superheroes.Hero: " + fireFist.name);
        System.out.println("Name of the superheroes.Hero: " + iceBlast.name);
    }

    public static void names(){
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        //TODO 1: Print all the 5 superheroes names as suggested in the example
        System.out.println(superheroes[0] + "\n" + superheroes[1] + "\n" + superheroes[2] + "\n" + superheroes[3] + "\n" + superheroes[4] + "\n");

        // Print the introduction years
        System.out.println("Introduction Years:");
        //TODO 2: Print the introductionYear of the superheroes.
        System.out.println(introductionYears[0] + "\n" + introductionYears[1] + "\n" + introductionYears[2] + "\n" + introductionYears[3] + "\n" + introductionYears[4] + "\n");

        // TODO 3a: Print the original name of the third superhero
        System.out.println("Heroi original: " + superheroes[2]);
        // TODO 3b: Modify the third superhero name
        superheroes[2] = "Darth Vader";
        // TODO 3c: Print the modified name of the third superhero
        System.out.println("Heroi alterado: " + superheroes[2]);

        // TODO 4a: Print the original year of introduction of the third superhero
        System.out.println("Data original: " + introductionYears[2]);
        // TODO 4b: Modify the year of introduction of the third superhero
        introductionYears[2] = 1977;
        // TODO 4c: Print the modified year of introduction of the third superhero
        System.out.println("Data Modificada: " + introductionYears[2] + "\n");

        // TODO 5a: Print the length of the array containing superhero names
        System.out.println("Impresso com outro metodo: " + superheroes.length + "\n");

        // TODO 5b: Print the length of the array containing superhero year of introduction
        System.out.println("Tamanho do Array das Datas: " + introductionYears.length + "\n");
    }
}
