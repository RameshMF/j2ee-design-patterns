package com.ramesh.j2ee.businessdelegate;

/**
 * BusinessDelegate separates the presentation and business tiers
 * @author RAMESH
 */
public class BusinessDelegate {

  private BusinessLookup lookupService;
  private BusinessService businessService;
  private ServiceType serviceType;

  public void setLookupService(BusinessLookup businessLookup) {
    this.lookupService = businessLookup;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public void doTask() {
    businessService = lookupService.getBusinessService(serviceType);
    businessService.doProcessing();
  }
}
