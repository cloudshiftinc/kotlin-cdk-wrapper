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

package io.cloudshiftdev.awscdkdsl.services.pinpoint

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnCampaign

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
 * .comparisonOperator("comparisonOperator")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-metricdimension.html)
 */
@CdkDslMarker
public class CfnCampaignMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnCampaign.MetricDimensionProperty.Builder =
        CfnCampaign.MetricDimensionProperty.builder()

    /** @param comparisonOperator the value to be set. */
    public fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /** @param value the value to be set. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCampaign.MetricDimensionProperty = cdkBuilder.build()
}
