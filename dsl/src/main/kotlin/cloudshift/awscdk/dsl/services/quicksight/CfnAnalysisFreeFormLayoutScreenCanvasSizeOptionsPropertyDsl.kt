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
public class CfnAnalysisFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty.Builder =
        CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()

    public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
        cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
    }

    public fun build(): CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty = cdkBuilder.build()
}
