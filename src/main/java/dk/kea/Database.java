package dk.kea;
import java.util.ArrayList;

    //private SuperHeroList superHero = new setSuperHero();

    public class Database {
        public static ArrayList<SuperHeroList> getSuperHero;

        public Database(ArrayList<SuperHeroList> superHero){
            //jeg skal enten fortælle den at den skal bruge en ny plads hvergang eller ikke have den static
            this.getSuperHero= superHero;
            superHero.add( new SuperHeroList(SuperHeroList.getSuperHeroName(), SuperHeroList.getRealName(),
                    SuperHeroList.getIsHuman(), SuperHeroList.getYearOfCreation(), SuperHeroList.getStrength()));
        }

        public static ArrayList<SuperHeroList> getSuperHero() {
            return getSuperHero;
        }

        public void getSuperHero(ArrayList<SuperHeroList> getSuperHero) {
            this.getSuperHero = getSuperHero;
        }


    }

