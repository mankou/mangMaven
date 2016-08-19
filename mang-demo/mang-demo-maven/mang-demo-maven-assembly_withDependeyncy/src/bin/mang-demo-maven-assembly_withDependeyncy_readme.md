# 说明
 * 该工程是一个练习assembly打jar-with-dependency的工程
 * 其会把相关依赖的jar包的class都打到一个jar包中

# 使用说明
 * 在工程根目录下执行mvn clean package
 * 命令执行后会在target中看到mang-demo-maven-assembly_withDependeyncy-0.0.1-SNAPSHOT-jar-with-dependencies.jar
 * 在命令行中执行 jar -jar mang-demo-maven-assembly_withDependeyncy-0.0.1-SNAPSHOT-jar-with-dependencies.jar 即可运行
 
# 目前存在的问题
 ## 分发包中的lib只有一个带依赖的jar的问题
 * 注如果你使用jar-with-dependencies的方式可以打成包含依赖的整个的jar包 
 * 使用mang-demo-maven-assembly工程中的方式可以打不包含依赖的分发包
 * 我想把这2个整合下 打成分发包 但lib下只有一个包含依赖的jar包不知道怎么做
 * 目前的问题是如果你用mang-demo-maven-assembly的方式指定xml则你指定主类的方式就不灵了
 
