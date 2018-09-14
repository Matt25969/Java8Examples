package com.qa.FlatMaps;

import java.util.HashSet;
import java.util.Set;

public class Developer {

	private String name;
	private Set<String> languages;

	public Developer(String name) {
		this.languages = new HashSet<>();
		this.setName(name);
	}

	public void add(String language) {
		this.languages.add(language);
	}

	public Set<String> getLanguages() {
		return languages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
