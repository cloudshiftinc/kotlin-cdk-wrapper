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
public class CfnAnalysisPercentVisibleRangePropertyDsl {
    private val cdkBuilder: CfnAnalysis.PercentVisibleRangeProperty.Builder =
        CfnAnalysis.PercentVisibleRangeProperty.builder()

    public fun from(from: Number) {
        cdkBuilder.from(from)
    }

    public fun to(to: Number) {
        cdkBuilder.to(to)
    }

    public fun build(): CfnAnalysis.PercentVisibleRangeProperty = cdkBuilder.build()
}
