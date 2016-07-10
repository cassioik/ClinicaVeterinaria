package com.clinicaveterinaria.dao;

import java.util.List;

import javax.persistence.Query;

import com.clinicaveterinaria.model.Alergia;

public class AlergiaDAO extends GenericDAO<Integer, Alergia>{

	public AlergiaDAO() {
		super(Alergia.class);
	}

	public List<Alergia> listar(){
		Query query = super.getEntityManager().createNamedQuery("Alergia.listAll");
		
		@SuppressWarnings("unchecked")
		List<Alergia> retorno = query.getResultList();
		return retorno;
	}
}
