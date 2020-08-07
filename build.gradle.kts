import org.jetbrains.changelog.closure
import org.jetbrains.changelog.markdownToHTML

plugins {
    kotlin("jvm") version "1.3.72"
    id("org.jetbrains.intellij") version "0.4.21"
    id("org.jetbrains.changelog") version "0.4.0"
    id("io.gitlab.arturbosch.detekt") version "1.10.0"
    id("org.jlleitschuh.gradle.ktlint") version "9.2.1"
}

val pluginGroup: String by project
val pluginId: String by project
val pluginVersion: String by project
val pluginSinceBuild: String by project
val pluginUntilBuild: String by project

val platformType: String by project
val platformVersion: String by project
val platformDownloadSources: String by project

group = pluginGroup
version = pluginVersion

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.10.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}

intellij {
    pluginName = pluginId
    version = platformVersion
    type = platformType
    downloadSources = platformDownloadSources.toBoolean()
    updateSinceUntilBuild = true
}

detekt {
    config = files("./detekt-config.yml")
    buildUponDefaultConfig = true

    reports {
        html.enabled = false
        xml.enabled = false
        txt.enabled = false
    }
}

tasks {
    patchPluginXml {
        version(pluginVersion)
        sinceBuild(pluginSinceBuild)
        untilBuild(pluginUntilBuild)

        pluginDescription(closure {
            File("./README.md").readText().lines().run {
                val start = "<!-- Plugin description -->"
                val end = "<!-- Plugin description end -->"

                if (!containsAll(listOf(start, end))) {
                    throw GradleException("Plugin description section not found in README.md file:\n$start ... $end")
                }
                subList(indexOf(start) + 1, indexOf(end))
            }.joinToString("\n").run { markdownToHTML(this) }
        })

        changeNotes(closure {
            changelog.getLatest().toHTML()
        })
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

sourceSets {
    main {
        java.srcDir("src/main/gen")
    }
}

kotlin {
    sourceSets {
        main {
            kotlin.srcDir("src/main/gen")
        }
    }
}