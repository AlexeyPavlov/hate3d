package ru.hate3d.entity;

/**
 * �����
 * 
 * @author ������� ������
 */
public class Film {

	/*
	 * �������������
	 */
	private long id;

	/*
	 * ��������
	 */
	private String title;

	/*
	 * ��������
	 */
	private String description;

	/**
	 * �������� �������������
	 * 
	 * @return �������������
	 */
	public long getId() {
		return id;
	}

	/**
	 * ���������� �������������
	 * 
	 * @param id
	 *            - �������������
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * �������� ��������
	 * 
	 * @return ��������
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * ���������� ��������
	 * 
	 * @param title
	 *            - ��������
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * �������� ��������
	 * 
	 * @return ��������
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * ���������� ��������
	 * 
	 * @param description
	 *            - ��������
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
