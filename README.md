>&#8195;&#8195;项目名称：**地方特色美食综合服务平台**<br/>
>&#8195;&#8195;当前项目的代码为PC端前台代码以及后台代码，并且后台也为Android端与IOS端进行提供服务。项目采用经典的SSH(Spring、Struts2、Hibernate)框架进行开发，该项目主要针对的是地方美食，当今旅游业迅速发展，旅游除了观赏美景，也少不了品尝地方的特色美食，该项目针对这一需求进行开发。<br/>
>&#8195;&#8195;该由于项目是一项毕业设计，不是一个成熟的上线项目，所以仅供参考。当前项目正在开发中，预计完成时间为：2017年6月1日

# 开发技术


&#8195;&#8195;项目开发是基于JavaEE技术，前端采用JSP、EL表达式、JQuery、JavaScript等技术，后台采用经典的三大框架技术，由于当前项目不是上线项目，所以采用的是中小型数据库MySQL。该项目使用git在GitHub上进行协同开发，并且采用的是Maven项目进行项目的构建管理。除此之外还利用到的技术点包括：JUnit 4.x、JSON、URL Rewrite等技术

# 开发工具


* Eclipse Java EE IDE for Web Developers — Version: Neon.3 Release (4.6.3)
* Apache Tomcat - Version：8.0.43
* MySQL — Version：5.1.73
* Maven - Version：3.3.9
* git - Version:2.10.1.windows.1
* Java - Version:1.8.0_112
* Spring - Version:4.2.5
* Struts2 - Version:2.3.32
* Hibernate - Version:5.1.0
* JUnit - Version:4.x

说明：其它版本可详见项目的配置文件，初衷是采用所有的最新版本，但是经测试*Struts2 2.5.x*版本出现问题，所以采用的版本为*2.3.32*

# 模块说明


&#8195;&#8195;项目由于是多人协同开发，所以采用的是分模块是开发，这样既可以将个人代码进行分离便于维护，同时可以使多人进行同时开发提高效率。

&#8195;&#8195;项目的开发名称为dftsms(首字符拼音缩写)，Maven设计采用的设计模式是聚合式，在项目的顶级目录下除了包含一个项目的顶级POM配置以及各模块，其它都是项目开发的文档，可供参考。

&#8195;&#8195;项目模块划分设计思路：所有PC前端都存放在web模块下，这也是项目核心之一，通过这个模块关联其它所有模块，这样达到MVC中的模型(model)、视图(view)、控制器(controller)的分离

## web模块

&#8195;&#8195;当前模块存放的是所有PC端前台所需要的所有代码文件，包含JSP、CSS、JQuery、JavaScript等代码文件。
&#8195;&#8195;该模块使用Maven的maven-archetype-webapp进行创建，但是由于其使用的Servlet版本过低，所以创建完成后，需要更改Servlet版本，以及Java编译版本。这部分可参考：[Dynamic Web开发之版本分析](01)


# 代码导入
&#8195;&#8195;因为开发的IDE环境是Eclipse，所以演示只将代码导入到Eclipse中，过程如下：

1. 拷贝当前项目的[web URL](02)
2. 打开git透视图：Window -> perspective -> Open perspective -> Other(其实最简单的是Eclipse左上角的快捷方式)
3. 将项目克隆下来：选中Clone a Git repository,然后输入URL，以及自己的账号密码，下一步，直到最后可选择性的修改保存路径，并保存即可。
4. 将项目导入Eclipse：在git透视图中选中克隆项目 -> 右击 -> Import Project ,然后直接finish即可。然后可以切换到Java或JavaEE透视图，即可看到导入的项目
5. 为web模块添加server依赖：在web模块上右击 -> Build Path -> Add Library -> 选中Server Runtime -> 选中Tomcat -> finish
6. 为了保险可以更新一下Maven项目：项目上右击 -> Maven -> Update Project

***************

**图片演示**

说明：省略了一些没必要展示的地方，省略部分基本上就是下一步或者finish即可。

第一步：

![图片01](tu_01)

第二步：

![图片02](tu_02)

第三步：

![图片03](tu_03)

第四步：

![图片04](tu_04)

第五步：

![图片05](tu_05)

第六步：

![图片06](tu_06)

第七步：

![图片07](tu_07)

第八步：

![图片08](tu_08)

第九步：

![图片08](tu_09)

[01]:http://blog.csdn.net/fanxiaobin577328725/article/details/69661325
[02]:https://github.com/fxb577328725/dftsms.git

[tu_01]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_01
[tu_02]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_02
[tu_03]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_03
[tu_04]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_04
[tu_05]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_05
[tu_06]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_06
[tu_07]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_07
[tu_08]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_08
[tu_09]:https://github.com/fxb577328725/dftsms/master/PictureOf_README/tu_09
