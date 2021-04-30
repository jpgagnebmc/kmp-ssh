package com.baremetalcloud.testserver

import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger
import ch.qos.logback.classic.LoggerContext
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.spi.ILoggingEvent
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import org.slf4j.LoggerFactory
import java.security.InvalidParameterException

class LogConfig(val name: String, val displayConsoleTimestamp: Boolean) {
    init {
        try {
            setupLogging(name)
        } catch (e: ExceptionInInitializerError) {
            println(e.toString())
        }
    }
    fun debug() {
        val logger = LoggerFactory.getLogger("ROOT") as Logger
        logger.level = Level.DEBUG
        logger.isAdditive = true
        setOf(
            "org.apache.http",
//            "affair.neo4j.Neo",
            "org.neo4j",
            "s.a.a.h.a.i.conn.SdkTlsSocketFactory",
            "software.amazon.awssdk.http.apache",
            "software.amazon.awssdk.core.interceptor",
            "software.amazon.awssdk.request",
            "software.amazon.awssdk.auth.signer",
        ).forEach {
            setLevel(it, Level.INFO)
        }
    }

    fun setupLogging(name: String, jsonAppender: FileAppender<ILoggingEvent>? = null) {
        val logger = LoggerFactory.getLogger("ROOT") as Logger
        logger.detachAndStopAllAppenders()
        logger.addAppender(configureConsoleLogger(name))
//        logger.addAppender(configureFileLogger())
        jsonAppender?.let {
            logger.addAppender(jsonAppender)
        }
        logger.level = Level.INFO
        logger.isAdditive = true
//        (LoggerFactory.getLogger("affair.scheduler.TaskExecutor") as Logger).level = Level.INFO
        setLevel("org.neo4j", Level.ERROR)
        setLevel("io.ktor", Level.ERROR)
        setLevel("io.netty", Level.ERROR)
        setLevel("org.eclipse.jetty", Level.ERROR)
    }

    fun setLevel(qualifiedName: String?, level: Level) {
        if (qualifiedName == null) {
            throw InvalidParameterException()
        }
        (LoggerFactory.getLogger(qualifiedName) as Logger).level = level
    }
    fun configureFileLogger(): FileAppender<ILoggingEvent> {
        val encoder = PatternLayoutEncoder()
        encoder.pattern = "$name %d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
        encoder.context = LoggerFactory.getILoggerFactory() as LoggerContext
        encoder.start()
        val appender = FileAppender<ILoggingEvent>()
        appender.file = "/var/log/affair/$name.log"
        appender.context = encoder.context
        appender.start()
        return appender
    }

    fun configureConsoleLogger(name: String): ConsoleAppender<ILoggingEvent> {
        val encoder = PatternLayoutEncoder()
        if(displayConsoleTimestamp) {
            encoder.pattern = "[%thread] %-5level %logger{36} - %msg%n"
        } else {
            encoder.pattern = "$name %d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
        }
        encoder.context = LoggerFactory.getILoggerFactory() as LoggerContext
        encoder.start()
        val consoleAppender = ConsoleAppender<ILoggingEvent>()
        consoleAppender.encoder = encoder
        consoleAppender.context = encoder.context
        consoleAppender.start()

        return consoleAppender
    }

    fun setLoggerToInfo(qualifiedName: String?) {
        setLevel(qualifiedName, Level.INFO)
    }

    fun setLoggerToDebug(qualifiedName: String?) {
        setLevel(qualifiedName, Level.DEBUG)
    }

    fun setLoggerToError(qualifiedName: String?) {
        setLevel(qualifiedName, Level.ERROR)
    }

}
