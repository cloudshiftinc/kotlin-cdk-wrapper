@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The measure type field with numerical type columns.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumericalMeasureFieldProperty numericalMeasureFieldProperty =
 * NumericalMeasureFieldProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .fieldId("fieldId")
 * // the properties below are optional
 * .aggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .formatConfiguration(NumberFormatConfigurationProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-numericalmeasurefield.html)
 */
@CdkDslMarker
public class CfnAnalysisNumericalMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnAnalysis.NumericalMeasureFieldProperty.Builder =
        CfnAnalysis.NumericalMeasureFieldProperty.builder()

    /**
     * @param aggregationFunction The aggregation function of the measure field.
     */
    public fun aggregationFunction(aggregationFunction: IResolvable) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    /**
     * @param aggregationFunction The aggregation function of the measure field.
     */
    public fun aggregationFunction(aggregationFunction: CfnAnalysis.NumericalAggregationFunctionProperty) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    /**
     * @param column The column that is used in the `NumericalMeasureField` .
     */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /**
     * @param column The column that is used in the `NumericalMeasureField` .
     */
    public fun column(column: CfnAnalysis.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    /**
     * @param fieldId The custom field ID.
     */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /**
     * @param formatConfiguration The format configuration of the field.
     */
    public fun formatConfiguration(formatConfiguration: IResolvable) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    /**
     * @param formatConfiguration The format configuration of the field.
     */
    public fun formatConfiguration(formatConfiguration: CfnAnalysis.NumberFormatConfigurationProperty) {
        cdkBuilder.formatConfiguration(formatConfiguration)
    }

    public fun build(): CfnAnalysis.NumericalMeasureFieldProperty = cdkBuilder.build()
}
