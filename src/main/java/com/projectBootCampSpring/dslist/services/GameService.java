package com.projectBootCampSpring.dslist.services;

import com.projectBootCampSpring.dslist.dto.GameMinDTO;
import com.projectBootCampSpring.dslist.entities.Game;
import com.projectBootCampSpring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findALL(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x) ).toList();

        // stream() lib permite hacer operaciones con sequencia de datos
        // map() transforma objetos Game para GameMinDTO usando x como argumento
        // toList para transformar stream() para una lista
    }
}
