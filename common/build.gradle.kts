plugins {
    id("cloudshift.awscdkdsl.build.kotlin-library")
    id("cloudshift.awscdkdsl.build.library-publishing")
}

dependencies { implementation(libs.awscdk) }
