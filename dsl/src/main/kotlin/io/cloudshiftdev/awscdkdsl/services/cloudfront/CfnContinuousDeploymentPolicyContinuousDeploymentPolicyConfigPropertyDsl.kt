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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

/**
 * Contains the configuration for a continuous deployment policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * ContinuousDeploymentPolicyConfigProperty continuousDeploymentPolicyConfigProperty =
 * ContinuousDeploymentPolicyConfigProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html)
 */
@CdkDslMarker
public class CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl {
    private val cdkBuilder:
        CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder =
        CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder()

    private val _stagingDistributionDnsNames: MutableList<String> = mutableListOf()

    /**
     * @param enabled A Boolean that indicates whether this continuous deployment policy is enabled
     *   (in effect). When this value is `true` , this policy is enabled and in effect. When this
     *   value is `false` , this policy is not enabled and has no effect.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A Boolean that indicates whether this continuous deployment policy is enabled
     *   (in effect). When this value is `true` , this policy is enabled and in effect. When this
     *   value is `false` , this policy is not enabled and has no effect.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution.
     *   For example: `d111111abcdef8.cloudfront.net` .
     */
    public fun stagingDistributionDnsNames(vararg stagingDistributionDnsNames: String) {
        _stagingDistributionDnsNames.addAll(listOf(*stagingDistributionDnsNames))
    }

    /**
     * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution.
     *   For example: `d111111abcdef8.cloudfront.net` .
     */
    public fun stagingDistributionDnsNames(stagingDistributionDnsNames: Collection<String>) {
        _stagingDistributionDnsNames.addAll(stagingDistributionDnsNames)
    }

    /**
     * @param trafficConfig Contains the parameters for routing production traffic from your primary
     *   to staging distributions.
     */
    public fun trafficConfig(trafficConfig: IResolvable) {
        cdkBuilder.trafficConfig(trafficConfig)
    }

    /**
     * @param trafficConfig Contains the parameters for routing production traffic from your primary
     *   to staging distributions.
     */
    public fun trafficConfig(trafficConfig: CfnContinuousDeploymentPolicy.TrafficConfigProperty) {
        cdkBuilder.trafficConfig(trafficConfig)
    }

    public fun build(): CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty {
        if (_stagingDistributionDnsNames.isNotEmpty())
            cdkBuilder.stagingDistributionDnsNames(_stagingDistributionDnsNames)
        return cdkBuilder.build()
    }
}
