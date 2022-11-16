package space.xnet.beanloading

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("mail")
class MyConfig(
  val messages: MutableMap<String, String> = mutableMapOf()
)