package com.xzcen.modules.sys.menu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xzcen.modules.sys.menu.entity.MenuItem;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {
	public List<MenuItem> findByMenuName(String menuName);
}
