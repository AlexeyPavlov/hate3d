package ru.hate3d.entity;

import java.util.List;

/**
 * ����
 * 
 * @author ������� ������
 */
public class Network {

	/*
	 * �������������
	 */
	private int id;

	/*
	 * ��������
	 */
	private String name;

	/*
	 * ����������
	 */
	private List<Cinema> cinemas;

	/**
	 * �������� �������������
	 * 
	 * @return �������������
	 */
	public int getId() {
		return id;
	}

	/**
	 * ���������� ������������
	 * 
	 * @param id
	 *            - �������������
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * �������� ��������
	 * 
	 * @return ��������
	 */
	public String getName() {
		return name;
	}

	/**
	 * ���������� ��������
	 * 
	 * @param name
	 *            - ��������
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * �������� ����������
	 * 
	 * @return ����������
	 */
	public List<Cinema> getCinemas() {
		return cinemas;
	}

	/**
	 * ���������� ����������
	 * 
	 * @param cinemas
	 *            - ����������
	 */
	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

}
