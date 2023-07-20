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
public class CfnDashboardKPIConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.KPIConditionalFormattingOptionProperty.Builder =
        CfnDashboard.KPIConditionalFormattingOptionProperty.builder()

    public fun primaryValue(primaryValue: IResolvable) {
        cdkBuilder.primaryValue(primaryValue)
    }

    public fun primaryValue(primaryValue: CfnDashboard.KPIPrimaryValueConditionalFormattingProperty) {
        cdkBuilder.primaryValue(primaryValue)
    }

    public fun progressBar(progressBar: IResolvable) {
        cdkBuilder.progressBar(progressBar)
    }

    public fun progressBar(progressBar: CfnDashboard.KPIProgressBarConditionalFormattingProperty) {
        cdkBuilder.progressBar(progressBar)
    }

    public fun build(): CfnDashboard.KPIConditionalFormattingOptionProperty = cdkBuilder.build()
}
