package remiseria;

public class Chofer {
	public String licencia;
	public String nombre;
	int telefono;
	public String vehiculo;
	int NroChofer;
	int puntaje;

	public Chofer(String lic, String nom, int tel, String vehi, int chofer,
			int pun) {
         licencia = lic;
         nombre= nom;
         telefono = tel;
         vehiculo = vehi;
         NroChofer = chofer;
         puntaje = pun;
	}

}
