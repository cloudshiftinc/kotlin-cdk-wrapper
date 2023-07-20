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
public class CfnDashboardConditionalFormattingIconSetPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingIconSetProperty.Builder =
        CfnDashboard.ConditionalFormattingIconSetProperty.builder()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun iconSetType(iconSetType: String) {
        cdkBuilder.iconSetType(iconSetType)
    }

    public fun build(): CfnDashboard.ConditionalFormattingIconSetProperty = cdkBuilder.build()
}
