package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ILocationDao;
import com.app.model.Location;

@Repository
public class LocationDaoImpl implements ILocationDao {
	
	@Autowired
	private HibernateTemplate ht;

	public String saveLocation(Location loc) {
		
		return (String) ht.save(loc);
	}

	public void updateLocation(Location loc) {
		ht.update(loc);
	}

	public void deleteLocation(Location loc) {
		ht.delete(loc);
	}

	public Location getLocById(String locId) {
		return ht.get(Location.class, locId);
	}

	public List<Location> getAllLocations() {
		return ht.loadAll(Location.class);
	}

}
