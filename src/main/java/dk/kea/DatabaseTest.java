package dk.kea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    private Database database;

    @BeforeEach
    public void startup() {
        database = new Database();
        database.makeSuperHero("superman", "clark kent", "no", 1938, 25874);
        database.makeSuperHero("batman", "bruce wayne", "yes", 1964, 25873);
        database.makeSuperHero("wonderwoman", "Wendy", "yes", 1964, 25873);
        database.makeSuperHero("ironman", "tony stark", "yes", 1964, 25873);
        database.makeSuperHero("mars", "marshen man", "no", 1950, 25873);
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

        database.makeSuperHero(superHeroName, realName, isHuman, yearOfCreation, strength);
        //assert
        assertEquals(expected, database.superheroes.size());
    }

    @Test
    public void addHero3() {
        //Arrange
        int expected = 8;
        //Act
        database.makeSuperHero("bob", "bob", "yes", 1992, 5);
        database.makeSuperHero("john", "cena", "no", 2, 9001);
        database.makeSuperHero("fish", "man", "no", 1852, 50);
        //assert
        assertEquals(expected, database.superheroes.size());
    }

    @Test
    public void searchHero(){
        //arrange
        int expected = 1;
        //Act
        String searchTerm = "mars";
        ArrayList<SuperHeroList> searchResult = database.searchForSuperHeroName(searchTerm);
        database.searchForSuperHeroName(searchTerm);
        assertEquals(expected, database.searchResult.size());
    }

    @Test
    public void searchHero2(){
        //arrange
        int expected = 2;
        //Act
        String searchTerm = "s";
        ArrayList<SuperHeroList> searchResult = database.searchForSuperHeroName(searchTerm);
        database.searchForSuperHeroName(searchTerm);
        assertEquals(expected, database.searchResult.size());
    }

    @Test
    public void searchHeroFlere(){
        //arrange
        int expected = 4;
        //Act
        String searchTerm = "man";
        ArrayList<SuperHeroList> searchResult = database.searchForSuperHeroName(searchTerm);
        database.searchForSuperHeroName(searchTerm);
        assertEquals(expected, database.searchResult.size());
    }
}
