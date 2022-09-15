package dk.kea;

public class SuperHeroList {

    private String superHeroName;
    private String realName;
    private String isHuman;
    private int yearOfCreation;
    private int strength;


    public SuperHeroList(String superHeroName, String realName, String isHuman, int yearOfCreation, int strength){
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

    public String getIsHuman() {
        return isHuman;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public int getStrength() {
        return strength;
    }

}


