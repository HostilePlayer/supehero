package dk.kea;

public class SuperHeroList {

    private static SuperHeroList[] superHero;
    public static String superHeroName;
    public static String realName;
    public static boolean isHuman;
    public static int yearOfCreation;
    public static int strength;


    public SuperHeroList(String superHeroName, String realName, boolean isHuman, int yearOfCreation, int strength){
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.isHuman = isHuman;
        this.yearOfCreation = yearOfCreation;
        this.strength = strength;
    }

    public static String getSuperHeroName() {
        return superHeroName;
    }

    public static String getRealName() {
        return realName;
    }

    public static boolean getIsHuman() {
        return isHuman;
    }

    public static int getYearOfCreation() {
        return yearOfCreation;
    }

    public static int getStrength() {
        return strength;
    }
}


