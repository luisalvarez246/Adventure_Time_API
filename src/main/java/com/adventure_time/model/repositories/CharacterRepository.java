package com.adventure_time.model.repositories;
import com.adventure_time.model.CharacterAT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterAT, Integer>
{
}
