plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.kez.gps"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kez.gps"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
}
