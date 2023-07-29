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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * An aggregation based on the percentile of values in a dimension or measure.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PercentileAggregationProperty percentileAggregationProperty =
 * PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-percentileaggregation.html)
 */
@CdkDslMarker
public class CfnDashboardPercentileAggregationPropertyDsl {
    private val cdkBuilder: CfnDashboard.PercentileAggregationProperty.Builder =
        CfnDashboard.PercentileAggregationProperty.builder()

    /**
     * @param percentileValue The percentile value. This value can be any numeric constant 0–100. A
     *   percentile value of 50 computes the median value of the measure.
     */
    public fun percentileValue(percentileValue: Number) {
        cdkBuilder.percentileValue(percentileValue)
    }

    public fun build(): CfnDashboard.PercentileAggregationProperty = cdkBuilder.build()
}
