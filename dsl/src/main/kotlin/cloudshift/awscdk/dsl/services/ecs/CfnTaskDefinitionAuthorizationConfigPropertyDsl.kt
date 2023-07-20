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
public class CfnTaskDefinitionAuthorizationConfigPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.AuthorizationConfigProperty.Builder =
        CfnTaskDefinition.AuthorizationConfigProperty.builder()

    public fun accessPointId(accessPointId: String) {
        cdkBuilder.accessPointId(accessPointId)
    }

    public fun iam(iam: String) {
        cdkBuilder.iam(iam)
    }

    public fun build(): CfnTaskDefinition.AuthorizationConfigProperty = cdkBuilder.build()
}
