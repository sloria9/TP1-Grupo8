package clubSocios;


public class TestSocios {

	public static void main(String[] args) {

		Socio socio1 = new Socio("Sofia", "1123454332",new Fecha(21,8,20),TipoSocio.TRADICIONAL);
		Socio socio2 = new Socio("Pedro", "1151142265",new Fecha(15,11,23),TipoSocio.VIP);
		Socio socio3 = new Socio("Josefina", "1195982615",new Fecha(5,12,96),TipoSocio.VITALICIO);
		
		CasaClub club = new CasaClub();
		club.agregarSocio(socio1);
		club.agregarSocio(socio2);
		club.agregarSocio(socio3);

	}
}
