package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Museum service class.
 */
@Service
public class MuseumService implements MuseumServiceInterface {

  MuseumFakeDatabase museumFakeDatabase;

  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {
    return null;
  }

  @Override
  public Museum createMuseum(Museum museum) {
    Boolean coordenadaEhValida = CoordinateUtil.isCoordinateValid(museum.getCoordinate());
    if (!coordenadaEhValida) {
      throw new InvalidCoordinateException("Coordenada inválida");
    }
    return museumFakeDatabase.saveMuseum(museum);


  }

  @Override
  public Museum getMuseum(Long id) {
    return null;
  }

  @Autowired
  public MuseumService(MuseumFakeDatabase museumFakeDatabase) {
    this.museumFakeDatabase = museumFakeDatabase;
  }
}
