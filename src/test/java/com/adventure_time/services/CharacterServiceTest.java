package com.adventure_time.services;

import com.adventure_time.model.CharacterAT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CharacterServiceTest
{
    @Autowired
    CharacterService services;

    @Test
    public void getAllCharacters_returns_a_list_of_all_characters()
    {
        //Arrange
        ArrayList<CharacterAT> characterList;
        //Act
        characterList = services.getAllCharacters();
        //Assert
        for (CharacterAT character : characterList)
        {
            System.out.println("ID: " + character.getId());
            System.out.println("Name: " + character.getName());
            // Print other fields as needed
            System.out.println("-----------------------");
        }
        System.out.println(characterList.size());
    }
    @Test
    public void getCharacterById_returns_a_character_if_it_exists()
    {
        //Arrange
        CharacterAT character;
        CharacterAT nullCharacter;
        //Act
        character = services.getCharacterById(1);
        nullCharacter = services.getCharacterById(100);
        //Assert
        assertEquals("Finn", character.getName());
        assertNull(nullCharacter);
    }

    @Test
    public void deleteCharacter_deletes_a_specific_character_if_it_is_found()
    {
        //Arrange
        int                     id;
        String                  deletedCharacter;
        String                  notFoundCharacter;
        //Act
        id = services.getAllCharacters().size();
        deletedCharacter = services.deleteCharacterById(id);
        notFoundCharacter = services.deleteCharacterById(100);
        //Assert
        assertEquals("Deleted " + id, deletedCharacter);
        assertEquals("Not Deleted, Record with ID: " + 100 + " does not exist", notFoundCharacter);
    }
    @Test
    public void saveCharacter_creates_a_new_Character()
    {

    }
}