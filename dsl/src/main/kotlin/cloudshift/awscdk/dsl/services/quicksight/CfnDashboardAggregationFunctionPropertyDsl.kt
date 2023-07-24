@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * An aggregation function aggregates values from a dimension or measure.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AggregationFunctionProperty aggregationFunctionProperty = AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-aggregationfunction.html)
 */
@CdkDslMarker
public class CfnDashboardAggregationFunctionPropertyDsl {
    private val cdkBuilder: CfnDashboard.AggregationFunctionProperty.Builder =
        CfnDashboard.AggregationFunctionProperty.builder()

    /**
     * @param categoricalAggregationFunction Aggregation for categorical values.
     * * `COUNT` : Aggregate by the total number of values, including duplicates.
     * * `DISTINCT_COUNT` : Aggregate by the total number of distinct values.
     */
    public fun categoricalAggregationFunction(categoricalAggregationFunction: String) {
        cdkBuilder.categoricalAggregationFunction(categoricalAggregationFunction)
    }

    /**
     * @param dateAggregationFunction Aggregation for date values.
     * * `COUNT` : Aggregate by the total number of values, including duplicates.
     * * `DISTINCT_COUNT` : Aggregate by the total number of distinct values.
     * * `MIN` : Select the smallest date value.
     * * `MAX` : Select the largest date value.
     */
    public fun dateAggregationFunction(dateAggregationFunction: String) {
        cdkBuilder.dateAggregationFunction(dateAggregationFunction)
    }

    /**
     * @param numericalAggregationFunction Aggregation for numerical values.
     */
    public fun numericalAggregationFunction(numericalAggregationFunction: IResolvable) {
        cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
    }

    /**
     * @param numericalAggregationFunction Aggregation for numerical values.
     */
    public fun numericalAggregationFunction(numericalAggregationFunction: CfnDashboard.NumericalAggregationFunctionProperty) {
        cdkBuilder.numericalAggregationFunction(numericalAggregationFunction)
    }

    public fun build(): CfnDashboard.AggregationFunctionProperty = cdkBuilder.build()
}
