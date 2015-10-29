package com.xzcen.modules.sys.menu.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xzcen.modules.sys.menu.entity.MenuItem;
import com.xzcen.modules.sys.menu.entity.MenuStru;
import com.xzcen.modules.sys.menu.entity.MenuType;
import com.xzcen.modules.sys.menu.repository.MenuTypeRepository;

@Service
@Transactional(readOnly = true)
public class MenuManagement{

	@Autowired
	private MenuTypeRepository menuTypeRepository;
	@Autowired
	private MenuItemRepository menuItemRepository;
	@Autowired
	private MenuStruRepository menuStruRepository;
	
	@Transactional(readOnly = false)
	public MenuType saveMenuType(MenuType menuType){
		return menuTypeRepository.save(menuType);
	}
	
	public MenuType findOne(Long id){
		return menuTypeRepository.findOne(id);
	}
	
	@Transactional(readOnly = false)
	public MenuItem saveMenuItem(MenuItem menuItem){
		return menuItemRepository.save(menuItem);
	}

	public List<MenuItem> findMenuItemByMenuName(String menuName) {
		return menuItemRepository.findByMenuName(menuName);
	}
	
	@Transactional(readOnly = false)
	public MenuStru saveMenuStru(MenuStru menuStru){
		return menuStruRepository.save(menuStru);
	}
}
