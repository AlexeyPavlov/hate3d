package ru.hate3d.entity;

import java.util.List;

/**
 * ���������
 * 
 * @author ������� ������
 */
public class Cinema {

	/*
	 * �������������
	 */
	private Long id;

	/*
	 * ��������
	 */
	private String name;

	/*
	 * ����
	 */
	private List<Hall> halls;

	/**
	 * �������� �������������
	 * 
	 * @return �������������
	 */
	public Long getId() {
		return id;
	}

	/**
	 * ���������� �������������
	 * 
	 * @param id
	 *            - �������������
	 */
	public void setId(Long id) {
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
	 * �������� ����
	 * 
	 * @return ����
	 */
	public List<Hall> getHalls() {
		return halls;
	}

	/**
	 * ���������� ����
	 * 
	 * @param halls
	 *            - ����
	 */
	public void setHalls(List<Hall> halls) {
		this.halls = halls;
	}

}
