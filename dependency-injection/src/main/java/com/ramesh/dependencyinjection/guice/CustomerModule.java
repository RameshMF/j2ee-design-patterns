package com.ramesh.dependencyinjection.guice;

import com.google.inject.AbstractModule;
import com.ramesh.dependencyinjection.DataSource;
import com.ramesh.dependencyinjection.MySQLDataSource;

public class CustomerModule extends AbstractModule {

	  @Override
	  protected void configure() {
	    bind(DataSource.class).to(MySQLDataSource.class);
	  }
}
