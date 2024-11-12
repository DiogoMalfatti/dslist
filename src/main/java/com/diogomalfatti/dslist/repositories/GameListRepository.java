package com.diogomalfatti.dslist.repositories;

import com.diogomalfatti.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
