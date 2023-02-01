package nl.hlopez.slf4jmock

import org.slf4j.LoggerFactory

class Example {
    private val logger = LoggerFactory.getLogger(Example::class.java)

    fun methodWithLogInfo(message: String) {
        logger.info(message)
    }
}
