package com.example.demo.service.impl;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepository;
import com.example.demo.service.LocationService;

@Service
public class LocationServiceimpl  implements LocationService{
    @Autowired
    LocationRepository locationRepository;
    public Location createLocation(Location location){
        if(location.getLatitude()>90){
            throw new Ille
        }
        return locationRepository.save(location);
    }
    public List<Location> getAllLocation(){

    }
}
