import com.android.build.api.dsl.ApplicationExtension
import com.example.firebasecrashlyticsreport.configureFirebase
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

class ApplicationFirebaseConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.google.firebase.appdistribution")
                apply("com.google.firebase.crashlytics")
                apply("com.google.firebase.firebase-perf")
            }

            val extension = extensions.getByType<ApplicationExtension>()
            configureFirebase(extension)
        }
    }
}
