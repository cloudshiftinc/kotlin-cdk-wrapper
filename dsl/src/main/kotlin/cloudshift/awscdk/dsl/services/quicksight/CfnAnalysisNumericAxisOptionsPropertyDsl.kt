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
public class CfnAnalysisNumericAxisOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.NumericAxisOptionsProperty.Builder =
        CfnAnalysis.NumericAxisOptionsProperty.builder()

    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    public fun range(range: CfnAnalysis.AxisDisplayRangeProperty) {
        cdkBuilder.range(range)
    }

    public fun scale(scale: IResolvable) {
        cdkBuilder.scale(scale)
    }

    public fun scale(scale: CfnAnalysis.AxisScaleProperty) {
        cdkBuilder.scale(scale)
    }

    public fun build(): CfnAnalysis.NumericAxisOptionsProperty = cdkBuilder.build()
}
