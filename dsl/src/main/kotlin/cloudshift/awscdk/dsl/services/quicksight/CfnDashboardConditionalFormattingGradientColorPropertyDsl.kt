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
public class CfnDashboardConditionalFormattingGradientColorPropertyDsl {
    private val cdkBuilder: CfnDashboard.ConditionalFormattingGradientColorProperty.Builder =
        CfnDashboard.ConditionalFormattingGradientColorProperty.builder()

    public fun color(color: IResolvable) {
        cdkBuilder.color(color)
    }

    public fun color(color: CfnDashboard.GradientColorProperty) {
        cdkBuilder.color(color)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnDashboard.ConditionalFormattingGradientColorProperty = cdkBuilder.build()
}
