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
import kotlin.String

@CdkDslMarker
public class CfnDashboardFilterDropDownControlPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterDropDownControlProperty.Builder =
        CfnDashboard.FilterDropDownControlProperty.builder()

    public fun cascadingControlConfiguration(cascadingControlConfiguration: IResolvable) {
        cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
    }

    public fun cascadingControlConfiguration(cascadingControlConfiguration: CfnDashboard.CascadingControlConfigurationProperty) {
        cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
    }

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnDashboard.DropDownControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun filterControlId(filterControlId: String) {
        cdkBuilder.filterControlId(filterControlId)
    }

    public fun selectableValues(selectableValues: IResolvable) {
        cdkBuilder.selectableValues(selectableValues)
    }

    public fun selectableValues(selectableValues: CfnDashboard.FilterSelectableValuesProperty) {
        cdkBuilder.selectableValues(selectableValues)
    }

    public fun sourceFilterId(sourceFilterId: String) {
        cdkBuilder.sourceFilterId(sourceFilterId)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDashboard.FilterDropDownControlProperty = cdkBuilder.build()
}
