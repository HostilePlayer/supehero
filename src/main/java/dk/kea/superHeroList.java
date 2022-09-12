package dk.kea;

public class superHeroList {
    public static String superHeroName;
    static String realName;
    static boolean isHuman;
    static int yearOfCreation;
    static int strength;

    public superHeroList(String superHeroName, String realName, boolean isHuman, int yearOfCreation, int strength){
        this.superHeroName = superHeroName;
        this.realName = realName;
        this.isHuman = isHuman;
        this.yearOfCreation = yearOfCreation;
        this.strength = strength;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public String getRealName() {
        return realName;
    }

    public boolean getIsHuman() {
        return isHuman;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public int getStrength() {
        return strength;
    }
}


