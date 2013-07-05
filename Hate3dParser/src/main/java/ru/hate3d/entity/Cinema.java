package ru.hate3d.entity;

import java.util.List;

/**
 * Кинотеатр
 * 
 * @author Алексей Павлов
 */
public class Cinema {

	/*
	 * Идентификатор
	 */
	private Long id;

	/*
	 * Название
	 */
	private String name;

	/*
	 * Залы
	 */
	private List<Hall> halls;

	/**
	 * Получить идентификатор
	 * 
	 * @return идентификатор
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Установить идентификатор
	 * 
	 * @param id
	 *            - идентификатор
	 */
	public void setId(Long id) {
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
	 * Получить залы
	 * 
	 * @return залы
	 */
	public List<Hall> getHalls() {
		return halls;
	}

	/**
	 * Установить залы
	 * 
	 * @param halls
	 *            - залы
	 */
	public void setHalls(List<Hall> halls) {
		this.halls = halls;
	}

}
