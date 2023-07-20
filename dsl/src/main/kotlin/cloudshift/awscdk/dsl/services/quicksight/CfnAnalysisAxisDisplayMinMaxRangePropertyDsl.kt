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
import kotlin.Number

@CdkDslMarker
public class CfnAnalysisAxisDisplayMinMaxRangePropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisDisplayMinMaxRangeProperty.Builder =
        CfnAnalysis.AxisDisplayMinMaxRangeProperty.builder()

    public fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
    }

    public fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
    }

    public fun build(): CfnAnalysis.AxisDisplayMinMaxRangeProperty = cdkBuilder.build()
}
