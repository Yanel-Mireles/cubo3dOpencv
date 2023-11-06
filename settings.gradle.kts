pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "cubo3d"
include(":app")
include(":sdk")
project(":sdk").projectDir = File("C:\\Users\\SONY\\AndroidStudioProjects\\cubo3d\\sdk")
