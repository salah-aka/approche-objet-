package Interface;

public class TestObjetGeometriqueexécutable {

	public static void main(String[] args) {
		ObjetGeometrique[] objetGeo = new ObjetGeometrique[2];
			
		objetGeo[0] = new Cercle(4);
		objetGeo[1] = new Rectangle(2, 3);
       
		for (int i=0; i<objetGeo.length; i++) {
			System.out.println(objetGeo[i].getClass().getSimpleName() );
			System.out.println( objetGeo[i].perimetre() );
			System.out.println( objetGeo[i].surface() );
		}		
	}
}
