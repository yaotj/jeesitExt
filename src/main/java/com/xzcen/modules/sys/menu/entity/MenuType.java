package com.xzcen.modules.sys.menu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import com.xzcen.modules.common.jpa.IdEntity;

@Entity
public class MenuType extends IdEntity {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) private Long menuTypeId;

	@NotBlank
	@Column(unique=true)
	private String menuTypeName;//菜单类型名称

	private String isSys;//是否系统菜单

	private String isSysDefault;//是否系统预置菜单
	
	public String getMenuTypeName() {
		return menuTypeName;
	}

	public void setMenuTypeName(String menuTypeName) {
		this.menuTypeName = menuTypeName;
	}

	public String getIsSys() {
		return isSys;
	}

	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}

	public String getIsSysDefault() {
		return isSysDefault;
	}

	public void setIsSysDefault(String isSysDefault) {
		this.isSysDefault = isSysDefault;
	}
}
