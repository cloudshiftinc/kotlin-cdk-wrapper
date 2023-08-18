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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-conditionalformattingcolor.html)
 */
@CdkDslMarker
public class CfnDashboardConditionalFormattingColorPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingColorProperty.Builder =
        CfnDashboard.ConditionalFormattingColorProperty.builder()

    /** @param gradient Formatting configuration for gradient color. */
    public fun gradient(gradient: IResolvable) {
        cdkBuilder.gradient(gradient)
    }

    /** @param gradient Formatting configuration for gradient color. */
    public fun gradient(gradient: CfnDashboard.ConditionalFormattingGradientColorProperty) {
        cdkBuilder.gradient(gradient)
    }

    /** @param solid Formatting configuration for solid color. */
    public fun solid(solid: IResolvable) {
        cdkBuilder.solid(solid)
    }

    /** @param solid Formatting configuration for solid color. */
    public fun solid(solid: CfnDashboard.ConditionalFormattingSolidColorProperty) {
        cdkBuilder.solid(solid)
    }

    public fun build(): CfnDashboard.ConditionalFormattingColorProperty = cdkBuilder.build()
}
