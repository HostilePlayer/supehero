package dk.kea;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterFace {

    Scanner scanner;
    private Database database;

    public UserInterFace() {
        database = new Database();
        scanner = new Scanner(System.in);
    }

    public void startup() {
        database.makeSuperHero("superman", "clark kent", "no", 1938, 25874);
        database.makeSuperHero("batman", "bruce wayne", "yes", 1964, 25873);
        database.makeSuperHero("wonderwoman", "Wendy", "yes", 1964, 25873);
        database.makeSuperHero("ironman", "tony stark", "yes", 1964, 25873);
        database.makeSuperHero("mars", "marshen man", "no", 1950, 25873);
        brugerValg();
    }

    public void brugerValg() {

        System.out.println("Welcome to the Superhero Database!");

        int userInput = 0;

        while (userInput != 9) {
            try {
                userInput = 0;
                System.out.println("1. to add superhero");
                System.out.println("2. for list of superhero's");
                System.out.println("3. to search in list");
                System.out.println("4. to edit Superhero");
                System.out.println("5. to delete Superhero");
                System.out.println("9. quit program");
                System.out.println("----------");
                userInput = scanner.nextInt();
                if (userInput == 1) {
                    addHero();
                } else if (userInput == 2) {
                    database.printHero();
                } else if (userInput == 3) {
                    searchHero();
                } else if (userInput == 4) {
                    editHero();
                } else if (userInput == 5){
                    deleteHero();
                }

            } catch (InputMismatchException e) {
                System.out.println("WARNING; is not a valid input");
                scanner.nextLine();
            }
        }
    }

    public void deleteHero(){
        try{

            //kunne ikke lave en metoder i database der printer en liste med index. så skal have nr fra UI og der efter sletter
            database.printListWithNumbers();
            System.out.println("give the coresponding number");
            int nr = scanner.nextInt();
            //System.out.println("Deleting hero: " + SuperHeroList);
            System.out.println(" ");

            database.superheroes.remove(nr-1);
            System.out.println("Superhero is deletet");


        } catch (IndexOutOfBoundsException e){
            System.out.println("WARNING: not valid input");
        }
    }

    private void editHero() {
        System.out.println("Search for a hero to start edit");
        String searchTerm = scanner.next();

        // opret arrayliste til søgeresultater
        ArrayList<SuperHeroList> searchResult = database.searchAndEdit(searchTerm);

        database.searchAndEdit(searchTerm);

        //System.out.println(searchResult.size());
        try {
            System.out.println("press the coresponding number:");
            int nr = scanner.nextInt();
            SuperHeroList editHero = searchResult.get(nr - 1); // index starter fra 0
            System.out.println("EditHero: " + editHero);
            System.out.println(" ");

            System.out.println("Write new info and press enter to edit");
            System.out.println("leave aria blank and press enter to leave as is");
            System.out.println(" ");

            System.out.println("old superHero Name: " + editHero.getSuperHeroName());
            String newSuperHeroName = scanner.nextLine(); //den her køre ikke
            scanner.nextLine();
            if (!newSuperHeroName.isEmpty()) {
                editHero.setSuperHeroName(newSuperHeroName);
            }


            System.out.println("old real Name: " + editHero.getRealName());
            String newRealName = scanner.nextLine();
            if (!newRealName.isEmpty()) {
                editHero.setSuperHeroName(newRealName);
            }


            System.out.println("old is human status: " + editHero.getIsHuman());
            String newIsHuman = scanner.nextLine();
            if (!newIsHuman.isEmpty()) {
                editHero.setIsHuman(newIsHuman);
            }

            try {
                System.out.println("old year of creation: " + editHero.getYearOfCreation());
                String newYearOfCreation = scanner.nextLine();
                if (!newYearOfCreation.isEmpty()) {
                    editHero.setYearOfCreation(Integer.parseInt(newYearOfCreation));
                }
            } catch (NumberFormatException e) {
                System.out.println("WARNING: not valid number");
            }


            System.out.println("old strength in Newton: " + editHero.getStrength());
            try {
                String newStrength = scanner.nextLine();
                if (!newStrength.isEmpty()) {
                    editHero.setStrength(Integer.parseInt(newStrength));
                }
            } catch (NumberFormatException e) {
                System.out.println("WARNING: not valid number");
            }

            // Udskriv resultater - check for listen har elementer
            if (!searchResult.isEmpty()) {
                for (SuperHeroList search : searchResult)
                    System.out.println(search);
            } else {
                System.out.println("Superhero not in Database");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("WARNING: input valid number");
        }
        System.out.println("End of edit");
        searchResult.clear();
        System.out.println("----------");
    }

    private void searchHero() {
        System.out.println("Do you wanna search for a Superhero's name or by birth name?");
        System.out.println("1. for superhero name");
        System.out.println("2. for birth name");
        System.out.println("3. for undo");
        int searchOption;
        searchOption = scanner.nextInt();
        if (searchOption == 1) {

            System.out.println("search for Superhero name");
            String searchTerm = scanner.next();

            // opret arrayliste til søgeresultater
            ArrayList<SuperHeroList> searchResult = database.searchForSuperHeroName(searchTerm);

            database.searchForSuperHeroName(searchTerm);

            System.out.println(searchResult);
            System.out.println(" ");

            if (searchResult == null) {
                System.out.println("Superhero not in Database");
            }
            searchResult.clear();
        } else if (searchOption == 2) {
            System.out.println("search for real name");
            String searchTerm = scanner.next();

            // opret arrayliste til søgeresultater
            ArrayList<SuperHeroList> searchResult = database.searchForRealName(searchTerm);

            database.searchForRealName(searchTerm);

            System.out.println(searchResult);
            System.out.println(" ");

            if (searchResult == null) {
                System.out.println("Superhero not in Database");
            }
            searchResult.clear();
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
