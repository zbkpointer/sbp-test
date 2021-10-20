# 项目背景
创建该项目的初衷是学习基于springboot的插件化编程思想，插件化思想肯定是用类加载器做的，具体怎么做需要阅读源码。
而项目[sbp](https://github.com/hank-cp/sbp.git )是基于springboot做的封装框架，已经初步参成熟，可以投入使用。如何快速理解sbp项目，没有比跑通更为直接的了，就像玩游戏先玩后摸索。
由于`sbp`项目没有清晰地叙述构建插件编程的流程，因此又查询基于sbp的使用仓库，于是查找到[sbp-test](https://github.com/dtrouillet/sbp-test.git)用来测试sbp的使用。
而`sbp-test`项目又引入了很多杂项，因此我就精简了该项目，用于新手快速上手跑通sbp项目。

# 项目简介
项目采用maven多模块构建方式，其中模块有
<modules>
<module>application</module>
<module>api</module>
<module>plugins</module>
<module>update</module>
</modules>
，application模块是一个springboot-web应用，plugins亦是且包含两个模块<modules>
<module>plugina</module>
<module>pluginb</module>
</modules>，a、b模块也是springboot-web。
