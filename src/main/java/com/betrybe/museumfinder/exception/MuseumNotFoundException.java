package com.betrybe.museumfinder.exception;

/**
 * MuseumNotFoundException Exception.
 */
public class MuseumNotFoundException extends RuntimeException {

  public MuseumNotFoundException(String message) {
    super(message);
  }
}