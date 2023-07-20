@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardConditionalFormattingCustomIconConditionPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingCustomIconConditionProperty.Builder =
        CfnDashboard.ConditionalFormattingCustomIconConditionProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun displayConfiguration(displayConfiguration: IResolvable) {
        cdkBuilder.displayConfiguration(displayConfiguration)
    }

    public fun displayConfiguration(displayConfiguration: CfnDashboard.ConditionalFormattingIconDisplayConfigurationProperty) {
        cdkBuilder.displayConfiguration(displayConfiguration)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun iconOptions(iconOptions: IResolvable) {
        cdkBuilder.iconOptions(iconOptions)
    }

    public fun iconOptions(iconOptions: CfnDashboard.ConditionalFormattingCustomIconOptionsProperty) {
        cdkBuilder.iconOptions(iconOptions)
    }

    public fun build(): CfnDashboard.ConditionalFormattingCustomIconConditionProperty =
        cdkBuilder.build()
}
