package com.revature.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarWarsService {

	@Autowired
	private StarWarsDao StarwarsDao;

	public StarWarsCharacter createStarWarsCharacter(StarWarsCharacter Starwarscharacter) {
		return StarwarsDao.save(Starwarscharacter);
	}

	public Optional<StarWarsCharacter> getStarWarsCharacterById(Integer StarWarsId) {
		return StarwarsDao.findById(StarWarsId);
	}

}
