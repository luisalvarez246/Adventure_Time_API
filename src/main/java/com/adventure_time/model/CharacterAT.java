package com.adventure_time.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

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
    @Column(nullable = false)
    private String  name;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status  status;
    private String  species;
    private String  image;

    public CharacterAT()
    {
    }

    public enum Status
    {
        Alive,
        Dead,
        Unknown
    }
}
