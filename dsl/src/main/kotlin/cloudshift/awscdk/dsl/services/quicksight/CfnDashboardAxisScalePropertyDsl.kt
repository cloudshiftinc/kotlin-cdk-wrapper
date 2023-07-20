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
public class CfnDashboardAxisScalePropertyDsl {
    private val cdkBuilder: CfnDashboard.AxisScaleProperty.Builder =
        CfnDashboard.AxisScaleProperty.builder()

    public fun linear(linear: IResolvable) {
        cdkBuilder.linear(linear)
    }

    public fun linear(linear: CfnDashboard.AxisLinearScaleProperty) {
        cdkBuilder.linear(linear)
    }

    public fun logarithmic(logarithmic: IResolvable) {
        cdkBuilder.logarithmic(logarithmic)
    }

    public fun logarithmic(logarithmic: CfnDashboard.AxisLogarithmicScaleProperty) {
        cdkBuilder.logarithmic(logarithmic)
    }

    public fun build(): CfnDashboard.AxisScaleProperty = cdkBuilder.build()
}
