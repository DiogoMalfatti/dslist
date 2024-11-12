package com.diogomalfatti.dslist.services;

import com.diogomalfatti.dslist.dto.GameDTO;
import com.diogomalfatti.dslist.dto.GameMinDTO;
import com.diogomalfatti.dslist.entities.Game;
import com.diogomalfatti.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    /* tratamento de exceções */
    return new GameDTO(result);
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();
  }

}
