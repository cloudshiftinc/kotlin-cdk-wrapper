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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The dynamic configuration of the reference line data configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineDynamicDataConfigurationProperty referenceLineDynamicDataConfigurationProperty =
 * ReferenceLineDynamicDataConfigurationProperty.builder()
 * .calculation(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .measureAggregationFunction(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-referencelinedynamicdataconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardReferenceLineDynamicDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ReferenceLineDynamicDataConfigurationProperty.Builder =
        CfnDashboard.ReferenceLineDynamicDataConfigurationProperty.builder()

    /** @param calculation The calculation that is used in the dynamic data. */
    public fun calculation(calculation: IResolvable) {
        cdkBuilder.calculation(calculation)
    }

    /** @param calculation The calculation that is used in the dynamic data. */
    public fun calculation(calculation: CfnDashboard.NumericalAggregationFunctionProperty) {
        cdkBuilder.calculation(calculation)
    }

    /** @param column The column that the dynamic data targets. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The column that the dynamic data targets. */
    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    /**
     * @param measureAggregationFunction The aggregation function that is used in the dynamic data.
     */
    public fun measureAggregationFunction(measureAggregationFunction: IResolvable) {
        cdkBuilder.measureAggregationFunction(measureAggregationFunction)
    }

    /**
     * @param measureAggregationFunction The aggregation function that is used in the dynamic data.
     */
    public fun measureAggregationFunction(
        measureAggregationFunction: CfnDashboard.AggregationFunctionProperty
    ) {
        cdkBuilder.measureAggregationFunction(measureAggregationFunction)
    }

    public fun build(): CfnDashboard.ReferenceLineDynamicDataConfigurationProperty =
        cdkBuilder.build()
}
