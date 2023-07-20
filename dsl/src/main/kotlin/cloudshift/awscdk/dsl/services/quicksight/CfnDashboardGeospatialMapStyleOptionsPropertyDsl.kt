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
public class CfnDashboardGeospatialMapStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialMapStyleOptionsProperty.Builder =
        CfnDashboard.GeospatialMapStyleOptionsProperty.builder()

    public fun baseMapStyle(baseMapStyle: String) {
        cdkBuilder.baseMapStyle(baseMapStyle)
    }

    public fun build(): CfnDashboard.GeospatialMapStyleOptionsProperty = cdkBuilder.build()
}
