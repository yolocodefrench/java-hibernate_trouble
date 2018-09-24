package menu;

import dao.DAO;
import entity.CompteSimple;

public class Menu {

	public static void main(String[] args) {

		CompteSimple compte = new CompteSimple("jesuiscontent4589", 30000);
		DAO dao = new DAO();
		dao.createDatabse();
		System.out.println(compte);
		System.out.println("bonjour");

	}

}
