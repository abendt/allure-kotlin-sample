import io.qameta.allure.gradle.config.JUnit4Config

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.11")
    id("io.qameta.allure") version "2.5"
}

allure {
    version = "2.9.0"
    autoconfigure = true
    useJUnit4 = closureOf<JUnit4Config> {
        version = "2.9.0"
    }
    downloadLink = "http://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.9.0/allure-commandline-2.9.0.zip"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.jetbrains.kotlin:kotlin-test")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
