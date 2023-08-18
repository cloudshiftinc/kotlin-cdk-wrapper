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
 * The comparison display configuration of a KPI or gauge chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ComparisonConfigurationProperty comparisonConfigurationProperty =
 * ComparisonConfigurationProperty.builder()
 * .comparisonFormat(ComparisonFormatConfigurationProperty.builder()
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
 * .comparisonMethod("comparisonMethod")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-comparisonconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisComparisonConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ComparisonConfigurationProperty.Builder =
        CfnAnalysis.ComparisonConfigurationProperty.builder()

    /** @param comparisonFormat The format of the comparison. */
    public fun comparisonFormat(comparisonFormat: IResolvable) {
        cdkBuilder.comparisonFormat(comparisonFormat)
    }

    /** @param comparisonFormat The format of the comparison. */
    public fun comparisonFormat(
        comparisonFormat: CfnAnalysis.ComparisonFormatConfigurationProperty
    ) {
        cdkBuilder.comparisonFormat(comparisonFormat)
    }

    /**
     * @param comparisonMethod The method of the comparison. Choose from the following options:.
     * * `DIFFERENCE`
     * * `PERCENT_DIFFERENCE`
     * * `PERCENT`
     */
    public fun comparisonMethod(comparisonMethod: String) {
        cdkBuilder.comparisonMethod(comparisonMethod)
    }

    public fun build(): CfnAnalysis.ComparisonConfigurationProperty = cdkBuilder.build()
}
