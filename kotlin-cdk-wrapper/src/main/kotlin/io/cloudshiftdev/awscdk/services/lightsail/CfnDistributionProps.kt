@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDistribution`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnDistributionProps cfnDistributionProps = CfnDistributionProps.builder()
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
public interface CfnDistributionProps {
  /**
   * The ID of the bundle applied to the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-bundleid)
   */
  public fun bundleId(): String

  /**
   * An object that describes the cache behavior settings of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
   */
  public fun cacheBehaviorSettings(): Any? = unwrap(this).getCacheBehaviorSettings()

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
   */
  public fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

  /**
   * The name of the SSL/TLS certificate attached to the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-certificatename)
   */
  public fun certificateName(): String? = unwrap(this).getCertificateName()

  /**
   * An object that describes the default cache behavior of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
   */
  public fun defaultCacheBehavior(): Any

  /**
   * The name of the distribution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-distributionname)
   */
  public fun distributionName(): String

  /**
   * The IP address type of the distribution.
   *
   * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * A Boolean value indicating whether the distribution is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
   */
  public fun isEnabled(): Any? = unwrap(this).getIsEnabled()

  /**
   * An object that describes the origin resource of the distribution, such as a Lightsail instance,
   * bucket, or load balancer.
   *
   * The distribution pulls, caches, and serves content from the origin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
   */
  public fun origin(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDistributionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bundleId The ID of the bundle applied to the distribution. 
     */
    public fun bundleId(bundleId: String)

    /**
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution.
     */
    public fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable)

    /**
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution.
     */
    public fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty)

    /**
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("766be6ec1d5f5ad3551b369ac31a740f862c60762e279a16f11f880c8c57cb31")
    public
        fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty.Builder.() -> Unit)

    /**
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution.
     */
    public fun cacheBehaviors(cacheBehaviors: IResolvable)

    /**
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution.
     */
    public fun cacheBehaviors(cacheBehaviors: List<Any>)

    /**
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution.
     */
    public fun cacheBehaviors(vararg cacheBehaviors: Any)

    /**
     * @param certificateName The name of the SSL/TLS certificate attached to the distribution.
     */
    public fun certificateName(certificateName: String)

    /**
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable)

    /**
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    public fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty)

    /**
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee52aa6fc3058ca0975a851e209a1d97d285c55c682f0ddf421215d02c79cd7b")
    public
        fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty.Builder.() -> Unit)

    /**
     * @param distributionName The name of the distribution. 
     */
    public fun distributionName(distributionName: String)

    /**
     * @param ipAddressType The IP address type of the distribution.
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param isEnabled A Boolean value indicating whether the distribution is enabled.
     */
    public fun isEnabled(isEnabled: Boolean)

    /**
     * @param isEnabled A Boolean value indicating whether the distribution is enabled.
     */
    public fun isEnabled(isEnabled: IResolvable)

    /**
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     * The distribution pulls, caches, and serves content from the origin.
     */
    public fun origin(origin: IResolvable)

    /**
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     * The distribution pulls, caches, and serves content from the origin.
     */
    public fun origin(origin: CfnDistribution.InputOriginProperty)

    /**
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     * The distribution pulls, caches, and serves content from the origin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1499567289ac781984465c8da8eae6032a63c11bfdbd4dd141a70f4c2ed0c459")
    public fun origin(origin: CfnDistribution.InputOriginProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDistributionProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnDistributionProps.builder()

    /**
     * @param bundleId The ID of the bundle applied to the distribution. 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution.
     */
    override fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(IResolvable::unwrap))
    }

    /**
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution.
     */
    override
        fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(CfnDistribution.CacheSettingsProperty::unwrap))
    }

    /**
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("766be6ec1d5f5ad3551b369ac31a740f862c60762e279a16f11f880c8c57cb31")
    override
        fun cacheBehaviorSettings(cacheBehaviorSettings: CfnDistribution.CacheSettingsProperty.Builder.() -> Unit):
        Unit = cacheBehaviorSettings(CfnDistribution.CacheSettingsProperty(cacheBehaviorSettings))

    /**
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution.
     */
    override fun cacheBehaviors(cacheBehaviors: IResolvable) {
      cdkBuilder.cacheBehaviors(cacheBehaviors.let(IResolvable::unwrap))
    }

    /**
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution.
     */
    override fun cacheBehaviors(cacheBehaviors: List<Any>) {
      cdkBuilder.cacheBehaviors(cacheBehaviors)
    }

    /**
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution.
     */
    override fun cacheBehaviors(vararg cacheBehaviors: Any): Unit =
        cacheBehaviors(cacheBehaviors.toList())

    /**
     * @param certificateName The name of the SSL/TLS certificate attached to the distribution.
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    override fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(IResolvable::unwrap))
    }

    /**
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    override fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(CfnDistribution.CacheBehaviorProperty::unwrap))
    }

    /**
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee52aa6fc3058ca0975a851e209a1d97d285c55c682f0ddf421215d02c79cd7b")
    override
        fun defaultCacheBehavior(defaultCacheBehavior: CfnDistribution.CacheBehaviorProperty.Builder.() -> Unit):
        Unit = defaultCacheBehavior(CfnDistribution.CacheBehaviorProperty(defaultCacheBehavior))

    /**
     * @param distributionName The name of the distribution. 
     */
    override fun distributionName(distributionName: String) {
      cdkBuilder.distributionName(distributionName)
    }

    /**
     * @param ipAddressType The IP address type of the distribution.
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param isEnabled A Boolean value indicating whether the distribution is enabled.
     */
    override fun isEnabled(isEnabled: Boolean) {
      cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * @param isEnabled A Boolean value indicating whether the distribution is enabled.
     */
    override fun isEnabled(isEnabled: IResolvable) {
      cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     * The distribution pulls, caches, and serves content from the origin.
     */
    override fun origin(origin: IResolvable) {
      cdkBuilder.origin(origin.let(IResolvable::unwrap))
    }

    /**
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     * The distribution pulls, caches, and serves content from the origin.
     */
    override fun origin(origin: CfnDistribution.InputOriginProperty) {
      cdkBuilder.origin(origin.let(CfnDistribution.InputOriginProperty::unwrap))
    }

    /**
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     * The distribution pulls, caches, and serves content from the origin.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1499567289ac781984465c8da8eae6032a63c11bfdbd4dd141a70f4c2ed0c459")
    override fun origin(origin: CfnDistribution.InputOriginProperty.Builder.() -> Unit): Unit =
        origin(CfnDistribution.InputOriginProperty(origin))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnDistributionProps,
  ) : CdkObject(cdkObject), CfnDistributionProps {
    /**
     * The ID of the bundle applied to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-bundleid)
     */
    override fun bundleId(): String = unwrap(this).getBundleId()

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     */
    override fun cacheBehaviorSettings(): Any? = unwrap(this).getCacheBehaviorSettings()

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     */
    override fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

    /**
     * The name of the SSL/TLS certificate attached to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-certificatename)
     */
    override fun certificateName(): String? = unwrap(this).getCertificateName()

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     */
    override fun defaultCacheBehavior(): Any = unwrap(this).getDefaultCacheBehavior()

    /**
     * The name of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-distributionname)
     */
    override fun distributionName(): String = unwrap(this).getDistributionName()

    /**
     * The IP address type of the distribution.
     *
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-ipaddresstype)
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * A Boolean value indicating whether the distribution is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
     */
    override fun isEnabled(): Any? = unwrap(this).getIsEnabled()

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     */
    override fun origin(): Any = unwrap(this).getOrigin()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistributionProps):
        CfnDistributionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionProps):
        software.amazon.awscdk.services.lightsail.CfnDistributionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnDistributionProps
  }
}
