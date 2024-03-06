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
     * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent to
     *   the staging distribution. If the HTTP request contains a header and value that matches what
     *   you specify here, the request is sent to the staging distribution. Otherwise the request is
     *   sent to the primary distribution.
     */
    public fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: IResolvable) {
        cdkBuilder.singleHeaderPolicyConfig(singleHeaderPolicyConfig)
    }

    /**
     * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent to
     *   the staging distribution. If the HTTP request contains a header and value that matches what
     *   you specify here, the request is sent to the staging distribution. Otherwise the request is
     *   sent to the primary distribution.
     */
    public fun singleHeaderPolicyConfig(
        singleHeaderPolicyConfig: CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty
    ) {
        cdkBuilder.singleHeaderPolicyConfig(singleHeaderPolicyConfig)
    }

    /**
     * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP requests
     *   that are sent to the staging distribution.
     */
    public fun singleWeightPolicyConfig(singleWeightPolicyConfig: IResolvable) {
        cdkBuilder.singleWeightPolicyConfig(singleWeightPolicyConfig)
    }

    /**
     * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP requests
     *   that are sent to the staging distribution.
     */
    public fun singleWeightPolicyConfig(
        singleWeightPolicyConfig: CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty
    ) {
        cdkBuilder.singleWeightPolicyConfig(singleWeightPolicyConfig)
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

    /** @param type The type of traffic configuration. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty {
        if (_stagingDistributionDnsNames.isNotEmpty())
            cdkBuilder.stagingDistributionDnsNames(_stagingDistributionDnsNames)
        return cdkBuilder.build()
    }
}
