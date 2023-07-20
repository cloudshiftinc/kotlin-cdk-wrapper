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
import kotlin.Number

@CdkDslMarker
public class CfnTemplateReferenceLineStaticDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ReferenceLineStaticDataConfigurationProperty.Builder =
        CfnTemplate.ReferenceLineStaticDataConfigurationProperty.builder()

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.ReferenceLineStaticDataConfigurationProperty = cdkBuilder.build()
}
