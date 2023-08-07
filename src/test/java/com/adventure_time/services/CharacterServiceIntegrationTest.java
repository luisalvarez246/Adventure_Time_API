package com.adventure_time.services;

import com.adventure_time.model.CharacterAT;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CharacterServiceIntegrationTest
{
    @Autowired
    CharacterService    characterService;

    @Test
    public void updateCharacter_successful_test()
    {
        //Arrange
        CharacterAT newCharacter = new CharacterAT();
        CharacterAT updateCharacter = new CharacterAT();
        String      originalName;
        String      updatedName;
        String      result;
        newCharacter.setId(1);
        newCharacter.setName("Fin");
        updateCharacter.setId(1);
        updateCharacter.setName("Ramon");
        //Act
        characterService.saveCharacter(newCharacter);
        originalName = characterService.getCharacterById(1).getName();
        result = characterService.updateCharacter(updateCharacter);
        updatedName = characterService.getCharacterById(1).getName();
        //Assert
        assertEquals("Fin", originalName);
        assertEquals("Ramon", updatedName);
        assertEquals("Character updated: " + updateCharacter.getName(), result);
    }
}
