package com.maxwell04.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxwell04.dslist.dto.GameMinDTO;
import com.maxwell04.dslist.entities.Game;
import com.maxwell04.dslist.repositories.GameRepository;

//Lógica de serviço da aplicação

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
