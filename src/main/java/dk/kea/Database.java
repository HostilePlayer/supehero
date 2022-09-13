package dk.kea;
import java.util.ArrayList;

    //private SuperHeroList superHero = new setSuperHero();

    public class Database {
        //public static ArrayList<SuperHeroList> getSuperHero;
        private ArrayList<SuperHeroList> superheroes = new ArrayList<>();
        private SuperHeroList[] superHero = new SuperHeroList[0];
        private int index = 0;

        public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
            SuperHeroList hero = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);

            superHero[index] = hero;
            index++;

            ArrayList<String> superheroes = new ArrayList<>();

        }

        public ArrayList<SuperHeroList> getSuperHero() {
            return superheroes;
        }


    }

