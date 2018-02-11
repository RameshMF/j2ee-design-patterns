package com.ramesh.j2ee.businessdelegate;

/**
 * 
 * Service JMS implementation
 * @author RAMESH
 *
 */
public class JmsService implements BusinessService {

  @Override
  public void doProcessing() {
    System.out.println("JmsService is now processing");
  }
}
