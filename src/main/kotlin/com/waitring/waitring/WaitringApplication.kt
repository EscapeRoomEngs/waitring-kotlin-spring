package com.waitring.waitring

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class WaitringApplication

fun main(args: Array<String>) {
	val log = LoggerFactory.getLogger(WaitringApplication::class.java)

	runApplication<WaitringApplication>(*args)

	log.info("###################################################")
	log.info("##########   WaitRing Application Start  ##########")
	log.info("###################################################")
}
