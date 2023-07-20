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
public class CfnDashboardParameterDropDownControlPropertyDsl {
    private val cdkBuilder: CfnDashboard.ParameterDropDownControlProperty.Builder =
        CfnDashboard.ParameterDropDownControlProperty.builder()

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

    public fun parameterControlId(parameterControlId: String) {
        cdkBuilder.parameterControlId(parameterControlId)
    }

    public fun selectableValues(selectableValues: IResolvable) {
        cdkBuilder.selectableValues(selectableValues)
    }

    public fun selectableValues(selectableValues: CfnDashboard.ParameterSelectableValuesProperty) {
        cdkBuilder.selectableValues(selectableValues)
    }

    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDashboard.ParameterDropDownControlProperty = cdkBuilder.build()
}
