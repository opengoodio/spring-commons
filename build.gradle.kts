plugins {
    id("io.opengood.gradle.config")
}

group = "io.opengood.commons"

opengood {
    artifact {
        description = "Commons library containing reusable patterns, extensions, properties, beans, and objects for Spring and Spring Boot"
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-webflux")

    testImplementation("ch.qos.logback:logback-classic:_")
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin:_")
    testImplementation("org.springframework.cloud:spring-cloud-starter-contract-stub-runner:_")
}
