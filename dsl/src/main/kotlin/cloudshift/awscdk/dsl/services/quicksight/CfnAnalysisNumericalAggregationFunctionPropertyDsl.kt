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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Aggregation for numerical values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumericalAggregationFunctionProperty numericalAggregationFunctionProperty =
 * NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-numericalaggregationfunction.html)
 */
@CdkDslMarker
public class CfnAnalysisNumericalAggregationFunctionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.NumericalAggregationFunctionProperty.Builder =
        CfnAnalysis.NumericalAggregationFunctionProperty.builder()

    /**
     * @param percentileAggregation An aggregation based on the percentile of values in a dimension
     *   or measure.
     */
    public fun percentileAggregation(percentileAggregation: IResolvable) {
        cdkBuilder.percentileAggregation(percentileAggregation)
    }

    /**
     * @param percentileAggregation An aggregation based on the percentile of values in a dimension
     *   or measure.
     */
    public fun percentileAggregation(
        percentileAggregation: CfnAnalysis.PercentileAggregationProperty
    ) {
        cdkBuilder.percentileAggregation(percentileAggregation)
    }

    /**
     * @param simpleNumericalAggregation Built-in aggregation functions for numerical values.
     * * `SUM` : The sum of a dimension or measure.
     * * `AVERAGE` : The average of a dimension or measure.
     * * `MIN` : The minimum value of a dimension or measure.
     * * `MAX` : The maximum value of a dimension or measure.
     * * `COUNT` : The count of a dimension or measure.
     * * `DISTINCT_COUNT` : The count of distinct values in a dimension or measure.
     * * `VAR` : The variance of a dimension or measure.
     * * `VARP` : The partitioned variance of a dimension or measure.
     * * `STDEV` : The standard deviation of a dimension or measure.
     * * `STDEVP` : The partitioned standard deviation of a dimension or measure.
     * * `MEDIAN` : The median value of a dimension or measure.
     */
    public fun simpleNumericalAggregation(simpleNumericalAggregation: String) {
        cdkBuilder.simpleNumericalAggregation(simpleNumericalAggregation)
    }

    public fun build(): CfnAnalysis.NumericalAggregationFunctionProperty = cdkBuilder.build()
}
