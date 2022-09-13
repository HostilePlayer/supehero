package dk.kea;
import java.util.ArrayList;

    public class Database {
        //public static ArrayList<SuperHeroList> getSuperHero;
        ArrayList<SuperHeroList> newHero = new ArrayList<>();

        public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
            SuperHeroList newHero = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);
            //SuperHeroList.add(newHero);
            //newHero.add(new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength));
        }

        public ArrayList<SuperHeroList> getSuperHero() {
            return newHero;
        }


    }

