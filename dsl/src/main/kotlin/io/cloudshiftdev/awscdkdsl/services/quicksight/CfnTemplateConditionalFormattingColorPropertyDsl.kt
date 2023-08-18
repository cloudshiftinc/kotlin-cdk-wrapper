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
 * The formatting configuration for the color.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingColorProperty conditionalFormattingColorProperty =
 * ConditionalFormattingColorProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-conditionalformattingcolor.html)
 */
@CdkDslMarker
public class CfnTemplateConditionalFormattingColorPropertyDsl {
    private val cdkBuilder: CfnTemplate.ConditionalFormattingColorProperty.Builder =
        CfnTemplate.ConditionalFormattingColorProperty.builder()

    /** @param gradient Formatting configuration for gradient color. */
    public fun gradient(gradient: IResolvable) {
        cdkBuilder.gradient(gradient)
    }

    /** @param gradient Formatting configuration for gradient color. */
    public fun gradient(gradient: CfnTemplate.ConditionalFormattingGradientColorProperty) {
        cdkBuilder.gradient(gradient)
    }

    /** @param solid Formatting configuration for solid color. */
    public fun solid(solid: IResolvable) {
        cdkBuilder.solid(solid)
    }

    /** @param solid Formatting configuration for solid color. */
    public fun solid(solid: CfnTemplate.ConditionalFormattingSolidColorProperty) {
        cdkBuilder.solid(solid)
    }

    public fun build(): CfnTemplate.ConditionalFormattingColorProperty = cdkBuilder.build()
}
