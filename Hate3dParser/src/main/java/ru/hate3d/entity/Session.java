package ru.hate3d.entity;

import java.util.Date;

/**
 * Сеанс
 * 
 * @author Алексей Павлов
 */
public class Session {

	/*
	 * Время начала
	 */
	private Date startTime;

	/*
	 * Фильм
	 */
	private Film film;

	/**
	 * Получить время начала
	 * 
	 * @return время начала
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * Установить время начала
	 * 
	 * @param startTime
	 *            - время начала
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * Получить фильм
	 * 
	 * @return �����
	 */
	public Film getFilm() {
		return film;
	}

	/**
	 * Установить фильм
	 * 
	 * @param film
	 *            фильмы
	 */
	public void setFilm(Film film) {
		this.film = film;
	}

}
