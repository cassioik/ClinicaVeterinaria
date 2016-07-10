package com.clinicaveterinaria.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.clinicaveterinaria.model.Animal;

public class AnimalDAO extends GenericDAO<Integer, Animal> {

	public AnimalDAO() {
		super(Animal.class);
	}

	public List<Animal> listarAnimaisComAlergia(Integer idAlergia){
		Query query = super.getEntityManager().createNamedQuery("Animal.listAnimaisPorAlergia");
		query.setParameter("idAlergia", idAlergia);
		
		@SuppressWarnings("unchecked")
		List<Animal> retorno = query.getResultList();
		return retorno;
	}
	
}
