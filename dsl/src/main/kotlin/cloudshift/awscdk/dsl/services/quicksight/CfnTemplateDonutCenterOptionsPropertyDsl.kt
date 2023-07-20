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
public class CfnTemplateDonutCenterOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.DonutCenterOptionsProperty.Builder =
        CfnTemplate.DonutCenterOptionsProperty.builder()

    public fun labelVisibility(labelVisibility: String) {
        cdkBuilder.labelVisibility(labelVisibility)
    }

    public fun build(): CfnTemplate.DonutCenterOptionsProperty = cdkBuilder.build()
}
