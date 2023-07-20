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
import kotlin.String

@CdkDslMarker
public class CfnDashboardStringValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.StringValueWhenUnsetConfigurationProperty.Builder =
        CfnDashboard.StringValueWhenUnsetConfigurationProperty.builder()

    public fun customValue(customValue: String) {
        cdkBuilder.customValue(customValue)
    }

    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnDashboard.StringValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
