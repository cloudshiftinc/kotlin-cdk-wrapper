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

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.greengrassv2.CfnDeployment
import kotlin.Number

@CdkDslMarker
public class CfnDeploymentDeploymentConfigurationValidationPolicyPropertyDsl {
    private val cdkBuilder: CfnDeployment.DeploymentConfigurationValidationPolicyProperty.Builder =
        CfnDeployment.DeploymentConfigurationValidationPolicyProperty.builder()

    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnDeployment.DeploymentConfigurationValidationPolicyProperty =
        cdkBuilder.build()
}
