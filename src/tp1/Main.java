package tp1;

public class Main extends Salle{

	public static void main(String[] args) {
		Salle s= new Salle();
		Salle s1=new Salle(" inforMatique ");
		Salle s2=new Salle(1, "Gestion");
		System.out.println(s.id+s.nom+"\n");
		System.out.println(s1.nom+"\n");
		System.out.println(s2.id+" "+s2.nom);

	}

}
