pluginManagement {
    repositories {
        maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }

        mavenCentral()

        maven { setUrl("https://plugins.gradle.org/m2/") }
    }
}
rootProject.name = "confexplorer"
include(":web-app-react-kotlin-js-gradle")
