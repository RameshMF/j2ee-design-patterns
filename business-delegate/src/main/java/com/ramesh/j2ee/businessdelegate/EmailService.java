package com.ramesh.j2ee.businessdelegate;

/**
 * 
 * Service JMS implementation
 * @author RAMESH
 *
 */
public class EmailService implements BusinessService {

  @Override
  public void doProcessing() {
    System.out.println("EmailService is now processing");
  }
}
