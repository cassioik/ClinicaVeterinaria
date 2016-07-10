package com.clinicaveterinaria;

import java.util.List;

import com.clinicaveterinaria.dao.AlergiaDAO;
import com.clinicaveterinaria.dao.AnimalDAO;
import com.clinicaveterinaria.dao.GenericDAO;
import com.clinicaveterinaria.model.Alergia;
import com.clinicaveterinaria.model.Animal;

public class ClinicaVeterinaria {

	public static void main(String[] args) {
//		PessoaDAO pessoaDAO = new PessoaDAO();
//		AlergiaDAO alergiaDAO = new AlergiaDAO();
		AnimalDAO animalDAO = new AnimalDAO();
		try{
//			Pessoa pessoa;
//			pessoaDAO.beginTransaction();
//			pessoa = pessoaDAO.findByCPF(111L);
//			pessoaDAO.commitAndCloseTransaction();
//
//			System.out.println(pessoa.getNome());
			
//			List<Alergia> alergia;
//			alergiaDAO.beginTransaction();
//			alergia = alergiaDAO.listar();
//			
//			for(Alergia a : alergia){
//				System.out.println(a.getNomeAlergia());
//			}
			
			List<Animal> animais;
			animalDAO.beginTransaction();
			animais = animalDAO.listarAnimaisComAlergia(0);
			animalDAO.commitAndCloseTransaction();
			
			for(Animal a : animais){
				System.out.println(a.getNome());
				List<Alergia> alergias = a.getAlergias();
				for(Alergia al : alergias){
					System.out.println(al.getNomeAlergia());
				}
			}
			
		}catch(Exception e){
			animalDAO.rollbackAndCloseTransaction();
//			alergiaDAO.rollbackAndCloseTransaction();
//			pessoaDAO.rollbackAndCloseTransaction();
			e.printStackTrace();
		}finally{
			GenericDAO.fecharEntityManagerFactory();
		}
		System.out.println("Saindo!!!");
	}
}