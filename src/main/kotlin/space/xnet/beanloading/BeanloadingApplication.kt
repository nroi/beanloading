package space.xnet.beanloading

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan(
  basePackages = [
    "space.xnet.beanloading"
  ]
)
@SpringBootApplication
class BeanloadingApplication

fun main(args: Array<String>) {
  runApplication<BeanloadingApplication>(*args)
}
