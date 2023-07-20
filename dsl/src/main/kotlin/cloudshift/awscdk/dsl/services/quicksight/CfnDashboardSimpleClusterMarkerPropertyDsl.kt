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
public class CfnDashboardSimpleClusterMarkerPropertyDsl {
    private val cdkBuilder: CfnDashboard.SimpleClusterMarkerProperty.Builder =
        CfnDashboard.SimpleClusterMarkerProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun build(): CfnDashboard.SimpleClusterMarkerProperty = cdkBuilder.build()
}
