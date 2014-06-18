package erp.action;

import erp.model.*;
import com.opensymphony.xwork2.ActionSupport;

public class EmpresaAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Empresa empresa;

	@Override
	public String execute() throws Exception { 
        return SUCCESS;
    }
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;  
	}
}
