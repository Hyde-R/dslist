package com.maxwell04.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxwell04.dslist.dto.GameDTO;
import com.maxwell04.dslist.dto.GameMinDTO;
import com.maxwell04.dslist.services.GameService;

//Api conectando o back-end ao front-end retornando apenas alguns dados básicos do jogo


@RestController
@RequestMapping(value = "/games")
public class GameController {

	
	@Autowired
	private GameService gameService;
	
	//Requisição Api para encontrar um game pela ID 
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	//Requisição Api para encontrar todos os jogos na lista
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
}
