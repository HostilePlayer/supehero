package dk.kea;

import java.util.Scanner;

public class UserInterFace {

    Scanner scanner;
    private Database database;

    public UserInterFace() {
        database = new Database();
        scanner = new Scanner(System.in);
    }

    public void startup() {
        database.makeSuperHero("Superman", "Clark Kent", "no", 1963, 25874);
        database.makeSuperHero("Batman", "Bruce Wayne", "yes", 1964, 25873);
        brugerValg();
    }

    public void brugerValg() {

        System.out.println("Whelcome to the Superhero Database!");


        int userInput = 0;

        while (userInput != 9) {
            System.out.println("1. for add superhero");
            System.out.println("2. for list of superhero's");
            System.out.println("3. to search in list");
            System.out.println("9. quit program");
            System.out.println("----------");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                addHero();
            } else if (userInput == 2) {
                database.printHero();
            } else if (userInput == 3) {
                searchHero();
            }


        }
    }

    private void searchHero() {
        System.out.println("Do you wanna search for a Superhero's name or by birth name?");
        System.out.println("1. for superhero name");
        System.out.println("2. for birth name");
        System.out.println("3. for undo");
        int searchOption;
        searchOption = scanner.nextInt();
            if (searchOption == 1) {

                System.out.println("Enter name: ");
                String searchTerm = scanner.next();
                database.searchForHeroName(searchTerm);
                SuperHeroList superHero = database.searchForHeroName(searchTerm);

                if (superHero == null) {
                    System.out.println("Superhero not in Database");
                } else if (superHero != null) {
                    System.out.println("SuperHero Real name: " + superHero.getRealName());
                    System.out.println("is it Human: " + superHero.getIsHuman());
                    System.out.println("first publish: " + superHero.getYearOfCreation());
                    System.out.println("superhero force: " + superHero.getStrength() + "newstons");
                    System.out.println("----------");
                }
            } else if (searchOption == 2) {
                System.out.println("Enter birth name: ");
                String searchTerm = scanner.next();
                database.searchForBirthName(searchTerm);
                SuperHeroList superHero = database.searchForBirthName(searchTerm);

                if (superHero == null) {
                    System.out.println("Superhero not in Database");
                } else if (superHero != null) {
                    //kan kun finde den nyeste
                    System.out.println("SuperHero Real name: " + superHero.getRealName());
                    System.out.println("is it Human: " + superHero.getIsHuman());
                    System.out.println("first publish: " + superHero.getYearOfCreation());
                    System.out.println("superhero force: " + superHero.getStrength() + "newstons");
                    System.out.println("----------");

            }
        }
    }


    public void addHero() {
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

        System.out.println("Number of superhero's: " + database.superheroes.size());
        System.out.println("----------");
    }
}
