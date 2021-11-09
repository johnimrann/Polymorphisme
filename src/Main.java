
public class Main {

	public static void main(String[] args) {

		// Polymorphysme ->
		
		Flyable[] vehiculeVolant = {new Moto(), new Moto(), new Bateau()};
		
		System.out.println("Il y a " + vehiculeVolant.length + " vehicules volants");
		
		for (Flyable e : vehiculeVolant) {
			e.fly();
		
		}
		Voiture s = new Voiture();
		s.mName= "Ferrari";
		System.out.println(s.mName);
		
		Voiture[] voiture = { new Voiture(),new Voiture()};
		for (Voiture v : voiture) {
			voiture[0].mName = "Lamborghini";
			voiture[1].mName = "Mazerrati";
			System.out.println(v.mName);
		}
		
		
		
	}   

}

