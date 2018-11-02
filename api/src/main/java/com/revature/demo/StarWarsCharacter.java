package com.revature.demo;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "starwarscharacter")
public class StarWarsCharacter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "starwars_id")
	private Integer starWarsId;

	@Column(name = "starwars_name")
	private String starWarsName;

	@Column(name = "starwars_level")
	private String starWarsLvl;

	public Integer getStarWarsId() {
		return starWarsId;
	}

	public void setStarWarsId(Integer starWarsId) {
		this.starWarsId = starWarsId;
	}

	public String getStarWarsName() {
		return starWarsName;
	}

	public void setStarWarsName(String starWarsName) {
		this.starWarsName = starWarsName;
	}

	public String getStarWarsLvl() {
		return starWarsLvl;
	}

	public void setStarWarsLvl(String starWarsLvl) {
		this.starWarsLvl = starWarsLvl;
	}

	@Override
	public String toString() {
		return "StarWarsCharacter [starWarsId=" + starWarsId + ", starWarsName=" + starWarsName + ", starWarsLvl="
				+ starWarsLvl + "]";
	}

}
