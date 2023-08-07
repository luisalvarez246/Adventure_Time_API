package com.adventure_time.services;

import com.adventure_time.model.CharacterAT;
import com.adventure_time.model.repositories.CharacterRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CharacterServiceUnitTest
{
    @Autowired
    CharacterService    characterService;

    @MockBean
    CharacterRepository mockRepository;

    //Mockito test
    @Test
    public void saveCharacter_successful_test()
    {
        //Arrange
        CharacterAT newCharacter = new CharacterAT();
        String      result;
        //Act Configure Mock Behavior
        newCharacter.setName("Marceline");
        when(mockRepository.save(newCharacter)).thenReturn(newCharacter);
        result = characterService.saveCharacter(newCharacter);
        //Assert
        verify(mockRepository).save(newCharacter);
        assertNotNull(newCharacter);
        assertEquals("Character " + newCharacter.getName() + " created successfully", result);
    }

    @Test
    public void saveCharacter_unsuccessful_test()
    {
        //Arrange
        CharacterAT newCharacter = new CharacterAT();
        //Act Configure Mock Behavior
        newCharacter.setName("Marceline");
        when(mockRepository.save(newCharacter)).thenThrow(new RuntimeException("Database save failed"));
        try
        {
           characterService.saveCharacter(newCharacter);
           fail("Expected an exception to be thrown");
        }
        catch(Exception error)
        {
            assertEquals("Character " + newCharacter.getName() + " could not be saved Error: Database save failed", error.getMessage());
        }
        //Assert
        verify(mockRepository).save(newCharacter);
    }
}
