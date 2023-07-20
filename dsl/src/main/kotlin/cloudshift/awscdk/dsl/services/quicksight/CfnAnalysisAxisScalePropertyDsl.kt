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

@CdkDslMarker
public class CfnAnalysisAxisScalePropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisScaleProperty.Builder =
        CfnAnalysis.AxisScaleProperty.builder()

    public fun linear(linear: IResolvable) {
        cdkBuilder.linear(linear)
    }

    public fun linear(linear: CfnAnalysis.AxisLinearScaleProperty) {
        cdkBuilder.linear(linear)
    }

    public fun logarithmic(logarithmic: IResolvable) {
        cdkBuilder.logarithmic(logarithmic)
    }

    public fun logarithmic(logarithmic: CfnAnalysis.AxisLogarithmicScaleProperty) {
        cdkBuilder.logarithmic(logarithmic)
    }

    public fun build(): CfnAnalysis.AxisScaleProperty = cdkBuilder.build()
}
