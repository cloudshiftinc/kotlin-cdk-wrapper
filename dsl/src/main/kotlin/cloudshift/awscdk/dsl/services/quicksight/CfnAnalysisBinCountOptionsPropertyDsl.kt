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
public class CfnAnalysisBinCountOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.BinCountOptionsProperty.Builder =
        CfnAnalysis.BinCountOptionsProperty.builder()

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnalysis.BinCountOptionsProperty = cdkBuilder.build()
}
