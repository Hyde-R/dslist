package com.maxwell04.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxwell04.dslist.entities.GameList;

//Repositório da aplicação que acessa ao banco de dados

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
