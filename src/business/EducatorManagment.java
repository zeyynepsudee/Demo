package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.EducatorDao;
import entities.Category;
import entities.Educator;

public class EducatorManagment{
	private EducatorDao educatorDao;
	private Logger[] loggers;
	private List<Educator> educators;
	public EducatorManagment(EducatorDao educatorDao, Logger[] loggers ) {
		super();
		this.educatorDao=educatorDao;
		this.loggers=loggers;
	}
public void add(Educator educator) throws Exception { 

	for(Educator educatorA : educators) {
		if (educator.getEducatorName().equals(educator.getEducatorName())) {
			throw new Exception("Eğitmen ismi aynı olamaz");
		}
	}
educatorDao.add(educator);
for(Logger logger : loggers) {
	logger.log(educator.getEducatorName());
}



}



	

}





