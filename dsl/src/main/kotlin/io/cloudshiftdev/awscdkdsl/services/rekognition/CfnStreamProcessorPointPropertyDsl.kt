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

package io.cloudshiftdev.awscdkdsl.services.rekognition

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

/**
 * The X and Y coordinates of a point on an image or video frame.
 *
 * The X and Y values are ratios of the overall image size or video resolution. For example, if the
 * input image is 700x200 and the values are X=0.5 and Y=0.25, then the point is at the (350,50)
 * pixel coordinate on the image.
 *
 * An array of `Point` objects, `Polygon` , is returned by
 * [DetectText](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectText) and by
 * [DetectCustomLabels](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_DetectCustomLabels)
 * or used to define regions of interest in Amazon Rekognition Video operations such as
 * `CreateStreamProcessor` . `Polygon` represents a fine-grained polygon around a detected item. For
 * more information, see
 * [Geometry](https://docs.aws.amazon.com/rekognition/latest/APIReference/API_Geometry) .
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

    /** @param x The value of the X coordinate for a point on a `Polygon` . */
    public fun x(x: Number) {
        cdkBuilder.x(x)
    }

    /** @param y The value of the Y coordinate for a point on a `Polygon` . */
    public fun y(y: Number) {
        cdkBuilder.y(y)
    }

    public fun build(): CfnStreamProcessor.PointProperty = cdkBuilder.build()
}
