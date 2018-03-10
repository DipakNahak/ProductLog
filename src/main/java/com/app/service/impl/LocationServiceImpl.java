package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ILocationDao;
import com.app.model.Location;
import com.app.service.ILocationService;

@Service
public class LocationServiceImpl implements ILocationService {

	@Autowired
	private ILocationDao dao;
	
	public String saveLocation(Location loc) {
		return dao.saveLocation(loc);
	}

	public void updateLocation(Location loc) {
		dao.updateLocation(loc);
	}

	public void deleteLocation(Location loc) {
		dao.deleteLocation(loc);
	}

	public Location getLocById(String locId) {
		return dao.getLocById(locId);
	}

	public List<Location> getAllLocations() {
		return dao.getAllLocations();
	}

}
