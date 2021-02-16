package net.codejava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 45)
	private String email;

	@Column(nullable = false, length = 64)
	private String password;
	
	@Column(name = "first_name", nullable = false, length = 20)
	private String firstName;
	
	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
	@Column(name = "cost1", nullable = true, length = 20)
	private float cost1;
	
	@Column(name = "cost2", nullable = true, length = 20)
	private float cost2;
	
	@Column(name = "cost3", nullable = true, length = 20)
	private float cost3;
	
	@Transient
	private float costs;
	
	@Transient
	private int month;

	public User() {
		super();
	}
	public User(String email, String firstName, String lastName) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public float getCost1() {
		return cost1;
	}

	public void setCost1(float cost1) {
		this.cost1 = cost1;
	}

	public float getCost2() {
		return cost2;
	}

	public void setCost2(float cost2) {
		this.cost2 = cost2;
	}

	public float getCost3() {
		return cost3;
	}
	

	public void setCost3(float cost3) {
		this.cost3 = cost3;
	}

	public float getCosts(int month) {
		switch (month) {
		case 1:
			return cost1;
		case 2:
			return cost2;
		case 3:
			return cost3;

		default:
			return cost1;
		}
	}
	public float getCosts() {
	
			return costs;
		
	}

	public void setCosts(float costs) {
		this.costs = costs;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
}
