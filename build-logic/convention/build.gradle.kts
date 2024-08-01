plugins {
    `kotlin-dsl`
}

group = "com.example.firebasecrashlyticsreport.buildlogic"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation(libs.plugin.android)
    implementation(libs.plugin.firebase.appdistribution)
    implementation(libs.plugin.firebase.crashlytics)
    implementation(libs.plugin.firebase.performance)
}

gradlePlugin {
    plugins {
        register("applicationFirebase") {
            id = "application.firebase"
            implementationClass = "ApplicationFirebaseConventionPlugin"
        }
    }
}
