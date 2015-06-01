package org.justforfun.spring.demo.database;

import java.sql.SQLException;
import java.util.List;

import org.justforfun.spring.demo.database.dao.OfferDao;
import org.justforfun.spring.demo.database.models.Offer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws SQLException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		try {
			OfferDao offerDao = (OfferDao) context.getBean("offerDao");
			
			List<Offer> offers = offerDao.getOffers();
			
			System.out.println(offers);

		} finally {
			context.close();
		}
	}
}
