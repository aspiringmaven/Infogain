package me.sumitkawatra.javageek.form;

import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String name;
	private int age;

	public UserForm() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + "]";
	}

}
