1、修改项目名为jeesitExt，数据库同
2、升级spring、hibernate等主要依赖的版本（以spring版本后退1为主）
3、集成springdatajpa(需要特别注意hibernate-entitymanager包)

版本管理方案：
1、在gitcafe（或者自己搭建）等建立一个私有版本库，服务器上安装git客户端，把服务器上的版本作为远程git的一个版本。服务器与其他人可以使用svn。

使用笔记：
LoginController 拦截${adminPath}  跳转到sysindex页面（后续需要做出自己的index页面）
${fns:getConfig('productName')} 其中fns是自定义标签，后台是global方法，productName是jeesite.properties中的属性。
modules 组件

@cache 缓存注解
http://blog.csdn.net/id19870510/article/details/6096865
@DynamicInsert @DynamicUpdate
hibernate 插入/更新方式，需要学习

data jpa service 说明：
基础查询继承Repository，复杂查询需要自定义service接口和实现。也可以通过在继承的Repository 自定义方法，并在方法上写@query 实现


依照原有平台设计，jeesite目录下的类使用hibernate，xzcen下的类使用data jpa

需要做案例：
单表保存、多表保存、列表分页，多表联查分页

菜单设计：功能设计以loushang为参考
右侧是树形
顶级  功能操作树（设定死） 右键操作添加应用及模块
	次级   应用    操作  添加模块
		再次  模块（模块可以分多层（子模块））  末级模块可以添加功能
			次次   功能  功能可以添加操作
				最次  操作，具体的访问url设置