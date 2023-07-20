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
public class CfnAnalysisDataPathValuePropertyDsl {
    private val cdkBuilder: CfnAnalysis.DataPathValueProperty.Builder =
        CfnAnalysis.DataPathValueProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    public fun build(): CfnAnalysis.DataPathValueProperty = cdkBuilder.build()
}
