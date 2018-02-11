package com.ramesh.j2ee.businessdelegate;

/**
 * 
 * Service EJB implementation
 * @author RAMESH
 *
 */
public class EjbService implements BusinessService {

  @Override
  public void doProcessing() {
    System.out.println("EjbService is now processing");
  }
}
