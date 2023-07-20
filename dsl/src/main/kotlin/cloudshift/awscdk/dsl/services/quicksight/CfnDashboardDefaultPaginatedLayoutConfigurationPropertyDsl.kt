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
public class CfnDashboardDefaultPaginatedLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DefaultPaginatedLayoutConfigurationProperty.Builder =
        CfnDashboard.DefaultPaginatedLayoutConfigurationProperty.builder()

    public fun sectionBased(sectionBased: IResolvable) {
        cdkBuilder.sectionBased(sectionBased)
    }

    public fun sectionBased(sectionBased: CfnDashboard.DefaultSectionBasedLayoutConfigurationProperty) {
        cdkBuilder.sectionBased(sectionBased)
    }

    public fun build(): CfnDashboard.DefaultPaginatedLayoutConfigurationProperty = cdkBuilder.build()
}
