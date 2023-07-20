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
import kotlin.Number

@CdkDslMarker
public class CfnDashboardAxisLinearScalePropertyDsl {
    private val cdkBuilder: CfnDashboard.AxisLinearScaleProperty.Builder =
        CfnDashboard.AxisLinearScaleProperty.builder()

    public fun stepCount(stepCount: Number) {
        cdkBuilder.stepCount(stepCount)
    }

    public fun stepSize(stepSize: Number) {
        cdkBuilder.stepSize(stepSize)
    }

    public fun build(): CfnDashboard.AxisLinearScaleProperty = cdkBuilder.build()
}
