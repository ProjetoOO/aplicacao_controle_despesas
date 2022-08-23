package model;

import java.util.*;



public class User {

	private String username;
	private String password;
	private ArrayList<Group> groups; //nao precisamos nunca apagar essa lista
	private ArrayList<String> friends;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.groups = new ArrayList<Group>();
		this.friends = new ArrayList<String>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Group> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<Group> groups) {
		this.groups = groups;
	}

	public ArrayList<String> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<String> friends) {
		this.friends = friends;
	}

}
