package com.adventure_time.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CharacterATTest
{
    CharacterAT characterAT = new CharacterAT(1, "Billy", "Dead", "Human", "url");

    @Test
    public void Character_has_a_name()
    {
        //arrange
        String  name;
        //act
        name = characterAT.getName();
        //assert
        assertEquals("Billy", name);
    }
}