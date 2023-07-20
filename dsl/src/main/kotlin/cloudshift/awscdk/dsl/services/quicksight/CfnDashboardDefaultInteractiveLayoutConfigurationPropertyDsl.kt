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
public class CfnDashboardDefaultInteractiveLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DefaultInteractiveLayoutConfigurationProperty.Builder =
        CfnDashboard.DefaultInteractiveLayoutConfigurationProperty.builder()

    public fun freeForm(freeForm: IResolvable) {
        cdkBuilder.freeForm(freeForm)
    }

    public fun freeForm(freeForm: CfnDashboard.DefaultFreeFormLayoutConfigurationProperty) {
        cdkBuilder.freeForm(freeForm)
    }

    public fun grid(grid: IResolvable) {
        cdkBuilder.grid(grid)
    }

    public fun grid(grid: CfnDashboard.DefaultGridLayoutConfigurationProperty) {
        cdkBuilder.grid(grid)
    }

    public fun build(): CfnDashboard.DefaultInteractiveLayoutConfigurationProperty =
        cdkBuilder.build()
}
