package ru.hate3d.entity;

import java.util.List;

/**
 * Зал
 * 
 * @author Алексей Павлов
 */
public class Hall {

	/*
	 * Идентификатор
	 */
	private int id;

	/*
	 * Сеансы
	 */
	private List<Session> sessions;

	/**
	 * Получить идентификатор
	 * 
	 * @return идентификатор
	 */
	public int getId() {
		return id;
	}

	/**
	 * Установить идентификатор
	 * 
	 * @param id
	 *            - идентификатор
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Получить сеансы
	 * 
	 * @return сеансы
	 */
	public List<Session> getSessions() {
		return sessions;
	}

	/**
	 * Установить сеансы
	 * 
	 * @param sessions
	 *            - сеансы
	 */
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

}
