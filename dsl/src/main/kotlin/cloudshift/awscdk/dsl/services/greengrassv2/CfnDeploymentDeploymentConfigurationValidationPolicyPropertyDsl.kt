@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information about how long a component on a core device can validate its configuration
 * updates before it times out.
 *
 * Components can use the
 * [SubscribeToValidateConfigurationUpdates](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-subscribetovalidateconfigurationupdates)
 * IPC operation to receive notifications when a deployment specifies a configuration update. Then,
 * components can respond with the
 * [SendConfigurationValidityReport](https://docs.aws.amazon.com/greengrass/v2/developerguide/interprocess-communication.html#ipc-operation-sendconfigurationvalidityreport)
 * IPC operation. For more information, see the
 * [Create deployments](https://docs.aws.amazon.com/greengrass/v2/developerguide/create-deployments.html)
 * in the *AWS IoT Greengrass V2 Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * DeploymentConfigurationValidationPolicyProperty deploymentConfigurationValidationPolicyProperty =
 * DeploymentConfigurationValidationPolicyProperty.builder()
 * .timeoutInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentconfigurationvalidationpolicy.html)
 */
@CdkDslMarker
public class CfnDeploymentDeploymentConfigurationValidationPolicyPropertyDsl {
    private val cdkBuilder: CfnDeployment.DeploymentConfigurationValidationPolicyProperty.Builder =
        CfnDeployment.DeploymentConfigurationValidationPolicyProperty.builder()

    /**
     * @param timeoutInSeconds The amount of time in seconds that a component can validate its
     *   configuration updates. If the validation time exceeds this timeout, then the deployment
     *   proceeds for the device.
     *
     * Default: `30`
     */
    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    public fun build(): CfnDeployment.DeploymentConfigurationValidationPolicyProperty =
        cdkBuilder.build()
}
