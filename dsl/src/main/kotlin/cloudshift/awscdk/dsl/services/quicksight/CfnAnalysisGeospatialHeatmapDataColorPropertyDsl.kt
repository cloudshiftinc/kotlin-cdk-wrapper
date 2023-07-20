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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisGeospatialHeatmapDataColorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialHeatmapDataColorProperty.Builder =
        CfnAnalysis.GeospatialHeatmapDataColorProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun build(): CfnAnalysis.GeospatialHeatmapDataColorProperty = cdkBuilder.build()
}
