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
 * The options that determine the number display format configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumberDisplayFormatConfigurationProperty numberDisplayFormatConfigurationProperty =
 * NumberDisplayFormatConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-numberdisplayformatconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisNumberDisplayFormatConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.NumberDisplayFormatConfigurationProperty.Builder =
        CfnAnalysis.NumberDisplayFormatConfigurationProperty.builder()

    /**
     * @param decimalPlacesConfiguration The option that determines the decimal places
     *   configuration.
     */
    public fun decimalPlacesConfiguration(decimalPlacesConfiguration: IResolvable) {
        cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
    }

    /**
     * @param decimalPlacesConfiguration The option that determines the decimal places
     *   configuration.
     */
    public fun decimalPlacesConfiguration(
        decimalPlacesConfiguration: CfnAnalysis.DecimalPlacesConfigurationProperty
    ) {
        cdkBuilder.decimalPlacesConfiguration(decimalPlacesConfiguration)
    }

    /**
     * @param negativeValueConfiguration The options that determine the negative value
     *   configuration.
     */
    public fun negativeValueConfiguration(negativeValueConfiguration: IResolvable) {
        cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
    }

    /**
     * @param negativeValueConfiguration The options that determine the negative value
     *   configuration.
     */
    public fun negativeValueConfiguration(
        negativeValueConfiguration: CfnAnalysis.NegativeValueConfigurationProperty
    ) {
        cdkBuilder.negativeValueConfiguration(negativeValueConfiguration)
    }

    /**
     * @param nullValueFormatConfiguration The options that determine the null value format
     *   configuration.
     */
    public fun nullValueFormatConfiguration(nullValueFormatConfiguration: IResolvable) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    /**
     * @param nullValueFormatConfiguration The options that determine the null value format
     *   configuration.
     */
    public fun nullValueFormatConfiguration(
        nullValueFormatConfiguration: CfnAnalysis.NullValueFormatConfigurationProperty
    ) {
        cdkBuilder.nullValueFormatConfiguration(nullValueFormatConfiguration)
    }

    /** @param numberScale Determines the number scale value of the number format. */
    public fun numberScale(numberScale: String) {
        cdkBuilder.numberScale(numberScale)
    }

    /** @param prefix Determines the prefix value of the number format. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /**
     * @param separatorConfiguration The options that determine the numeric separator configuration.
     */
    public fun separatorConfiguration(separatorConfiguration: IResolvable) {
        cdkBuilder.separatorConfiguration(separatorConfiguration)
    }

    /**
     * @param separatorConfiguration The options that determine the numeric separator configuration.
     */
    public fun separatorConfiguration(
        separatorConfiguration: CfnAnalysis.NumericSeparatorConfigurationProperty
    ) {
        cdkBuilder.separatorConfiguration(separatorConfiguration)
    }

    /** @param suffix Determines the suffix value of the number format. */
    public fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
    }

    public fun build(): CfnAnalysis.NumberDisplayFormatConfigurationProperty = cdkBuilder.build()
}
