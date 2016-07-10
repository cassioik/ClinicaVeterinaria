package com.clinicaveterinaria.dao;

import com.clinicaveterinaria.model.TipoAnimal;

public class TipoAnimalDAO extends GenericDAO<Integer, TipoAnimal>{

	public TipoAnimalDAO() {
		super(TipoAnimal.class);
	}

}
