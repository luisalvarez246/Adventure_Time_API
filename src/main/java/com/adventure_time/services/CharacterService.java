package com.adventure_time.services;

import com.adventure_time.model.CharacterAT;
import com.adventure_time.model.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterService
{
    @Autowired
    CharacterRepository characterRepository;

    public ArrayList<CharacterAT> getAllCharacters()
    {
        ArrayList<CharacterAT> characterList;

        characterList = (ArrayList<CharacterAT>) characterRepository.findAll();
        return (characterList);
    }

    public CharacterAT getCharacterById(int id)
    {
        CharacterAT character;

        character =  characterRepository.findById(id).orElse(null);
        return (character);
    }

    public String deleteCharacterById(int id)
    {
        if (characterRepository.existsById(id))
        {
            characterRepository.deleteById(id);
            return("Deleted " + id);
        }
        else
        {
            return("Not Deleted, Record with ID: " + id + " does not exist");
        }
    }

    /*
    public void createCharacter(Character character)
    {
        characterRepository.save(character);
    }*/
}
