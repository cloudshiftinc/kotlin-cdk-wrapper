@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/**
 * An (X, Y) cartesian coordinate denoting a point on the frame.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * PointProperty pointProperty = PointProperty.builder()
 * .x(123)
 * .y(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rekognition-streamprocessor-point.html)
 */
@CdkDslMarker
public class CfnStreamProcessorPointPropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.PointProperty.Builder =
        CfnStreamProcessor.PointProperty.builder()

    /** @param x The X coordinate of the point. */
    public fun x(x: Number) {
        cdkBuilder.x(x)
    }

    /** @param y The Y coordinate of the point. */
    public fun y(y: Number) {
        cdkBuilder.y(y)
    }

    public fun build(): CfnStreamProcessor.PointProperty = cdkBuilder.build()
}
