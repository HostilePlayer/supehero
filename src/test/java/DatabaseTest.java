import dk.kea.Database;
import dk.kea.SuperHeroList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    public ArrayList<SuperHeroList> superheroes = new ArrayList<>();
    public ArrayList<SuperHeroList> searchResult = new ArrayList<>();
    private Database database;

    @BeforeEach
    public void startup() {
        database = new Database();
        superheroes.add(new SuperHeroList("superman", "clark kent", "no", 1938, 25874));
        superheroes.add(new SuperHeroList("batman", "bruce wayne", "yes", 1964, 25873));
        superheroes.add(new SuperHeroList("wonderwoman", "Wendy", "yes", 1964, 25873));
        superheroes.add(new SuperHeroList("ironman", "tony stark", "yes", 1964, 25873));
        superheroes.add(new SuperHeroList("mars", "marshen man", "no", 1950, 25873));
    }

    @Test
    public void addHero() {
        //Arrange
        int expected = 6;
        //Act
        String superHeroName = "john";

        String realName = "Cena";

        String isHuman = "yes";

        int yearOfCreation = 2;

        int strength = 9001;

        superheroes.add(new SuperHeroList(superHeroName, realName, isHuman, yearOfCreation, strength));
        //Assert
        assertEquals(expected, superheroes.size());
    }

    @Test
    public void addHero3() {
        //Arrange
        int expected = 8;
        //Act
        superheroes.add(new SuperHeroList("bob", "bob", "yes", 1992, 5));
        superheroes.add(new SuperHeroList("john", "cena", "no", 2, 9001));
        superheroes.add(new SuperHeroList("fish", "man", "no", 1852, 50));
        //Assert
        assertEquals(expected, superheroes.size());
    }

    @Test
    public void searchHero(){
        //Arrange
        int expected = 1;
        //Act
        String searchTerm = "mars";
        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            if (name.contains(searchTerm)) {
                //hvis et element matcher skal det addes
                if (!searchResult.contains(superHero)) {
                    //add element : men add 2 gange?
                    searchResult.add(superHero);
                }
            }
        }
        //Assert
        assertEquals(expected, searchResult.size());
    }

    @Test
    public void searchHero2(){
        //Arrange
        int expected = 2;
        //Act
        String searchTerm = "s";
        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            if (name.contains(searchTerm)) {
                //hvis et element matcher skal det addes
                if (!searchResult.contains(superHero)) {
                    //add element : men add 2 gange?
                    searchResult.add(superHero);
                }
            }
        }
        //Assert
        assertEquals(expected, searchResult.size());
    }

    @Test
    public void searchHeroFlere(){
        //Arrange
        int expected = 4;
        //Act
        String searchTerm = "man";
        for (SuperHeroList superHero : superheroes) {
            String name = superHero.getSuperHeroName().toLowerCase();
            if (name.contains(searchTerm)) {
                //hvis et element matcher skal det addes
                if (!searchResult.contains(superHero)) {
                    //add element : men add 2 gange?
                    searchResult.add(superHero);
                }
            }
        }
        //Assert
        assertEquals(expected, searchResult.size());
    }


    @Test
    public void deleteHero(){
        //Arrange
        int expected = 4;
        //Act
        for (int i = 0; i < superheroes.size(); i++) {
            System.out.println(i + 1 + ":" + superheroes.get(i));
        }
        int nummer = 1;
        superheroes.remove(nummer);
        //Assert
        assertEquals(expected, superheroes.size());
    }
}
