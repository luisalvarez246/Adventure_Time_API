package com.adventure_time.services;

import com.adventure_time.model.CharacterAT;
import com.adventure_time.model.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    /*
    public void createCharacter(Character character)
    {
        characterRepository.save(character);
    }*/
}
