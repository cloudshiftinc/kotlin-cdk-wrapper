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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

@CdkDslMarker
public class CfnTemplatePivotTableFieldSubtotalOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableFieldSubtotalOptionsProperty.Builder =
        CfnTemplate.PivotTableFieldSubtotalOptionsProperty.builder()

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnTemplate.PivotTableFieldSubtotalOptionsProperty = cdkBuilder.build()
}
