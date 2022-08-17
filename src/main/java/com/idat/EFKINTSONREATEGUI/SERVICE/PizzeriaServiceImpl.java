package com.idat.EFKINTSONREATEGUI.SERVICE;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFKINTSONREATEGUI.CLIENT.OpenFeignPizza;
import com.idat.EFKINTSONREATEGUI.DTO.Pizza;
import com.idat.EFKINTSONREATEGUI.MODEL.Pizzeria;
import com.idat.EFKINTSONREATEGUI.MODEL.PizzeriaDetalle;
import com.idat.EFKINTSONREATEGUI.MODEL.PizzeriaPizzaFK;
import com.idat.EFKINTSONREATEGUI.REPOSITORY.PizzeriaPizzaRepository;
import com.idat.EFKINTSONREATEGUI.REPOSITORY.PizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {
	
	@Autowired
	private PizzeriaRepository repository;
	
	@Autowired
	private PizzeriaPizzaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignPizza feign;

	@Override
	public List<Pizzeria> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Pizzeria ObtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizzeria pizzeria) {
		// TODO Auto-generated method stub
		repository.save(pizzeria);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Pizzeria pizzeria) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(pizzeria);

	}

	@Override
	public void asignarPizzaAPizzeria() {
		
		List<Pizza> listado= feign.listarPizzasSeleccionados();
		PizzeriaPizzaFK fk= null;
		PizzeriaDetalle detalle = null;
		
		for(Pizza pizza: listado) {
			
			fk=new PizzeriaPizzaFK();			
			fk.setIdPizza(pizza.getIdPizza());
			fk.setIdPizerria(1);
			
			detalle = new PizzeriaDetalle();
			detalle.setFk(fk);
			
			repositoryDetalle.save(detalle);
			
		}
		
	}

}
