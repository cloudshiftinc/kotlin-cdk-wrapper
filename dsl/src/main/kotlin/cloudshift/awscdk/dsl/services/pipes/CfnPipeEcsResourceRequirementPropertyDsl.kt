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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.String

@CdkDslMarker
public class CfnPipeEcsResourceRequirementPropertyDsl {
    private val cdkBuilder: CfnPipe.EcsResourceRequirementProperty.Builder =
        CfnPipe.EcsResourceRequirementProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPipe.EcsResourceRequirementProperty = cdkBuilder.build()
}
