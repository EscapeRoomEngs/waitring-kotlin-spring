package com.waitring.waitring

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WaitringApplication

fun main(args: Array<String>) {
	val log = LoggerFactory.getLogger(WaitringApplication::class.java)

	runApplication<WaitringApplication>(*args)

	log.info("###################################################")
	log.info("##########   WaitRing Application Start  ##########")
	log.info("###################################################")
}
