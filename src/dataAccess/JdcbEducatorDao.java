package dataAccess;

import entities.Educator;

public class JdcbEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println(educator + "Jdbc ile veritabanına eğitmen eklendi");
		
	}

}
