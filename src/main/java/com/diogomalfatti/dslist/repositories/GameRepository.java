package com.diogomalfatti.dslist.repositories;

import com.diogomalfatti.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
