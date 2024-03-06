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
 * The reference line visual display options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineProperty referenceLineProperty = ReferenceLineProperty.builder()
 * .dataConfiguration(ReferenceLineDataConfigurationProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .labelConfiguration(ReferenceLineLabelConfigurationProperty.builder()
 * .customLabelConfiguration(ReferenceLineCustomLabelConfigurationProperty.builder()
 * .customLabel("customLabel")
 * .build())
 * .fontColor("fontColor")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .horizontalPosition("horizontalPosition")
 * .valueLabelConfiguration(ReferenceLineValueLabelConfigurationProperty.builder()
 * .formatConfiguration(NumericFormatConfigurationProperty.builder()
 * .currencyDisplayFormatConfiguration(CurrencyDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numberScale("numberScale")
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .symbol("symbol")
 * .build())
 * .numberDisplayFormatConfiguration(NumberDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .numberScale("numberScale")
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .build())
 * .percentageDisplayFormatConfiguration(PercentageDisplayFormatConfigurationProperty.builder()
 * .decimalPlacesConfiguration(DecimalPlacesConfigurationProperty.builder()
 * .decimalPlaces(123)
 * .build())
 * .negativeValueConfiguration(NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build())
 * .nullValueFormatConfiguration(NullValueFormatConfigurationProperty.builder()
 * .nullString("nullString")
 * .build())
 * .prefix("prefix")
 * .separatorConfiguration(NumericSeparatorConfigurationProperty.builder()
 * .decimalSeparator("decimalSeparator")
 * .thousandsSeparator(ThousandSeparatorOptionsProperty.builder()
 * .symbol("symbol")
 * .visibility("visibility")
 * .build())
 * .build())
 * .suffix("suffix")
 * .build())
 * .build())
 * .relativePosition("relativePosition")
 * .build())
 * .verticalPosition("verticalPosition")
 * .build())
 * .status("status")
 * .styleConfiguration(ReferenceLineStyleConfigurationProperty.builder()
 * .color("color")
 * .pattern("pattern")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-referenceline.html)
 */
@CdkDslMarker
public class CfnAnalysisReferenceLinePropertyDsl {
    private val cdkBuilder: CfnAnalysis.ReferenceLineProperty.Builder =
        CfnAnalysis.ReferenceLineProperty.builder()

    /** @param dataConfiguration The data configuration of the reference line. */
    public fun dataConfiguration(dataConfiguration: IResolvable) {
        cdkBuilder.dataConfiguration(dataConfiguration)
    }

    /** @param dataConfiguration The data configuration of the reference line. */
    public fun dataConfiguration(
        dataConfiguration: CfnAnalysis.ReferenceLineDataConfigurationProperty
    ) {
        cdkBuilder.dataConfiguration(dataConfiguration)
    }

    /** @param labelConfiguration The label configuration of the reference line. */
    public fun labelConfiguration(labelConfiguration: IResolvable) {
        cdkBuilder.labelConfiguration(labelConfiguration)
    }

    /** @param labelConfiguration The label configuration of the reference line. */
    public fun labelConfiguration(
        labelConfiguration: CfnAnalysis.ReferenceLineLabelConfigurationProperty
    ) {
        cdkBuilder.labelConfiguration(labelConfiguration)
    }

    /**
     * @param status The status of the reference line. Choose one of the following options:.
     * * `ENABLE`
     * * `DISABLE`
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param styleConfiguration The style configuration of the reference line. */
    public fun styleConfiguration(styleConfiguration: IResolvable) {
        cdkBuilder.styleConfiguration(styleConfiguration)
    }

    /** @param styleConfiguration The style configuration of the reference line. */
    public fun styleConfiguration(
        styleConfiguration: CfnAnalysis.ReferenceLineStyleConfigurationProperty
    ) {
        cdkBuilder.styleConfiguration(styleConfiguration)
    }

    public fun build(): CfnAnalysis.ReferenceLineProperty = cdkBuilder.build()
}
