package app

import io.opengood.commons.spring.property.YamlPropertySourceFactory
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

@Configuration
@ConfigurationProperties(prefix = "app")
@ConstructorBinding
@PropertySource(value = ["classpath:app-properties.yml"], factory = YamlPropertySourceFactory::class)
data class AppProperties(
    val properties: Map<String, String> = HashMap()
)
