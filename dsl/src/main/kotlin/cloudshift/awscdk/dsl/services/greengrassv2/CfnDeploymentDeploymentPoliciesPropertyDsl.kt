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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information about policies that define how a deployment updates components and handles
 * failure.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * DeploymentPoliciesProperty deploymentPoliciesProperty = DeploymentPoliciesProperty.builder()
 * .componentUpdatePolicy(DeploymentComponentUpdatePolicyProperty.builder()
 * .action("action")
 * .timeoutInSeconds(123)
 * .build())
 * .configurationValidationPolicy(DeploymentConfigurationValidationPolicyProperty.builder()
 * .timeoutInSeconds(123)
 * .build())
 * .failureHandlingPolicy("failureHandlingPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-deploymentpolicies.html)
 */
@CdkDslMarker
public class CfnDeploymentDeploymentPoliciesPropertyDsl {
    private val cdkBuilder: CfnDeployment.DeploymentPoliciesProperty.Builder =
        CfnDeployment.DeploymentPoliciesProperty.builder()

    /**
     * @param componentUpdatePolicy The component update policy for the configuration deployment.
     *   This policy defines when it's safe to deploy the configuration to devices.
     */
    public fun componentUpdatePolicy(componentUpdatePolicy: IResolvable) {
        cdkBuilder.componentUpdatePolicy(componentUpdatePolicy)
    }

    /**
     * @param componentUpdatePolicy The component update policy for the configuration deployment.
     *   This policy defines when it's safe to deploy the configuration to devices.
     */
    public fun componentUpdatePolicy(
        componentUpdatePolicy: CfnDeployment.DeploymentComponentUpdatePolicyProperty
    ) {
        cdkBuilder.componentUpdatePolicy(componentUpdatePolicy)
    }

    /**
     * @param configurationValidationPolicy The configuration validation policy for the
     *   configuration deployment. This policy defines how long each component has to validate its
     *   configure updates.
     */
    public fun configurationValidationPolicy(configurationValidationPolicy: IResolvable) {
        cdkBuilder.configurationValidationPolicy(configurationValidationPolicy)
    }

    /**
     * @param configurationValidationPolicy The configuration validation policy for the
     *   configuration deployment. This policy defines how long each component has to validate its
     *   configure updates.
     */
    public fun configurationValidationPolicy(
        configurationValidationPolicy: CfnDeployment.DeploymentConfigurationValidationPolicyProperty
    ) {
        cdkBuilder.configurationValidationPolicy(configurationValidationPolicy)
    }

    /**
     * @param failureHandlingPolicy The failure handling policy for the configuration deployment.
     *   This policy defines what to do if the deployment fails. Default: `ROLLBACK`
     */
    public fun failureHandlingPolicy(failureHandlingPolicy: String) {
        cdkBuilder.failureHandlingPolicy(failureHandlingPolicy)
    }

    public fun build(): CfnDeployment.DeploymentPoliciesProperty = cdkBuilder.build()
}
