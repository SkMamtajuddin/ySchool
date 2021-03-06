package org.yarlithub.yschool.repository.model.dao.yschool.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.repository.model.obj.yschool.Results;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.repository.model.dao.yschool.ResultsDao;
 
 
/**
 * DAO for table: Results.
 * @author autogenerated
 */
@Repository
public class ResultsDaoImpl extends GenericHibernateDaoImpl<Results, Integer> implements ResultsDao {
	
	/** Constructor method. */
		public ResultsDaoImpl() {
			super(Results.class);
		}
	}

