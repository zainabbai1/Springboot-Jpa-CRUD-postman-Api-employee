package net.guides.springboot2.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "employees")
@EntityListeners(AuditingEntityListener.class)
public class Employee
{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

@NotBlank
@Column(name = "first_name")
	private String firstName;

@NotBlank
@Column(name = "last_name")
	private String lastName;

@NotBlank
@Column(name = "email_address", nullable = false)
	private String emailId;
	
	public Employee() {}

	public Employee(String firstName, String lastName, String emailId) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName)
    {
		this.lastName = lastName;
	}

	public String getEmailId()
	{
		return emailId;
	}

	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}
	}
