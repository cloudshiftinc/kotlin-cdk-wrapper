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
public class CfnAnalysisArcAxisDisplayRangePropertyDsl {
    private val cdkBuilder: CfnAnalysis.ArcAxisDisplayRangeProperty.Builder =
        CfnAnalysis.ArcAxisDisplayRangeProperty.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAnalysis.ArcAxisDisplayRangeProperty = cdkBuilder.build()
}
