# 说明
 * 这是一个用assembly打分发包的例子 

# 具体使用
* 在工程根目录下使用命令 mvn clean package 
* 执行命令后会在target下生成类似 mang-demo-maven-assembly-0.0.1-SNAPSHOT-distribution.zip 的压缩包
* 将该压缩包解压后双击 bin/start-jar.bat 或者bin/start-cp.bat 即可运行
* 注 start-jar.bat是用java -jar 方式启动 start-cp.bat是用java -cp的方式启动

# 目标结构说明
## bin 目录
 * bin目录和运行脚本、readme.md等
## assembly 目录
 * 该目录下存放assembly插件的配置文件

