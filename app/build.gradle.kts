plugins {
    application
    checkstyle
    id("org.sonarqube") version "6.2.0.5505"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("hexlet.code.App")
}

repositories {
    mavenCentral()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.test {
    useJUnitPlatform()
}

checkstyle {
    toolVersion = "10.12.1"
    configFile = file("config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false
    isShowViolations = true
}

sonar {
    properties {
        property("sonar.projectKey", "TechWizard-SS_java-project-61")
        property("sonar.organization", "techwizard-ss")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}