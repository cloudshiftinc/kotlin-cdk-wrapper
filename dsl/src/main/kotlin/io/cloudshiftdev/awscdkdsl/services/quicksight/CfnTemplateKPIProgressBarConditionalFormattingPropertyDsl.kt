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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The conditional formatting for the progress bar of a KPI visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPIProgressBarConditionalFormattingProperty kPIProgressBarConditionalFormattingProperty =
 * KPIProgressBarConditionalFormattingProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-kpiprogressbarconditionalformatting.html)
 */
@CdkDslMarker
public class CfnTemplateKPIProgressBarConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIProgressBarConditionalFormattingProperty.Builder =
        CfnTemplate.KPIProgressBarConditionalFormattingProperty.builder()

    /** @param foregroundColor The conditional formatting of the progress bar's foreground color. */
    public fun foregroundColor(foregroundColor: IResolvable) {
        cdkBuilder.foregroundColor(foregroundColor)
    }

    /** @param foregroundColor The conditional formatting of the progress bar's foreground color. */
    public fun foregroundColor(foregroundColor: CfnTemplate.ConditionalFormattingColorProperty) {
        cdkBuilder.foregroundColor(foregroundColor)
    }

    public fun build(): CfnTemplate.KPIProgressBarConditionalFormattingProperty = cdkBuilder.build()
}
