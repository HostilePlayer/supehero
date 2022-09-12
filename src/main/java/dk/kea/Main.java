package dk.kea;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    Scanner scanner = new Scanner(System.in);
    int brugerInput;

    ArrayList<SuperHeroList > superhelte = new ArrayList<>();
    Database database = new Database(superhelte);

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
        //Database.setSuperHero();
        //SuperHeroList.SuperHeroList();
        do {
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

            SuperHeroList hero = new SuperHeroList(superHeroNavn, realNavn, isHuman,
                    yearOfCreation, strength);
            //men hvilken plads ligger jeg den?
            System.out.println("The superhero " + superHeroNavn + " added");
        }while (Database.getSuperHero().size() <= 5);
        if (Database.getSuperHero().size() == 5){
            System.out.println("Databasen er fyldt!");
        }
        Main Program = new Main();
        Program.brugerValg();
    }

}