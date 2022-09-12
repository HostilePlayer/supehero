package dk.kea;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    int brugerInput;

    //Database database = new Datebase();
    //database.SuperHeroList();

    public static void main(String[] args) {
        Main Program = new Main();

        System.out.println("Whelcome to the Superhero Database!");

        Program.brugerValg();
    }

    public void brugerValg() {
        Main Program = new Main();

        System.out.println("1. for add superhero");
        System.out.println("9. quit program");

        brugerInput = scanner.nextInt();
        if(brugerInput == 1){
            System.out.println("adding superhero");
            Program.addHero();
        }

    }

    public void addHero(){
        //SuperHeroList[] superHero;
        Database.setSuperHero();

        System.out.println("Write a the superhero's name");
        String superHeroNavn = scanner.next();
        System.out.println("Write the superhero's real name");
        String realNavn = scanner.next();
        System.out.println("Is the Superhero human? true or false");
        boolean isHuman = scanner.nextBoolean();
        System.out.println("What year whas the hero first written about?");
        int yearOfCreation = scanner.nextInt();
        System.out.println("how much force in Newton can the superhero do?");
        int strength = scanner.nextInt();

        System.out.println("| Superhero: " + superHeroNavn + " | real name: " + realNavn
        + " | Human: " + isHuman + " | first publish: " + yearOfCreation +
                " | strength in newton: " + strength + " newtons");

        SuperHeroList superHero = new SuperHeroList(superHeroNavn, realNavn, isHuman,
                yearOfCreation, strength);

        //superHero = new SuperHeroList[]{};
        Main Program = new Main();
        Program.brugerValg();
    }

}