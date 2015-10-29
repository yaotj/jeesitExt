package com.xzcen.modules.sys.menu.web;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thinkgem.jeesite.modules.sys.entity.Menu;
import com.xzcen.modules.sys.menu.entity.MenuItem;
import com.xzcen.modules.sys.menu.entity.MenuStru;
import com.xzcen.modules.sys.menu.entity.MenuType;
import com.xzcen.modules.sys.menu.repository.MenuManagement;


@Controller
@RequestMapping(value = "${adminPath}/sysxzcen/menu")
public class MenuControllerXzcen {
	@Autowired MenuManagement menuManagement;
	
	@RequestMapping(method=RequestMethod.GET)
	public void get() {
		System.out.println("MenuControllerXzcen.get()");
		MenuType menuType=new MenuType();
		menuType.setMenuTypeName(UUID.randomUUID().toString());
		menuType.setIsSys("yes");
		menuType.setIsSysDefault("no");
		menuManagement.saveMenuType(menuType);
		
		menuType = menuManagement.findOne(new Long(12312));
		System.out.println(menuType.getMenuTypeName());
		menuType.setIsSys("yes");
		menuManagement.saveMenuType(menuType);
	}
	
	@RequestMapping(value="item",method=RequestMethod.GET)
	public void saveItem(){
		System.out.println("MenuControllerXzcen.saveItem()");
		MenuItem menuItem=new MenuItem();
		menuItem.setAppId("zhibao");
		menuItem.setFunctionId("cz");
		menuItem.setIcon("sss");
		menuItem.setMenuName("zhijie");
		menuManagement.saveMenuItem(menuItem);
		
		System.out.println(menuManagement.findMenuItemByMenuName("zhijie").size());
	}
	@RequestMapping(value="stru")
	public void saveStru(){
		System.out.println("MenuControllerXzcen.saveStru()");
		MenuStru menuStru =new MenuStru();
		menuStru.setMenuId("23");
		menuManagement.saveMenuStru(menuStru);
	}
	
	@RequestMapping(value = "form")
	public String form(MenuType menuType, Model model) {
		model.addAttribute("menuType", menuType);
		return "modules/demo/single";
	}
}
