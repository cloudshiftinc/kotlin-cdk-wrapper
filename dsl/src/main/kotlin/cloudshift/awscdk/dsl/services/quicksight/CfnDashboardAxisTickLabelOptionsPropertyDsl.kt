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
import kotlin.Number

@CdkDslMarker
public class CfnDashboardAxisTickLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.AxisTickLabelOptionsProperty.Builder =
        CfnDashboard.AxisTickLabelOptionsProperty.builder()

    public fun labelOptions(labelOptions: IResolvable) {
        cdkBuilder.labelOptions(labelOptions)
    }

    public fun labelOptions(labelOptions: CfnDashboard.LabelOptionsProperty) {
        cdkBuilder.labelOptions(labelOptions)
    }

    public fun rotationAngle(rotationAngle: Number) {
        cdkBuilder.rotationAngle(rotationAngle)
    }

    public fun build(): CfnDashboard.AxisTickLabelOptionsProperty = cdkBuilder.build()
}
