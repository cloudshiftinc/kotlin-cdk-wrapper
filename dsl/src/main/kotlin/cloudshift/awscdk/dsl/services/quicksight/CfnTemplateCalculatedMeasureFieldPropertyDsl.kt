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
public class CfnTemplateCalculatedMeasureFieldPropertyDsl {
    private val cdkBuilder: CfnTemplate.CalculatedMeasureFieldProperty.Builder =
        CfnTemplate.CalculatedMeasureFieldProperty.builder()

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnTemplate.CalculatedMeasureFieldProperty = cdkBuilder.build()
}
