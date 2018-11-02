package com.revature.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarWarsDao extends CrudRepository<StarWarsCharacter, Integer>{

}
