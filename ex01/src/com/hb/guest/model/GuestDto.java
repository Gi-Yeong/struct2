package com.hb.guest.model;

import java.util.Date;

public class GuestDto {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;
	
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getSabun() {
		return sabun;
	}
	public String getName() {
		return name;
	}
	public Date getNalja() {
		return nalja;
	}
	public int getPay() {
		return pay;
	}

	// 객체 비교를 위한 클래스 오버라이드
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof GuestDto)) return false;

		GuestDto dto = (GuestDto) o;

		if (getSabun() != dto.getSabun()) return false;
		if (getPay() != dto.getPay()) return false;
		return getName() != null ? getName().equals(dto.getName()) : dto.getName() == null;

	}

	@Override
	public int hashCode() {
		int result = getSabun();
		result = 31 * result + (getName() != null ? getName().hashCode() : 0);
		result = 31 * result + getPay();
		return result;
	}
}
