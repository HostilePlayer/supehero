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

    }

    public void brugerValg() {
        Main Program = new Main();

        System.out.println("1. for add superhero");
        System.out.println("9. quit program");

        brugerInput = scanner.nextInt();
        if(brugerInput == 1){
            Program.start();

            System.out.println("please add superhero");
        }

    }

    public void start(){
        //SuperHeroList[] superHero;
        Database.setSuperHero();

        System.out.println("Write a the superhero's name");
        SuperHeroList.superHeroName = scanner.next();
        System.out.println("Write the superhero's real name");
        SuperHeroList.realName = scanner.next();
        System.out.println("Is the Superhero human? true or false");
        SuperHeroList.isHuman = scanner.nextBoolean();
        System.out.println("What year whas the hero first written about?");
        SuperHeroList.yearOfCreation = scanner.nextInt();
        System.out.println("how much force in Newton can the superhero do?");
        SuperHeroList.strength = scanner.nextInt();

        System.out.println("| Superhero: " + SuperHeroList.superHeroName + " | real name: " + SuperHeroList.realName
        + " | Human: " + SuperHeroList.isHuman + " | first publish: " + SuperHeroList.yearOfCreation +
                " | strength in newton: " + SuperHeroList.strength + " newtons");

        //superHero = new SuperHeroList[]{};
        Main Program = new Main();
        Program.brugerValg();
    }

}