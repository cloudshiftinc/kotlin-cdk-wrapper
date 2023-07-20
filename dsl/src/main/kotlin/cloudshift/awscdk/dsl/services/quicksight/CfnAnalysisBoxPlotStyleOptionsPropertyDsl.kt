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
public class CfnAnalysisBoxPlotStyleOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.BoxPlotStyleOptionsProperty.Builder =
        CfnAnalysis.BoxPlotStyleOptionsProperty.builder()

    public fun fillStyle(fillStyle: String) {
        cdkBuilder.fillStyle(fillStyle)
    }

    public fun build(): CfnAnalysis.BoxPlotStyleOptionsProperty = cdkBuilder.build()
}
