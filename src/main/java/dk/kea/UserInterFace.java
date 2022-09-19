package dk.kea;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterFace {

    Scanner scanner;
    private Database database;

    public UserInterFace() {
        database = new Database();
        scanner = new Scanner(System.in);
    }

    public void startup() {
        database.makeSuperHero("superman", "clark kent", "no", 1963, 25874);
        database.makeSuperHero("batman", "bruce wayne", "yes", 1964, 25873);
        brugerValg();
    }

    public void brugerValg() {

        System.out.println("Whelcome to the Superhero Database!");


        int userInput = 0;

        while (userInput != 9) {
            System.out.println("1. for add superhero");
            System.out.println("2. for list of superhero's");
            System.out.println("3. to search in list");
            System.out.println("4. to edit Superhero");
            System.out.println("9. quit program");
            System.out.println("----------");
            userInput = scanner.nextInt();

            if (userInput == 1) {
                addHero();
            } else if (userInput == 2) {
                database.printHero();
            } else if (userInput == 3) {
                searchHero();
            } else if (userInput == 4){
                editHero();
            }


        }
    }

    private void editHero(){
        System.out.println("Search for a hero to start edit");
        String searchResults = scanner.next();
        database.changeHero(searchResults);

        // opret arrayliste til søgeresultater
        ArrayList<SuperHeroList> searchResult = new ArrayList<SuperHeroList>();
        // find personer, hvis navn indeholder søgekriterium og gem i liste
        for (SuperHeroList superHero : searchResult) {
            String name = superHero.getSuperHeroName().toLowerCase();
            if (name.contains(superHero.getSuperHeroName().toLowerCase())) {
                searchResult.add(superHero);
                for (int i=0; i<searchResult.size(); i++) {
                    //i debug virker det som om at den skaber flere pladser end forventet
                    System.out.println(i+1 +":" + searchResult.get(i));

                }
                //TODO lav om på hvordan jeg printer brugers muligheder
                //i debug crasher koden her java.lang.nullPointerExeption this.scanner is null
                System.out.println("press the coresponding number:");
                int nr = scanner.nextInt();
                scanner.nextLine();
                SuperHeroList editHero = searchResult.get(nr+1); // index starter fra 0
                System.out.println("EditHero: " + editHero);
                System.out.println("Edit data and press ENTER. if you will not edit data press ENTER");

                System.out.println("superHero Name: " + editHero.getSuperHeroName());

                String newSuperHeroName = scanner.nextLine();
                if (!newSuperHeroName.isEmpty()) {
                    editHero.setSuperHeroName(newSuperHeroName);
                    System.out.println("superHero Name: " + editHero.getRealName());
                }
                String newRealName = scanner.nextLine();
                if (!newRealName.isEmpty()) {
                    editHero.setSuperHeroName(newSuperHeroName);
                    System.out.println("real Name: " + editHero.getRealName());
                }
                String newIsHuman = scanner.nextLine();
                if (!newIsHuman.isEmpty()) {
                    editHero.setIsHuman(newIsHuman);
                    System.out.println("real Name: " + editHero.getRealName());
                }
                System.out.println("year of creation: " + editHero.getYearOfCreation());
                String newYearOfCreation = scanner.nextLine();
                if (!newYearOfCreation.isEmpty()) {
                    editHero.setYearOfCreation(Integer.parseInt(newYearOfCreation));
                }

                System.out.println("strength in Newton: " + editHero.getStrength());
                String newStrength = scanner.nextLine();
                if (!newStrength.isEmpty()) {
                    editHero.setStrength(Integer.parseInt(newYearOfCreation));
                }
            }
        }
        // Udskriv resultater - check for ikke tom liste
        if (!searchResults.isEmpty())
            for (SuperHeroList search : searchResult)
                System.out.println(search);
        else
            System.out.println("Superhero not in Database");
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
                    for(SuperHeroList superHeros : database.superheroes) {
                        System.out.println("Superhero name: " + superHero.getSuperHeroName());
                        System.out.println("SuperHero Real name: " + superHero.getRealName());
                        System.out.println("is it Human: " + superHero.getIsHuman());
                        System.out.println("first publish: " + superHero.getYearOfCreation());
                        System.out.println("superhero force: " + superHero.getStrength() + "newstons");
                        System.out.println("----------");
                    }
                }
            } else if (searchOption == 2) {
                System.out.println("Enter birth name: ");
                String searchTerm = scanner.next();
                database.searchForBirthName(searchTerm);
                SuperHeroList superHero = database.searchForBirthName(searchTerm);

                if (superHero == null) {
                    System.out.println("Superhero not in Database");
                } else if (superHero != null) {
                    System.out.println("Superhero name: " + superHero.getSuperHeroName());
                    System.out.println("SuperHero Real name: " + superHero.getRealName());
                    System.out.println("is it Human: " + superHero.getIsHuman());
                    System.out.println("first publish: " + superHero.getYearOfCreation());
                    System.out.println("superhero force: " + superHero.getStrength() + " newtons");
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

        database.makeSuperHero(superHeroName, realName, isHuman, yearOfCreation, strength);

        System.out.println("The superhero " + superHeroName + " added");

        System.out.println("Number of superhero's: " + database.superheroes.size());
        System.out.println("----------");
    }
}
