# parallel

1.aapt在父子bu如果出现资源重复的情况下，会生成重复id名字的问题，后期需要解决。
获取jar signer环境变量问题
libs，assets判断空

2. 主工程 build.gradle
jarSigner = "C:\\Program Files\\Java\\jdk1.8.0_111\\bin\\jarsigner"  修改为实际位置

3. 如需更改最终插件运行命令名字，例如现在的parallelCompileAll。

   首先更改主工程下，settings.gradle 下的def toggle = "plugin"//["project","plugin","bsd"]
   运行插件，更换名字

    主工程build.gralde
 buildscript {
     repositories {
         maven {
             url uri("./repo")
         }
         jcenter()
     }


     这里代表先引用本地插件库，再引用jcenter插件库