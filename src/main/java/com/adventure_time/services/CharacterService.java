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
    private final CharacterRepository characterRepository;
    @Autowired
    public CharacterService(CharacterRepository characterRepository)
    {
        this.characterRepository = characterRepository;
    }

    public List<CharacterAT> getCharacters()
    {
        List<CharacterAT> characterList;

        characterList = characterRepository.findAll();
        return (characterList);
    }

    /*
    public void createCharacter(Character character)
    {
        characterRepository.save(character);
    }*/
}
