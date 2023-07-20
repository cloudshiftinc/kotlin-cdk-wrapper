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
public class CfnDashboardCustomActionFilterOperationPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomActionFilterOperationProperty.Builder =
        CfnDashboard.CustomActionFilterOperationProperty.builder()

    public fun selectedFieldsConfiguration(selectedFieldsConfiguration: IResolvable) {
        cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
    }

    public fun selectedFieldsConfiguration(selectedFieldsConfiguration: CfnDashboard.FilterOperationSelectedFieldsConfigurationProperty) {
        cdkBuilder.selectedFieldsConfiguration(selectedFieldsConfiguration)
    }

    public fun targetVisualsConfiguration(targetVisualsConfiguration: IResolvable) {
        cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
    }

    public fun targetVisualsConfiguration(targetVisualsConfiguration: CfnDashboard.FilterOperationTargetVisualsConfigurationProperty) {
        cdkBuilder.targetVisualsConfiguration(targetVisualsConfiguration)
    }

    public fun build(): CfnDashboard.CustomActionFilterOperationProperty = cdkBuilder.build()
}
