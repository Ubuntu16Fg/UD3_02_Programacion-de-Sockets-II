package trabajoP2P;

import java.util.List;

public class InfoCliente {
	private String ip;
	private int puerto;
	private List<String> archivos;

	public InfoCliente(String ip, int puerto, List<String> archivos) {
		this.ip = ip;
		this.puerto = puerto;
		this.archivos = archivos;
	}
}
