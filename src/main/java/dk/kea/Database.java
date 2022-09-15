package dk.kea;
import javax.xml.crypto.Data;
import java.util.ArrayList;

    public class Database {
        public ArrayList<SuperHeroList> superheroes;
        public Database(){
            superheroes = new ArrayList<>();
        }

        //TODO find fejl der overwriter tidliger inputs men beholder antallet af inputs
        public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
            //SuperHeroList newSuperHero = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);
            //superheroes.add(newSuperHero);
            superheroes.add( new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength));
        }

        public ArrayList<SuperHeroList> getSuperHero() {
            return superheroes;
        }

        public SuperHeroList searchFor(String searchTerm) {
            for (SuperHeroList superHero : superheroes) {
                String name = SuperHeroList.getSuperHeroName().toLowerCase();
                if (name.contains(searchTerm.toLowerCase())) {
                    return superHero;
                }
                return null;
            }

            return null;
        }

    }

