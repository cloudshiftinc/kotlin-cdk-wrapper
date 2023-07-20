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
public class CfnAnalysisScrollBarOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ScrollBarOptionsProperty.Builder =
        CfnAnalysis.ScrollBarOptionsProperty.builder()

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun visibleRange(visibleRange: IResolvable) {
        cdkBuilder.visibleRange(visibleRange)
    }

    public fun visibleRange(visibleRange: CfnAnalysis.VisibleRangeOptionsProperty) {
        cdkBuilder.visibleRange(visibleRange)
    }

    public fun build(): CfnAnalysis.ScrollBarOptionsProperty = cdkBuilder.build()
}
