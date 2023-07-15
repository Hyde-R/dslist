package com.maxwell04.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxwell04.dslist.dto.GameListDTO;
import com.maxwell04.dslist.dto.GameMinDTO;
import com.maxwell04.dslist.dto.ReplacementDTO;
import com.maxwell04.dslist.services.GameListService;
import com.maxwell04.dslist.services.GameService;

//Api conectando o back-end ao front-end retornando apenas alguns dados básicos do jogo


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	//Requisição Api para encontrar todas as listas
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	//
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
		@PostMapping(value = "/{listId}/replacement")
		public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
			gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
}
	
}