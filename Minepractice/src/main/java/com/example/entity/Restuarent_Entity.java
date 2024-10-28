package com.example.entity;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name="vivah" ,schema = "Restuarent")
public class Restuarent_Entity {

	private int locations;
	private String chinese;
	private String Italian;
	private String mexican;
	private String indian;
}
