@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
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
public open class CfnDistribution internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDistributionProps,
  ) :
      this(software.amazon.awscdk.services.lightsail.CfnDistribution(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDistributionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDistributionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDistributionProps(props)
  )

  /**
   * Indicates whether you can update the distribution’s current bundle to another bundle.
   */
  public open fun attrAbleToUpdateBundle(): IResolvable =
      unwrap(this).getAttrAbleToUpdateBundle().let(IResolvable::wrap)

  /**
   * The Amazon Resource Name (ARN) of the distribution.
   */
  public open fun attrDistributionArn(): String = unwrap(this).getAttrDistributionArn()

  /**
   * The status of the distribution.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The ID of the bundle applied to the distribution.
   */
  public open fun bundleId(): String = unwrap(this).getBundleId()

  /**
   * The ID of the bundle applied to the distribution.
   */
  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  /**
   * An object that describes the cache behavior settings of the distribution.
   */
  public open fun cacheBehaviorSettings(): Any? = unwrap(this).getCacheBehaviorSettings()

  /**
   * An object that describes the cache behavior settings of the distribution.
   */
  public open fun cacheBehaviorSettings(`value`: IResolvable) {
    unwrap(this).setCacheBehaviorSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that describes the cache behavior settings of the distribution.
   */
  public open fun cacheBehaviorSettings(`value`: CacheSettingsProperty) {
    unwrap(this).setCacheBehaviorSettings(`value`.let(CacheSettingsProperty::unwrap))
  }

  /**
   * An object that describes the cache behavior settings of the distribution.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79f57704ab0ebc94e6e2c88f87d3814983faca9f798980109dc7f6122c158f6d")
  public open fun cacheBehaviorSettings(`value`: CacheSettingsProperty.Builder.() -> Unit): Unit =
      cacheBehaviorSettings(CacheSettingsProperty(`value`))

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   */
  public open fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   */
  public open fun cacheBehaviors(`value`: IResolvable) {
    unwrap(this).setCacheBehaviors(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   */
  public open fun cacheBehaviors(`value`: List<Any>) {
    unwrap(this).setCacheBehaviors(`value`)
  }

  /**
   * An array of objects that describe the per-path cache behavior of the distribution.
   */
  public open fun cacheBehaviors(vararg `value`: Any): Unit = cacheBehaviors(`value`.toList())

  /**
   * The name of the SSL/TLS certificate attached to the distribution.
   */
  public open fun certificateName(): String? = unwrap(this).getCertificateName()

  /**
   * The name of the SSL/TLS certificate attached to the distribution.
   */
  public open fun certificateName(`value`: String) {
    unwrap(this).setCertificateName(`value`)
  }

  /**
   * An object that describes the default cache behavior of the distribution.
   */
  public open fun defaultCacheBehavior(): Any = unwrap(this).getDefaultCacheBehavior()

  /**
   * An object that describes the default cache behavior of the distribution.
   */
  public open fun defaultCacheBehavior(`value`: IResolvable) {
    unwrap(this).setDefaultCacheBehavior(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that describes the default cache behavior of the distribution.
   */
  public open fun defaultCacheBehavior(`value`: CacheBehaviorProperty) {
    unwrap(this).setDefaultCacheBehavior(`value`.let(CacheBehaviorProperty::unwrap))
  }

  /**
   * An object that describes the default cache behavior of the distribution.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1c242d3b3eaba59599830c82a1222710e29154ea4d516159285318e8f201b65")
  public open fun defaultCacheBehavior(`value`: CacheBehaviorProperty.Builder.() -> Unit): Unit =
      defaultCacheBehavior(CacheBehaviorProperty(`value`))

  /**
   * The name of the distribution.
   */
  public open fun distributionName(): String = unwrap(this).getDistributionName()

  /**
   * The name of the distribution.
   */
  public open fun distributionName(`value`: String) {
    unwrap(this).setDistributionName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IP address type of the distribution.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The IP address type of the distribution.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * A Boolean value indicating whether the distribution is enabled.
   */
  public open fun isEnabled(): Any? = unwrap(this).getIsEnabled()

  /**
   * A Boolean value indicating whether the distribution is enabled.
   */
  public open fun isEnabled(`value`: Boolean) {
    unwrap(this).setIsEnabled(`value`)
  }

  /**
   * A Boolean value indicating whether the distribution is enabled.
   */
  public open fun isEnabled(`value`: IResolvable) {
    unwrap(this).setIsEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that describes the origin resource of the distribution, such as a Lightsail instance,
   * bucket, or load balancer.
   */
  public open fun origin(): Any = unwrap(this).getOrigin()

  /**
   * An object that describes the origin resource of the distribution, such as a Lightsail instance,
   * bucket, or load balancer.
   */
  public open fun origin(`value`: IResolvable) {
    unwrap(this).setOrigin(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that describes the origin resource of the distribution, such as a Lightsail instance,
   * bucket, or load balancer.
   */
  public open fun origin(`value`: InputOriginProperty) {
    unwrap(this).setOrigin(`value`.let(InputOriginProperty::unwrap))
  }

  /**
   * An object that describes the origin resource of the distribution, such as a Lightsail instance,
   * bucket, or load balancer.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("064abce212e311aac6686c805cd4f4f4ae0ec3dd5280c17c4f35fede72c8f503")
  public open fun origin(`value`: InputOriginProperty.Builder.() -> Unit): Unit =
      origin(InputOriginProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnDistribution].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the bundle applied to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-bundleid)
     * @param bundleId The ID of the bundle applied to the distribution. 
     */
    public fun bundleId(bundleId: String)

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution. 
     */
    public fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable)

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution. 
     */
    public fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty)

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7be9dd6a199c12d315ac62758530f6e3c1deceb2b119cf1bda341cc3fe6eeb1")
    public
        fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty.Builder.() -> Unit)

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution. 
     */
    public fun cacheBehaviors(cacheBehaviors: IResolvable)

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution. 
     */
    public fun cacheBehaviors(cacheBehaviors: List<Any>)

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution. 
     */
    public fun cacheBehaviors(vararg cacheBehaviors: Any)

    /**
     * The name of the SSL/TLS certificate attached to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-certificatename)
     * @param certificateName The name of the SSL/TLS certificate attached to the distribution. 
     */
    public fun certificateName(certificateName: String)

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable)

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    public fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty)

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4157d6c3d1a227fcd50f9ada92f79843f63a504eb29c54a28b5157aeb2ae401")
    public fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty.Builder.() -> Unit)

    /**
     * The name of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-distributionname)
     * @param distributionName The name of the distribution. 
     */
    public fun distributionName(distributionName: String)

    /**
     * The IP address type of the distribution.
     *
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-ipaddresstype)
     * @param ipAddressType The IP address type of the distribution. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * A Boolean value indicating whether the distribution is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
     * @param isEnabled A Boolean value indicating whether the distribution is enabled. 
     */
    public fun isEnabled(isEnabled: Boolean)

    /**
     * A Boolean value indicating whether the distribution is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
     * @param isEnabled A Boolean value indicating whether the distribution is enabled. 
     */
    public fun isEnabled(isEnabled: IResolvable)

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     */
    public fun origin(origin: IResolvable)

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     */
    public fun origin(origin: InputOriginProperty)

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95170e276150a0f651d6df3157aed185b387fec3a0a2b81b8b6b0002a7f65c5")
    public fun origin(origin: InputOriginProperty.Builder.() -> Unit)

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDistribution.Builder =
        software.amazon.awscdk.services.lightsail.CfnDistribution.Builder.create(scope, id)

    /**
     * The ID of the bundle applied to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-bundleid)
     * @param bundleId The ID of the bundle applied to the distribution. 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution. 
     */
    override fun cacheBehaviorSettings(cacheBehaviorSettings: IResolvable) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(IResolvable::unwrap))
    }

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution. 
     */
    override fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty) {
      cdkBuilder.cacheBehaviorSettings(cacheBehaviorSettings.let(CacheSettingsProperty::unwrap))
    }

    /**
     * An object that describes the cache behavior settings of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviorsettings)
     * @param cacheBehaviorSettings An object that describes the cache behavior settings of the
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7be9dd6a199c12d315ac62758530f6e3c1deceb2b119cf1bda341cc3fe6eeb1")
    override
        fun cacheBehaviorSettings(cacheBehaviorSettings: CacheSettingsProperty.Builder.() -> Unit):
        Unit = cacheBehaviorSettings(CacheSettingsProperty(cacheBehaviorSettings))

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution. 
     */
    override fun cacheBehaviors(cacheBehaviors: IResolvable) {
      cdkBuilder.cacheBehaviors(cacheBehaviors.let(IResolvable::unwrap))
    }

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution. 
     */
    override fun cacheBehaviors(cacheBehaviors: List<Any>) {
      cdkBuilder.cacheBehaviors(cacheBehaviors)
    }

    /**
     * An array of objects that describe the per-path cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-cachebehaviors)
     * @param cacheBehaviors An array of objects that describe the per-path cache behavior of the
     * distribution. 
     */
    override fun cacheBehaviors(vararg cacheBehaviors: Any): Unit =
        cacheBehaviors(cacheBehaviors.toList())

    /**
     * The name of the SSL/TLS certificate attached to the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-certificatename)
     * @param certificateName The name of the SSL/TLS certificate attached to the distribution. 
     */
    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    override fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(IResolvable::unwrap))
    }

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    override fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty) {
      cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(CacheBehaviorProperty::unwrap))
    }

    /**
     * An object that describes the default cache behavior of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-defaultcachebehavior)
     * @param defaultCacheBehavior An object that describes the default cache behavior of the
     * distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b4157d6c3d1a227fcd50f9ada92f79843f63a504eb29c54a28b5157aeb2ae401")
    override
        fun defaultCacheBehavior(defaultCacheBehavior: CacheBehaviorProperty.Builder.() -> Unit):
        Unit = defaultCacheBehavior(CacheBehaviorProperty(defaultCacheBehavior))

    /**
     * The name of the distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-distributionname)
     * @param distributionName The name of the distribution. 
     */
    override fun distributionName(distributionName: String) {
      cdkBuilder.distributionName(distributionName)
    }

    /**
     * The IP address type of the distribution.
     *
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for IPv4 and IPv6.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-ipaddresstype)
     * @param ipAddressType The IP address type of the distribution. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * A Boolean value indicating whether the distribution is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
     * @param isEnabled A Boolean value indicating whether the distribution is enabled. 
     */
    override fun isEnabled(isEnabled: Boolean) {
      cdkBuilder.isEnabled(isEnabled)
    }

    /**
     * A Boolean value indicating whether the distribution is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-isenabled)
     * @param isEnabled A Boolean value indicating whether the distribution is enabled. 
     */
    override fun isEnabled(isEnabled: IResolvable) {
      cdkBuilder.isEnabled(isEnabled.let(IResolvable::unwrap))
    }

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     */
    override fun origin(origin: IResolvable) {
      cdkBuilder.origin(origin.let(IResolvable::unwrap))
    }

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     */
    override fun origin(origin: InputOriginProperty) {
      cdkBuilder.origin(origin.let(InputOriginProperty::unwrap))
    }

    /**
     * An object that describes the origin resource of the distribution, such as a Lightsail
     * instance, bucket, or load balancer.
     *
     * The distribution pulls, caches, and serves content from the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html#cfn-lightsail-distribution-origin)
     * @param origin An object that describes the origin resource of the distribution, such as a
     * Lightsail instance, bucket, or load balancer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a95170e276150a0f651d6df3157aed185b387fec3a0a2b81b8b6b0002a7f65c5")
    override fun origin(origin: InputOriginProperty.Builder.() -> Unit): Unit =
        origin(InputOriginProperty(origin))

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDistribution =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnDistribution.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDistribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDistribution(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution):
        CfnDistribution = CfnDistribution(cdkObject)

    internal fun unwrap(wrapped: CfnDistribution):
        software.amazon.awscdk.services.lightsail.CfnDistribution = wrapped.cdkObject
  }

  /**
   * `CacheBehavior` is a property of the
   * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
   * resource. It describes the default cache behavior of an Amazon Lightsail content delivery network
   * (CDN) distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * CacheBehaviorProperty cacheBehaviorProperty = CacheBehaviorProperty.builder()
   * .behavior("behavior")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehavior.html)
   */
  public interface CacheBehaviorProperty {
    /**
     * The cache behavior of the distribution.
     *
     * The following cache behaviors can be specified:
     *
     * * *`cache`* - This option is best for static sites. When specified, your distribution caches
     * and serves your entire website as static content. This behavior is ideal for websites with
     * static content that doesn't change depending on who views it, or for websites that don't use
     * cookies, headers, or query strings to personalize content.
     * * *`dont-cache`* - This option is best for sites that serve a mix of static and dynamic
     * content. When specified, your distribution caches and serves only the content that is specified
     * in the distribution’s `CacheBehaviorPerPath` parameter. This behavior is ideal for websites or
     * web applications that use cookies, headers, and query strings to personalize content for
     * individual users.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehavior.html#cfn-lightsail-distribution-cachebehavior-behavior)
     */
    public fun behavior(): String? = unwrap(this).getBehavior()

    /**
     * A builder for [CacheBehaviorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param behavior The cache behavior of the distribution.
       * The following cache behaviors can be specified:
       *
       * * *`cache`* - This option is best for static sites. When specified, your distribution
       * caches and serves your entire website as static content. This behavior is ideal for websites
       * with static content that doesn't change depending on who views it, or for websites that don't
       * use cookies, headers, or query strings to personalize content.
       * * *`dont-cache`* - This option is best for sites that serve a mix of static and dynamic
       * content. When specified, your distribution caches and serves only the content that is
       * specified in the distribution’s `CacheBehaviorPerPath` parameter. This behavior is ideal for
       * websites or web applications that use cookies, headers, and query strings to personalize
       * content for individual users.
       */
      public fun behavior(behavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty.builder()

      /**
       * @param behavior The cache behavior of the distribution.
       * The following cache behaviors can be specified:
       *
       * * *`cache`* - This option is best for static sites. When specified, your distribution
       * caches and serves your entire website as static content. This behavior is ideal for websites
       * with static content that doesn't change depending on who views it, or for websites that don't
       * use cookies, headers, or query strings to personalize content.
       * * *`dont-cache`* - This option is best for sites that serve a mix of static and dynamic
       * content. When specified, your distribution caches and serves only the content that is
       * specified in the distribution’s `CacheBehaviorPerPath` parameter. This behavior is ideal for
       * websites or web applications that use cookies, headers, and query strings to personalize
       * content for individual users.
       */
      override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty,
    ) : CdkObject(cdkObject), CacheBehaviorProperty {
      /**
       * The cache behavior of the distribution.
       *
       * The following cache behaviors can be specified:
       *
       * * *`cache`* - This option is best for static sites. When specified, your distribution
       * caches and serves your entire website as static content. This behavior is ideal for websites
       * with static content that doesn't change depending on who views it, or for websites that don't
       * use cookies, headers, or query strings to personalize content.
       * * *`dont-cache`* - This option is best for sites that serve a mix of static and dynamic
       * content. When specified, your distribution caches and serves only the content that is
       * specified in the distribution’s `CacheBehaviorPerPath` parameter. This behavior is ideal for
       * websites or web applications that use cookies, headers, and query strings to personalize
       * content for individual users.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehavior.html#cfn-lightsail-distribution-cachebehavior-behavior)
       */
      override fun behavior(): String? = unwrap(this).getBehavior()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CacheBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty):
          CacheBehaviorProperty = CdkObjectWrappers.wrap(cdkObject) as? CacheBehaviorProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheBehaviorProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorProperty
    }
  }

  /**
   * `CookieObject` is a property of the
   * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
   * property. It describes whether an Amazon Lightsail content delivery network (CDN) distribution
   * forwards cookies to the origin and, if so, which ones.
   *
   * For the cookies that you specify, your distribution caches separate versions of the specified
   * content based on the cookie values in viewer requests.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * CookieObjectProperty cookieObjectProperty = CookieObjectProperty.builder()
   * .cookiesAllowList(List.of("cookiesAllowList"))
   * .option("option")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cookieobject.html)
   */
  public interface CookieObjectProperty {
    /**
     * The specific cookies to forward to your distribution's origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cookieobject.html#cfn-lightsail-distribution-cookieobject-cookiesallowlist)
     */
    public fun cookiesAllowList(): List<String> = unwrap(this).getCookiesAllowList() ?: emptyList()

    /**
     * Specifies which cookies to forward to the distribution's origin for a cache behavior.
     *
     * Use one of the following configurations for your distribution:
     *
     * * *`all`* - Forwards all cookies to your origin.
     * * *`none`* - Doesn’t forward cookies to your origin.
     * * *`allow-list`* - Forwards only the cookies that you specify using the `CookiesAllowList`
     * parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cookieobject.html#cfn-lightsail-distribution-cookieobject-option)
     */
    public fun option(): String? = unwrap(this).getOption()

    /**
     * A builder for [CookieObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookiesAllowList The specific cookies to forward to your distribution's origin.
       */
      public fun cookiesAllowList(cookiesAllowList: List<String>)

      /**
       * @param cookiesAllowList The specific cookies to forward to your distribution's origin.
       */
      public fun cookiesAllowList(vararg cookiesAllowList: String)

      /**
       * @param option Specifies which cookies to forward to the distribution's origin for a cache
       * behavior.
       * Use one of the following configurations for your distribution:
       *
       * * *`all`* - Forwards all cookies to your origin.
       * * *`none`* - Doesn’t forward cookies to your origin.
       * * *`allow-list`* - Forwards only the cookies that you specify using the `CookiesAllowList`
       * parameter.
       */
      public fun option(option: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty.builder()

      /**
       * @param cookiesAllowList The specific cookies to forward to your distribution's origin.
       */
      override fun cookiesAllowList(cookiesAllowList: List<String>) {
        cdkBuilder.cookiesAllowList(cookiesAllowList)
      }

      /**
       * @param cookiesAllowList The specific cookies to forward to your distribution's origin.
       */
      override fun cookiesAllowList(vararg cookiesAllowList: String): Unit =
          cookiesAllowList(cookiesAllowList.toList())

      /**
       * @param option Specifies which cookies to forward to the distribution's origin for a cache
       * behavior.
       * Use one of the following configurations for your distribution:
       *
       * * *`all`* - Forwards all cookies to your origin.
       * * *`none`* - Doesn’t forward cookies to your origin.
       * * *`allow-list`* - Forwards only the cookies that you specify using the `CookiesAllowList`
       * parameter.
       */
      override fun option(option: String) {
        cdkBuilder.option(option)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty,
    ) : CdkObject(cdkObject), CookieObjectProperty {
      /**
       * The specific cookies to forward to your distribution's origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cookieobject.html#cfn-lightsail-distribution-cookieobject-cookiesallowlist)
       */
      override fun cookiesAllowList(): List<String> = unwrap(this).getCookiesAllowList() ?:
          emptyList()

      /**
       * Specifies which cookies to forward to the distribution's origin for a cache behavior.
       *
       * Use one of the following configurations for your distribution:
       *
       * * *`all`* - Forwards all cookies to your origin.
       * * *`none`* - Doesn’t forward cookies to your origin.
       * * *`allow-list`* - Forwards only the cookies that you specify using the `CookiesAllowList`
       * parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cookieobject.html#cfn-lightsail-distribution-cookieobject-option)
       */
      override fun option(): String? = unwrap(this).getOption()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookieObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty):
          CookieObjectProperty = CdkObjectWrappers.wrap(cdkObject) as? CookieObjectProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookieObjectProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDistribution.CookieObjectProperty
    }
  }

  /**
   * `HeaderObject` is a property of the
   * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
   * property. It describes the request headers used by your distribution, which caches your content
   * based on the request headers.
   *
   * For the headers that you specify, your distribution caches separate versions of the specified
   * content based on the header values in viewer requests. For example, suppose that viewer requests
   * for logo.jpg contain a custom product header that has a value of either acme or apex. Also,
   * suppose that you configure your distribution to cache your content based on values in the product
   * header. Your distribution forwards the product header to the origin and caches the response from
   * the origin once for each header value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * HeaderObjectProperty headerObjectProperty = HeaderObjectProperty.builder()
   * .headersAllowList(List.of("headersAllowList"))
   * .option("option")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-headerobject.html)
   */
  public interface HeaderObjectProperty {
    /**
     * The specific headers to forward to your distribution's origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-headerobject.html#cfn-lightsail-distribution-headerobject-headersallowlist)
     */
    public fun headersAllowList(): List<String> = unwrap(this).getHeadersAllowList() ?: emptyList()

    /**
     * The headers that you want your distribution to forward to your origin.
     *
     * Your distribution caches your content based on these headers.
     *
     * Use one of the following configurations for your distribution:
     *
     * * *`all`* - Forwards all headers to your origin..
     * * *`none`* - Forwards only the default headers.
     * * *`allow-list`* - Forwards only the headers that you specify using the `HeadersAllowList`
     * parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-headerobject.html#cfn-lightsail-distribution-headerobject-option)
     */
    public fun option(): String? = unwrap(this).getOption()

    /**
     * A builder for [HeaderObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headersAllowList The specific headers to forward to your distribution's origin.
       */
      public fun headersAllowList(headersAllowList: List<String>)

      /**
       * @param headersAllowList The specific headers to forward to your distribution's origin.
       */
      public fun headersAllowList(vararg headersAllowList: String)

      /**
       * @param option The headers that you want your distribution to forward to your origin.
       * Your distribution caches your content based on these headers.
       *
       * Use one of the following configurations for your distribution:
       *
       * * *`all`* - Forwards all headers to your origin..
       * * *`none`* - Forwards only the default headers.
       * * *`allow-list`* - Forwards only the headers that you specify using the `HeadersAllowList`
       * parameter.
       */
      public fun option(option: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty.builder()

      /**
       * @param headersAllowList The specific headers to forward to your distribution's origin.
       */
      override fun headersAllowList(headersAllowList: List<String>) {
        cdkBuilder.headersAllowList(headersAllowList)
      }

      /**
       * @param headersAllowList The specific headers to forward to your distribution's origin.
       */
      override fun headersAllowList(vararg headersAllowList: String): Unit =
          headersAllowList(headersAllowList.toList())

      /**
       * @param option The headers that you want your distribution to forward to your origin.
       * Your distribution caches your content based on these headers.
       *
       * Use one of the following configurations for your distribution:
       *
       * * *`all`* - Forwards all headers to your origin..
       * * *`none`* - Forwards only the default headers.
       * * *`allow-list`* - Forwards only the headers that you specify using the `HeadersAllowList`
       * parameter.
       */
      override fun option(option: String) {
        cdkBuilder.option(option)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty,
    ) : CdkObject(cdkObject), HeaderObjectProperty {
      /**
       * The specific headers to forward to your distribution's origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-headerobject.html#cfn-lightsail-distribution-headerobject-headersallowlist)
       */
      override fun headersAllowList(): List<String> = unwrap(this).getHeadersAllowList() ?:
          emptyList()

      /**
       * The headers that you want your distribution to forward to your origin.
       *
       * Your distribution caches your content based on these headers.
       *
       * Use one of the following configurations for your distribution:
       *
       * * *`all`* - Forwards all headers to your origin..
       * * *`none`* - Forwards only the default headers.
       * * *`allow-list`* - Forwards only the headers that you specify using the `HeadersAllowList`
       * parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-headerobject.html#cfn-lightsail-distribution-headerobject-option)
       */
      override fun option(): String? = unwrap(this).getOption()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeaderObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty):
          HeaderObjectProperty = CdkObjectWrappers.wrap(cdkObject) as? HeaderObjectProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeaderObjectProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDistribution.HeaderObjectProperty
    }
  }

  /**
   * `CacheSettings` is a property of the
   * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
   * resource. It describes the cache settings of an Amazon Lightsail content delivery network (CDN)
   * distribution.
   *
   * These settings apply only to your distribution’s `CacheBehaviors` that have a `Behavior` of
   * `cache` . This includes the `DefaultCacheBehavior` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * CacheSettingsProperty cacheSettingsProperty = CacheSettingsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
   */
  public interface CacheSettingsProperty {
    /**
     * The HTTP methods that are processed and forwarded to the distribution's origin.
     *
     * You can specify the following options:
     *
     * * `GET,HEAD` - The distribution forwards the `GET` and `HEAD` methods.
     * * `GET,HEAD,OPTIONS` - The distribution forwards the `GET` , `HEAD` , and `OPTIONS` methods.
     * * `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` - The distribution forwards the `GET` , `HEAD` ,
     * `OPTIONS` , `PUT` , `PATCH` , `POST` , and `DELETE` methods.
     *
     * If you specify `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` , you might need to restrict access
     * to your distribution's origin so users can't perform operations that you don't want them to. For
     * example, you might not want users to have permission to delete objects from your origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-allowedhttpmethods)
     */
    public fun allowedHttpMethods(): String? = unwrap(this).getAllowedHttpMethods()

    /**
     * The HTTP method responses that are cached by your distribution.
     *
     * You can specify the following options:
     *
     * * `GET,HEAD` - The distribution caches responses to the `GET` and `HEAD` methods.
     * * `GET,HEAD,OPTIONS` - The distribution caches responses to the `GET` , `HEAD` , and
     * `OPTIONS` methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-cachedhttpmethods)
     */
    public fun cachedHttpMethods(): String? = unwrap(this).getCachedHttpMethods()

    /**
     * The default amount of time that objects stay in the distribution's cache before the
     * distribution forwards another request to the origin to determine whether the content has been
     * updated.
     *
     *
     * The value specified applies only when the origin does not add HTTP headers such as
     * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-defaultttl)
     */
    public fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

    /**
     * An object that describes the cookies that are forwarded to the origin.
     *
     * Your content is cached based on the cookies that are forwarded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-forwardedcookies)
     */
    public fun forwardedCookies(): Any? = unwrap(this).getForwardedCookies()

    /**
     * An object that describes the headers that are forwarded to the origin.
     *
     * Your content is cached based on the headers that are forwarded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-forwardedheaders)
     */
    public fun forwardedHeaders(): Any? = unwrap(this).getForwardedHeaders()

    /**
     * An object that describes the query strings that are forwarded to the origin.
     *
     * Your content is cached based on the query strings that are forwarded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-forwardedquerystrings)
     */
    public fun forwardedQueryStrings(): Any? = unwrap(this).getForwardedQueryStrings()

    /**
     * The maximum amount of time that objects stay in the distribution's cache before the
     * distribution forwards another request to the origin to determine whether the object has been
     * updated.
     *
     * The value specified applies only when the origin adds HTTP headers such as `Cache-Control
     * max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-maximumttl)
     */
    public fun maximumTtl(): Number? = unwrap(this).getMaximumTtl()

    /**
     * The minimum amount of time that objects stay in the distribution's cache before the
     * distribution forwards another request to the origin to determine whether the object has been
     * updated.
     *
     * A value of `0` must be specified for `minimumTTL` if the distribution is configured to
     * forward all headers to the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-minimumttl)
     */
    public fun minimumTtl(): Number? = unwrap(this).getMinimumTtl()

    /**
     * A builder for [CacheSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedHttpMethods The HTTP methods that are processed and forwarded to the
       * distribution's origin.
       * You can specify the following options:
       *
       * * `GET,HEAD` - The distribution forwards the `GET` and `HEAD` methods.
       * * `GET,HEAD,OPTIONS` - The distribution forwards the `GET` , `HEAD` , and `OPTIONS`
       * methods.
       * * `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` - The distribution forwards the `GET` , `HEAD` ,
       * `OPTIONS` , `PUT` , `PATCH` , `POST` , and `DELETE` methods.
       *
       * If you specify `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` , you might need to restrict access
       * to your distribution's origin so users can't perform operations that you don't want them to.
       * For example, you might not want users to have permission to delete objects from your origin.
       */
      public fun allowedHttpMethods(allowedHttpMethods: String)

      /**
       * @param cachedHttpMethods The HTTP method responses that are cached by your distribution.
       * You can specify the following options:
       *
       * * `GET,HEAD` - The distribution caches responses to the `GET` and `HEAD` methods.
       * * `GET,HEAD,OPTIONS` - The distribution caches responses to the `GET` , `HEAD` , and
       * `OPTIONS` methods.
       */
      public fun cachedHttpMethods(cachedHttpMethods: String)

      /**
       * @param defaultTtl The default amount of time that objects stay in the distribution's cache
       * before the distribution forwards another request to the origin to determine whether the
       * content has been updated.
       *
       * The value specified applies only when the origin does not add HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
       */
      public fun defaultTtl(defaultTtl: Number)

      /**
       * @param forwardedCookies An object that describes the cookies that are forwarded to the
       * origin.
       * Your content is cached based on the cookies that are forwarded.
       */
      public fun forwardedCookies(forwardedCookies: IResolvable)

      /**
       * @param forwardedCookies An object that describes the cookies that are forwarded to the
       * origin.
       * Your content is cached based on the cookies that are forwarded.
       */
      public fun forwardedCookies(forwardedCookies: CookieObjectProperty)

      /**
       * @param forwardedCookies An object that describes the cookies that are forwarded to the
       * origin.
       * Your content is cached based on the cookies that are forwarded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c922e547404c44d6e645910173c087833c3a63b46c3df390f032d632e93db26")
      public fun forwardedCookies(forwardedCookies: CookieObjectProperty.Builder.() -> Unit)

      /**
       * @param forwardedHeaders An object that describes the headers that are forwarded to the
       * origin.
       * Your content is cached based on the headers that are forwarded.
       */
      public fun forwardedHeaders(forwardedHeaders: IResolvable)

      /**
       * @param forwardedHeaders An object that describes the headers that are forwarded to the
       * origin.
       * Your content is cached based on the headers that are forwarded.
       */
      public fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty)

      /**
       * @param forwardedHeaders An object that describes the headers that are forwarded to the
       * origin.
       * Your content is cached based on the headers that are forwarded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c5e4bf40216dbcd990d823b98baa309d58f4960b0737400d37c0f8bf7963d8")
      public fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty.Builder.() -> Unit)

      /**
       * @param forwardedQueryStrings An object that describes the query strings that are forwarded
       * to the origin.
       * Your content is cached based on the query strings that are forwarded.
       */
      public fun forwardedQueryStrings(forwardedQueryStrings: IResolvable)

      /**
       * @param forwardedQueryStrings An object that describes the query strings that are forwarded
       * to the origin.
       * Your content is cached based on the query strings that are forwarded.
       */
      public fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty)

      /**
       * @param forwardedQueryStrings An object that describes the query strings that are forwarded
       * to the origin.
       * Your content is cached based on the query strings that are forwarded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cfe764aaa9a7c09e6074777153751f674301feab5a38748d2705ee804d4b307")
      public
          fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty.Builder.() -> Unit)

      /**
       * @param maximumTtl The maximum amount of time that objects stay in the distribution's cache
       * before the distribution forwards another request to the origin to determine whether the object
       * has been updated.
       * The value specified applies only when the origin adds HTTP headers such as `Cache-Control
       * max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
       */
      public fun maximumTtl(maximumTtl: Number)

      /**
       * @param minimumTtl The minimum amount of time that objects stay in the distribution's cache
       * before the distribution forwards another request to the origin to determine whether the object
       * has been updated.
       * A value of `0` must be specified for `minimumTTL` if the distribution is configured to
       * forward all headers to the origin.
       */
      public fun minimumTtl(minimumTtl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty.builder()

      /**
       * @param allowedHttpMethods The HTTP methods that are processed and forwarded to the
       * distribution's origin.
       * You can specify the following options:
       *
       * * `GET,HEAD` - The distribution forwards the `GET` and `HEAD` methods.
       * * `GET,HEAD,OPTIONS` - The distribution forwards the `GET` , `HEAD` , and `OPTIONS`
       * methods.
       * * `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` - The distribution forwards the `GET` , `HEAD` ,
       * `OPTIONS` , `PUT` , `PATCH` , `POST` , and `DELETE` methods.
       *
       * If you specify `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` , you might need to restrict access
       * to your distribution's origin so users can't perform operations that you don't want them to.
       * For example, you might not want users to have permission to delete objects from your origin.
       */
      override fun allowedHttpMethods(allowedHttpMethods: String) {
        cdkBuilder.allowedHttpMethods(allowedHttpMethods)
      }

      /**
       * @param cachedHttpMethods The HTTP method responses that are cached by your distribution.
       * You can specify the following options:
       *
       * * `GET,HEAD` - The distribution caches responses to the `GET` and `HEAD` methods.
       * * `GET,HEAD,OPTIONS` - The distribution caches responses to the `GET` , `HEAD` , and
       * `OPTIONS` methods.
       */
      override fun cachedHttpMethods(cachedHttpMethods: String) {
        cdkBuilder.cachedHttpMethods(cachedHttpMethods)
      }

      /**
       * @param defaultTtl The default amount of time that objects stay in the distribution's cache
       * before the distribution forwards another request to the origin to determine whether the
       * content has been updated.
       *
       * The value specified applies only when the origin does not add HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
       */
      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      /**
       * @param forwardedCookies An object that describes the cookies that are forwarded to the
       * origin.
       * Your content is cached based on the cookies that are forwarded.
       */
      override fun forwardedCookies(forwardedCookies: IResolvable) {
        cdkBuilder.forwardedCookies(forwardedCookies.let(IResolvable::unwrap))
      }

      /**
       * @param forwardedCookies An object that describes the cookies that are forwarded to the
       * origin.
       * Your content is cached based on the cookies that are forwarded.
       */
      override fun forwardedCookies(forwardedCookies: CookieObjectProperty) {
        cdkBuilder.forwardedCookies(forwardedCookies.let(CookieObjectProperty::unwrap))
      }

      /**
       * @param forwardedCookies An object that describes the cookies that are forwarded to the
       * origin.
       * Your content is cached based on the cookies that are forwarded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c922e547404c44d6e645910173c087833c3a63b46c3df390f032d632e93db26")
      override fun forwardedCookies(forwardedCookies: CookieObjectProperty.Builder.() -> Unit): Unit
          = forwardedCookies(CookieObjectProperty(forwardedCookies))

      /**
       * @param forwardedHeaders An object that describes the headers that are forwarded to the
       * origin.
       * Your content is cached based on the headers that are forwarded.
       */
      override fun forwardedHeaders(forwardedHeaders: IResolvable) {
        cdkBuilder.forwardedHeaders(forwardedHeaders.let(IResolvable::unwrap))
      }

      /**
       * @param forwardedHeaders An object that describes the headers that are forwarded to the
       * origin.
       * Your content is cached based on the headers that are forwarded.
       */
      override fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty) {
        cdkBuilder.forwardedHeaders(forwardedHeaders.let(HeaderObjectProperty::unwrap))
      }

      /**
       * @param forwardedHeaders An object that describes the headers that are forwarded to the
       * origin.
       * Your content is cached based on the headers that are forwarded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c5e4bf40216dbcd990d823b98baa309d58f4960b0737400d37c0f8bf7963d8")
      override fun forwardedHeaders(forwardedHeaders: HeaderObjectProperty.Builder.() -> Unit): Unit
          = forwardedHeaders(HeaderObjectProperty(forwardedHeaders))

      /**
       * @param forwardedQueryStrings An object that describes the query strings that are forwarded
       * to the origin.
       * Your content is cached based on the query strings that are forwarded.
       */
      override fun forwardedQueryStrings(forwardedQueryStrings: IResolvable) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings.let(IResolvable::unwrap))
      }

      /**
       * @param forwardedQueryStrings An object that describes the query strings that are forwarded
       * to the origin.
       * Your content is cached based on the query strings that are forwarded.
       */
      override fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty) {
        cdkBuilder.forwardedQueryStrings(forwardedQueryStrings.let(QueryStringObjectProperty::unwrap))
      }

      /**
       * @param forwardedQueryStrings An object that describes the query strings that are forwarded
       * to the origin.
       * Your content is cached based on the query strings that are forwarded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cfe764aaa9a7c09e6074777153751f674301feab5a38748d2705ee804d4b307")
      override
          fun forwardedQueryStrings(forwardedQueryStrings: QueryStringObjectProperty.Builder.() -> Unit):
          Unit = forwardedQueryStrings(QueryStringObjectProperty(forwardedQueryStrings))

      /**
       * @param maximumTtl The maximum amount of time that objects stay in the distribution's cache
       * before the distribution forwards another request to the origin to determine whether the object
       * has been updated.
       * The value specified applies only when the origin adds HTTP headers such as `Cache-Control
       * max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
       */
      override fun maximumTtl(maximumTtl: Number) {
        cdkBuilder.maximumTtl(maximumTtl)
      }

      /**
       * @param minimumTtl The minimum amount of time that objects stay in the distribution's cache
       * before the distribution forwards another request to the origin to determine whether the object
       * has been updated.
       * A value of `0` must be specified for `minimumTTL` if the distribution is configured to
       * forward all headers to the origin.
       */
      override fun minimumTtl(minimumTtl: Number) {
        cdkBuilder.minimumTtl(minimumTtl)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty,
    ) : CdkObject(cdkObject), CacheSettingsProperty {
      /**
       * The HTTP methods that are processed and forwarded to the distribution's origin.
       *
       * You can specify the following options:
       *
       * * `GET,HEAD` - The distribution forwards the `GET` and `HEAD` methods.
       * * `GET,HEAD,OPTIONS` - The distribution forwards the `GET` , `HEAD` , and `OPTIONS`
       * methods.
       * * `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` - The distribution forwards the `GET` , `HEAD` ,
       * `OPTIONS` , `PUT` , `PATCH` , `POST` , and `DELETE` methods.
       *
       * If you specify `GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE` , you might need to restrict access
       * to your distribution's origin so users can't perform operations that you don't want them to.
       * For example, you might not want users to have permission to delete objects from your origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-allowedhttpmethods)
       */
      override fun allowedHttpMethods(): String? = unwrap(this).getAllowedHttpMethods()

      /**
       * The HTTP method responses that are cached by your distribution.
       *
       * You can specify the following options:
       *
       * * `GET,HEAD` - The distribution caches responses to the `GET` and `HEAD` methods.
       * * `GET,HEAD,OPTIONS` - The distribution caches responses to the `GET` , `HEAD` , and
       * `OPTIONS` methods.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-cachedhttpmethods)
       */
      override fun cachedHttpMethods(): String? = unwrap(this).getCachedHttpMethods()

      /**
       * The default amount of time that objects stay in the distribution's cache before the
       * distribution forwards another request to the origin to determine whether the content has been
       * updated.
       *
       *
       * The value specified applies only when the origin does not add HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-defaultttl)
       */
      override fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

      /**
       * An object that describes the cookies that are forwarded to the origin.
       *
       * Your content is cached based on the cookies that are forwarded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-forwardedcookies)
       */
      override fun forwardedCookies(): Any? = unwrap(this).getForwardedCookies()

      /**
       * An object that describes the headers that are forwarded to the origin.
       *
       * Your content is cached based on the headers that are forwarded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-forwardedheaders)
       */
      override fun forwardedHeaders(): Any? = unwrap(this).getForwardedHeaders()

      /**
       * An object that describes the query strings that are forwarded to the origin.
       *
       * Your content is cached based on the query strings that are forwarded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-forwardedquerystrings)
       */
      override fun forwardedQueryStrings(): Any? = unwrap(this).getForwardedQueryStrings()

      /**
       * The maximum amount of time that objects stay in the distribution's cache before the
       * distribution forwards another request to the origin to determine whether the object has been
       * updated.
       *
       * The value specified applies only when the origin adds HTTP headers such as `Cache-Control
       * max-age` , `Cache-Control s-maxage` , and `Expires` to objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-maximumttl)
       */
      override fun maximumTtl(): Number? = unwrap(this).getMaximumTtl()

      /**
       * The minimum amount of time that objects stay in the distribution's cache before the
       * distribution forwards another request to the origin to determine whether the object has been
       * updated.
       *
       * A value of `0` must be specified for `minimumTTL` if the distribution is configured to
       * forward all headers to the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html#cfn-lightsail-distribution-cachesettings-minimumttl)
       */
      override fun minimumTtl(): Number? = unwrap(this).getMinimumTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CacheSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty):
          CacheSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? CacheSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheSettingsProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheSettingsProperty
    }
  }

  /**
   * `InputOrigin` is a property of the
   * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
   * resource. It describes the origin resource of an Amazon Lightsail content delivery network (CDN)
   * distribution.
   *
   * An origin can be a instance, bucket, or load balancer. A distribution pulls content from an
   * origin, caches it, and serves it to viewers through a worldwide network of edge servers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * InputOriginProperty inputOriginProperty = InputOriginProperty.builder()
   * .name("name")
   * .protocolPolicy("protocolPolicy")
   * .regionName("regionName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html)
   */
  public interface InputOriginProperty {
    /**
     * The name of the origin resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html#cfn-lightsail-distribution-inputorigin-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The protocol that your Amazon Lightsail distribution uses when establishing a connection with
     * your origin to pull content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html#cfn-lightsail-distribution-inputorigin-protocolpolicy)
     */
    public fun protocolPolicy(): String? = unwrap(this).getProtocolPolicy()

    /**
     * The AWS Region name of the origin resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html#cfn-lightsail-distribution-inputorigin-regionname)
     */
    public fun regionName(): String? = unwrap(this).getRegionName()

    /**
     * A builder for [InputOriginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the origin resource.
       */
      public fun name(name: String)

      /**
       * @param protocolPolicy The protocol that your Amazon Lightsail distribution uses when
       * establishing a connection with your origin to pull content.
       */
      public fun protocolPolicy(protocolPolicy: String)

      /**
       * @param regionName The AWS Region name of the origin resource.
       */
      public fun regionName(regionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty.builder()

      /**
       * @param name The name of the origin resource.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param protocolPolicy The protocol that your Amazon Lightsail distribution uses when
       * establishing a connection with your origin to pull content.
       */
      override fun protocolPolicy(protocolPolicy: String) {
        cdkBuilder.protocolPolicy(protocolPolicy)
      }

      /**
       * @param regionName The AWS Region name of the origin resource.
       */
      override fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty,
    ) : CdkObject(cdkObject), InputOriginProperty {
      /**
       * The name of the origin resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html#cfn-lightsail-distribution-inputorigin-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The protocol that your Amazon Lightsail distribution uses when establishing a connection
       * with your origin to pull content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html#cfn-lightsail-distribution-inputorigin-protocolpolicy)
       */
      override fun protocolPolicy(): String? = unwrap(this).getProtocolPolicy()

      /**
       * The AWS Region name of the origin resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-inputorigin.html#cfn-lightsail-distribution-inputorigin-regionname)
       */
      override fun regionName(): String? = unwrap(this).getRegionName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputOriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty):
          InputOriginProperty = CdkObjectWrappers.wrap(cdkObject) as? InputOriginProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputOriginProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDistribution.InputOriginProperty
    }
  }

  /**
   * `QueryStringObject` is a property of the
   * [CacheSettings](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachesettings.html)
   * property. It describes the query string parameters that an Amazon Lightsail content delivery
   * network (CDN) distribution to bases caching on.
   *
   * For the query strings that you specify, your distribution caches separate versions of the
   * specified content based on the query string values in viewer requests.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * QueryStringObjectProperty queryStringObjectProperty = QueryStringObjectProperty.builder()
   * .option(false)
   * .queryStringsAllowList(List.of("queryStringsAllowList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-querystringobject.html)
   */
  public interface QueryStringObjectProperty {
    /**
     * Indicates whether the distribution forwards and caches based on query strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-querystringobject.html#cfn-lightsail-distribution-querystringobject-option)
     */
    public fun option(): Any? = unwrap(this).getOption()

    /**
     * The specific query strings that the distribution forwards to the origin.
     *
     * Your distribution caches content based on the specified query strings.
     *
     * If the `option` parameter is true, then your distribution forwards all query strings,
     * regardless of what you specify using the `QueryStringsAllowList` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-querystringobject.html#cfn-lightsail-distribution-querystringobject-querystringsallowlist)
     */
    public fun queryStringsAllowList(): List<String> = unwrap(this).getQueryStringsAllowList() ?:
        emptyList()

    /**
     * A builder for [QueryStringObjectProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param option Indicates whether the distribution forwards and caches based on query
       * strings.
       */
      public fun option(option: Boolean)

      /**
       * @param option Indicates whether the distribution forwards and caches based on query
       * strings.
       */
      public fun option(option: IResolvable)

      /**
       * @param queryStringsAllowList The specific query strings that the distribution forwards to
       * the origin.
       * Your distribution caches content based on the specified query strings.
       *
       * If the `option` parameter is true, then your distribution forwards all query strings,
       * regardless of what you specify using the `QueryStringsAllowList` parameter.
       */
      public fun queryStringsAllowList(queryStringsAllowList: List<String>)

      /**
       * @param queryStringsAllowList The specific query strings that the distribution forwards to
       * the origin.
       * Your distribution caches content based on the specified query strings.
       *
       * If the `option` parameter is true, then your distribution forwards all query strings,
       * regardless of what you specify using the `QueryStringsAllowList` parameter.
       */
      public fun queryStringsAllowList(vararg queryStringsAllowList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty.builder()

      /**
       * @param option Indicates whether the distribution forwards and caches based on query
       * strings.
       */
      override fun option(option: Boolean) {
        cdkBuilder.option(option)
      }

      /**
       * @param option Indicates whether the distribution forwards and caches based on query
       * strings.
       */
      override fun option(option: IResolvable) {
        cdkBuilder.option(option.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringsAllowList The specific query strings that the distribution forwards to
       * the origin.
       * Your distribution caches content based on the specified query strings.
       *
       * If the `option` parameter is true, then your distribution forwards all query strings,
       * regardless of what you specify using the `QueryStringsAllowList` parameter.
       */
      override fun queryStringsAllowList(queryStringsAllowList: List<String>) {
        cdkBuilder.queryStringsAllowList(queryStringsAllowList)
      }

      /**
       * @param queryStringsAllowList The specific query strings that the distribution forwards to
       * the origin.
       * Your distribution caches content based on the specified query strings.
       *
       * If the `option` parameter is true, then your distribution forwards all query strings,
       * regardless of what you specify using the `QueryStringsAllowList` parameter.
       */
      override fun queryStringsAllowList(vararg queryStringsAllowList: String): Unit =
          queryStringsAllowList(queryStringsAllowList.toList())

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty,
    ) : CdkObject(cdkObject), QueryStringObjectProperty {
      /**
       * Indicates whether the distribution forwards and caches based on query strings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-querystringobject.html#cfn-lightsail-distribution-querystringobject-option)
       */
      override fun option(): Any? = unwrap(this).getOption()

      /**
       * The specific query strings that the distribution forwards to the origin.
       *
       * Your distribution caches content based on the specified query strings.
       *
       * If the `option` parameter is true, then your distribution forwards all query strings,
       * regardless of what you specify using the `QueryStringsAllowList` parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-querystringobject.html#cfn-lightsail-distribution-querystringobject-querystringsallowlist)
       */
      override fun queryStringsAllowList(): List<String> = unwrap(this).getQueryStringsAllowList()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty):
          QueryStringObjectProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryStringObjectProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringObjectProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDistribution.QueryStringObjectProperty
    }
  }

  /**
   * `CacheBehaviorPerPath` is a property of the
   * [AWS::Lightsail::Distribution](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-distribution.html)
   * resource. It describes the per-path cache behavior of an Amazon Lightsail content delivery network
   * (CDN) distribution.
   *
   * Use a per-path cache behavior to override the default cache behavior of a distribution, or to
   * add an exception to it. For example, if you set the `CacheBehavior` to `cache` , you can use a
   * per-path cache behavior to specify a directory, file, or file type that your distribution will
   * cache. If you don’t want your distribution to cache a specified directory, file, or file type, set
   * the per-path cache behavior to `dont-cache` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lightsail.*;
   * CacheBehaviorPerPathProperty cacheBehaviorPerPathProperty =
   * CacheBehaviorPerPathProperty.builder()
   * .behavior("behavior")
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehaviorperpath.html)
   */
  public interface CacheBehaviorPerPathProperty {
    /**
     * The cache behavior for the specified path.
     *
     * You can specify one of the following per-path cache behaviors:
     *
     * * *`cache`* - This behavior caches the specified path.
     * * *`dont-cache`* - This behavior doesn't cache the specified path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehaviorperpath.html#cfn-lightsail-distribution-cachebehaviorperpath-behavior)
     */
    public fun behavior(): String? = unwrap(this).getBehavior()

    /**
     * The path to a directory or file to cache, or not cache.
     *
     * Use an asterisk symbol to specify wildcard directories ( `path/to/assets/ *` ), and file
     * types ( `*.html` , `*jpg` , `*js` ). Directories and file paths are case-sensitive.
     *
     * Examples:
     *
     * * Specify the following to cache all files in the document root of an Apache web server
     * running on a instance.
     *
     * `var/www/html/`
     *
     * * Specify the following file to cache only the index page in the document root of an Apache
     * web server.
     *
     * `var/www/html/index.html`
     *
     * * Specify the following to cache only the .html files in the document root of an Apache web
     * server.
     *
     * `var/www/html/ *.html`
     *
     * * Specify the following to cache only the .jpg, .png, and .gif files in the images
     * sub-directory of the document root of an Apache web server.
     *
     * `var/www/html/images/ *.jpg`
     *
     * `var/www/html/images/ *.png`
     *
     * `var/www/html/images/ *.gif`
     *
     * Specify the following to cache all files in the images subdirectory of the document root of
     * an Apache web server.
     *
     * `var/www/html/images/`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehaviorperpath.html#cfn-lightsail-distribution-cachebehaviorperpath-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [CacheBehaviorPerPathProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param behavior The cache behavior for the specified path.
       * You can specify one of the following per-path cache behaviors:
       *
       * * *`cache`* - This behavior caches the specified path.
       * * *`dont-cache`* - This behavior doesn't cache the specified path.
       */
      public fun behavior(behavior: String)

      /**
       * @param path The path to a directory or file to cache, or not cache.
       * Use an asterisk symbol to specify wildcard directories ( `path/to/assets/ *` ), and file
       * types ( `*.html` , `*jpg` , `*js` ). Directories and file paths are case-sensitive.
       *
       * Examples:
       *
       * * Specify the following to cache all files in the document root of an Apache web server
       * running on a instance.
       *
       * `var/www/html/`
       *
       * * Specify the following file to cache only the index page in the document root of an Apache
       * web server.
       *
       * `var/www/html/index.html`
       *
       * * Specify the following to cache only the .html files in the document root of an Apache web
       * server.
       *
       * `var/www/html/ *.html`
       *
       * * Specify the following to cache only the .jpg, .png, and .gif files in the images
       * sub-directory of the document root of an Apache web server.
       *
       * `var/www/html/images/ *.jpg`
       *
       * `var/www/html/images/ *.png`
       *
       * `var/www/html/images/ *.gif`
       *
       * Specify the following to cache all files in the images subdirectory of the document root of
       * an Apache web server.
       *
       * `var/www/html/images/`
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty.builder()

      /**
       * @param behavior The cache behavior for the specified path.
       * You can specify one of the following per-path cache behaviors:
       *
       * * *`cache`* - This behavior caches the specified path.
       * * *`dont-cache`* - This behavior doesn't cache the specified path.
       */
      override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      /**
       * @param path The path to a directory or file to cache, or not cache.
       * Use an asterisk symbol to specify wildcard directories ( `path/to/assets/ *` ), and file
       * types ( `*.html` , `*jpg` , `*js` ). Directories and file paths are case-sensitive.
       *
       * Examples:
       *
       * * Specify the following to cache all files in the document root of an Apache web server
       * running on a instance.
       *
       * `var/www/html/`
       *
       * * Specify the following file to cache only the index page in the document root of an Apache
       * web server.
       *
       * `var/www/html/index.html`
       *
       * * Specify the following to cache only the .html files in the document root of an Apache web
       * server.
       *
       * `var/www/html/ *.html`
       *
       * * Specify the following to cache only the .jpg, .png, and .gif files in the images
       * sub-directory of the document root of an Apache web server.
       *
       * `var/www/html/images/ *.jpg`
       *
       * `var/www/html/images/ *.png`
       *
       * `var/www/html/images/ *.gif`
       *
       * Specify the following to cache all files in the images subdirectory of the document root of
       * an Apache web server.
       *
       * `var/www/html/images/`
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty,
    ) : CdkObject(cdkObject), CacheBehaviorPerPathProperty {
      /**
       * The cache behavior for the specified path.
       *
       * You can specify one of the following per-path cache behaviors:
       *
       * * *`cache`* - This behavior caches the specified path.
       * * *`dont-cache`* - This behavior doesn't cache the specified path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehaviorperpath.html#cfn-lightsail-distribution-cachebehaviorperpath-behavior)
       */
      override fun behavior(): String? = unwrap(this).getBehavior()

      /**
       * The path to a directory or file to cache, or not cache.
       *
       * Use an asterisk symbol to specify wildcard directories ( `path/to/assets/ *` ), and file
       * types ( `*.html` , `*jpg` , `*js` ). Directories and file paths are case-sensitive.
       *
       * Examples:
       *
       * * Specify the following to cache all files in the document root of an Apache web server
       * running on a instance.
       *
       * `var/www/html/`
       *
       * * Specify the following file to cache only the index page in the document root of an Apache
       * web server.
       *
       * `var/www/html/index.html`
       *
       * * Specify the following to cache only the .html files in the document root of an Apache web
       * server.
       *
       * `var/www/html/ *.html`
       *
       * * Specify the following to cache only the .jpg, .png, and .gif files in the images
       * sub-directory of the document root of an Apache web server.
       *
       * `var/www/html/images/ *.jpg`
       *
       * `var/www/html/images/ *.png`
       *
       * `var/www/html/images/ *.gif`
       *
       * Specify the following to cache all files in the images subdirectory of the document root of
       * an Apache web server.
       *
       * `var/www/html/images/`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-distribution-cachebehaviorperpath.html#cfn-lightsail-distribution-cachebehaviorperpath-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CacheBehaviorPerPathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty):
          CacheBehaviorPerPathProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CacheBehaviorPerPathProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheBehaviorPerPathProperty):
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDistribution.CacheBehaviorPerPathProperty
    }
  }
}
