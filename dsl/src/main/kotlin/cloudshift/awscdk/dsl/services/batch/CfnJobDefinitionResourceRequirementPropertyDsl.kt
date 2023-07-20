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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionResourceRequirementPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.ResourceRequirementProperty.Builder =
        CfnJobDefinition.ResourceRequirementProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnJobDefinition.ResourceRequirementProperty = cdkBuilder.build()
}
