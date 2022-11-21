import javax.faces.bean.ManagedBean;

@ManagedBean
public class Bean {
	
	private String lien;

	public Bean() {
		
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}
	
	

}
