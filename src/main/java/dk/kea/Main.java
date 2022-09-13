package dk.kea;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    Scanner scanner = new Scanner(System.in);

    ArrayList<SuperHeroList > superHero = new ArrayList<>();
    Database database = new Database();

    public static void main(String[] args) {
        Main Program = new Main();

        System.out.println("Whelcome to the Superhero Database!");

        Program.brugerValg();
    }

    public void brugerValg() {
        Main Program = new Main();

        System.out.println("1. for add superhero");
        System.out.println("2. for list of superhero's");
        System.out.println("9. quit program");
        System.out.println("----------");

        int brugerInput = scanner.nextInt();



        if(brugerInput == 1){

            addHero();
        }else if(brugerInput == 2){

            printHero();
        }
    }

    public void addHero(){
            Main Program = new Main();
        System.out.println("adding superhero");

            System.out.println("Write a the superhero's name");
            String superHeroName = scanner.next();
            System.out.println("Write the superhero's real name");
            String realName = scanner.next();
            System.out.println("Is the Superhero human? write yes or no");
            String isHuman = scanner.next();
            System.out.println("What year whas the hero first written about?");
            int yearOfCreation = scanner.nextInt();
            System.out.println("how much force in Newton can the superhero do?");
            int strength = scanner.nextInt();

            System.out.println("| Superhero: " + superHeroName + " | real name: " + realName
                    + " | Human: " + isHuman + " | first publish: " + yearOfCreation +
                    " | strength in newton: " + strength + " newtons");

            database.makeSuperHero(superHeroName, realName, isHuman, yearOfCreation, strength);
            SuperHeroList hero1 = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);

            //men hvilken plads ligger jeg den?
            System.out.println("The superhero " + superHeroName + " added");

           // System.out.println("Number of superhero's: "+Database.getSuperHero().size());
            System.out.println("----------");

            brugerValg();
    }

    public void printHero(){
        Main Program = new Main();

        System.out.println("list of superhero's");

        for(SuperHeroList hero : database.getSuperHero()){
            System.out.println(" ");
            System.out.println(hero);
            System.out.println(superHero);
            System.out.println("SuperHero name: "+SuperHeroList.getSuperHeroName());
            System.out.println("SuperHero Real name: "+SuperHeroList.getRealName());
            System.out.println("is it Human: "+SuperHeroList.getIsHuman());
            System.out.println("first publish: "+SuperHeroList.getYearOfCreation());
            System.out.println("first publish: "+SuperHeroList.getStrength());
            System.out.println("----------");
        }



        brugerValg();
    }
}