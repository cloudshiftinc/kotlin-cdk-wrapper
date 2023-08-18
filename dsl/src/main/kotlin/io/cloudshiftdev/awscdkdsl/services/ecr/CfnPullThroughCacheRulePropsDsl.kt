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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps

/**
 * Properties for defining a `CfnPullThroughCacheRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * CfnPullThroughCacheRuleProps cfnPullThroughCacheRuleProps =
 * CfnPullThroughCacheRuleProps.builder()
 * .ecrRepositoryPrefix("ecrRepositoryPrefix")
 * .upstreamRegistryUrl("upstreamRegistryUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html)
 */
@CdkDslMarker
public class CfnPullThroughCacheRulePropsDsl {
    private val cdkBuilder: CfnPullThroughCacheRuleProps.Builder =
        CfnPullThroughCacheRuleProps.builder()

    /**
     * @param ecrRepositoryPrefix The Amazon ECR repository prefix associated with the pull through
     *   cache rule.
     */
    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
        cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
    }

    /**
     * @param upstreamRegistryUrl The upstream registry URL associated with the pull through cache
     *   rule.
     */
    public fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
        cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
    }

    public fun build(): CfnPullThroughCacheRuleProps = cdkBuilder.build()
}
