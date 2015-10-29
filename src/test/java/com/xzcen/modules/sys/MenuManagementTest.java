package com.xzcen.modules.sys;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xzcen.modules.sys.menu.entity.MenuType;
import com.xzcen.modules.sys.menu.repository.MenuManagement;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:../../main/resources/*.xml"})
public class MenuManagementTest {
	@Autowired MenuManagement menuManagement;
	MenuType menuType=new MenuType();
	
	@Test
	void menuTypeSave(){
		menuType.setMenuTypeName(UUID.randomUUID().toString());
		menuType.setIsSys("yes");
		menuType.setIsSysDefault("no");
		menuManagement.saveMenuType(menuType);
	}
}
