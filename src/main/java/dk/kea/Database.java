package dk.kea;
import java.util.ArrayList;

    //private SuperHeroList superHero = new setSuperHero();

    public class Database {
        //public static ArrayList<SuperHeroList> getSuperHero;
        private ArrayList<SuperHeroList> superheroes = new ArrayList<>();
        private int index = 0;

        public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
            SuperHeroList hero1 = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);
            superheroes.add(hero1);

        }

        public ArrayList<SuperHeroList> getSuperHero() {
            return superheroes;
        }
    }

