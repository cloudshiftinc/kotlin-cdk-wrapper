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
public class CfnAnalysisLegendOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LegendOptionsProperty.Builder =
        CfnAnalysis.LegendOptionsProperty.builder()

    public fun height(height: String) {
        cdkBuilder.height(height)
    }

    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    public fun title(title: IResolvable) {
        cdkBuilder.title(title)
    }

    public fun title(title: CfnAnalysis.LabelOptionsProperty) {
        cdkBuilder.title(title)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun width(width: String) {
        cdkBuilder.width(width)
    }

    public fun build(): CfnAnalysis.LegendOptionsProperty = cdkBuilder.build()
}
