package cloudshift.awscdkdsl.build.dsl.model

import com.squareup.kotlinpoet.ClassName

internal object CdkDsl {
    const val packageName = "cloudshift.awscdk.dsl"
    const val cdkPackageName = "software.amazon.awscdk"
    val DslMarkerAnnotation =
        ClassName.bestGuess(
            "cloudshift.awscdk.common.CdkDslMarker"
        )
}
