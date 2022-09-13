package dk.kea;
import java.util.ArrayList;

    //private SuperHeroList superHero = new setSuperHero();

    public class Database {
        static ArrayList<SuperHeroList> getSuperHero;

        public Database(ArrayList<SuperHeroList> superHero){
            this.getSuperHero = superHero;
            superHero.add(0, new SuperHeroList(SuperHeroList.getSuperHeroName(), SuperHeroList.getRealName(),
                    SuperHeroList.getIsHuman(), SuperHeroList.getYearOfCreation(), SuperHeroList.getStrength()));
        }

        public static ArrayList<SuperHeroList> getSuperHero() {
            return getSuperHero;
        }

        public void getSuperHero(ArrayList<SuperHeroList> getSuperHero) {
            this.getSuperHero = getSuperHero;
        }


    }

