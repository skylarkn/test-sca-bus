#### 切换实现

**顶层pom文件修改**

[pom.xml](pom.xml)

依赖项由rocketmq切换带amqp

**参数切换**

[consumer配置文件](/consumer/src/main/resources/application.yml)

[provider配置文件](/provider/src/main/resources/application.yml)

由rocketmq链接配置改为rabbitmq连接配置

分别启动两个服务

[consumer服务](/consumer/src/main/java/org/example/consumer/ConsumerApplication.java)
[provider服务](/provider/src/main/java/org/example/provider/ProviderApplication.java)


**API创建本地事件，经由spring cloud bus 发送到mq:**

POST http://localhost:28084/business

[Provider02Controller](/provider/src/main/java/org/example/provider/controller/Provider02Controller.java)

ISSISU

问题：可以创建本地事件，并发送消息到rocketmq，消费端也可以接收消息，但是类型是```UnknownRemoteApplicationEvent```

一模一样的代码 将实现类从 ```spring-cloud-starter-bus-rocketmq``` 切换到 ```spring-cloud-starter-bus-amqp``` 问题就解决了

spring-cloud-bus整合rocketmq 无法消费自定义的事件