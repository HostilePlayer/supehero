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

    public ArrayList<SuperHeroList> searchAndEdit(String searchTerm){

        ArrayList<SuperHeroList> searchResult = new ArrayList<>();

        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            //nu skal den finde dem der passer og add dem til searchResult
            if (name.contains(searchTerm)) {
                searchResult.add(superHero);
                for (int i = 0; i < searchResult.size(); i++)
                //i debug virker det som om at den skaber flere pladser end forventet
                System.out.println(i + 1 + ":" + searchResult.get(i));

            }
            return superheroes;
        }
        return searchResult;
    }


}
