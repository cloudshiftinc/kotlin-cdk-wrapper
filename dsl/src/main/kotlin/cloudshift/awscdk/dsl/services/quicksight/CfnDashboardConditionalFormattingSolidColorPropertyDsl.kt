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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardConditionalFormattingSolidColorPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingSolidColorProperty.Builder =
        CfnDashboard.ConditionalFormattingSolidColorProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnDashboard.ConditionalFormattingSolidColorProperty = cdkBuilder.build()
}
