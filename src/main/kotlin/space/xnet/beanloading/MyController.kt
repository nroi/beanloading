package space.xnet.beanloading

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(
  private val myConfig: MyConfig
) {

  @GetMapping("/foo-endpoint")
  fun fooEndpoint(): String {
    return myConfig.messages.toString()
  }
}