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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The data configuration of the reference line.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineDataConfigurationProperty referenceLineDataConfigurationProperty =
 * ReferenceLineDataConfigurationProperty.builder()
 * .axisBinding("axisBinding")
 * .dynamicConfiguration(ReferenceLineDynamicDataConfigurationProperty.builder()
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
 * .attributeAggregationFunction(AttributeAggregationFunctionProperty.builder()
 * .simpleAttributeAggregation("simpleAttributeAggregation")
 * .valueForMultipleValues("valueForMultipleValues")
 * .build())
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .build())
 * .seriesType("seriesType")
 * .staticConfiguration(ReferenceLineStaticDataConfigurationProperty.builder()
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-referencelinedataconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisReferenceLineDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ReferenceLineDataConfigurationProperty.Builder =
        CfnAnalysis.ReferenceLineDataConfigurationProperty.builder()

    /**
     * @param axisBinding The axis binding type of the reference line. Choose one of the following
     *   options:.
     * * `PrimaryY`
     * * `SecondaryY`
     */
    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    /**
     * @param dynamicConfiguration The dynamic configuration of the reference line data
     *   configuration.
     */
    public fun dynamicConfiguration(dynamicConfiguration: IResolvable) {
        cdkBuilder.dynamicConfiguration(dynamicConfiguration)
    }

    /**
     * @param dynamicConfiguration The dynamic configuration of the reference line data
     *   configuration.
     */
    public fun dynamicConfiguration(
        dynamicConfiguration: CfnAnalysis.ReferenceLineDynamicDataConfigurationProperty
    ) {
        cdkBuilder.dynamicConfiguration(dynamicConfiguration)
    }

    /**
     * @param seriesType The series type of the reference line data configuration. Choose one of the
     *   following options:.
     * * `BAR`
     * * `LINE`
     */
    public fun seriesType(seriesType: String) {
        cdkBuilder.seriesType(seriesType)
    }

    /**
     * @param staticConfiguration The static data configuration of the reference line data
     *   configuration.
     */
    public fun staticConfiguration(staticConfiguration: IResolvable) {
        cdkBuilder.staticConfiguration(staticConfiguration)
    }

    /**
     * @param staticConfiguration The static data configuration of the reference line data
     *   configuration.
     */
    public fun staticConfiguration(
        staticConfiguration: CfnAnalysis.ReferenceLineStaticDataConfigurationProperty
    ) {
        cdkBuilder.staticConfiguration(staticConfiguration)
    }

    public fun build(): CfnAnalysis.ReferenceLineDataConfigurationProperty = cdkBuilder.build()
}
