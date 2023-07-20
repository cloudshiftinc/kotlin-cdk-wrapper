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
public class CfnDashboardDateTimePickerControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.DateTimePickerControlDisplayOptionsProperty.Builder =
        CfnDashboard.DateTimePickerControlDisplayOptionsProperty.builder()

    public fun dateTimeFormat(dateTimeFormat: String) {
        cdkBuilder.dateTimeFormat(dateTimeFormat)
    }

    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnDashboard.DateTimePickerControlDisplayOptionsProperty = cdkBuilder.build()
}
