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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnDistribution

/**
 * `CacheBehavior` is a property of the
 * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
 * resource. It describes the default cache behavior of an Amazon Lightsail content delivery network
 * (CDN) distribution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CacheBehaviorProperty cacheBehaviorProperty = CacheBehaviorProperty.builder()
 * .behavior("behavior")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehavior.html)
 */
@CdkDslMarker
public class CfnDistributionCacheBehaviorPropertyDsl {
    private val cdkBuilder: CfnDistribution.CacheBehaviorProperty.Builder =
        CfnDistribution.CacheBehaviorProperty.builder()

    /**
     * @param behavior The cache behavior of the distribution. The following cache behaviors can be
     *   specified:
     * * *`cache`* - This option is best for static sites. When specified, your distribution caches
     *   and serves your entire website as static content. This behavior is ideal for websites with
     *   static content that doesn't change depending on who views it, or for websites that don't
     *   use cookies, headers, or query strings to personalize content.
     * * *`dont-cache`* - This option is best for sites that serve a mix of static and dynamic
     *   content. When specified, your distribution caches and serves only the content that is
     *   specified in the distribution’s `CacheBehaviorPerPath` parameter. This behavior is ideal
     *   for websites or web applications that use cookies, headers, and query strings to
     *   personalize content for individual users.
     */
    public fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
    }

    public fun build(): CfnDistribution.CacheBehaviorProperty = cdkBuilder.build()
}
