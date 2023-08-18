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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Formatting configuration for solid color.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingSolidColorProperty conditionalFormattingSolidColorProperty =
 * ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-conditionalformattingsolidcolor.html)
 */
@CdkDslMarker
public class CfnDashboardConditionalFormattingSolidColorPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingSolidColorProperty.Builder =
        CfnDashboard.ConditionalFormattingSolidColorProperty.builder()

    /** @param color Determines the color. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param expression The expression that determines the formatting configuration for solid
     *   color.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnDashboard.ConditionalFormattingSolidColorProperty = cdkBuilder.build()
}
