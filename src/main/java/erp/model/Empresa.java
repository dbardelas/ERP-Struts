/**
 * 
 */
package erp.model;

/**
 * @author Diego
 *
 */
public class Empresa {
	private String codigo;
	private String cif;
	private String razonSocial;
	
	public Empresa() {
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getCif() {
		return cif;
	}
	
	public void setCif(String cif) {
		this.cif = cif;
	}
	
	public String getRazonSocial() {
		return razonSocial;
	}
	
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	public String toString() {
		return codigo + " " + cif + " " + razonSocial;
	}
}
