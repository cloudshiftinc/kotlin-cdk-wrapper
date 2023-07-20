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
public class CfnDashboardLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.LayoutConfigurationProperty.Builder =
        CfnDashboard.LayoutConfigurationProperty.builder()

    public fun freeFormLayout(freeFormLayout: IResolvable) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun freeFormLayout(freeFormLayout: CfnDashboard.FreeFormLayoutConfigurationProperty) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun gridLayout(gridLayout: IResolvable) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun gridLayout(gridLayout: CfnDashboard.GridLayoutConfigurationProperty) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun sectionBasedLayout(sectionBasedLayout: IResolvable) {
        cdkBuilder.sectionBasedLayout(sectionBasedLayout)
    }

    public fun sectionBasedLayout(sectionBasedLayout: CfnDashboard.SectionBasedLayoutConfigurationProperty) {
        cdkBuilder.sectionBasedLayout(sectionBasedLayout)
    }

    public fun build(): CfnDashboard.LayoutConfigurationProperty = cdkBuilder.build()
}
