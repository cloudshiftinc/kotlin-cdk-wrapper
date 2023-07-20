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
public class CfnTemplateFieldSortPropertyDsl {
    private val cdkBuilder: CfnTemplate.FieldSortProperty.Builder =
        CfnTemplate.FieldSortProperty.builder()

    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    public fun build(): CfnTemplate.FieldSortProperty = cdkBuilder.build()
}
