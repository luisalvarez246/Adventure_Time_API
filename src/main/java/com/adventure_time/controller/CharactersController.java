package com.adventure_time.controller;

import com.adventure_time.model.CharacterAT;
import com.adventure_time.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/characters")
public class CharactersController
{
    @Autowired
    CharacterService    characterService;

    @GetMapping
    public  ArrayList<CharacterAT> getAllCharacters()
    {
        return (characterService.getAllCharacters());
    }

    @GetMapping(path = "/{id}")
    public  CharacterAT getCharacterById(@PathVariable int id)
    {
        return (characterService.getCharacterById(id));
    }
}