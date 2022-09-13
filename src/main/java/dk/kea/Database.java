package dk.kea;
import java.util.ArrayList;

    //private SuperHeroList superHero = new setSuperHero();

    public class Database {
        //public static ArrayList<SuperHeroList> getSuperHero;
        private ArrayList<SuperHeroList> SuperHeroList = new ArrayList<>();
        private SuperHeroList[] superHero = new SuperHeroList[5];
        private int index = 0;

        public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
            SuperHeroList newHero = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);
            SuperHeroList.add(newHero);

            superHero[index] = newHero;
            index++;


        }

        public ArrayList<SuperHeroList> getSuperHero() {
            return SuperHeroList;
        }


    }

