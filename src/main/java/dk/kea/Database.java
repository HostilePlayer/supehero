package dk.kea;

public class Database {
    //private SuperHeroList superHero = new setSuperHero();


    public static SuperHeroList setSuperHero(String superHeroNavn, String realNavn, boolean isHuman, int yearOfCreation, int strength) {
        SuperHeroList superHero1 = new SuperHeroList(SuperHeroList.getSuperHeroName(), SuperHeroList.getRealName(),
                SuperHeroList.getIsHuman(), SuperHeroList.getYearOfCreation(), SuperHeroList.getStrength());

        SuperHeroList superHero2 = new SuperHeroList(SuperHeroList.getSuperHeroName(), SuperHeroList.getRealName(),
                SuperHeroList.getIsHuman(), SuperHeroList.getYearOfCreation(), SuperHeroList.getStrength());

        SuperHeroList superHero3 = new SuperHeroList(SuperHeroList.getSuperHeroName(), SuperHeroList.getRealName(),
                SuperHeroList.getIsHuman(), SuperHeroList.getYearOfCreation(), SuperHeroList.getStrength());

        SuperHeroList superHero4 = new SuperHeroList(SuperHeroList.getSuperHeroName(), SuperHeroList.getRealName(),
                SuperHeroList.getIsHuman(), SuperHeroList.getYearOfCreation(), SuperHeroList.getStrength());

        SuperHeroList superHero5 = new SuperHeroList(SuperHeroList.getSuperHeroName(), SuperHeroList.getRealName(),
                SuperHeroList.getIsHuman(), SuperHeroList.getYearOfCreation(), SuperHeroList.getStrength());
        return superHero1;
    }
}
