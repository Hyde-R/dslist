package com.maxwell04.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxwell04.dslist.dto.GameListDTO;
import com.maxwell04.dslist.services.GameListService;

//Api conectando o back-end ao front-end retornando apenas alguns dados básicos do jogo


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	
	@Autowired
	private GameListService gameListService;
	
	//Requisição Api para encontrar todas as listas
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
}
