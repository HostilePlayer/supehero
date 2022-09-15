package dk.kea;

public class SuperHeroList {

    private static String superHeroName;
    private static String realName;
    private static String isHuman;
    private static int yearOfCreation;
    private static int strength;


    public SuperHeroList(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength){
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

    public static String getIsHuman() {
        return isHuman;
    }

    public static int getYearOfCreation() {
        return yearOfCreation;
    }

    public static int getStrength() {
        return strength;
    }

}


