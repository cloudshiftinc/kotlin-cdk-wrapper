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
public class CfnDashboardReferenceLineCustomLabelConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.ReferenceLineCustomLabelConfigurationProperty.Builder =
        CfnDashboard.ReferenceLineCustomLabelConfigurationProperty.builder()

    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    public fun build(): CfnDashboard.ReferenceLineCustomLabelConfigurationProperty =
        cdkBuilder.build()
}
