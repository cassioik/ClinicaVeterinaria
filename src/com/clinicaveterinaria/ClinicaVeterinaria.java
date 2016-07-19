package com.clinicaveterinaria;

import com.clinicaveterinaria.dao.GenericDAO;
import com.clinicaveterinaria.facade.AnimalFacade;
import com.clinicaveterinaria.model.Animal;

public class ClinicaVeterinaria {

	public static void main(String[] args) {
		try {
			AnimalFacade facade = new AnimalFacade();
			Animal animal = facade.buscar(0);
			System.out.println(animal.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			GenericDAO.fecharEntityManagerFactory();
		}
		System.out.println("Saindo!!!");
	}
}