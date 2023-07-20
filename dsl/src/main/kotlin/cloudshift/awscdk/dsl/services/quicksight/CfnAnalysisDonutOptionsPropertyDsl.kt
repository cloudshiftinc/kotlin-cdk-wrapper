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
public class CfnAnalysisDonutOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DonutOptionsProperty.Builder =
        CfnAnalysis.DonutOptionsProperty.builder()

    public fun arcOptions(arcOptions: IResolvable) {
        cdkBuilder.arcOptions(arcOptions)
    }

    public fun arcOptions(arcOptions: CfnAnalysis.ArcOptionsProperty) {
        cdkBuilder.arcOptions(arcOptions)
    }

    public fun donutCenterOptions(donutCenterOptions: IResolvable) {
        cdkBuilder.donutCenterOptions(donutCenterOptions)
    }

    public fun donutCenterOptions(donutCenterOptions: CfnAnalysis.DonutCenterOptionsProperty) {
        cdkBuilder.donutCenterOptions(donutCenterOptions)
    }

    public fun build(): CfnAnalysis.DonutOptionsProperty = cdkBuilder.build()
}
