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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Formatting configuration for icon set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingIconSetProperty conditionalFormattingIconSetProperty =
 * ConditionalFormattingIconSetProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .iconSetType("iconSetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-conditionalformattingiconset.html)
 */
@CdkDslMarker
public class CfnDashboardConditionalFormattingIconSetPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingIconSetProperty.Builder =
        CfnDashboard.ConditionalFormattingIconSetProperty.builder()

    /**
     * @param expression The expression that determines the formatting configuration for the icon
     *   set.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /** @param iconSetType Determines the icon set type. */
    public fun iconSetType(iconSetType: String) {
        cdkBuilder.iconSetType(iconSetType)
    }

    public fun build(): CfnDashboard.ConditionalFormattingIconSetProperty = cdkBuilder.build()
}
