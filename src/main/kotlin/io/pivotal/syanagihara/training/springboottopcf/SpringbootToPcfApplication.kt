package io.pivotal.syanagihara.training.springboottopcf

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootToPcfApplication

fun main(args: Array<String>) {
    runApplication<SpringbootToPcfApplication>(*args)
}
