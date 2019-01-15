package exopoly1;

public class App {

	public static void main(String[] args) throws Exception {
	
		FormeGeometrique[] formes = new FormeGeometrique[] {
				
				new Cercle(12.5),
				new Carre(5.6),
				new Rectangle(50, 85)				
		};
		
		for(FormeGeometrique forme : formes)
		{
			System.out.print(forme);
			System.out.print(" ,Aire: "+forme.calculerAire());
			System.out.println(" ,Perimètre: "+forme.calculerPerimetre());					
		}
	}
}
