/**
 * 
 */
package bj.ifri.tpmaven.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author koukpaki
 *
 */
@Entity
public class University {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String manager;

	private String phone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public University(String name, String manager, String phone) {
		super();
		this.name = name;
		this.manager = manager;
		this.phone = phone;
	}

	public University() {
		super();
	}

}
