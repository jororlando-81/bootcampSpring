package com.projectBootCampSpring.dslist.repositories;

import com.projectBootCampSpring.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
