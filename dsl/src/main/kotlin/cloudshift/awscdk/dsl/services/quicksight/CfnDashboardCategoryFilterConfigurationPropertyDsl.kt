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
public class CfnDashboardCategoryFilterConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.CategoryFilterConfigurationProperty.Builder =
        CfnDashboard.CategoryFilterConfigurationProperty.builder()

    public fun customFilterConfiguration(customFilterConfiguration: IResolvable) {
        cdkBuilder.customFilterConfiguration(customFilterConfiguration)
    }

    public fun customFilterConfiguration(customFilterConfiguration: CfnDashboard.CustomFilterConfigurationProperty) {
        cdkBuilder.customFilterConfiguration(customFilterConfiguration)
    }

    public fun customFilterListConfiguration(customFilterListConfiguration: IResolvable) {
        cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
    }

    public fun customFilterListConfiguration(customFilterListConfiguration: CfnDashboard.CustomFilterListConfigurationProperty) {
        cdkBuilder.customFilterListConfiguration(customFilterListConfiguration)
    }

    public fun filterListConfiguration(filterListConfiguration: IResolvable) {
        cdkBuilder.filterListConfiguration(filterListConfiguration)
    }

    public fun filterListConfiguration(filterListConfiguration: CfnDashboard.FilterListConfigurationProperty) {
        cdkBuilder.filterListConfiguration(filterListConfiguration)
    }

    public fun build(): CfnDashboard.CategoryFilterConfigurationProperty = cdkBuilder.build()
}
