package com.maxwell04.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.maxwell04.dslist.entities.GameList;

//Repositório da aplicação que acessa ao banco de dados

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	//Atualizando a ordem dos jogos em uma lista após arrastar itens e trocar as posições. 
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
	void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
