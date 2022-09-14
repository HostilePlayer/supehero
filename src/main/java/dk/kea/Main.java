package dk.kea;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    Scanner scanner = new Scanner(System.in);
    private Database database;

    public static void main(String[] args) {

        Main Program = new Main();
        Program.database = new Database();
        Program.brugerValg();

    }

    public void brugerValg() {

        System.out.println("Whelcome to the Superhero Database!");


        int brugerInput = scanner.nextInt();

        while (brugerInput != 9){
            System.out.println("1. for add superhero");
            System.out.println("2. for list of superhero's");
            System.out.println("9. quit program");
            System.out.println("----------");
            if(brugerInput == 1){
                addHero();
            } else if (brugerInput == 2){
                printHero();
            }



        }
    }

    public void addHero(){
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
            //SuperHeroList hero1 = new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength);

            //men hvilken plads ligger jeg den?
            System.out.println("The superhero " + superHeroName + " added");

           // System.out.println("Number of superhero's: "+Database.getSuperHero().size());
            System.out.println("----------");


    }

    public void printHero(){

        System.out.println("list of superhero's");
        //System.out.println(superHero); //prints [], virker ikke i for loop
        //System.out.println(database.getSuperHero()); //prints [], virker ikke i for loop

        for(SuperHeroList newHero : database.getSuperHero()){
            System.out.println(" ");
            //System.out.println(newHero); // returns dk.kea.SuperHeroList@5197848c
            System.out.println("----------");

            System.out.println(database.getSuperHero());

            /*
            //prints den info jeg vil have men kun den nyeste input
            System.out.println("SuperHero name: "+SuperHeroList.getSuperHeroName());
            System.out.println("SuperHero Real name: "+SuperHeroList.getRealName());
            System.out.println("is it Human: "+SuperHeroList.getIsHuman());
            System.out.println("first publish: "+SuperHeroList.getYearOfCreation());
            System.out.println("first publish: "+SuperHeroList.getStrength());
            System.out.println("----------");
            */
        }


    }
}