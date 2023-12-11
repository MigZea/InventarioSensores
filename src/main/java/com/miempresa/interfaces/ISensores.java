package com.miempresa.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miempresa.modelo.Sensores;

@Repository
public interface ISensores extends CrudRepository<Sensores, Integer> {

}
