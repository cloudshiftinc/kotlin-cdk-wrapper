package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName

internal object CdkDsl {
    const val packageName = "io.cloudshiftdev.awscdk"
    const val cdkPackageName = "software.amazon.awscdk"
    val DslMarkerAnnotation = ClassName("${packageName}.common", "CdkDslMarker")
    val MapBuilderClass = ClassName("${packageName}.common", "MapBuilder")
}
