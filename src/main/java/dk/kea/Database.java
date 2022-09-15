package dk.kea;
import java.util.Scanner;
import java.util.ArrayList;

public class Database {
    Scanner scanner;
    public ArrayList<SuperHeroList> superheroes = new ArrayList<>();

    public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
        superheroes.add(new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength));
    }

    public SuperHeroList searchForHeroName(String searchTerm) {

        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            if (name.contains(searchTerm.toLowerCase())) {
                return superHero;
            }
            return null;
        }

        return null;
    }


    public SuperHeroList searchForBirthName(String searchTerm) {

        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getRealName().toLowerCase();
            if (name.contains(searchTerm.toLowerCase())) {
                return superHero;
            }
            return null;
        }

        return null;
    }

    public void printHero(){

        System.out.println("list of superhero's");

        for(SuperHeroList superheroes : superheroes){
            System.out.println(" ");
            System.out.println("----------");
            System.out.println("SuperHero name: "+ superheroes.getSuperHeroName());
            System.out.println("SuperHero Real name: "+ superheroes.getRealName());
            System.out.println("is it Human: "+ superheroes.getIsHuman());
            System.out.println("first publish: "+ superheroes.getYearOfCreation());
            System.out.println("superhero force: "+ superheroes.getStrength()+" newstons");
            System.out.println("----------");

        }

    }

    public void changeHero(String searchResults){
        // opret arrayliste til søgeresultater
        ArrayList <SuperHeroList> searchResult = new ArrayList<SuperHeroList>();
        // find personer, hvis navn indeholder søgekriterium og gem i liste
        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            if (name.contains(superHero.getSuperHeroName().toLowerCase())) {
                searchResult.add(superHero);
                for (int i=0; i<searchResult.size(); i++) {
                    System.out.println(i+1 +":" + searchResult.get(i));

                }
                System.out.println("press the coresponding number:");
                int nr = scanner.nextInt();
                scanner.nextLine();
                SuperHeroList editHero = searchResult.get(nr+1); // index starter fra 0
                System.out.println("EditHero: " + editHero);
                System.out.println("Edit data and press ENTER. if you will not edit data press ENTER");

                System.out.println("superHero Name: " + editHero.getSuperHeroName());

                String newSuperHeroName = scanner.nextLine();
                if (!newSuperHeroName.isEmpty())
                    editHero.setSuperHeroName(newSuperHeroName);
                    System.out.println("superHero Name: " + editHero.getRealName());

                    String newRealName = scanner.nextLine();
                if (!newRealName.isEmpty())
                    editHero.setSuperHeroName(newSuperHeroName);
                    System.out.println("real Name: " + editHero.getRealName());

                String newIsHuman = scanner.nextLine();
                if (!newIsHuman.isEmpty())
                    editHero.setIsHuman(newIsHuman);
                    System.out.println("real Name: " + editHero.getRealName());

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
            for (SuperHeroList search : superheroes)
                System.out.println(search);
        else
            System.out.println("Superhero not in Database");

    }
}
