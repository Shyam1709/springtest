package com.wedding.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MehndiCeremony {

	private String artist;
	private String location;
	private Double vote_average;
	private Integer price;
	private String poster_path;

public MehndiCeremony() {}

	public MehndiCeremony(String artist, String location, Double vote_average, Integer price, String poster_path) {
		this.artist = artist;
		this.location = location;
		this.vote_average = vote_average;
		this.price = price;
		this.poster_path = poster_path;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getVote_average() {
		return vote_average;
	}

	public void setVote_average(Double vote_average) {
		this.vote_average = vote_average;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPoster_path() {
		return poster_path;
	}

	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

}
