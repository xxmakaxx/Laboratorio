package Logica;

import java.util.HashMap;


public class Controller implements IController {
	private HashMap<String, Usuario> usr;
	private HashMap<String, Cuponera> cpn;
	private HashMap<String, Actividad> act;
	private HashMap<String, Institucion> ins;
	
	public Controller() {
		
	}
	
	public HashMap<String, Usuario> getUsr(){
		return usr;
	}
	
	public HashMap<String, Cuponera> getCpn(){
		return cpn;
	}
	
	public HashMap<String, Actividad> getAct(){
		return act;
	}
	
	public HashMap<String, Institucion> getIns(){
		return ins;
	}
	
	public void altaInstitucion(String nombre, String desc, String url) {
		if(!ins.containsKey(nombre)) {
			Institucion d=new Institucion(nombre,desc,url);
			ins.put(nombre,d);
		}else {/*tira excepcion*/}
	}
	
	public void altaSocio(String nick, String nom, String ap, String mail, Fecha fnac) {
		if(!usr.containsKey(nick)) {
			Usuario u=new Socio(nick,nom,ap,mail,fnac);
			usr.put(nick,u);
		}else {/*tira excepcion*/}
	}
	
	public void altaProf(String nick, String nom, String ap, String mail, String desc, String bio, String web, Fecha fnac, Institucion i) {
		if(!usr.containsKey(nick)) {
			Usuario u=new Profesor(nick,nom,ap,mail,desc,bio,web,fnac,i);
			usr.put(nick,u);
		}else {/*tira excepcion*/}
	}
	
	public void altaActividad(String nom, String desc,  int duracion, int costo, Fecha fecha,Institucion i) {
		if(!act.containsKey(nom)) {
			Actividad a=new Actividad(nom,desc,duracion,costo,fecha,i);
			act.put(nom, a);
			i.getActividades().add(a);
		}else {/*tira excepcion*/}
	}

}





























