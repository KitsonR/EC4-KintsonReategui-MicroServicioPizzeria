package com.idat.EFKINTSONREATEGUI.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFKINTSONREATEGUI.MODEL.PizzeriaDetalle;


@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzeriaDetalle, Integer> {

}
