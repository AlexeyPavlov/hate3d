package ru.hate3d.entity;

import java.util.List;

/**
 * ���
 * 
 * @author ������� ������
 */
public class Hall {

	/*
	 * �������������
	 */
	private int id;

	/*
	 * ������
	 */
	private List<Session> sessions;

	/**
	 * �������� �������������
	 * 
	 * @return �������������
	 */
	public int getId() {
		return id;
	}

	/**
	 * ���������� �������������
	 * 
	 * @param id
	 *            - �������������
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * �������� ������
	 * 
	 * @return ������
	 */
	public List<Session> getSessions() {
		return sessions;
	}

	/**
	 * ���������� ������
	 * 
	 * @param sessions
	 *            - ������
	 */
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

}
