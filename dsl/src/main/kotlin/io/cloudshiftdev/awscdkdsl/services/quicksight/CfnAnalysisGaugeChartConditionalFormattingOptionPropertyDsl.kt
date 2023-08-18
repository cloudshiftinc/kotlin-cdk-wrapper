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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Conditional formatting options of a `GaugeChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GaugeChartConditionalFormattingOptionProperty gaugeChartConditionalFormattingOptionProperty =
 * GaugeChartConditionalFormattingOptionProperty.builder()
 * .arc(GaugeChartArcConditionalFormattingProperty.builder()
 * .foregroundColor(ConditionalFormattingColorProperty.builder()
 * .gradient(ConditionalFormattingGradientColorProperty.builder()
 * .color(GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build())
 * .expression("expression")
 * .build())
 * .solid(ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build())
 * .build())
 * .build())
 * .primaryValue(GaugeChartPrimaryValueConditionalFormattingProperty.builder()
 * .icon(ConditionalFormattingIconProperty.builder()
 * .customCondition(ConditionalFormattingCustomIconConditionProperty.builder()
 * .expression("expression")
 * .iconOptions(ConditionalFormattingCustomIconOptionsProperty.builder()
 * .icon("icon")
 * .unicodeIcon("unicodeIcon")
 * .build())
 * // the properties below are optional
 * .color("color")
 * .displayConfiguration(ConditionalFormattingIconDisplayConfigurationProperty.builder()
 * .iconDisplayOption("iconDisplayOption")
 * .build())
 * .build())
 * .iconSet(ConditionalFormattingIconSetProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .iconSetType("iconSetType")
 * .build())
 * .build())
 * .textColor(ConditionalFormattingColorProperty.builder()
 * .gradient(ConditionalFormattingGradientColorProperty.builder()
 * .color(GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build())
 * .expression("expression")
 * .build())
 * .solid(ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-gaugechartconditionalformattingoption.html)
 */
@CdkDslMarker
public class CfnAnalysisGaugeChartConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GaugeChartConditionalFormattingOptionProperty.Builder =
        CfnAnalysis.GaugeChartConditionalFormattingOptionProperty.builder()

    /**
     * @param arc The options that determine the presentation of the arc of a `GaugeChartVisual` .
     */
    public fun arc(arc: IResolvable) {
        cdkBuilder.arc(arc)
    }

    /**
     * @param arc The options that determine the presentation of the arc of a `GaugeChartVisual` .
     */
    public fun arc(arc: CfnAnalysis.GaugeChartArcConditionalFormattingProperty) {
        cdkBuilder.arc(arc)
    }

    /**
     * @param primaryValue The conditional formatting for the primary value of a `GaugeChartVisual`
     *   .
     */
    public fun primaryValue(primaryValue: IResolvable) {
        cdkBuilder.primaryValue(primaryValue)
    }

    /**
     * @param primaryValue The conditional formatting for the primary value of a `GaugeChartVisual`
     *   .
     */
    public fun primaryValue(
        primaryValue: CfnAnalysis.GaugeChartPrimaryValueConditionalFormattingProperty
    ) {
        cdkBuilder.primaryValue(primaryValue)
    }

    public fun build(): CfnAnalysis.GaugeChartConditionalFormattingOptionProperty =
        cdkBuilder.build()
}
