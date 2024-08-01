package com.example.firebasecrashlyticsreport

import com.android.build.api.dsl.ApplicationExtension
import com.google.firebase.appdistribution.gradle.AppDistributionExtension
import com.google.firebase.crashlytics.buildtools.gradle.CrashlyticsExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

internal fun Project.configureFirebase(extension: ApplicationExtension) {
    extension.buildTypes {
        getByName("debug") {
            configureAppDistribution()
            configureCrashlytics()
        }
    }
}

private fun Project.configureAppDistribution() {
    configure<AppDistributionExtension> {
    }
}

private fun Project.configureCrashlytics() {
    configure<CrashlyticsExtension> {
        mappingFileUploadEnabled = false
    }
}
