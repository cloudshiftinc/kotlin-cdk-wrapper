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
public class CfnDashboardAxisLogarithmicScalePropertyDsl {
    private val cdkBuilder: CfnDashboard.AxisLogarithmicScaleProperty.Builder =
        CfnDashboard.AxisLogarithmicScaleProperty.builder()

    public fun base(base: Number) {
        cdkBuilder.base(base)
    }

    public fun build(): CfnDashboard.AxisLogarithmicScaleProperty = cdkBuilder.build()
}
