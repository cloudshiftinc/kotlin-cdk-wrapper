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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps

/**
 * Properties for defining a `CfnContinuousDeploymentPolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnContinuousDeploymentPolicyProps cfnContinuousDeploymentPolicyProps =
 * CfnContinuousDeploymentPolicyProps.builder()
 * .continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty.builder()
 * .enabled(false)
 * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
 * // the properties below are optional
 * .singleHeaderPolicyConfig(SingleHeaderPolicyConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build())
 * .singleWeightPolicyConfig(SingleWeightPolicyConfigProperty.builder()
 * .weight(123)
 * // the properties below are optional
 * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build())
 * .build())
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
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html)
 */
@CdkDslMarker
public class CfnContinuousDeploymentPolicyPropsDsl {
    private val cdkBuilder: CfnContinuousDeploymentPolicyProps.Builder =
        CfnContinuousDeploymentPolicyProps.builder()

    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     *   deployment policy.
     */
    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
        cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
    }

    /**
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     *   deployment policy.
     */
    public fun continuousDeploymentPolicyConfig(
        continuousDeploymentPolicyConfig:
            CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty
    ) {
        cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
    }

    public fun build(): CfnContinuousDeploymentPolicyProps = cdkBuilder.build()
}
