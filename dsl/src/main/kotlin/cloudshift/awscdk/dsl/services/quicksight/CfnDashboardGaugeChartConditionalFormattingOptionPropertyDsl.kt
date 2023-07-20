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
public class CfnDashboardGaugeChartConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.GaugeChartConditionalFormattingOptionProperty.Builder =
        CfnDashboard.GaugeChartConditionalFormattingOptionProperty.builder()

    public fun arc(arc: IResolvable) {
        cdkBuilder.arc(arc)
    }

    public fun arc(arc: CfnDashboard.GaugeChartArcConditionalFormattingProperty) {
        cdkBuilder.arc(arc)
    }

    public fun primaryValue(primaryValue: IResolvable) {
        cdkBuilder.primaryValue(primaryValue)
    }

    public fun primaryValue(primaryValue: CfnDashboard.GaugeChartPrimaryValueConditionalFormattingProperty) {
        cdkBuilder.primaryValue(primaryValue)
    }

    public fun build(): CfnDashboard.GaugeChartConditionalFormattingOptionProperty =
        cdkBuilder.build()
}
