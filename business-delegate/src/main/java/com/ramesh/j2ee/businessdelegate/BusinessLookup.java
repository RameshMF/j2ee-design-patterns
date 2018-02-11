package com.ramesh.j2ee.businessdelegate;

/**
 * Class for performing service lookups.
 * @author RAMESH
 */
public class BusinessLookup {

	private EjbService ejbService;

	private JmsService jmsService;

	private EmailService emailService;

	/**
	 * @param serviceType
	 *            Type of service instance to be returned.
	 * @return Service instance.
	 */
	public BusinessService getBusinessService(ServiceType serviceType) {
		if (serviceType.equals(ServiceType.EJB)) {
			return ejbService;
		} else if (serviceType.equals(ServiceType.JMS)) {
			return jmsService;
		} else {
			return emailService;
		}
	}

	public void setJmsService(JmsService jmsService) {
		this.jmsService = jmsService;
	}

	public void setEjbService(EjbService ejbService) {
		this.ejbService = ejbService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
}
