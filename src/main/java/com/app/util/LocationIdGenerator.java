package com.app.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;


/**
 * @author Dipak
 *This Id Generator class is for generating custom Id for location registration
 *
 */
public class LocationIdGenerator implements IdentifierGenerator {

	public Serializable generate(SessionImplementor si, Object o)
			throws HibernateException {
		String id = "";
		try {
			Connection con = si.connection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select new_sequence1.nextval from duel");
			rs.next();
			int i = rs.getInt(1);
			if (i <= 9) {
				id = "L00" + i;
			} else if (i > 9 && i <= 99) {
				id = "L0" + i;
			} else {
				id = "L" + i;
			}

		} catch (Exception e) {
			System.err.println(e);

		}
		return id;

	}

}
