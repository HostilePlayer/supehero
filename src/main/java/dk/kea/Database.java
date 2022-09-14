package dk.kea;
import java.util.ArrayList;

    public class Database {
        public ArrayList<SuperHeroList> superheroes  = new ArrayList<>();

        public void makeSuperHero(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength) {
            SuperHeroList newSuperHero = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);
            superheroes.add(newSuperHero);

        }

        public ArrayList<SuperHeroList> getSuperHero() {
            return superheroes;
        }

        public SuperHeroList searchFor(String searchTerm) {
            for (SuperHeroList superhero : superheroes) {
                String name = superhero.getSuperHeroName().toLowerCase();
                if (name.contains(searchTerm.toLowerCase())) {
                    return superhero;
                }
                return null;
            }

            return null;
        }

    }

