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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionResourceRequirementPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.ResourceRequirementProperty.Builder =
        CfnTaskDefinition.ResourceRequirementProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTaskDefinition.ResourceRequirementProperty = cdkBuilder.build()
}
