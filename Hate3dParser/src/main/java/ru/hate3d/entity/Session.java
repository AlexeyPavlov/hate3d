package ru.hate3d.entity;

import java.util.Date;

/**
 * �����
 * 
 * @author ������� ������
 */
public class Session {

	/*
	 * ����� ������
	 */
	private Date startTime;

	/*
	 * �����
	 */
	private Film film;

	/**
	 * �������� ����� ������
	 * 
	 * @return ����� ������
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * ���������� ����� ������
	 * 
	 * @param startTime
	 *            - ����� ������
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * �������� �����
	 * 
	 * @return �����
	 */
	public Film getFilm() {
		return film;
	}

	/**
	 * ���������� �����
	 * 
	 * @param film
	 *            �����
	 */
	public void setFilm(Film film) {
		this.film = film;
	}

}
