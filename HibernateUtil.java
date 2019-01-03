package learningtime.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory;
	
	static {
	try {
		sessionFactory=new Configuration().configure().buildSessionFactory();
	  }
	catch(Throwable ex) {
		System.err.println("sessionFactory cration failed."+ ex);
		throw new ExceptionInInitializerError(ex);
	}
	}
	
	public static SessionFactory setSessionFactory() {
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	//another way to create sessionFactory
/*	static
 	{
 	public static SessionFactory createSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
		configuration.getProperties()).buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		//return sessionFactory;
	}*/
	
	}