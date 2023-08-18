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
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The arc axis range of a `GaugeChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ArcAxisDisplayRangeProperty arcAxisDisplayRangeProperty = ArcAxisDisplayRangeProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-arcaxisdisplayrange.html)
 */
@CdkDslMarker
public class CfnTemplateArcAxisDisplayRangePropertyDsl {
    private val cdkBuilder: CfnTemplate.ArcAxisDisplayRangeProperty.Builder =
        CfnTemplate.ArcAxisDisplayRangeProperty.builder()

    /** @param max The maximum value of the arc axis range. */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /** @param min The minimum value of the arc axis range. */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnTemplate.ArcAxisDisplayRangeProperty = cdkBuilder.build()
}
