package nl.hlopez.slf4jmock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Slf4jMockIssueApplication

fun main(args: Array<String>) {
    runApplication<Slf4jMockIssueApplication>(*args)
}
