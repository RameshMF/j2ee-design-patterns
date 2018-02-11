package com.ramesh.dependencyinjection;

import java.sql.Connection;

/**
 * Datasource interface
 *
 */
public interface DataSource {
	void createConnection(DatabaseConfig config);
	Connection getConnection();
	
}
