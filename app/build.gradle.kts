/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.3/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    // application
    java
    war
    eclipse
    id("org.gretty") version "3.1.2"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:32.1.1-jre")

    // Lombok
    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    // Servlet + JSF
    // https://mvnrepository.com/artifact/org.glassfish/javax.faces
    implementation("org.glassfish:javax.faces:2.3.9")

    // https://mvnrepository.com/artifact/net.bootsfaces/bootsfaces
    implementation("net.bootsfaces:bootsfaces:1.5.0")

    // CDI
    // https://mvnrepository.com/artifact/org.jboss.weld.servlet/weld-servlet-shaded
    implementation("org.jboss.weld.servlet:weld-servlet-shaded:3.1.9.Final")

    // JAX-RS
    // https://mvnrepository.com/artifact/org.glassfish.jersey.containers/jersey-container-servlet
    implementation("org.glassfish.jersey.containers:jersey-container-servlet:2.41")

    // https://mvnrepository.com/artifact/org.glassfish.jersey.ext.cdi/jersey-cdi1x
    implementation("org.glassfish.jersey.ext.cdi:jersey-cdi1x:2.41")

    // https://mvnrepository.com/artifact/org.glassfish.jersey.inject/jersey-hk2
    implementation("org.glassfish.jersey.inject:jersey-hk2:2.41")

    // https://mvnrepository.com/artifact/org.glassfish.jersey.media/jersey-media-json-jackson
    implementation("org.glassfish.jersey.media:jersey-media-json-jackson:2.41")

    // https://mvnrepository.com/artifact/org.glassfish.jersey.bundles/jaxrs-ri
    implementation("org.glassfish.jersey.bundles:jaxrs-ri:2.41")

    // SLF4J + Logback
    // https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation("org.slf4j:slf4j-api:2.0.10")

    // https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
    implementation("ch.qos.logback:logback-classic:1.4.14")

    // Axios
    // https://mvnrepository.com/artifact/org.webjars.npm/axios
    implementation("org.webjars.npm:axios:1.6.2")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

war {
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

gretty {
    // servletContainer = "jetty11"
    contextPath = "/learn-cdi-jax-rs"
}
