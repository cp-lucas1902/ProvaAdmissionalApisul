package br.com.apisul.entity;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;

public class Tecnopuc {

	private Integer andar;
	private Character elevador;
	private Character turno;

	public Tecnopuc() {
	}

	public Tecnopuc(Integer andar, Character elevador, Character turno) {
		this.andar = andar;
		this.elevador = elevador;
		this.turno = turno;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public Character getElevador() {
		return elevador;
	}

	public void setElevador(Character elevador) {
		this.elevador = elevador;
	}

	public Character getTurno() {
		return turno;
	}

	public void setTurno(Character turno) {
		this.turno = turno;
	}

}
