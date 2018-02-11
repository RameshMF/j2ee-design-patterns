package com.ramesh.j2ee.businessdelegate;

/**
 * 
 * Client utilizes BusinessDelegate to call the business tier
 * @author RAMESH
 *
 */
public class Client {

  private BusinessDelegate businessDelegate;

  public Client(BusinessDelegate businessDelegate) {
    this.businessDelegate = businessDelegate;
  }

  public void doTask() {
    businessDelegate.doTask();
  }
}
