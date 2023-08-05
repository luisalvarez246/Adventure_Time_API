package com.adventure_time.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Characters")
@Getter
@Setter
@AllArgsConstructor
public class CharacterAT
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int     id;
    private String  name;
    private String  status;
    private String  species;
    private String  image;

    public CharacterAT()
    {
    }
}
