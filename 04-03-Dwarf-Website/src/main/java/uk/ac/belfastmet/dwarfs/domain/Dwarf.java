package uk.ac.belfastmet.dwarfs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dwarf_people")
public class Dwarf {

	// instance variables
	private long id;
	private String name;
	private String author;
	private int age;

	// Constructors
	public Dwarf() {

	}

	/**
	 * 
	 * @param name   creating gets and sets
	 * @param author creating gets and sets
	 * @param age    creating gets and sets
	 */
	public Dwarf(String name, String author, int age) {

		this.name = name;
		this.author = author;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * creating a string for iterator
	 */
	public String toString() {
		return this.name + " " + this.author + " " + this.age;
	}
}