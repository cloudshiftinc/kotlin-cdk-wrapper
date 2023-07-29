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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The conditional formatting for the primary value of a KPI visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * KPIPrimaryValueConditionalFormattingProperty kPIPrimaryValueConditionalFormattingProperty =
 * KPIPrimaryValueConditionalFormattingProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-kpiprimaryvalueconditionalformatting.html)
 */
@CdkDslMarker
public class CfnTemplateKPIPrimaryValueConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnTemplate.KPIPrimaryValueConditionalFormattingProperty.Builder =
        CfnTemplate.KPIPrimaryValueConditionalFormattingProperty.builder()

    /** @param icon The conditional formatting of the primary value's icon. */
    public fun icon(icon: IResolvable) {
        cdkBuilder.icon(icon)
    }

    /** @param icon The conditional formatting of the primary value's icon. */
    public fun icon(icon: CfnTemplate.ConditionalFormattingIconProperty) {
        cdkBuilder.icon(icon)
    }

    /** @param textColor The conditional formatting of the primary value's text color. */
    public fun textColor(textColor: IResolvable) {
        cdkBuilder.textColor(textColor)
    }

    /** @param textColor The conditional formatting of the primary value's text color. */
    public fun textColor(textColor: CfnTemplate.ConditionalFormattingColorProperty) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnTemplate.KPIPrimaryValueConditionalFormattingProperty =
        cdkBuilder.build()
}
