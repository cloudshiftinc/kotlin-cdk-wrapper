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
public class CfnDashboardFilterDateTimePickerControlPropertyDsl {
    private val cdkBuilder: CfnDashboard.FilterDateTimePickerControlProperty.Builder =
        CfnDashboard.FilterDateTimePickerControlProperty.builder()

    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun displayOptions(displayOptions: CfnDashboard.DateTimePickerControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    public fun filterControlId(filterControlId: String) {
        cdkBuilder.filterControlId(filterControlId)
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

    public fun build(): CfnDashboard.FilterDateTimePickerControlProperty = cdkBuilder.build()
}
