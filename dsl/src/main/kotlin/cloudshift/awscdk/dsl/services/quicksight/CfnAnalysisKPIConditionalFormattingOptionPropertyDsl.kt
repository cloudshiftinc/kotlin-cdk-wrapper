@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The conditional formatting options of a KPI visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPIConditionalFormattingOptionProperty kPIConditionalFormattingOptionProperty =
 * KPIConditionalFormattingOptionProperty.builder()
 * .primaryValue(KPIPrimaryValueConditionalFormattingProperty.builder()
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
 * .progressBar(KPIProgressBarConditionalFormattingProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-kpiconditionalformattingoption.html)
 */
@CdkDslMarker
public class CfnAnalysisKPIConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.KPIConditionalFormattingOptionProperty.Builder =
        CfnAnalysis.KPIConditionalFormattingOptionProperty.builder()

    /**
     * @param primaryValue The conditional formatting for the primary value of a KPI visual.
     */
    public fun primaryValue(primaryValue: IResolvable) {
        cdkBuilder.primaryValue(primaryValue)
    }

    /**
     * @param primaryValue The conditional formatting for the primary value of a KPI visual.
     */
    public fun primaryValue(primaryValue: CfnAnalysis.KPIPrimaryValueConditionalFormattingProperty) {
        cdkBuilder.primaryValue(primaryValue)
    }

    /**
     * @param progressBar The conditional formatting for the progress bar of a KPI visual.
     */
    public fun progressBar(progressBar: IResolvable) {
        cdkBuilder.progressBar(progressBar)
    }

    /**
     * @param progressBar The conditional formatting for the progress bar of a KPI visual.
     */
    public fun progressBar(progressBar: CfnAnalysis.KPIProgressBarConditionalFormattingProperty) {
        cdkBuilder.progressBar(progressBar)
    }

    public fun build(): CfnAnalysis.KPIConditionalFormattingOptionProperty = cdkBuilder.build()
}
