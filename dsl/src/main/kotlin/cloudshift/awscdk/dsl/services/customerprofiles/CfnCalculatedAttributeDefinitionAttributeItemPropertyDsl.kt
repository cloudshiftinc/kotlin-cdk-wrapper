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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition
import kotlin.String

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionAttributeItemPropertyDsl {
    private val cdkBuilder: CfnCalculatedAttributeDefinition.AttributeItemProperty.Builder =
        CfnCalculatedAttributeDefinition.AttributeItemProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnCalculatedAttributeDefinition.AttributeItemProperty = cdkBuilder.build()
}
