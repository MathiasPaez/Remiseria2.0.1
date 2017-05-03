package remiseria;

public class Viaje {
	Direccion origen;
    public Direccion destino;
	float costo;
	double Chofer chofer;
	protected Cliente cliente;
	FormaDePago formapago;

	public Viaje(Direccion orig, Direccion dest, float cost, private Chofer chof,
			Cliente client, FormaDePago formapag) {
		
		origen = orig;
		destino = dest;
		costo = cost;
		chofer = chof;
		cliente = client;
		formapago = formapag;
	}

}
