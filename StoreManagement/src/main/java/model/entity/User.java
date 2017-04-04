package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Johnny Lopes
 *
 */

@Table(name = "USER")
@Entity
public class User {

	private Integer id;
	private String name;
	private String surname;
	private String login;
	private String password;
	private String email;
	private String address;
	private String phoneNumber;
	private UserType type;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDUSER")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NMUSER")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "NMSURNAME")
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "NMLOGIN")
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "NMPASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "NMUSEREMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "NMADDRESS")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "NMPHONENUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "NRUSERTYPE")
	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

}
