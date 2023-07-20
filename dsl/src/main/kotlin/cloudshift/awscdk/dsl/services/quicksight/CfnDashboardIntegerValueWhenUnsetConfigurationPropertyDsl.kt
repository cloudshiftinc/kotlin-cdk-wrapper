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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDashboardIntegerValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.IntegerValueWhenUnsetConfigurationProperty.Builder =
        CfnDashboard.IntegerValueWhenUnsetConfigurationProperty.builder()

    public fun customValue(customValue: Number) {
        cdkBuilder.customValue(customValue)
    }

    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnDashboard.IntegerValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
