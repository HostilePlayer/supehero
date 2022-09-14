package dk.kea;
import java.util.Scanner;


public class Main {

    Scanner scanner = new Scanner(System.in);
    private Database database;

    public static void main(String[] args) {

        Main Program = new Main();
        Program.database = new Database();
        Program.brugerValg();

    }

    public void brugerValg() {

        System.out.println("Whelcome to the Superhero Database!");


        int userInput = 0;

        while (userInput != 9){
            System.out.println("1. for add superhero");
            System.out.println("2. for list of superhero's");
            System.out.println("3. to search in list");
            System.out.println("9. quit program");
            System.out.println("----------");
            userInput = scanner.nextInt();

            if(userInput == 1){
                addHero();
            } else if (userInput == 2){
                printHero();
            } else if (userInput == 3) {
                searchHero();
            }


        }
    }

    private void searchHero() {
        System.out.println("Enter name: ");
        String searchTerm = scanner.next();
        database.searchFor(searchTerm);
        SuperHeroList superHero = database.searchFor(searchTerm);

        if (superHero == null) {
            System.out.println("Superhero not in Database");
        } else if(superHero != null) {
            System.out.println("SuperHero Real name: "+superHero.getRealName());
            System.out.println("is it Human: "+superHero.getIsHuman());
            System.out.println("first publish: "+superHero.getYearOfCreation());
            System.out.println("superhero force: "+superHero.getStrength()+"newstons");
            System.out.println("----------");
        }
    }

    public void addHero(){
        System.out.println("adding superhero");

            System.out.println("Write a the superhero's name");
            String superHeroName = scanner.next();
            System.out.println("Write the superhero's real name");
            String realName = scanner.next();
            System.out.println("Is the Superhero human? write yes or no");
            String isHuman = scanner.next();
            System.out.println("What year whas the hero first written about?");
            int yearOfCreation = scanner.nextInt();
            System.out.println("how much force in Newton can the superhero do?");
            int strength = scanner.nextInt();

            System.out.println("| Superhero: " + superHeroName + " | real name: " + realName
                    + " | Human: " + isHuman + " | first publish: " + yearOfCreation +
                    " | strength in newton: " + strength + " newtons");

            database.makeSuperHero(superHeroName, realName, isHuman, yearOfCreation, strength);

            System.out.println("The superhero " + superHeroName + " added");

            System.out.println("Number of superhero's: "+database.getSuperHero().size());
            System.out.println("----------");


    }

    public void printHero(){

        System.out.println("list of superhero's");

        for(SuperHeroList superheroes : database.getSuperHero()){
            System.out.println(" ");
            System.out.println("----------");
            System.out.println(database.getSuperHero()); //printer dk.kea.SuperHeroList@ + 8, tegn per helt
            //System.out.println(superheroes); printer dk.kea.SuperHeroList@ + 8 tegn

            //prints den info jeg vil have men kun den nyeste input
            System.out.println("SuperHero name: "+superheroes.getSuperHeroName());
            System.out.println("SuperHero Real name: "+superheroes.getRealName());
            System.out.println("is it Human: "+superheroes.getIsHuman());
            System.out.println("first publish: "+superheroes.getYearOfCreation());
            System.out.println("superhero force: "+superheroes.getStrength()+" newstons");
            System.out.println("----------");

        }

    }
}