package dk.kea;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    Scanner scanner = new Scanner(System.in);
    int brugerInput;

    ArrayList<SuperHeroList > superHero = new ArrayList<>();
    Database database = new Database(superHero);

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

        brugerInput = scanner.nextInt();
        if(brugerInput == 1){
            System.out.println("adding superhero");
            Program.addHero();
        }

        if(brugerInput == 2){
            System.out.println("viser liste");
            Program.printHero();
        }
    }

    public void addHero(){

            System.out.println("Write a the superhero's name");
            String superHeroNavn = scanner.next();
            System.out.println("Write the superhero's real name");
            String realNavn = scanner.next();
            System.out.println("Is the Superhero human? write yes or no");
            String isHuman = scanner.next();
            System.out.println("What year whas the hero first written about?");
            int yearOfCreation = scanner.nextInt();
            System.out.println("how much force in Newton can the superhero do?");
            int strength = scanner.nextInt();

            System.out.println("| Superhero: " + superHeroNavn + " | real name: " + realNavn
                    + " | Human: " + isHuman + " | first publish: " + yearOfCreation +
                    " | strength in newton: " + strength + " newtons");

            SuperHeroList superHero = new SuperHeroList(superHeroNavn, realNavn, isHuman,
                    yearOfCreation, strength);


            //men hvilken plads ligger jeg den?
            System.out.println("The superhero " + superHeroNavn + " added");

            System.out.println("Number of superhero's: "+Database.getSuperHero().size());
            System.out.println("----------");

        Main Program = new Main();
        Program.brugerValg();
    }

    public void printHero(){

        for(SuperHeroList superhero : superHero){
            System.out.println("SuperHero name: "+SuperHeroList.getSuperHeroName());
            System.out.println("SuperHero Real name: "+SuperHeroList.getRealName());
            System.out.println("is it Human: "+SuperHeroList.getIsHuman());
            System.out.println("first publish: "+SuperHeroList.getYearOfCreation());
            System.out.println("first publish: "+SuperHeroList.getStrength());
            System.out.println("----------");
        }

        Main Program = new Main();
        Program.brugerValg();
    }
}