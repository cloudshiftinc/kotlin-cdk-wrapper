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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the presentation of a KPI visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPIOptionsProperty kPIOptionsProperty = KPIOptionsProperty.builder()
 * .comparison(ComparisonConfigurationProperty.builder()
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
 * .build())
 * .primaryValueDisplayType("primaryValueDisplayType")
 * .primaryValueFontConfiguration(FontConfigurationProperty.builder()
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
 * .progressBar(ProgressBarOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .secondaryValue(SecondaryValueOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .secondaryValueFontConfiguration(FontConfigurationProperty.builder()
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
 * .sparkline(KPISparklineOptionsProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .color("color")
 * .tooltipVisibility("tooltipVisibility")
 * .visibility("visibility")
 * .build())
 * .trendArrows(TrendArrowOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .visualLayoutOptions(KPIVisualLayoutOptionsProperty.builder()
 * .standardLayout(KPIVisualStandardLayoutProperty.builder()
 * .type("type")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-kpioptions.html)
 */
@CdkDslMarker
public class CfnTemplateKPIOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIOptionsProperty.Builder =
        CfnTemplate.KPIOptionsProperty.builder()

    /** @param comparison The comparison configuration of a KPI visual. */
    public fun comparison(comparison: IResolvable) {
        cdkBuilder.comparison(comparison)
    }

    /** @param comparison The comparison configuration of a KPI visual. */
    public fun comparison(comparison: CfnTemplate.ComparisonConfigurationProperty) {
        cdkBuilder.comparison(comparison)
    }

    /** @param primaryValueDisplayType The options that determine the primary value display type. */
    public fun primaryValueDisplayType(primaryValueDisplayType: String) {
        cdkBuilder.primaryValueDisplayType(primaryValueDisplayType)
    }

    /**
     * @param primaryValueFontConfiguration The options that determine the primary value font
     *   configuration.
     */
    public fun primaryValueFontConfiguration(primaryValueFontConfiguration: IResolvable) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    /**
     * @param primaryValueFontConfiguration The options that determine the primary value font
     *   configuration.
     */
    public fun primaryValueFontConfiguration(
        primaryValueFontConfiguration: CfnTemplate.FontConfigurationProperty
    ) {
        cdkBuilder.primaryValueFontConfiguration(primaryValueFontConfiguration)
    }

    /**
     * @param progressBar The options that determine the presentation of the progress bar of a KPI
     *   visual.
     */
    public fun progressBar(progressBar: IResolvable) {
        cdkBuilder.progressBar(progressBar)
    }

    /**
     * @param progressBar The options that determine the presentation of the progress bar of a KPI
     *   visual.
     */
    public fun progressBar(progressBar: CfnTemplate.ProgressBarOptionsProperty) {
        cdkBuilder.progressBar(progressBar)
    }

    /**
     * @param secondaryValue The options that determine the presentation of the secondary value of a
     *   KPI visual.
     */
    public fun secondaryValue(secondaryValue: IResolvable) {
        cdkBuilder.secondaryValue(secondaryValue)
    }

    /**
     * @param secondaryValue The options that determine the presentation of the secondary value of a
     *   KPI visual.
     */
    public fun secondaryValue(secondaryValue: CfnTemplate.SecondaryValueOptionsProperty) {
        cdkBuilder.secondaryValue(secondaryValue)
    }

    /**
     * @param secondaryValueFontConfiguration The options that determine the secondary value font
     *   configuration.
     */
    public fun secondaryValueFontConfiguration(secondaryValueFontConfiguration: IResolvable) {
        cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
    }

    /**
     * @param secondaryValueFontConfiguration The options that determine the secondary value font
     *   configuration.
     */
    public fun secondaryValueFontConfiguration(
        secondaryValueFontConfiguration: CfnTemplate.FontConfigurationProperty
    ) {
        cdkBuilder.secondaryValueFontConfiguration(secondaryValueFontConfiguration)
    }

    /**
     * @param sparkline The options that determine the visibility, color, type, and tooltip
     *   visibility of the sparkline of a KPI visual.
     */
    public fun sparkline(sparkline: IResolvable) {
        cdkBuilder.sparkline(sparkline)
    }

    /**
     * @param sparkline The options that determine the visibility, color, type, and tooltip
     *   visibility of the sparkline of a KPI visual.
     */
    public fun sparkline(sparkline: CfnTemplate.KPISparklineOptionsProperty) {
        cdkBuilder.sparkline(sparkline)
    }

    /**
     * @param trendArrows The options that determine the presentation of trend arrows in a KPI
     *   visual.
     */
    public fun trendArrows(trendArrows: IResolvable) {
        cdkBuilder.trendArrows(trendArrows)
    }

    /**
     * @param trendArrows The options that determine the presentation of trend arrows in a KPI
     *   visual.
     */
    public fun trendArrows(trendArrows: CfnTemplate.TrendArrowOptionsProperty) {
        cdkBuilder.trendArrows(trendArrows)
    }

    /** @param visualLayoutOptions The options that determine the layout a KPI visual. */
    public fun visualLayoutOptions(visualLayoutOptions: IResolvable) {
        cdkBuilder.visualLayoutOptions(visualLayoutOptions)
    }

    /** @param visualLayoutOptions The options that determine the layout a KPI visual. */
    public fun visualLayoutOptions(
        visualLayoutOptions: CfnTemplate.KPIVisualLayoutOptionsProperty
    ) {
        cdkBuilder.visualLayoutOptions(visualLayoutOptions)
    }

    public fun build(): CfnTemplate.KPIOptionsProperty = cdkBuilder.build()
}
