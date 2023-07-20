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
public class CfnDashboardGeospatialWindowOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GeospatialWindowOptionsProperty.Builder =
        CfnDashboard.GeospatialWindowOptionsProperty.builder()

    public fun bounds(bounds: IResolvable) {
        cdkBuilder.bounds(bounds)
    }

    public fun bounds(bounds: CfnDashboard.GeospatialCoordinateBoundsProperty) {
        cdkBuilder.bounds(bounds)
    }

    public fun mapZoomMode(mapZoomMode: String) {
        cdkBuilder.mapZoomMode(mapZoomMode)
    }

    public fun build(): CfnDashboard.GeospatialWindowOptionsProperty = cdkBuilder.build()
}
