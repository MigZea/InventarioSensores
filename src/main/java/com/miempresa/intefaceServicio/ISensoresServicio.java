package com.miempresa.intefaceServicio;
import java.util.List;
import java.util.Optional;

import com.miempresa.modelo.Sensores;

public interface ISensoresServicio {
	public List<Sensores> listar();
	public Optional<Sensores> listarId(int id);
	public int guardar(Sensores p);
	public void borrar(int id);
}
