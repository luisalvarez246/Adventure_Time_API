package com.adventure_time.model.repositories;
import com.adventure_time.model.CharacterAT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterAT, Integer> {
}
