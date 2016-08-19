# 说明
* 该工程创建于20160816
* 希望用maven统一管理我的java练习代码、公用jar等

# 各工程说明
## mang-util
* 创建于20160816 一个我自己的公用类库
* 该工程的前身是mangJavaSample工程中的mang.jar 原来的版本已经到1.1.13 这次用maven管理 也算是一次大的改动所以版本过渡到2.0.0

## mang-test
* 创建于20160816纯粹是一个练习、测试的工程 
* 当需要测试时可以在该工程中写代码
* 目前建立是为了测试maven:将mang-util发布到本地仓库后其它工程可以用该工程

## mang-demo
* 以后我所有的demo都放在该目录下

### mang-demo-maven
* 关于maven的demo

#### mang-demo-maven-assembly
* 用 assembly 打分发包的例子

#### mang-demo-maven-assembly_withDependeyncy
* 用 assembly 打jar-with-dependency的例子
