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
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-referencelinedynamicdataconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateReferenceLineDynamicDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ReferenceLineDynamicDataConfigurationProperty.Builder =
        CfnTemplate.ReferenceLineDynamicDataConfigurationProperty.builder()

    /** @param calculation The calculation that is used in the dynamic data. */
    public fun calculation(calculation: IResolvable) {
        cdkBuilder.calculation(calculation)
    }

    /** @param calculation The calculation that is used in the dynamic data. */
    public fun calculation(calculation: CfnTemplate.NumericalAggregationFunctionProperty) {
        cdkBuilder.calculation(calculation)
    }

    /** @param column The column that the dynamic data targets. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The column that the dynamic data targets. */
    public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
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
        measureAggregationFunction: CfnTemplate.AggregationFunctionProperty
    ) {
        cdkBuilder.measureAggregationFunction(measureAggregationFunction)
    }

    public fun build(): CfnTemplate.ReferenceLineDynamicDataConfigurationProperty =
        cdkBuilder.build()
}
