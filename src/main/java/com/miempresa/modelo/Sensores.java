package com.miempresa.modelo;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "Sensores")
public class Sensores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "valor")
    private String valor;

    @Column(name = "latitud")
    private double latitud;

    @Column(name = "longitud")
    private double longitud;

    @Column(name = "fecha")
    private Date fecha;

    public Sensores() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
