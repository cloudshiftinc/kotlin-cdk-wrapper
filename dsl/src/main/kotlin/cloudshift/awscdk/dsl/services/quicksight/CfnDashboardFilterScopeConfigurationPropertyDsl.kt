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
public class CfnDashboardFilterScopeConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterScopeConfigurationProperty.Builder =
        CfnDashboard.FilterScopeConfigurationProperty.builder()

    public fun selectedSheets(selectedSheets: IResolvable) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    public fun selectedSheets(selectedSheets: CfnDashboard.SelectedSheetsFilterScopeConfigurationProperty) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    public fun build(): CfnDashboard.FilterScopeConfigurationProperty = cdkBuilder.build()
}
