@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import kotlin.Number

@CdkDslMarker
public class CfnStreamProcessorBoundingBoxPropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.BoundingBoxProperty.Builder =
        CfnStreamProcessor.BoundingBoxProperty.builder()

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun left(left: Number) {
        cdkBuilder.left(left)
    }

    public fun top(top: Number) {
        cdkBuilder.top(top)
    }

    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): CfnStreamProcessor.BoundingBoxProperty = cdkBuilder.build()
}
