## spring-logback


此项目是对logback日志配置学习。

<br><br>

### 注意事项
使用logback需要引入以下jar:
- slf4j-api.jar
- log4j-over-slf4j.jar
- logback-classic.jar
- logback-core.jar
在maven中引入log4j-over-slf4j.jar会自动引入slf4j-api.jar<br>
使用logback日志无须在web.xml中配置。<br>
logback-classic不能与slf4j-log4j12同引，会导致jar冲突。
