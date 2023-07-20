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
public class CfnDashboardDonutOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.DonutOptionsProperty.Builder =
        CfnDashboard.DonutOptionsProperty.builder()

    public fun arcOptions(arcOptions: IResolvable) {
        cdkBuilder.arcOptions(arcOptions)
    }

    public fun arcOptions(arcOptions: CfnDashboard.ArcOptionsProperty) {
        cdkBuilder.arcOptions(arcOptions)
    }

    public fun donutCenterOptions(donutCenterOptions: IResolvable) {
        cdkBuilder.donutCenterOptions(donutCenterOptions)
    }

    public fun donutCenterOptions(donutCenterOptions: CfnDashboard.DonutCenterOptionsProperty) {
        cdkBuilder.donutCenterOptions(donutCenterOptions)
    }

    public fun build(): CfnDashboard.DonutOptionsProperty = cdkBuilder.build()
}
