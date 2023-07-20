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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.String

@CdkDslMarker
public class CfnDeploymentGroupDeploymentStylePropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.DeploymentStyleProperty.Builder =
        CfnDeploymentGroup.DeploymentStyleProperty.builder()

    public fun deploymentOption(deploymentOption: String) {
        cdkBuilder.deploymentOption(deploymentOption)
    }

    public fun deploymentType(deploymentType: String) {
        cdkBuilder.deploymentType(deploymentType)
    }

    public fun build(): CfnDeploymentGroup.DeploymentStyleProperty = cdkBuilder.build()
}
