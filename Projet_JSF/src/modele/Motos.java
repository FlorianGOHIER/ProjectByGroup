package modele;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Motos {
	
	private List<Moto> motos;
	
	

	public Motos() {
		this.motos = null;
		Moto moto1 = new Moto("Honda", "CBR 250 RR", 2017, 3, 250, "AWS45632", "Bicylindre", ["Tout terrain"]);
		Moto moto2 = new Moto("Kawasaki", "Ninja 250", 2013, 4, 300, "AWS96325", "Monocylindre", ["Tout terrain", "Roadster"]);
		Moto moto3 = new Moto("Yamaha", "125 yz", 2019, 4, 352, "AWS56842", "Quatre Cylindre", ["Sportive", "Custom"]);
		Moto moto4 = new Moto("BMW", "1000 RR", 2022, 10, 800, "AWS12345", "Bicylindre", ["Trail"]);
		
		this.motos.add(moto1);
		this.motos.add(moto2);
		this.motos.add(moto3);
		this.motos.add(moto4);
	}



	public List<Moto> getMotos() {
		return motos;
	}
}
