package tp1;

public class Salle {
	
	int id;
	String nom;
	
	public Salle() {
		System.out.println("constructeur sans paramettre");
	}
	
	public Salle(String nameS) {
this.nom=nameS;		
	}
	public Salle(int idSalle,String nomSall) {
		
		this.id=idSalle;
		this.nom=nomSall;
		
	}

}
