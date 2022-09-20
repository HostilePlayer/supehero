package dk.kea;

import java.util.Scanner;
import java.util.ArrayList;


public class Database {
    Scanner scanner;
    public ArrayList<SuperHeroList> superheroes = new ArrayList<>();

    ArrayList<SuperHeroList> searchResult = new ArrayList<>();

    public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
        superheroes.add(new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength));
    }

    public ArrayList<SuperHeroList> searchForSuperHeroName(String searchTerm) {

        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            //nu skal den finde dem der passer og add dem til searchResult
            if (name.contains(searchTerm)) {
                //hvis et element matcher skal det addes
                if (!searchResult.contains(superHero)) {
                    //add element : men add 2 gange?
                    searchResult.add(superHero);
                }
            }
        }
        return searchResult;
    }


    public ArrayList<SuperHeroList> searchForRealName(String searchTerm) {

        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            //nu skal den finde dem der passer og add dem til searchResult
            if (name.contains(searchTerm)) {
                //hvis et element matcher skal det addes
                if (!searchResult.contains(superHero)) {
                    //add element : men add 2 gange?
                    searchResult.add(superHero);
                }
            }
        }
        return searchResult;
    }

    public void printHero() {

        System.out.println("list of superhero's");

        for (SuperHeroList superheroes : superheroes) {
            System.out.println(" ");
            System.out.println("----------");
            System.out.println("SuperHero name: " + superheroes.getSuperHeroName());
            System.out.println("SuperHero Real name: " + superheroes.getRealName());
            System.out.println("is it Human: " + superheroes.getIsHuman());
            System.out.println("first publish: " + superheroes.getYearOfCreation());
            System.out.println("superhero force: " + superheroes.getStrength() + " newstons");
            System.out.println("----------");

        }

    }

    public ArrayList<SuperHeroList> searchAndEdit(String searchTerm) {

        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            //nu skal den finde dem der passer og add dem til searchResult
            if (name.contains(searchTerm)) {

                //sådan stopper jeg den i at lave flere af den samme element
                if (!searchResult.contains(superHero)) {
                    //add element : men add 2 gange?
                    searchResult.add(superHero);
                }

                //printer hvert element på sin index plads
                for (int i = 0; i < searchResult.size(); i++)
                    System.out.println(i + 1 + ":" + searchResult.get(i));

            }

        }
        return searchResult;
    }
}

