@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * Determines the custom condition for an icon set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingCustomIconConditionProperty conditionalFormattingCustomIconConditionProperty
 * = ConditionalFormattingCustomIconConditionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-conditionalformattingcustomiconcondition.html)
 */
@CdkDslMarker
public class CfnDashboardConditionalFormattingCustomIconConditionPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingCustomIconConditionProperty.Builder =
        CfnDashboard.ConditionalFormattingCustomIconConditionProperty.builder()

    /**
     * @param color Determines the color of the icon.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param displayConfiguration Determines the icon display configuration.
     */
    public fun displayConfiguration(displayConfiguration: IResolvable) {
        cdkBuilder.displayConfiguration(displayConfiguration)
    }

    /**
     * @param displayConfiguration Determines the icon display configuration.
     */
    public fun displayConfiguration(displayConfiguration: CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty) {
        cdkBuilder.displayConfiguration(displayConfiguration)
    }

    /**
     * @param expression The expression that determines the condition of the icon set.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /**
     * @param iconOptions Custom icon options for an icon set.
     */
    public fun iconOptions(iconOptions: IResolvable) {
        cdkBuilder.iconOptions(iconOptions)
    }

    /**
     * @param iconOptions Custom icon options for an icon set.
     */
    public fun iconOptions(iconOptions: CfnDashboard.ConditionalFormattingCustomIconOptionsProperty) {
        cdkBuilder.iconOptions(iconOptions)
    }

    public fun build(): CfnDashboard.ConditionalFormattingCustomIconConditionProperty = cdkBuilder.build()
}
