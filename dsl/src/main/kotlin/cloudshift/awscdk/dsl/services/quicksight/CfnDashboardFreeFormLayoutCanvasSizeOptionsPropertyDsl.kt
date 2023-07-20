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
public class CfnDashboardFreeFormLayoutCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty.Builder =
        CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty.builder()

    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun screenCanvasSizeOptions(screenCanvasSizeOptions: CfnDashboard.FreeFormLayoutScreenCanvasSizeOptionsProperty) {
        cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
    }

    public fun build(): CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
