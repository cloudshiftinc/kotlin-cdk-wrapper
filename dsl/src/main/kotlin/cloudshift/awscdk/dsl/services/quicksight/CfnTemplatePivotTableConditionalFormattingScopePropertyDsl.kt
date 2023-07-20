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
public class CfnTemplatePivotTableConditionalFormattingScopePropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableConditionalFormattingScopeProperty.Builder =
        CfnTemplate.PivotTableConditionalFormattingScopeProperty.builder()

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun build(): CfnTemplate.PivotTableConditionalFormattingScopeProperty = cdkBuilder.build()
}
