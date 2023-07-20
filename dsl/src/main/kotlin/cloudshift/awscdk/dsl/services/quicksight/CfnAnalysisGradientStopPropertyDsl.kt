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
import kotlin.String

@CdkDslMarker
public class CfnAnalysisGradientStopPropertyDsl {
    private val cdkBuilder: CfnAnalysis.GradientStopProperty.Builder =
        CfnAnalysis.GradientStopProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun dataValue(dataValue: Number) {
        cdkBuilder.dataValue(dataValue)
    }

    public fun gradientOffset(gradientOffset: Number) {
        cdkBuilder.gradientOffset(gradientOffset)
    }

    public fun build(): CfnAnalysis.GradientStopProperty = cdkBuilder.build()
}
