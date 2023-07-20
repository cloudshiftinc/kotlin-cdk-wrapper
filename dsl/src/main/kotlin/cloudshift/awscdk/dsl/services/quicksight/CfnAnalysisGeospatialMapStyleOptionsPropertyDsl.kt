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
public class CfnAnalysisGeospatialMapStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GeospatialMapStyleOptionsProperty.Builder =
        CfnAnalysis.GeospatialMapStyleOptionsProperty.builder()

    public fun baseMapStyle(baseMapStyle: String) {
        cdkBuilder.baseMapStyle(baseMapStyle)
    }

    public fun build(): CfnAnalysis.GeospatialMapStyleOptionsProperty = cdkBuilder.build()
}
