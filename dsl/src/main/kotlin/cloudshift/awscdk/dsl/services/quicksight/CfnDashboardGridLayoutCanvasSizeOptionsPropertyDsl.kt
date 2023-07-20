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
public class CfnDashboardGridLayoutCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.GridLayoutCanvasSizeOptionsProperty.Builder =
        CfnDashboard.GridLayoutCanvasSizeOptionsProperty.builder()

    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: CfnDashboard.GridLayoutScreenCanvasSizeOptionsProperty) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun build(): CfnDashboard.GridLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
