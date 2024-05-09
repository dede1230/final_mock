package com.fpt.hurst.dto;

import java.sql.Date;

public class Cake {
	private int id;
	private String name;
	private double price;
	private String description;
	private String infomation;
	private String image;
	private int likes;
	private Date createAt;
	private Date updateAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInfomation() {
		return infomation;
	}

	public void setInfomation(String infomation) {
		this.infomation = infomation;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Cake(int id, String name, double price, String description, String infomation, String image, int likes,
			Date createAt, Date updateAt) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.infomation = infomation;
		this.image = image;
		this.likes = likes;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Cake() {
		super();
	}

}
