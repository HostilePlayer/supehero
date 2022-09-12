package dk.kea;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    String superHeroName;
    String realName;
    boolean isHuman;
    int yearOfCreation;
    int Strength;


    public static void main(String[] args) {

        System.out.println("Whelcome to the Superhero Database!");
        System.out.println("please add superhero");

        Main Program = new Main();
        Program.start();

    }

    public void start(){

        System.out.println("Write a the superhero's name");
        superHeroName = scanner.next();
        System.out.println("Write the superhero's real name");
        realName = scanner.next();
        System.out.println("Is the Superhero human? true or false");
        isHuman = scanner.nextBoolean();
        System.out.println("What year whas the hero first written about?");
        yearOfCreation = scanner.nextInt();
        System.out.println("how much force in Newton can the superhero do?");
        Strength = scanner.nextInt();



    }

}