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
public class CfnTaskDefinitionSystemControlPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.SystemControlProperty.Builder =
        CfnTaskDefinition.SystemControlProperty.builder()

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTaskDefinition.SystemControlProperty = cdkBuilder.build()
}
