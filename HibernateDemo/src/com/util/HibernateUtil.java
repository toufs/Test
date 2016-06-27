package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static {
		
		//looks for hibernate.properties file 
		Configuration configuration= new Configuration();
		
		//looks for hibernate.cfg.xml
		configuration.configure();
		
		
		//set values by java code...
	//	configuration.setProperty("", "");
	//configuration.addResource("");	to map mapping .hbm file 
		
		sessionFactory= configuration.buildSessionFactory();
		
		
		
	}
	
	public static SessionFactory getSessinFacory (){
		
		
		return sessionFactory;
	}
	

}
