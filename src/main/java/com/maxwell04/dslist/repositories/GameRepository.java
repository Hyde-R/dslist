package com.maxwell04.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxwell04.dslist.entities.Game;

//Repositório da aplicação que acessa ao banco de dados

public interface GameRepository extends JpaRepository<Game, Long> {
}
