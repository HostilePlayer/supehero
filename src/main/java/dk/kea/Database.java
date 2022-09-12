package dk.kea;
import java.util.ArrayList;

    //private SuperHeroList superHero = new setSuperHero();

    public class Database {
        static ArrayList<SuperHeroList> getSuperHero;

        public Database(ArrayList<SuperHeroList> superhelte){
            this.getSuperHero = superhelte;
        }

        public static ArrayList<SuperHeroList> getSuperHero() {
            return getSuperHero;
        }

        public void getSuperHero(ArrayList<SuperHeroList> getSuperHero) {
            this.getSuperHero = getSuperHero;
        }


    }

