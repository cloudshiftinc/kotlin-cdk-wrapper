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
public class CfnAnalysisDataBarsOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DataBarsOptionsProperty.Builder =
        CfnAnalysis.DataBarsOptionsProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun negativeColor(negativeColor: String) {
        cdkBuilder.negativeColor(negativeColor)
    }

    public fun positiveColor(positiveColor: String) {
        cdkBuilder.positiveColor(positiveColor)
    }

    public fun build(): CfnAnalysis.DataBarsOptionsProperty = cdkBuilder.build()
}
