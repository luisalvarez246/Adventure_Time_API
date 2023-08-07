package com.adventure_time.services;

import com.adventure_time.model.CharacterAT;
import com.adventure_time.model.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public String saveCharacter(CharacterAT newCharacter)
    {
        try
        {
            characterRepository.save(newCharacter);
            return ("Character " + newCharacter.getName() + " created successfully");
        }
        catch(Exception error)
        {
            throw new RuntimeException ("Character " + newCharacter.getName() + " could not be saved Error: " + error.getMessage());
        }
    }

    public String updateCharacter(CharacterAT updatedCharacter)
    {
        try
        {
            if (characterRepository.existsById(updatedCharacter.getId()))
            {
                characterRepository.save(updatedCharacter);
                return ("Character updated: " + updatedCharacter.getName());
            }
            else
                return ("Character not updated: Record with ID: " + updatedCharacter.getId() + " does not exist");
        }
        catch(Exception error)
        {
            throw new RuntimeException("Character not updated: " + error.getMessage());
        }
    }
}
