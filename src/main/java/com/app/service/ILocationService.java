package com.app.service;

import java.util.List;

import com.app.model.Location;

public interface ILocationService {
	public String saveLocation(Location loc);
	public void updateLocation(Location loc);
	public void deleteLocation(Location loc);
	public Location getLocById(String locId);
	public List<Location> getAllLocations();


}
