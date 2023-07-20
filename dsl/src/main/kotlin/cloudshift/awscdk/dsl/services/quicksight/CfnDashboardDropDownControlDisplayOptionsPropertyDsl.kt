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
public class CfnDashboardDropDownControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.DropDownControlDisplayOptionsProperty.Builder =
        CfnDashboard.DropDownControlDisplayOptionsProperty.builder()

    public fun selectAllOptions(selectAllOptions: IResolvable) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    public fun selectAllOptions(selectAllOptions: CfnDashboard.ListControlSelectAllOptionsProperty) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnDashboard.DropDownControlDisplayOptionsProperty = cdkBuilder.build()
}
