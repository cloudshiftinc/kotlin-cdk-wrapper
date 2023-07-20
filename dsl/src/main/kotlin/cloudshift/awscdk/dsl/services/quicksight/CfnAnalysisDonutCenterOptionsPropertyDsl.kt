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
public class CfnAnalysisDonutCenterOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DonutCenterOptionsProperty.Builder =
        CfnAnalysis.DonutCenterOptionsProperty.builder()

    public fun labelVisibility(labelVisibility: String) {
        cdkBuilder.labelVisibility(labelVisibility)
    }

    public fun build(): CfnAnalysis.DonutCenterOptionsProperty = cdkBuilder.build()
}
