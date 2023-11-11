package com.waitring.waitring

import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@Slf4j
class WaitringApplication

fun main(args: Array<String>) {
	runApplication<WaitringApplication>(*args)
}
