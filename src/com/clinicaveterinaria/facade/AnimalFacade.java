package com.clinicaveterinaria.facade;

import com.clinicaveterinaria.dao.AnimalDAO;
import com.clinicaveterinaria.model.Animal;

public class AnimalFacade {
	private AnimalDAO dao = new AnimalDAO();

	public void save(Animal animal) throws Exception {
		try {
			dao.beginTransaction();
			dao.save(animal);
			dao.commitAndCloseTransaction();
		} catch (Exception e) {
			dao.rollbackAndCloseTransaction();
			throw e;
		}
	}

	public void update(Animal animal) throws Exception {
		try {
			dao.beginTransaction();
			dao.update(animal);
			dao.commitAndCloseTransaction();
		} catch (Exception e) {
			dao.rollbackAndCloseTransaction();
			throw new Exception(e);
		}
	}

	public Animal buscar(Integer id) throws Exception {
		try {
			dao.beginTransaction();
			Animal animal = dao.find(id);
			dao.commitAndCloseTransaction();
			return animal;
		} catch (Exception e) {
			dao.rollbackAndCloseTransaction();
			throw e;
		}
	}

	public void delete(Integer id) throws Exception {
		try {
			dao.beginTransaction();
			Animal animal = dao.findReferenceOnly(id);
			dao.delete(animal);
			dao.commitAndCloseTransaction();
		} catch (Exception e) {
			dao.rollbackAndCloseTransaction();
			throw e;
		}
	}
}
