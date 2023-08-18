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
 * The format of the comparison.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ComparisonFormatConfigurationProperty comparisonFormatConfigurationProperty =
 * ComparisonFormatConfigurationProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-comparisonformatconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardComparisonFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ComparisonFormatConfigurationProperty.Builder =
        CfnDashboard.ComparisonFormatConfigurationProperty.builder()

    /** @param numberDisplayFormatConfiguration The number display format. */
    public fun numberDisplayFormatConfiguration(numberDisplayFormatConfiguration: IResolvable) {
        cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
    }

    /** @param numberDisplayFormatConfiguration The number display format. */
    public fun numberDisplayFormatConfiguration(
        numberDisplayFormatConfiguration: CfnDashboard.NumberDisplayFormatConfigurationProperty
    ) {
        cdkBuilder.numberDisplayFormatConfiguration(numberDisplayFormatConfiguration)
    }

    /** @param percentageDisplayFormatConfiguration The percentage display format. */
    public fun percentageDisplayFormatConfiguration(
        percentageDisplayFormatConfiguration: IResolvable
    ) {
        cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
    }

    /** @param percentageDisplayFormatConfiguration The percentage display format. */
    public fun percentageDisplayFormatConfiguration(
        percentageDisplayFormatConfiguration:
            CfnDashboard.PercentageDisplayFormatConfigurationProperty
    ) {
        cdkBuilder.percentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration)
    }

    public fun build(): CfnDashboard.ComparisonFormatConfigurationProperty = cdkBuilder.build()
}
