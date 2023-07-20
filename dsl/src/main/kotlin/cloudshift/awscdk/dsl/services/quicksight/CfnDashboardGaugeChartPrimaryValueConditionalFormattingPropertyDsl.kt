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

@CdkDslMarker
public class CfnDashboardGaugeChartPrimaryValueConditionalFormattingPropertyDsl {
    private val cdkBuilder: CfnDashboard.GaugeChartPrimaryValueConditionalFormattingProperty.Builder =
        CfnDashboard.GaugeChartPrimaryValueConditionalFormattingProperty.builder()

    public fun icon(icon: IResolvable) {
        cdkBuilder.icon(icon)
    }

    public fun icon(icon: CfnDashboard.ConditionalFormattingIconProperty) {
        cdkBuilder.icon(icon)
    }

    public fun textColor(textColor: IResolvable) {
        cdkBuilder.textColor(textColor)
    }

    public fun textColor(textColor: CfnDashboard.ConditionalFormattingColorProperty) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnDashboard.GaugeChartPrimaryValueConditionalFormattingProperty =
        cdkBuilder.build()
}
