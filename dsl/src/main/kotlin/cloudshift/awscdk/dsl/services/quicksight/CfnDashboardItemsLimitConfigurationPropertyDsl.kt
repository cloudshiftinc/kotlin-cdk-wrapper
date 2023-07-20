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
import kotlin.String

@CdkDslMarker
public class CfnDashboardItemsLimitConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ItemsLimitConfigurationProperty.Builder =
        CfnDashboard.ItemsLimitConfigurationProperty.builder()

    public fun itemsLimit(itemsLimit: Number) {
        cdkBuilder.itemsLimit(itemsLimit)
    }

    public fun otherCategories(otherCategories: String) {
        cdkBuilder.otherCategories(otherCategories)
    }

    public fun build(): CfnDashboard.ItemsLimitConfigurationProperty = cdkBuilder.build()
}
