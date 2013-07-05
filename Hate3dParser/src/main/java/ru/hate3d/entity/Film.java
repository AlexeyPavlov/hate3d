package ru.hate3d.entity;

/**
 * Фильм
 * 
 * @author Алексей Павлов
 */
public class Film {

	/*
	 * Идентификатор
	 */
	private long id;

	/*
	 * Название
	 */
	private String name;

	/*
	 * Описание
	 */
	private String description;

	/**
	 * Получить идентификатор
	 * 
	 * @return идентификатор
	 */
	public long getId() {
		return id;
	}

	/**
	 * Установить идентификатор
	 * 
	 * @param id
	 *            - идентификатор
	 */
	public void setId(long id) {
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
	 * @param title
	 *            - название
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Получить описание
	 * 
	 * @return описание
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Установить описание
	 * 
	 * @param description
	 *            - описание
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
