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
public class CfnDashboardSliderControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SliderControlDisplayOptionsProperty.Builder =
        CfnDashboard.SliderControlDisplayOptionsProperty.builder()

    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun titleOptions(titleOptions: CfnDashboard.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnDashboard.SliderControlDisplayOptionsProperty = cdkBuilder.build()
}
