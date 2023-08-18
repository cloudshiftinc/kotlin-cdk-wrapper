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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.CfnAlarm

/**
 * Dimension is an embedded property of the `AWS::CloudWatch::Alarm` type.
 *
 * Dimensions are name/value pairs that can be associated with a CloudWatch metric. You can specify
 * a maximum of 10 dimensions for a given metric.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * DimensionProperty dimensionProperty = DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-dimension.html)
 */
@CdkDslMarker
public class CfnAlarmDimensionPropertyDsl {
    private val cdkBuilder: CfnAlarm.DimensionProperty.Builder =
        CfnAlarm.DimensionProperty.builder()

    /**
     * @param name The name of the dimension, from 1–255 characters in length. This dimension name
     *   must have been included when the metric was published.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value for the dimension, from 1–255 characters in length. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAlarm.DimensionProperty = cdkBuilder.build()
}
