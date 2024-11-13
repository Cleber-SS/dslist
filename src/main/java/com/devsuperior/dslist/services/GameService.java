package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
=======

>>>>>>> 9fc4bfb15285536b13317eb404906081163fb4ad
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
<<<<<<< HEAD
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
//		GameDTO dto = new GameDTO(result);
//		return dto;
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
//		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
//		return dto;
		return result.stream().map(x -> new GameMinDTO(x)).toList();
=======
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
>>>>>>> 9fc4bfb15285536b13317eb404906081163fb4ad
	}
}
