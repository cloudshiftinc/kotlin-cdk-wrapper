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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Formatting configuration for gradient color.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingGradientColorProperty conditionalFormattingGradientColorProperty =
 * ConditionalFormattingGradientColorProperty.builder()
 * .color(GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build())
 * .expression("expression")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-conditionalformattinggradientcolor.html)
 */
@CdkDslMarker
public class CfnTemplateConditionalFormattingGradientColorPropertyDsl {
    private val cdkBuilder: CfnTemplate.ConditionalFormattingGradientColorProperty.Builder =
        CfnTemplate.ConditionalFormattingGradientColorProperty.builder()

    /** @param color Determines the color. */
    public fun color(color: IResolvable) {
        cdkBuilder.color(color)
    }

    /** @param color Determines the color. */
    public fun color(color: CfnTemplate.GradientColorProperty) {
        cdkBuilder.color(color)
    }

    /**
     * @param expression The expression that determines the formatting configuration for gradient
     *   color.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnTemplate.ConditionalFormattingGradientColorProperty = cdkBuilder.build()
}
