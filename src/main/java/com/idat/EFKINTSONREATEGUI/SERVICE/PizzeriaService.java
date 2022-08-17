package com.idat.EFKINTSONREATEGUI.SERVICE;

import java.util.List;

import com.idat.EFKINTSONREATEGUI.MODEL.Pizzeria;




public interface PizzeriaService {
	

	List<Pizzeria> listar();
	Pizzeria ObtenerId(Integer id);	
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
	
	void asignarPizzaAPizzeria();

}