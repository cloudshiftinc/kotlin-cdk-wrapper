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
public class CfnTemplateTemplateSourceTemplatePropertyDsl {
    private val cdkBuilder: CfnTemplate.TemplateSourceTemplateProperty.Builder =
        CfnTemplate.TemplateSourceTemplateProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnTemplate.TemplateSourceTemplateProperty = cdkBuilder.build()
}
