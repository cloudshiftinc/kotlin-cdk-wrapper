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
public class CfnTemplateFreeFormLayoutElementBorderStylePropertyDsl {
    private val cdkBuilder: CfnTemplate.FreeFormLayoutElementBorderStyleProperty.Builder =
        CfnTemplate.FreeFormLayoutElementBorderStyleProperty.builder()

    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnTemplate.FreeFormLayoutElementBorderStyleProperty = cdkBuilder.build()
}
