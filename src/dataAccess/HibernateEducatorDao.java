package dataAccess;

import entities.Educator;

public class HibernateEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println(educator + "Hibernate ile veritabanına eğitmen eklendi");
		
	}

}
