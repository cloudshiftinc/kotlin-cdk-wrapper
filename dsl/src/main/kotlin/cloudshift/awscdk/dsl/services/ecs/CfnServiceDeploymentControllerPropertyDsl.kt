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
import software.amazon.awscdk.services.ecs.CfnService
import kotlin.String

@CdkDslMarker
public class CfnServiceDeploymentControllerPropertyDsl {
    private val cdkBuilder: CfnService.DeploymentControllerProperty.Builder =
        CfnService.DeploymentControllerProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnService.DeploymentControllerProperty = cdkBuilder.build()
}
