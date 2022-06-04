# 开发环境
操作系统：Windows10  
开发语言：Java  
开发平台：IntelliJ IDEA  
jdk 版本：jdk18  
Neo4j 版本：4.4.7  
Neo4j 运行的 jdk 版本：jdk11  


# 代码运行
## 1. 安装Neo4j（Windows）
项目中使用的Neo4j版本是4.4.7版本，Neo4j运行的jdk版本是jdk11.

官网下载地址：https://neo4j.com/download-center/#community

## 2. 配置Neo4j
修改Neo4j.conf，添加

dbms.connector.http.listen_address=0.0.0.0:7474
dbms.connector.bolt.listen_address=0.0.0.0:7687

## 3. 更改代码变量
修改Neo4JPainter中的username和password为本地Neo4j的用户名与密码。

## 4. 运行
输入文件为input.txt，修改文件内容，运行main函数。
