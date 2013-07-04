package ru.hate3d.entity;

import java.util.List;

/**
 * Сеть
 * 
 * @author Алексей Павлов
 */
public class Network {

	/*
	 * Идентификатор
	 */
	private int id;

	/*
	 * Название
	 */
	private String name;

	/*
	 * Кинотеатры
	 */
	private List<Cinema> cinemas;

	/**
	 * Получить идентификатор
	 * 
	 * @return идентификатор
	 */
	public int getId() {
		return id;
	}

	/**
	 * Установить идентфикатор
	 * 
	 * @param id
	 *            - идентификатор
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Получить название
	 * 
	 * @return название
	 */
	public String getName() {
		return name;
	}

	/**
	 * Установить название
	 * 
	 * @param name
	 *            - название
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Получить кинотеатры
	 * 
	 * @return кинотеатры
	 */
	public List<Cinema> getCinemas() {
		return cinemas;
	}

	/**
	 * Установить кинотеатры
	 * 
	 * @param cinemas
	 *            - кинотеатры
	 */
	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

}
