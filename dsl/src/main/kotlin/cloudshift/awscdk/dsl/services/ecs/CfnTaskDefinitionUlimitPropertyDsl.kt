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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionUlimitPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.UlimitProperty.Builder =
        CfnTaskDefinition.UlimitProperty.builder()

    public fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
    }

    public fun build(): CfnTaskDefinition.UlimitProperty = cdkBuilder.build()
}
