package com.revature.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/starwars")
public class StarWarsController {

	@Autowired
	private StarWarsService starWarsService;

	@PostMapping(value="/create")
	public StarWarsCharacter createStarWarsCharacter(StarWarsCharacter starwarscharacter) {
		return starWarsService.createStarWarsCharacter(starwarscharacter);
	}
	
	@GetMapping(value="/character/{starWarsId}")
	public Optional<StarWarsCharacter> getStarWarsCharacterById(@PathVariable("starWarsId")Integer starWarsId) {
		return starWarsService.getStarWarsCharacterById(starWarsId);
	}
}
