package com.idat.EFKINTSONREATEGUI.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFKINTSONREATEGUI.MODEL.Pizzeria;



@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {

}
