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
 * The options that determine the numeric format configuration.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumericFormatConfigurationProperty numericFormatConfigurationProperty =
 * NumericFormatConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-numericformatconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardNumericFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.NumericFormatConfigurationProperty.Builder =
        CfnDashboard.NumericFormatConfigurationProperty.builder()

    /**
     * @param currencyDisplayFormatConfiguration The options that determine the currency display
     *   format configuration.
     */
    public fun currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration: IResolvable) {
        cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
    }

    /**
     * @param currencyDisplayFormatConfiguration The options that determine the currency display
     *   format configuration.
     */
    public fun currencyDisplayFormatConfiguration(
        currencyDisplayFormatConfiguration: CfnDashboard.CurrencyDisplayFormatConfigurationProperty
    ) {
        cdkBuilder.currencyDisplayFormatConfiguration(currencyDisplayFormatConfiguration)
    }

    /**
     * @param numberDisplayFormatConfiguration The options that determine the number display format
     *   configuration.
     */
    public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
        cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
    }

    /**
     * @param numberDisplayFormatConfiguration The options that determine the number display format
     *   configuration.
     */
    public fun numberDisplayFormatConfiguration(
        numberDisplayFormatConfiguration: CfnDashboard.NumberDisplayFormatConfigurationProperty
    ) {
        cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
    }

    /**
     * @param percentageDisplayFormatConfiguration The options that determine the percentage display
     *   format configuration.
     */
    public fun percentageDisplayFormatConfiguration(
        percentageDisplayFormatConfiguration: IResolvable
    ) {
        cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
    }

    /**
     * @param percentageDisplayFormatConfiguration The options that determine the percentage display
     *   format configuration.
     */
    public fun percentageDisplayFormatConfiguration(
        percentageDisplayFormatConfiguration:
            CfnDashboard.PercentageDisplayFormatConfigurationProperty
    ) {
        cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
    }

    public fun build(): CfnDashboard.NumericFormatConfigurationProperty = cdkBuilder.build()
}
