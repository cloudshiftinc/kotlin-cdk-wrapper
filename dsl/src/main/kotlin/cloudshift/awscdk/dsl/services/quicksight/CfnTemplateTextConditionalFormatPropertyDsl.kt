@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The conditional formatting for the text.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TextConditionalFormatProperty textConditionalFormatProperty =
 * TextConditionalFormatProperty.builder()
 * .backgroundColor(ConditionalFormattingColorProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-textconditionalformat.html)
 */
@CdkDslMarker
public class CfnTemplateTextConditionalFormatPropertyDsl {
    private val cdkBuilder: CfnTemplate.TextConditionalFormatProperty.Builder =
        CfnTemplate.TextConditionalFormatProperty.builder()

    /**
     * @param backgroundColor The conditional formatting for the text background color.
     */
    public fun backgroundColor(backgroundColor: IResolvable) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    /**
     * @param backgroundColor The conditional formatting for the text background color.
     */
    public fun backgroundColor(backgroundColor: CfnTemplate.ConditionalFormattingColorProperty) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    /**
     * @param icon The conditional formatting for the icon.
     */
    public fun icon(icon: IResolvable) {
        cdkBuilder.icon(icon)
    }

    /**
     * @param icon The conditional formatting for the icon.
     */
    public fun icon(icon: CfnTemplate.ConditionalFormattingIconProperty) {
        cdkBuilder.icon(icon)
    }

    /**
     * @param textColor The conditional formatting for the text color.
     */
    public fun textColor(textColor: IResolvable) {
        cdkBuilder.textColor(textColor)
    }

    /**
     * @param textColor The conditional formatting for the text color.
     */
    public fun textColor(textColor: CfnTemplate.ConditionalFormattingColorProperty) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnTemplate.TextConditionalFormatProperty = cdkBuilder.build()
}
