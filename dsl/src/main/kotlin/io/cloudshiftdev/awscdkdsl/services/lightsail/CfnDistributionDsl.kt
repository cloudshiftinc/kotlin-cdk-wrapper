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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDistribution
import software.constructs.Construct

/**
 * The `AWS::Lightsail::Distribution` resource specifies a content delivery network (CDN)
 * distribution.
 *
 * You can create distributions only in the `us-east-1` AWS Region.
 *
 * A distribution is a globally distributed network of caching servers that improve the performance
 * of your website or web application hosted on a Lightsail instance, static content hosted on a
 * Lightsail bucket, or through a Lightsail load balancer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnDistribution cfnDistribution = CfnDistribution.Builder.create(this, "MyCfnDistribution")
 * .bundleId("bundleId")
 * .defaultCacheBehavior(CacheBehaviorProperty.builder()
 * .behavior("behavior")
 * .build())
 * .distributionName("distributionName")
 * .origin(InputOriginProperty.builder()
 * .name("name")
 * .protocolPolicy("protocolPolicy")
 * .regionName("regionName")
 * .build())
 * // the properties below are optional
 * .cacheBehaviors(List.of(CacheBehaviorPerPathProperty.builder()
 * .behavior("behavior")
 * .path("path")
 * .build()))
 * .cacheBehaviorSettings(CacheSettingsProperty.builder()
 * .allowedHttpMethods("allowedHttpMethods")
 * .cachedHttpMethods("cachedHttpMethods")
 * .defaultTtl(123)
 * .forwardedCookies(CookieObjectProperty.builder()
 * .cookiesAllowList(List.of("cookiesAllowList"))
 * .option("option")
 * .build())
 * .forwardedHeaders(HeaderObjectProperty.builder()
 * .headersAllowList(List.of("headersAllowList"))
 * .option("option")
 * .build())
 * .forwardedQueryStrings(QueryStringObjectProperty.builder()
 * .option(false)
 * .queryStringsAllowList(List.of("queryStringsAllowList"))
 * .build())
 * .maximumTtl(123)
 * .minimumTtl(123)
 * .build())
 * .certificateName("certificateName")
 * .ipAddressType("ipAddressType")
 * .isEnabled(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
 */
@CdkDslMarker
public class CfnDistributionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDistribution.Builder = CfnDistribution.Builder.create(scope, id)

    private val _cacheBehaviors: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the bundle applied to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-bundleid)
     *
     * @param bundleId The ID of the bundle applied to the distribution.
     */
    public fun bundleId(bundleId: String) {
        cdkBuilder.bundleId(bundleId)
    }

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     *
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     *   distribution.
     */
    public fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable) {
        cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings)
    }

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     *
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     *   distribution.
     */
    public fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty) {
        cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings)
    }

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     *
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     *   distribution.
     */
    public fun cacheBehaviors(vararg cacheBehaviors: Any) {
        _cacheBehaviors.addAll(listOf(*cacheBehaviors))
    }

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     *
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     *   distribution.
     */
    public fun cacheBehaviors(cacheBehaviors: Collection<Any>) {
        _cacheBehaviors.addAll(cacheBehaviors)
    }

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     *
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     *   distribution.
     */
    public fun cacheBehaviors(cacheBehaviors: IResolvable) {
        cdkBuilder.cacheBehaviors(cacheBehaviors)
    }

    /**
     * The name of the SSL/TLS certificate attached to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-certificatename)
     *
     * @param certificateName The name of the SSL/TLS certificate attached to the distribution.
     */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     *
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     *   distribution.
     */
    public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
        cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
    }

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     *
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     *   distribution.
     */
    public fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty) {
        cdkBuilder.defaultCacheBehavior(defaultCacheBehavior)
    }

    /**
     * The name of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-distributionname)
     *
     * @param distributionName The name of the distribution.
     */
    public fun distributionName(distributionName: String) {
        cdkBuilder.distributionName(distributionName)
    }

    /**
     * The IP address type of the distribution.
     *
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-ipaddresstype)
     *
     * @param ipAddressType The IP address type of the distribution.
     */
    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * A Boolean value indicating whether the distribution is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
     *
     * @param isEnabled A Boolean value indicating whether the distribution is enabled.
     */
    public fun isEnabled(isEnabled: Boolean) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * A Boolean value indicating whether the distribution is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
     *
     * @param isEnabled A Boolean value indicating whether the distribution is enabled.
     */
    public fun isEnabled(isEnabled: IResolvable) {
        cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     *
     * @param origin An object that describes the origin resource of the distribution, such as a
     *   Lightsail instance, bucket, or load balancer.
     */
    public fun origin(origin: IResolvable) {
        cdkBuilder.origin(origin)
    }

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     *
     * @param origin An object that describes the origin resource of the distribution, such as a
     *   Lightsail instance, bucket, or load balancer.
     */
    public fun origin(origin: CfnDistribution.InputOriginProperty) {
        cdkBuilder.origin(origin)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDistribution {
        if (_cacheBehaviors.isNotEmpty()) cdkBuilder.cacheBehaviors(_cacheBehaviors)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
