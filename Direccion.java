package remiseria;

public class Direccion {
	String Localidad;
	double NroCalle;
	double NroEdificio;
	int NroTimbre;
	String Partido;
	int NroDepartamento;

	public Direccion(String loc, double Calle, double Edificio, int Timbre,
			String Partid, int Departamento) {
		Localidad = loc;
		NroCalle = Calle;
		NroEdificio = Edificio;
		NroTimbre = Timbre;
		Partido = Partid;
		NroDepartamento = Departamento;

	}

}
