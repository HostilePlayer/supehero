package dk.kea;

import java.util.Scanner;

public class UserInterFace {

    Scanner scanner = new Scanner(System.in);
    private Database database;

    public static void startup(){
        UserInterFace Program = new UserInterFace();
        Program.database = new Database();
        Program.database.makeSuperHero("Superman" , "Clark Kent", "no", 1963, 25874);
        Program.database.makeSuperHero("Batman" , "Bruce Wayne", "yes", 1964, 25873);
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
            //kan kun finde den nyeste
            System.out.println("SuperHero Real name: "+ superHero.getRealName());
            System.out.println("is it Human: "+ superHero.getIsHuman());
            System.out.println("first publish: "+ superHero.getYearOfCreation());
            System.out.println("superhero force: "+ superHero.getStrength()+"newstons");
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


        //tilføger superHero, data kan finde godkende den
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
/*
            //printer dk.kea.SuperHeroList@ + 8, tegn per helt, ram adresse?
            System.out.println(superheroes);
            //printer dk.kea.SuperHeroList@ + 8 tegn
            System.out.println(superheroes);
*/

            //prints den info jeg vil have men kun den nyeste input og gentage den nyeste per element i liste
            System.out.println("SuperHero name: "+ superheroes.getSuperHeroName());
            System.out.println("SuperHero Real name: "+ superheroes.getRealName());
            System.out.println("is it Human: "+ superheroes.getIsHuman());
            System.out.println("first publish: "+ superheroes.getYearOfCreation());
            System.out.println("superhero force: "+ superheroes.getStrength()+" newstons");
            System.out.println("----------");

        }

    }
}
