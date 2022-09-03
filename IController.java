package Logica;

import java.util.HashMap;

public interface IController {
	public abstract HashMap<String, Usuario> getUsr();
	public abstract HashMap<String, Cuponera> getCpn();
	public abstract HashMap<String, Actividad> getAct();
	public abstract HashMap<String, Institucion> getIns();
	public abstract void altaInstitucion(String nombre, String desc, String url);
	public abstract void altaSocio(String nick, String nom, String ap, String mail, Fecha fnac);
	public abstract void altaProf(String nick, String nom, String ap, String mail, String desc, String bio, String web, Fecha fnac, Institucion i);
	public abstract void altaActividad(String nom, String desc,  int duracion, int costo, Fecha fecha, Institucion i);

}
