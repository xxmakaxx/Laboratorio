package Logica;

import java.util.HashSet;

public class Socio extends Usuario{
	private HashSet<Fecha_Compra> cupon;
	private HashSet<Fecha_Registro> anotado;
	
	public Socio(String ni, String n, String ap, String ma, Fecha f) {
		super(ni, n, ap, ma, f);
		this.cupon = new HashSet<Fecha_Compra>();
		this.anotado = new HashSet<Fecha_Registro>();
	}
	
}