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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisBoxPlotOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.BoxPlotOptionsProperty.Builder =
        CfnAnalysis.BoxPlotOptionsProperty.builder()

    public fun allDataPointsVisibility(allDataPointsVisibility: String) {
        cdkBuilder.allDataPointsVisibility(allDataPointsVisibility)
    }

    public fun outlierVisibility(outlierVisibility: String) {
        cdkBuilder.outlierVisibility(outlierVisibility)
    }

    public fun styleOptions(styleOptions: IResolvable) {
        cdkBuilder.styleOptions(styleOptions)
    }

    public fun styleOptions(styleOptions: CfnAnalysis.BoxPlotStyleOptionsProperty) {
        cdkBuilder.styleOptions(styleOptions)
    }

    public fun build(): CfnAnalysis.BoxPlotOptionsProperty = cdkBuilder.build()
}
