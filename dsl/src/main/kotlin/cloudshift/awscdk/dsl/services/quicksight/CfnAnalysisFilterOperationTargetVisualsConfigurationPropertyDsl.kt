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
public class CfnAnalysisFilterOperationTargetVisualsConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterOperationTargetVisualsConfigurationProperty.Builder =
        CfnAnalysis.FilterOperationTargetVisualsConfigurationProperty.builder()

    public fun sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration: IResolvable) {
        cdkBuilder.sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration)
    }

    public fun sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration: CfnAnalysis.SameSheetTargetVisualConfigurationProperty) {
        cdkBuilder.sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration)
    }

    public fun build(): CfnAnalysis.FilterOperationTargetVisualsConfigurationProperty =
        cdkBuilder.build()
}
