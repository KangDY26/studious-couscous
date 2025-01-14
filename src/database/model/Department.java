package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Department {
	
	private Integer department_id;
	private String department_name;
	private Double manager_id;
	private Double location_id;
	
	public Department(ResultSet rs) throws SQLException {
		
		department_id = rs.getInt(1);
		department_name = rs.getString(2);
		manager_id = rs.getDouble(3);
		location_id = rs.getDouble(4);	
		
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Double getManager_id() {
		return manager_id;
	}

	public void setManager_id(Double manager_id) {
		this.manager_id = manager_id;
	}

	public Double getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Double location_id) {
		this.location_id = location_id;
	}

	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name + ", manager_id="
				+ manager_id + ", location_id=" + location_id + "]";
	}


	
}
