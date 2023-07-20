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
public class CfnDashboardMissingDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.MissingDataConfigurationProperty.Builder =
        CfnDashboard.MissingDataConfigurationProperty.builder()

    public fun treatmentOption(treatmentOption: String) {
        cdkBuilder.treatmentOption(treatmentOption)
    }

    public fun build(): CfnDashboard.MissingDataConfigurationProperty = cdkBuilder.build()
}
