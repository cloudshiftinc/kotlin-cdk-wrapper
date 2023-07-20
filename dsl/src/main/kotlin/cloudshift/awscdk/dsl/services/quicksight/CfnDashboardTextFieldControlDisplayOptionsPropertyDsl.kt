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
public class CfnDashboardTextFieldControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TextFieldControlDisplayOptionsProperty.Builder =
        CfnDashboard.TextFieldControlDisplayOptionsProperty.builder()

    public fun placeholderOptions(placeholderOptions: IResolvable) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    public fun placeholderOptions(placeholderOptions: CfnDashboard.TextControlPlaceholderOptionsProperty) {
        cdkBuilder.placeholderOptions(placeholderOptions)
    }

    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnDashboard.TextFieldControlDisplayOptionsProperty = cdkBuilder.build()
}
