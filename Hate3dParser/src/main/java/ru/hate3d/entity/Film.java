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
	private String title;

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
	public String getTitle() {
		return title;
	}

	/**
	 * Установить название
	 * 
	 * @param title
	 *            - название
	 */
	public void setTitle(String title) {
		this.title = title;
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
