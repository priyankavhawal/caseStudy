package com.app.pojos;

import javax.persistence.*;


@Entity
public class Users {
	private Integer id;
	private String name,email;
	private int phone;
	private String password;
	private roleType role;
	
	public Users() {
		System.out.println("inside Users constructor..");
	}
	public Users(String name, String email, int phone, String password, roleType role) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length = 30)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(length = 30)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Column(length = 30)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Enumerated(EnumType.STRING)
	public roleType getRole() {
		return role;
	}
	public void setRole(roleType role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ "]";
	}
	
	
	

}
