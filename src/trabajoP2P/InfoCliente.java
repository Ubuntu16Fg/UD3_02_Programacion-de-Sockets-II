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

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

	public List<String> getArchivos() {
		return archivos;
	}

	public void setArchivos(List<String> archivos) {
		this.archivos = archivos;
	}

}
