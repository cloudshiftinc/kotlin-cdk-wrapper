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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * The value of the constant that is used to specify the endpoints of a range filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RangeConstantProperty rangeConstantProperty = RangeConstantProperty.builder()
 * .maximum("maximum")
 * .minimum("minimum")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-rangeconstant.html)
 */
@CdkDslMarker
public class CfnTopicRangeConstantPropertyDsl {
    private val cdkBuilder: CfnTopic.RangeConstantProperty.Builder =
        CfnTopic.RangeConstantProperty.builder()

    /** @param maximum The maximum value for a range constant. */
    public fun maximum(maximum: String) {
        cdkBuilder.maximum(maximum)
    }

    /** @param minimum The minimum value for a range constant. */
    public fun minimum(minimum: String) {
        cdkBuilder.minimum(minimum)
    }

    public fun build(): CfnTopic.RangeConstantProperty = cdkBuilder.build()
}
