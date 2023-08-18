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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.constructs.Construct

/**
 * Creates a continuous deployment policy that routes a subset of production traffic from a primary
 * distribution to a staging distribution.
 *
 * After you create and update a staging distribution, you can use a continuous deployment policy to
 * incrementally move traffic to the staging distribution. This enables you to test changes to a
 * distribution's configuration before moving all of your production traffic to the new
 * configuration.
 *
 * For more information, see
 * [Using CloudFront continuous deployment to safely test CDN configuration changes](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/continuous-deployment.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnContinuousDeploymentPolicy cfnContinuousDeploymentPolicy =
 * CfnContinuousDeploymentPolicy.Builder.create(this, "MyCfnContinuousDeploymentPolicy")
 * .continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty.builder()
 * .enabled(false)
 * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
 * // the properties below are optional
 * .trafficConfig(TrafficConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build())
 * .singleWeightConfig(SingleWeightConfigProperty.builder()
 * .weight(123)
 * // the properties below are optional
 * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build())
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html)
 */
@CdkDslMarker
public class CfnContinuousDeploymentPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnContinuousDeploymentPolicy.Builder =
        CfnContinuousDeploymentPolicy.Builder.create(scope, id)

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     *
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     *   deployment policy.
     */
    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
        cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
    }

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     *
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     *   deployment policy.
     */
    public fun continuousDeploymentPolicyConfig(
        continuousDeploymentPolicyConfig:
            CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty
    ) {
        cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
    }

    public fun build(): CfnContinuousDeploymentPolicy = cdkBuilder.build()
}
