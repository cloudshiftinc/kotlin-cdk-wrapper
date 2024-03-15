@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * A distribution tells CloudFront where you want content to be delivered from, and the details
 * about how to track and manage content delivery.
 *
 * Example:
 *
 * ```
 * Bucket sourceBucket;
 * Distribution myDistribution = Distribution.Builder.create(this, "MyCfWebDistribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(sourceBucket))
 * .build())
 * .build();
 * CfnDistribution cfnDistribution = (CfnDistribution)myDistribution.getNode().getDefaultChild();
 * cfnDistribution.overrideLogicalId("MyDistributionCFDistribution3H55TI9Q");
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
 */
public open class CfnDistribution internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The domain name of the resource, such as `d111111abcdef8.cloudfront.net` .
   */
  public open fun attrDomainName(): String = unwrap(this).getAttrDomainName()

  /**
   * The distribution's identifier.
   *
   * For example: `E1U5RQF7T870K0` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The distribution's configuration.
   */
  public open fun distributionConfig(): Any = unwrap(this).getDistributionConfig()

  /**
   * The distribution's configuration.
   */
  public open fun distributionConfig(`value`: IResolvable) {
    unwrap(this).setDistributionConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The distribution's configuration.
   */
  public open fun distributionConfig(`value`: DistributionConfigProperty) {
    unwrap(this).setDistributionConfig(`value`.let(DistributionConfigProperty::unwrap))
  }

  /**
   * The distribution's configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a17803164ac2e5598e9c6f00f7ebf3b4664351f46f27e875374b470737905e35")
  public open fun distributionConfig(`value`: DistributionConfigProperty.Builder.() -> Unit): Unit =
      distributionConfig(DistributionConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A complex type that contains zero or more `Tag` elements.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnDistribution].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     * @param distributionConfig The distribution's configuration. 
     */
    public fun distributionConfig(distributionConfig: IResolvable)

    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     * @param distributionConfig The distribution's configuration. 
     */
    public fun distributionConfig(distributionConfig: DistributionConfigProperty)

    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     * @param distributionConfig The distribution's configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e379aee3bd221f987c8405b941cbd20ab829a4fddd8b607816a784e31c131113")
    public fun distributionConfig(distributionConfig: DistributionConfigProperty.Builder.() -> Unit)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnDistribution.Builder =
        software.amazon.awscdk.services.cloudfront.CfnDistribution.Builder.create(scope, id)

    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     * @param distributionConfig The distribution's configuration. 
     */
    override fun distributionConfig(distributionConfig: IResolvable) {
      cdkBuilder.distributionConfig(distributionConfig.let(IResolvable::unwrap))
    }

    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     * @param distributionConfig The distribution's configuration. 
     */
    override fun distributionConfig(distributionConfig: DistributionConfigProperty) {
      cdkBuilder.distributionConfig(distributionConfig.let(DistributionConfigProperty::unwrap))
    }

    /**
     * The distribution's configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-distributionconfig)
     * @param distributionConfig The distribution's configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e379aee3bd221f987c8405b941cbd20ab829a4fddd8b607816a784e31c131113")
    override
        fun distributionConfig(distributionConfig: DistributionConfigProperty.Builder.() -> Unit):
        Unit = distributionConfig(DistributionConfigProperty(distributionConfig))

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html#cfn-cloudfront-distribution-tags)
     * @param tags A complex type that contains zero or more `Tag` elements. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnDistribution.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDistribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDistribution(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution):
        CfnDistribution = CfnDistribution(cdkObject)

    internal fun unwrap(wrapped: CfnDistribution):
        software.amazon.awscdk.services.cloudfront.CfnDistribution = wrapped.cdkObject
  }

  /**
   * A complex type that describes the default cache behavior if you don't specify a `CacheBehavior`
   * element or if request URLs don't match any of the values of `PathPattern` in `CacheBehavior`
   * elements.
   *
   * You must create exactly one default cache behavior.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * DefaultCacheBehaviorProperty defaultCacheBehaviorProperty =
   * DefaultCacheBehaviorProperty.builder()
   * .targetOriginId("targetOriginId")
   * .viewerProtocolPolicy("viewerProtocolPolicy")
   * // the properties below are optional
   * .allowedMethods(List.of("allowedMethods"))
   * .cachedMethods(List.of("cachedMethods"))
   * .cachePolicyId("cachePolicyId")
   * .compress(false)
   * .defaultTtl(123)
   * .fieldLevelEncryptionId("fieldLevelEncryptionId")
   * .forwardedValues(ForwardedValuesProperty.builder()
   * .queryString(false)
   * // the properties below are optional
   * .cookies(CookiesProperty.builder()
   * .forward("forward")
   * // the properties below are optional
   * .whitelistedNames(List.of("whitelistedNames"))
   * .build())
   * .headers(List.of("headers"))
   * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
   * .build())
   * .functionAssociations(List.of(FunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .functionArn("functionArn")
   * .build()))
   * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .includeBody(false)
   * .lambdaFunctionArn("lambdaFunctionArn")
   * .build()))
   * .maxTtl(123)
   * .minTtl(123)
   * .originRequestPolicyId("originRequestPolicyId")
   * .realtimeLogConfigArn("realtimeLogConfigArn")
   * .responseHeadersPolicyId("responseHeadersPolicyId")
   * .smoothStreaming(false)
   * .trustedKeyGroups(List.of("trustedKeyGroups"))
   * .trustedSigners(List.of("trustedSigners"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html)
   */
  public interface DefaultCacheBehaviorProperty {
    /**
     * A complex type that controls which HTTP methods CloudFront processes and forwards to your
     * Amazon S3 bucket or your custom origin.
     *
     * There are three choices:
     *
     * * CloudFront forwards only `GET` and `HEAD` requests.
     * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
     * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
     *
     * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to
     * your custom origin so users can't perform operations that you don't want them to. For example,
     * you might not want users to have permissions to delete objects from your origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods)
     */
    public fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

    /**
     * The unique identifier of the cache policy that is attached to the default cache behavior.
     *
     * For more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
     * recommend that you use a `CachePolicyId` .
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachepolicyid)
     */
    public fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

    /**
     * A complex type that controls whether CloudFront caches the response to requests using the
     * specified HTTP methods.
     *
     * There are two choices:
     *
     * * CloudFront caches responses to `GET` and `HEAD` requests.
     * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
     *
     * If you pick the second choice for your Amazon S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
     * responses to be cached correctly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods)
     */
    public fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

    /**
     * Whether you want CloudFront to automatically compress certain files for this cache behavior.
     *
     * If so, specify `true` ; if not, specify `false` . For more information, see [Serving
     * Compressed
     * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress)
     */
    public fun compress(): Any? = unwrap(this).getCompress()

    /**
     * This field is deprecated.
     *
     * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field. For
     * more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The default amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. The value that you specify applies only when your origin does not add HTTP headers such
     * as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
     * information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - 86400
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl)
     */
    public fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

    /**
     * The value of `ID` for the field-level encryption configuration that you want CloudFront to
     * use for encrypting specific fields of data for the default cache behavior.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid)
     */
    public fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     * For more information, see [Working with
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to include values in the cache key, use a cache policy. For more information, see
     * [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send values to the origin but not include them in the cache key, use an origin
     * request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * or [Using the managed origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
     * recommend that you use a `CachePolicyId` .
     *
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
     * headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-forwardedvalues)
     */
    public fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

    /**
     * A list of CloudFront functions that are associated with this cache behavior.
     *
     * Your functions must be published to the `LIVE` stage to associate them with a cache behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-functionassociations)
     */
    public fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

    /**
     * A complex type that contains zero or more Lambda&#64;Edge function associations for a cache
     * behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations)
     */
    public fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

    /**
     * This field is deprecated.
     *
     * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
     * more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The maximum amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. The value that you specify applies only when your origin adds HTTP headers such as
     * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
     * information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - 31536000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl)
     */
    public fun maxTtl(): Number? = unwrap(this).getMaxTtl()

    /**
     * This field is deprecated.
     *
     * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
     * more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The minimum amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to your
     * origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl)
     */
    public fun minTtl(): Number? = unwrap(this).getMinTtl()

    /**
     * The unique identifier of the origin request policy that is attached to the default cache
     * behavior.
     *
     * For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * or [Using the managed origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-originrequestpolicyid)
     */
    public fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

    /**
     * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this
     * cache behavior.
     *
     * For more information, see [Real-time
     * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html) in
     * the *Amazon CloudFront Developer Guide* .
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-realtimelogconfigarn)
     */
    public fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

    /**
     * The identifier for a response headers policy.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-responseheaderspolicyid)
     */
    public fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

    /**
     * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format
     * using the origin that is associated with this cache behavior.
     *
     * If so, specify `true` ; if not, specify `false` . If you specify `true` for `SmoothStreaming`
     * , you can still distribute other content using this cache behavior if the content matches the
     * value of `PathPattern` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming)
     */
    public fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

    /**
     * The value of `ID` for the origin that you want CloudFront to route requests to when they use
     * the default cache behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid)
     */
    public fun targetOriginId(): String

    /**
     * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
     *
     * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed
     * cookies for all requests that match the cache behavior. The URLs or cookies must be signed with
     * a private key whose corresponding public key is in the key group. The signed URL or cookie
     * contains information about which public key CloudFront should use to verify the signature. For
     * more information, see [Serving private
     * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedkeygroups)
     */
    public fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?: emptyList()

    /**
     * We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
     *
     * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
     * signed cookies.
     *
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
     * cookies for all requests that match the cache behavior. The URLs or cookies must be signed with
     * the private key of a CloudFront key pair in a trusted signer's AWS account . The signed URL or
     * cookie contains information about which public key CloudFront should use to verify the
     * signature. For more information, see [Serving private
     * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners)
     */
    public fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

    /**
     * The protocol that viewers can use to access the files in the origin specified by
     * `TargetOriginId` when a request matches the path pattern in `PathPattern` .
     *
     * You can specify the following options:
     *
     * * `allow-all` : Viewers can use HTTP or HTTPS.
     * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
     * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
     * resubmits the request using the new URL.
     * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code of
     * 403 (Forbidden).
     *
     * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between Viewers
     * and
     * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     *
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin
     * using HTTPS is never to use any other protocol to fetch the object. If you have recently changed
     * from HTTP to HTTPS, we recommend that you clear your objects' cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object from the cache
     * regardless of whether the current request protocol matches the protocol used previously. For
     * more information, see [Managing Cache
     * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy)
     */
    public fun viewerProtocolPolicy(): String

    /**
     * A builder for [DefaultCacheBehaviorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      public fun allowedMethods(allowedMethods: List<String>)

      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      public fun allowedMethods(vararg allowedMethods: String)

      /**
       * @param cachePolicyId The unique identifier of the cache policy that is attached to the
       * default cache behavior.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       */
      public fun cachePolicyId(cachePolicyId: String)

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      public fun cachedMethods(cachedMethods: List<String>)

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      public fun cachedMethods(vararg cachedMethods: String)

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify `true` ; if not, specify `false` . For more information, see [Serving
       * Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun compress(compress: Boolean)

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify `true` ; if not, specify `false` . For more information, see [Serving
       * Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun compress(compress: IResolvable)

      /**
       * @param defaultTtl This field is deprecated.
       * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin does not add HTTP headers
       * such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For
       * more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun defaultTtl(defaultTtl: Number)

      /**
       * @param fieldLevelEncryptionId The value of `ID` for the field-level encryption
       * configuration that you want CloudFront to use for encrypting specific fields of data for the
       * default cache behavior.
       */
      public fun fieldLevelEncryptionId(fieldLevelEncryptionId: String)

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      public fun forwardedValues(forwardedValues: IResolvable)

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      public fun forwardedValues(forwardedValues: ForwardedValuesProperty)

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f8ad03cda9ea3bdabbeb32d3f74dfffacbde0f8cb9bae3862a79e5b38d9b2e")
      public fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit)

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * Your functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      public fun functionAssociations(functionAssociations: IResolvable)

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * Your functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      public fun functionAssociations(functionAssociations: List<Any>)

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * Your functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      public fun functionAssociations(vararg functionAssociations: Any)

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable)

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>)

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      public fun lambdaFunctionAssociations(vararg lambdaFunctionAssociations: Any)

      /**
       * @param maxTtl This field is deprecated.
       * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The maximum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin adds HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
       * information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun maxTtl(maxTtl: Number)

      /**
       * @param minTtl This field is deprecated.
       * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The minimum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to
       * your origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
       */
      public fun minTtl(minTtl: Number)

      /**
       * @param originRequestPolicyId The unique identifier of the origin request policy that is
       * attached to the default cache behavior.
       * For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originRequestPolicyId(originRequestPolicyId: String)

      /**
       * @param realtimeLogConfigArn The Amazon Resource Name (ARN) of the real-time log
       * configuration that is attached to this cache behavior.
       * For more information, see [Real-time
       * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun realtimeLogConfigArn(realtimeLogConfigArn: String)

      /**
       * @param responseHeadersPolicyId The identifier for a response headers policy.
       */
      public fun responseHeadersPolicyId(responseHeadersPolicyId: String)

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      public fun smoothStreaming(smoothStreaming: Boolean)

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      public fun smoothStreaming(smoothStreaming: IResolvable)

      /**
       * @param targetOriginId The value of `ID` for the origin that you want CloudFront to route
       * requests to when they use the default cache behavior. 
       */
      public fun targetOriginId(targetOriginId: String)

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedKeyGroups(trustedKeyGroups: List<String>)

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedKeyGroups(vararg trustedKeyGroups: String)

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in a trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedSigners(trustedSigners: List<String>)

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in a trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedSigners(vararg trustedSigners: String)

      /**
       * @param viewerProtocolPolicy The protocol that viewers can use to access the files in the
       * origin specified by `TargetOriginId` when a request matches the path pattern in `PathPattern`
       * . 
       * You can specify the following options:
       *
       * * `allow-all` : Viewers can use HTTP or HTTPS.
       * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
       * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
       * resubmits the request using the new URL.
       * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code
       * of 403 (Forbidden).
       *
       * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between
       * Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * The only way to guarantee that viewers retrieve an object that was fetched from the origin
       * using HTTPS is never to use any other protocol to fetch the object. If you have recently
       * changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached
       * objects are protocol agnostic. That means that an edge location will return an object from the
       * cache regardless of whether the current request protocol matches the protocol used previously.
       * For more information, see [Managing Cache
       * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun viewerProtocolPolicy(viewerProtocolPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty.builder()

      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      override fun allowedMethods(allowedMethods: List<String>) {
        cdkBuilder.allowedMethods(allowedMethods)
      }

      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      override fun allowedMethods(vararg allowedMethods: String): Unit =
          allowedMethods(allowedMethods.toList())

      /**
       * @param cachePolicyId The unique identifier of the cache policy that is attached to the
       * default cache behavior.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       */
      override fun cachePolicyId(cachePolicyId: String) {
        cdkBuilder.cachePolicyId(cachePolicyId)
      }

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      override fun cachedMethods(cachedMethods: List<String>) {
        cdkBuilder.cachedMethods(cachedMethods)
      }

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      override fun cachedMethods(vararg cachedMethods: String): Unit =
          cachedMethods(cachedMethods.toList())

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify `true` ; if not, specify `false` . For more information, see [Serving
       * Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
      }

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify `true` ; if not, specify `false` . For more information, see [Serving
       * Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun compress(compress: IResolvable) {
        cdkBuilder.compress(compress.let(IResolvable::unwrap))
      }

      /**
       * @param defaultTtl This field is deprecated.
       * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin does not add HTTP headers
       * such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For
       * more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      /**
       * @param fieldLevelEncryptionId The value of `ID` for the field-level encryption
       * configuration that you want CloudFront to use for encrypting specific fields of data for the
       * default cache behavior.
       */
      override fun fieldLevelEncryptionId(fieldLevelEncryptionId: String) {
        cdkBuilder.fieldLevelEncryptionId(fieldLevelEncryptionId)
      }

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      override fun forwardedValues(forwardedValues: IResolvable) {
        cdkBuilder.forwardedValues(forwardedValues.let(IResolvable::unwrap))
      }

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      override fun forwardedValues(forwardedValues: ForwardedValuesProperty) {
        cdkBuilder.forwardedValues(forwardedValues.let(ForwardedValuesProperty::unwrap))
      }

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f8ad03cda9ea3bdabbeb32d3f74dfffacbde0f8cb9bae3862a79e5b38d9b2e")
      override fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit):
          Unit = forwardedValues(ForwardedValuesProperty(forwardedValues))

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * Your functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      override fun functionAssociations(functionAssociations: IResolvable) {
        cdkBuilder.functionAssociations(functionAssociations.let(IResolvable::unwrap))
      }

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * Your functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      override fun functionAssociations(functionAssociations: List<Any>) {
        cdkBuilder.functionAssociations(functionAssociations)
      }

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * Your functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      override fun functionAssociations(vararg functionAssociations: Any): Unit =
          functionAssociations(functionAssociations.toList())

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations)
      }

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      override fun lambdaFunctionAssociations(vararg lambdaFunctionAssociations: Any): Unit =
          lambdaFunctionAssociations(lambdaFunctionAssociations.toList())

      /**
       * @param maxTtl This field is deprecated.
       * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The maximum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin adds HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
       * information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
      }

      /**
       * @param minTtl This field is deprecated.
       * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The minimum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to
       * your origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
       */
      override fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
      }

      /**
       * @param originRequestPolicyId The unique identifier of the origin request policy that is
       * attached to the default cache behavior.
       * For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originRequestPolicyId(originRequestPolicyId: String) {
        cdkBuilder.originRequestPolicyId(originRequestPolicyId)
      }

      /**
       * @param realtimeLogConfigArn The Amazon Resource Name (ARN) of the real-time log
       * configuration that is attached to this cache behavior.
       * For more information, see [Real-time
       * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun realtimeLogConfigArn(realtimeLogConfigArn: String) {
        cdkBuilder.realtimeLogConfigArn(realtimeLogConfigArn)
      }

      /**
       * @param responseHeadersPolicyId The identifier for a response headers policy.
       */
      override fun responseHeadersPolicyId(responseHeadersPolicyId: String) {
        cdkBuilder.responseHeadersPolicyId(responseHeadersPolicyId)
      }

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      override fun smoothStreaming(smoothStreaming: Boolean) {
        cdkBuilder.smoothStreaming(smoothStreaming)
      }

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      override fun smoothStreaming(smoothStreaming: IResolvable) {
        cdkBuilder.smoothStreaming(smoothStreaming.let(IResolvable::unwrap))
      }

      /**
       * @param targetOriginId The value of `ID` for the origin that you want CloudFront to route
       * requests to when they use the default cache behavior. 
       */
      override fun targetOriginId(targetOriginId: String) {
        cdkBuilder.targetOriginId(targetOriginId)
      }

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedKeyGroups(trustedKeyGroups: List<String>) {
        cdkBuilder.trustedKeyGroups(trustedKeyGroups)
      }

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedKeyGroups(vararg trustedKeyGroups: String): Unit =
          trustedKeyGroups(trustedKeyGroups.toList())

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in a trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedSigners(trustedSigners: List<String>) {
        cdkBuilder.trustedSigners(trustedSigners)
      }

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in a trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedSigners(vararg trustedSigners: String): Unit =
          trustedSigners(trustedSigners.toList())

      /**
       * @param viewerProtocolPolicy The protocol that viewers can use to access the files in the
       * origin specified by `TargetOriginId` when a request matches the path pattern in `PathPattern`
       * . 
       * You can specify the following options:
       *
       * * `allow-all` : Viewers can use HTTP or HTTPS.
       * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
       * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
       * resubmits the request using the new URL.
       * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code
       * of 403 (Forbidden).
       *
       * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between
       * Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * The only way to guarantee that viewers retrieve an object that was fetched from the origin
       * using HTTPS is never to use any other protocol to fetch the object. If you have recently
       * changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached
       * objects are protocol agnostic. That means that an edge location will return an object from the
       * cache regardless of whether the current request protocol matches the protocol used previously.
       * For more information, see [Managing Cache
       * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun viewerProtocolPolicy(viewerProtocolPolicy: String) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty,
    ) : CdkObject(cdkObject), DefaultCacheBehaviorProperty {
      /**
       * A complex type that controls which HTTP methods CloudFront processes and forwards to your
       * Amazon S3 bucket or your custom origin.
       *
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-allowedmethods)
       */
      override fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

      /**
       * The unique identifier of the cache policy that is attached to the default cache behavior.
       *
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachepolicyid)
       */
      override fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

      /**
       * A complex type that controls whether CloudFront caches the response to requests using the
       * specified HTTP methods.
       *
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-cachedmethods)
       */
      override fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

      /**
       * Whether you want CloudFront to automatically compress certain files for this cache
       * behavior.
       *
       * If so, specify `true` ; if not, specify `false` . For more information, see [Serving
       * Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-compress)
       */
      override fun compress(): Any? = unwrap(this).getCompress()

      /**
       * This field is deprecated.
       *
       * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin does not add HTTP headers
       * such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For
       * more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - 86400
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-defaultttl)
       */
      override fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

      /**
       * The value of `ID` for the field-level encryption configuration that you want CloudFront to
       * use for encrypting specific fields of data for the default cache behavior.
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-fieldlevelencryptionid)
       */
      override fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
       * recommend that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-forwardedvalues)
       */
      override fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

      /**
       * A list of CloudFront functions that are associated with this cache behavior.
       *
       * Your functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-functionassociations)
       */
      override fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

      /**
       * A complex type that contains zero or more Lambda&#64;Edge function associations for a cache
       * behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-lambdafunctionassociations)
       */
      override fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

      /**
       * This field is deprecated.
       *
       * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The maximum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin adds HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
       * information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - 31536000
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-maxttl)
       */
      override fun maxTtl(): Number? = unwrap(this).getMaxTtl()

      /**
       * This field is deprecated.
       *
       * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The minimum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to
       * your origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-minttl)
       */
      override fun minTtl(): Number? = unwrap(this).getMinTtl()

      /**
       * The unique identifier of the origin request policy that is attached to the default cache
       * behavior.
       *
       * For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-originrequestpolicyid)
       */
      override fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

      /**
       * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this
       * cache behavior.
       *
       * For more information, see [Real-time
       * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-realtimelogconfigarn)
       */
      override fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

      /**
       * The identifier for a response headers policy.
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-responseheaderspolicyid)
       */
      override fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

      /**
       * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming
       * format using the origin that is associated with this cache behavior.
       *
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-smoothstreaming)
       */
      override fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

      /**
       * The value of `ID` for the origin that you want CloudFront to route requests to when they
       * use the default cache behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-targetoriginid)
       */
      override fun targetOriginId(): String = unwrap(this).getTargetOriginId()

      /**
       * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
       *
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedkeygroups)
       */
      override fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?:
          emptyList()

      /**
       * We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       *
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in a trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-trustedsigners)
       */
      override fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

      /**
       * The protocol that viewers can use to access the files in the origin specified by
       * `TargetOriginId` when a request matches the path pattern in `PathPattern` .
       *
       * You can specify the following options:
       *
       * * `allow-all` : Viewers can use HTTP or HTTPS.
       * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
       * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
       * resubmits the request using the new URL.
       * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code
       * of 403 (Forbidden).
       *
       * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between
       * Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * The only way to guarantee that viewers retrieve an object that was fetched from the origin
       * using HTTPS is never to use any other protocol to fetch the object. If you have recently
       * changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached
       * objects are protocol agnostic. That means that an edge location will return an object from the
       * cache regardless of whether the current request protocol matches the protocol used previously.
       * For more information, see [Managing Cache
       * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html#cfn-cloudfront-distribution-defaultcachebehavior-viewerprotocolpolicy)
       */
      override fun viewerProtocolPolicy(): String = unwrap(this).getViewerProtocolPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultCacheBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty):
          DefaultCacheBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultCacheBehaviorProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DefaultCacheBehaviorProperty
    }
  }

  /**
   * A complex type that describes how CloudFront processes requests.
   *
   * You must create at least as many cache behaviors (including the default cache behavior) as you
   * have origins if you want CloudFront to serve objects from all of the origins. Each cache behavior
   * specifies the one origin from which you want CloudFront to get objects. If you have two origins
   * and only the default cache behavior, the default cache behavior will cause CloudFront to get
   * objects from one of the origins, but the other origin is never used.
   *
   * For the current quota (formerly known as limit) on the number of cache behaviors that you can
   * add to a distribution, see
   * [Quotas](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you don't want to specify any cache behaviors, include only an empty `CacheBehaviors`
   * element. For more information, see
   * [CacheBehaviors](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CacheBehaviors.html)
   * . Don't include an empty `CacheBehavior` element because this is invalid.
   *
   * To delete all cache behaviors in an existing distribution, update the distribution
   * configuration and include only an empty `CacheBehaviors` element.
   *
   * To add, change, or remove one or more cache behaviors, update the distribution configuration
   * and specify all of the cache behaviors that you want to include in the updated distribution.
   *
   * For more information about cache behaviors, see [Cache Behavior
   * Settings](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CacheBehaviorProperty cacheBehaviorProperty = CacheBehaviorProperty.builder()
   * .pathPattern("pathPattern")
   * .targetOriginId("targetOriginId")
   * .viewerProtocolPolicy("viewerProtocolPolicy")
   * // the properties below are optional
   * .allowedMethods(List.of("allowedMethods"))
   * .cachedMethods(List.of("cachedMethods"))
   * .cachePolicyId("cachePolicyId")
   * .compress(false)
   * .defaultTtl(123)
   * .fieldLevelEncryptionId("fieldLevelEncryptionId")
   * .forwardedValues(ForwardedValuesProperty.builder()
   * .queryString(false)
   * // the properties below are optional
   * .cookies(CookiesProperty.builder()
   * .forward("forward")
   * // the properties below are optional
   * .whitelistedNames(List.of("whitelistedNames"))
   * .build())
   * .headers(List.of("headers"))
   * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
   * .build())
   * .functionAssociations(List.of(FunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .functionArn("functionArn")
   * .build()))
   * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .includeBody(false)
   * .lambdaFunctionArn("lambdaFunctionArn")
   * .build()))
   * .maxTtl(123)
   * .minTtl(123)
   * .originRequestPolicyId("originRequestPolicyId")
   * .realtimeLogConfigArn("realtimeLogConfigArn")
   * .responseHeadersPolicyId("responseHeadersPolicyId")
   * .smoothStreaming(false)
   * .trustedKeyGroups(List.of("trustedKeyGroups"))
   * .trustedSigners(List.of("trustedSigners"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html)
   */
  public interface CacheBehaviorProperty {
    /**
     * A complex type that controls which HTTP methods CloudFront processes and forwards to your
     * Amazon S3 bucket or your custom origin.
     *
     * There are three choices:
     *
     * * CloudFront forwards only `GET` and `HEAD` requests.
     * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
     * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
     *
     * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to
     * your custom origin so users can't perform operations that you don't want them to. For example,
     * you might not want users to have permissions to delete objects from your origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods)
     */
    public fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

    /**
     * The unique identifier of the cache policy that is attached to this cache behavior.
     *
     * For more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
     * that you use a `CachePolicyId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachepolicyid)
     */
    public fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

    /**
     * A complex type that controls whether CloudFront caches the response to requests using the
     * specified HTTP methods.
     *
     * There are two choices:
     *
     * * CloudFront caches responses to `GET` and `HEAD` requests.
     * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
     *
     * If you pick the second choice for your Amazon S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
     * responses to be cached correctly.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods)
     */
    public fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

    /**
     * Whether you want CloudFront to automatically compress certain files for this cache behavior.
     *
     * If so, specify true; if not, specify false. For more information, see [Serving Compressed
     * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress)
     */
    public fun compress(): Any? = unwrap(this).getCompress()

    /**
     * This field is deprecated.
     *
     * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field. For
     * more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The default amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. The value that you specify applies only when your origin does not add HTTP headers such
     * as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
     * information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - 86400
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl)
     */
    public fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

    /**
     * The value of `ID` for the field-level encryption configuration that you want CloudFront to
     * use for encrypting specific fields of data for this cache behavior.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid)
     */
    public fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     * For more information, see [Working with
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to include values in the cache key, use a cache policy. For more information, see
     * [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send values to the origin but not include them in the cache key, use an origin
     * request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * or [Using the managed origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
     * that you use a `CachePolicyId` .
     *
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
     * headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-forwardedvalues)
     */
    public fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

    /**
     * A list of CloudFront functions that are associated with this cache behavior.
     *
     * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
     * behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-functionassociations)
     */
    public fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

    /**
     * A complex type that contains zero or more Lambda&#64;Edge function associations for a cache
     * behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations)
     */
    public fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

    /**
     * This field is deprecated.
     *
     * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
     * more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The maximum amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. The value that you specify applies only when your origin adds HTTP headers such as
     * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
     * information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - 31536000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl)
     */
    public fun maxTtl(): Number? = unwrap(this).getMaxTtl()

    /**
     * This field is deprecated.
     *
     * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
     * more information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or [Using the managed cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The minimum amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to your
     * origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl)
     */
    public fun minTtl(): Number? = unwrap(this).getMinTtl()

    /**
     * The unique identifier of the origin request policy that is attached to this cache behavior.
     *
     * For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * or [Using the managed origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-originrequestpolicyid)
     */
    public fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

    /**
     * The pattern (for example, `images/ *.jpg` ) that specifies which requests to apply the
     * behavior to. When CloudFront receives a viewer request, the requested path is compared with path
     * patterns in the order in which cache behaviors are listed in the distribution.
     *
     *
     * You can optionally include a slash ( `/` ) at the beginning of the path pattern. For example,
     * `/images/ *.jpg` . CloudFront behavior is the same with or without the leading `/` .
     *
     *
     * The path pattern for the default cache behavior is `*` and cannot be changed. If the request
     * for an object does not match the path pattern for any cache behaviors, CloudFront applies the
     * behavior in the default cache behavior.
     *
     * For more information, see [Path
     * Pattern](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern)
     */
    public fun pathPattern(): String

    /**
     * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this
     * cache behavior.
     *
     * For more information, see [Real-time
     * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html) in
     * the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-realtimelogconfigarn)
     */
    public fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

    /**
     * The identifier for a response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-responseheaderspolicyid)
     */
    public fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

    /**
     * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming format
     * using the origin that is associated with this cache behavior.
     *
     * If so, specify `true` ; if not, specify `false` . If you specify `true` for `SmoothStreaming`
     * , you can still distribute other content using this cache behavior if the content matches the
     * value of `PathPattern` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming)
     */
    public fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

    /**
     * The value of `ID` for the origin that you want CloudFront to route requests to when they
     * match this cache behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid)
     */
    public fun targetOriginId(): String

    /**
     * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
     *
     * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or signed
     * cookies for all requests that match the cache behavior. The URLs or cookies must be signed with
     * a private key whose corresponding public key is in the key group. The signed URL or cookie
     * contains information about which public key CloudFront should use to verify the signature. For
     * more information, see [Serving private
     * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedkeygroups)
     */
    public fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?: emptyList()

    /**
     * We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
     *
     * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
     * signed cookies.
     *
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
     * cookies for all requests that match the cache behavior. The URLs or cookies must be signed with
     * the private key of a CloudFront key pair in the trusted signer's AWS account . The signed URL or
     * cookie contains information about which public key CloudFront should use to verify the
     * signature. For more information, see [Serving private
     * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners)
     */
    public fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

    /**
     * The protocol that viewers can use to access the files in the origin specified by
     * `TargetOriginId` when a request matches the path pattern in `PathPattern` .
     *
     * You can specify the following options:
     *
     * * `allow-all` : Viewers can use HTTP or HTTPS.
     * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
     * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
     * resubmits the request using the new URL.
     * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code of
     * 403 (Forbidden).
     *
     * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between Viewers
     * and
     * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     *
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin
     * using HTTPS is never to use any other protocol to fetch the object. If you have recently changed
     * from HTTP to HTTPS, we recommend that you clear your objects' cache because cached objects are
     * protocol agnostic. That means that an edge location will return an object from the cache
     * regardless of whether the current request protocol matches the protocol used previously. For
     * more information, see [Managing Cache
     * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy)
     */
    public fun viewerProtocolPolicy(): String

    /**
     * A builder for [CacheBehaviorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      public fun allowedMethods(allowedMethods: List<String>)

      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      public fun allowedMethods(vararg allowedMethods: String)

      /**
       * @param cachePolicyId The unique identifier of the cache policy that is attached to this
       * cache behavior.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       */
      public fun cachePolicyId(cachePolicyId: String)

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      public fun cachedMethods(cachedMethods: List<String>)

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      public fun cachedMethods(vararg cachedMethods: String)

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify true; if not, specify false. For more information, see [Serving Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun compress(compress: Boolean)

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify true; if not, specify false. For more information, see [Serving Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun compress(compress: IResolvable)

      /**
       * @param defaultTtl This field is deprecated.
       * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin does not add HTTP headers
       * such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For
       * more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun defaultTtl(defaultTtl: Number)

      /**
       * @param fieldLevelEncryptionId The value of `ID` for the field-level encryption
       * configuration that you want CloudFront to use for encrypting specific fields of data for this
       * cache behavior.
       */
      public fun fieldLevelEncryptionId(fieldLevelEncryptionId: String)

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      public fun forwardedValues(forwardedValues: IResolvable)

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      public fun forwardedValues(forwardedValues: ForwardedValuesProperty)

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8f1f87993d6171cdc73086055f6bc637b8d209737a2e322543a6d01cedcb71")
      public fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit)

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      public fun functionAssociations(functionAssociations: IResolvable)

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      public fun functionAssociations(functionAssociations: List<Any>)

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      public fun functionAssociations(vararg functionAssociations: Any)

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable)

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      public fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>)

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      public fun lambdaFunctionAssociations(vararg lambdaFunctionAssociations: Any)

      /**
       * @param maxTtl This field is deprecated.
       * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The maximum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin adds HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
       * information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun maxTtl(maxTtl: Number)

      /**
       * @param minTtl This field is deprecated.
       * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The minimum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to
       * your origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
       */
      public fun minTtl(minTtl: Number)

      /**
       * @param originRequestPolicyId The unique identifier of the origin request policy that is
       * attached to this cache behavior.
       * For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originRequestPolicyId(originRequestPolicyId: String)

      /**
       * @param pathPattern The pattern (for example, `images/ *.jpg` ) that specifies which
       * requests to apply the behavior to. When CloudFront receives a viewer request, the requested
       * path is compared with path patterns in the order in which cache behaviors are listed in the
       * distribution. 
       *
       * You can optionally include a slash ( `/` ) at the beginning of the path pattern. For
       * example, `/images/ *.jpg` . CloudFront behavior is the same with or without the leading `/` .
       *
       *
       * The path pattern for the default cache behavior is `*` and cannot be changed. If the
       * request for an object does not match the path pattern for any cache behaviors, CloudFront
       * applies the behavior in the default cache behavior.
       *
       * For more information, see [Path
       * Pattern](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun pathPattern(pathPattern: String)

      /**
       * @param realtimeLogConfigArn The Amazon Resource Name (ARN) of the real-time log
       * configuration that is attached to this cache behavior.
       * For more information, see [Real-time
       * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun realtimeLogConfigArn(realtimeLogConfigArn: String)

      /**
       * @param responseHeadersPolicyId The identifier for a response headers policy.
       */
      public fun responseHeadersPolicyId(responseHeadersPolicyId: String)

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      public fun smoothStreaming(smoothStreaming: Boolean)

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      public fun smoothStreaming(smoothStreaming: IResolvable)

      /**
       * @param targetOriginId The value of `ID` for the origin that you want CloudFront to route
       * requests to when they match this cache behavior. 
       */
      public fun targetOriginId(targetOriginId: String)

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedKeyGroups(trustedKeyGroups: List<String>)

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedKeyGroups(vararg trustedKeyGroups: String)

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in the trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedSigners(trustedSigners: List<String>)

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in the trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun trustedSigners(vararg trustedSigners: String)

      /**
       * @param viewerProtocolPolicy The protocol that viewers can use to access the files in the
       * origin specified by `TargetOriginId` when a request matches the path pattern in `PathPattern`
       * . 
       * You can specify the following options:
       *
       * * `allow-all` : Viewers can use HTTP or HTTPS.
       * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
       * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
       * resubmits the request using the new URL.
       * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code
       * of 403 (Forbidden).
       *
       * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between
       * Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * The only way to guarantee that viewers retrieve an object that was fetched from the origin
       * using HTTPS is never to use any other protocol to fetch the object. If you have recently
       * changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached
       * objects are protocol agnostic. That means that an edge location will return an object from the
       * cache regardless of whether the current request protocol matches the protocol used previously.
       * For more information, see [Managing Cache
       * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun viewerProtocolPolicy(viewerProtocolPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty.builder()

      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      override fun allowedMethods(allowedMethods: List<String>) {
        cdkBuilder.allowedMethods(allowedMethods)
      }

      /**
       * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
       * and forwards to your Amazon S3 bucket or your custom origin.
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       */
      override fun allowedMethods(vararg allowedMethods: String): Unit =
          allowedMethods(allowedMethods.toList())

      /**
       * @param cachePolicyId The unique identifier of the cache policy that is attached to this
       * cache behavior.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       */
      override fun cachePolicyId(cachePolicyId: String) {
        cdkBuilder.cachePolicyId(cachePolicyId)
      }

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      override fun cachedMethods(cachedMethods: List<String>) {
        cdkBuilder.cachedMethods(cachedMethods)
      }

      /**
       * @param cachedMethods A complex type that controls whether CloudFront caches the response to
       * requests using the specified HTTP methods.
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       */
      override fun cachedMethods(vararg cachedMethods: String): Unit =
          cachedMethods(cachedMethods.toList())

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify true; if not, specify false. For more information, see [Serving Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
      }

      /**
       * @param compress Whether you want CloudFront to automatically compress certain files for
       * this cache behavior.
       * If so, specify true; if not, specify false. For more information, see [Serving Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun compress(compress: IResolvable) {
        cdkBuilder.compress(compress.let(IResolvable::unwrap))
      }

      /**
       * @param defaultTtl This field is deprecated.
       * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin does not add HTTP headers
       * such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For
       * more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      /**
       * @param fieldLevelEncryptionId The value of `ID` for the field-level encryption
       * configuration that you want CloudFront to use for encrypting specific fields of data for this
       * cache behavior.
       */
      override fun fieldLevelEncryptionId(fieldLevelEncryptionId: String) {
        cdkBuilder.fieldLevelEncryptionId(fieldLevelEncryptionId)
      }

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      override fun forwardedValues(forwardedValues: IResolvable) {
        cdkBuilder.forwardedValues(forwardedValues.let(IResolvable::unwrap))
      }

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      override fun forwardedValues(forwardedValues: ForwardedValuesProperty) {
        cdkBuilder.forwardedValues(forwardedValues.let(ForwardedValuesProperty::unwrap))
      }

      /**
       * @param forwardedValues This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a8f1f87993d6171cdc73086055f6bc637b8d209737a2e322543a6d01cedcb71")
      override fun forwardedValues(forwardedValues: ForwardedValuesProperty.Builder.() -> Unit):
          Unit = forwardedValues(ForwardedValuesProperty(forwardedValues))

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      override fun functionAssociations(functionAssociations: IResolvable) {
        cdkBuilder.functionAssociations(functionAssociations.let(IResolvable::unwrap))
      }

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      override fun functionAssociations(functionAssociations: List<Any>) {
        cdkBuilder.functionAssociations(functionAssociations)
      }

      /**
       * @param functionAssociations A list of CloudFront functions that are associated with this
       * cache behavior.
       * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       */
      override fun functionAssociations(vararg functionAssociations: Any): Unit =
          functionAssociations(functionAssociations.toList())

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      override fun lambdaFunctionAssociations(lambdaFunctionAssociations: List<Any>) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations)
      }

      /**
       * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
       * function associations for a cache behavior.
       */
      override fun lambdaFunctionAssociations(vararg lambdaFunctionAssociations: Any): Unit =
          lambdaFunctionAssociations(lambdaFunctionAssociations.toList())

      /**
       * @param maxTtl This field is deprecated.
       * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The maximum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin adds HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
       * information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
      }

      /**
       * @param minTtl This field is deprecated.
       * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The minimum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to
       * your origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
       */
      override fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
      }

      /**
       * @param originRequestPolicyId The unique identifier of the origin request policy that is
       * attached to this cache behavior.
       * For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originRequestPolicyId(originRequestPolicyId: String) {
        cdkBuilder.originRequestPolicyId(originRequestPolicyId)
      }

      /**
       * @param pathPattern The pattern (for example, `images/ *.jpg` ) that specifies which
       * requests to apply the behavior to. When CloudFront receives a viewer request, the requested
       * path is compared with path patterns in the order in which cache behaviors are listed in the
       * distribution. 
       *
       * You can optionally include a slash ( `/` ) at the beginning of the path pattern. For
       * example, `/images/ *.jpg` . CloudFront behavior is the same with or without the leading `/` .
       *
       *
       * The path pattern for the default cache behavior is `*` and cannot be changed. If the
       * request for an object does not match the path pattern for any cache behaviors, CloudFront
       * applies the behavior in the default cache behavior.
       *
       * For more information, see [Path
       * Pattern](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun pathPattern(pathPattern: String) {
        cdkBuilder.pathPattern(pathPattern)
      }

      /**
       * @param realtimeLogConfigArn The Amazon Resource Name (ARN) of the real-time log
       * configuration that is attached to this cache behavior.
       * For more information, see [Real-time
       * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun realtimeLogConfigArn(realtimeLogConfigArn: String) {
        cdkBuilder.realtimeLogConfigArn(realtimeLogConfigArn)
      }

      /**
       * @param responseHeadersPolicyId The identifier for a response headers policy.
       */
      override fun responseHeadersPolicyId(responseHeadersPolicyId: String) {
        cdkBuilder.responseHeadersPolicyId(responseHeadersPolicyId)
      }

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      override fun smoothStreaming(smoothStreaming: Boolean) {
        cdkBuilder.smoothStreaming(smoothStreaming)
      }

      /**
       * @param smoothStreaming Indicates whether you want to distribute media files in the
       * Microsoft Smooth Streaming format using the origin that is associated with this cache
       * behavior.
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       */
      override fun smoothStreaming(smoothStreaming: IResolvable) {
        cdkBuilder.smoothStreaming(smoothStreaming.let(IResolvable::unwrap))
      }

      /**
       * @param targetOriginId The value of `ID` for the origin that you want CloudFront to route
       * requests to when they match this cache behavior. 
       */
      override fun targetOriginId(targetOriginId: String) {
        cdkBuilder.targetOriginId(targetOriginId)
      }

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedKeyGroups(trustedKeyGroups: List<String>) {
        cdkBuilder.trustedKeyGroups(trustedKeyGroups)
      }

      /**
       * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed
       * URLs or signed cookies.
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedKeyGroups(vararg trustedKeyGroups: String): Unit =
          trustedKeyGroups(trustedKeyGroups.toList())

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in the trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedSigners(trustedSigners: List<String>) {
        cdkBuilder.trustedSigners(trustedSigners)
      }

      /**
       * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in the trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun trustedSigners(vararg trustedSigners: String): Unit =
          trustedSigners(trustedSigners.toList())

      /**
       * @param viewerProtocolPolicy The protocol that viewers can use to access the files in the
       * origin specified by `TargetOriginId` when a request matches the path pattern in `PathPattern`
       * . 
       * You can specify the following options:
       *
       * * `allow-all` : Viewers can use HTTP or HTTPS.
       * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
       * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
       * resubmits the request using the new URL.
       * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code
       * of 403 (Forbidden).
       *
       * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between
       * Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * The only way to guarantee that viewers retrieve an object that was fetched from the origin
       * using HTTPS is never to use any other protocol to fetch the object. If you have recently
       * changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached
       * objects are protocol agnostic. That means that an edge location will return an object from the
       * cache regardless of whether the current request protocol matches the protocol used previously.
       * For more information, see [Managing Cache
       * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun viewerProtocolPolicy(viewerProtocolPolicy: String) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty,
    ) : CdkObject(cdkObject), CacheBehaviorProperty {
      /**
       * A complex type that controls which HTTP methods CloudFront processes and forwards to your
       * Amazon S3 bucket or your custom origin.
       *
       * There are three choices:
       *
       * * CloudFront forwards only `GET` and `HEAD` requests.
       * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
       * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
       *
       * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or
       * to your custom origin so users can't perform operations that you don't want them to. For
       * example, you might not want users to have permissions to delete objects from your origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-allowedmethods)
       */
      override fun allowedMethods(): List<String> = unwrap(this).getAllowedMethods() ?: emptyList()

      /**
       * The unique identifier of the cache policy that is attached to this cache behavior.
       *
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachepolicyid)
       */
      override fun cachePolicyId(): String? = unwrap(this).getCachePolicyId()

      /**
       * A complex type that controls whether CloudFront caches the response to requests using the
       * specified HTTP methods.
       *
       * There are two choices:
       *
       * * CloudFront caches responses to `GET` and `HEAD` requests.
       * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
       *
       * If you pick the second choice for your Amazon S3 Origin, you may need to forward
       * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
       * responses to be cached correctly.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-cachedmethods)
       */
      override fun cachedMethods(): List<String> = unwrap(this).getCachedMethods() ?: emptyList()

      /**
       * Whether you want CloudFront to automatically compress certain files for this cache
       * behavior.
       *
       * If so, specify true; if not, specify false. For more information, see [Serving Compressed
       * Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-compress)
       */
      override fun compress(): Any? = unwrap(this).getCompress()

      /**
       * This field is deprecated.
       *
       * We recommend that you use the `DefaultTTL` field in a cache policy instead of this field.
       * For more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin does not add HTTP headers
       * such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For
       * more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - 86400
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-defaultttl)
       */
      override fun defaultTtl(): Number? = unwrap(this).getDefaultTtl()

      /**
       * The value of `ID` for the field-level encryption configuration that you want CloudFront to
       * use for encrypting specific fields of data for this cache behavior.
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-fieldlevelencryptionid)
       */
      override fun fieldLevelEncryptionId(): String? = unwrap(this).getFieldLevelEncryptionId()

      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       * For more information, see [Working with
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to include values in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send values to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A `CacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We recommend
       * that you use a `CachePolicyId` .
       *
       * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
       * headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-forwardedvalues)
       */
      override fun forwardedValues(): Any? = unwrap(this).getForwardedValues()

      /**
       * A list of CloudFront functions that are associated with this cache behavior.
       *
       * CloudFront functions must be published to the `LIVE` stage to associate them with a cache
       * behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-functionassociations)
       */
      override fun functionAssociations(): Any? = unwrap(this).getFunctionAssociations()

      /**
       * A complex type that contains zero or more Lambda&#64;Edge function associations for a cache
       * behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-lambdafunctionassociations)
       */
      override fun lambdaFunctionAssociations(): Any? = unwrap(this).getLambdaFunctionAssociations()

      /**
       * This field is deprecated.
       *
       * We recommend that you use the `MaxTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The maximum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. The value that you specify applies only when your origin adds HTTP headers such as
       * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
       * information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - 31536000
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-maxttl)
       */
      override fun maxTtl(): Number? = unwrap(this).getMaxTtl()

      /**
       * This field is deprecated.
       *
       * We recommend that you use the `MinTTL` field in a cache policy instead of this field. For
       * more information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * or [Using the managed cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The minimum amount of time that you want objects to stay in CloudFront caches before
       * CloudFront forwards another request to your origin to determine whether the object has been
       * updated. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to
       * your origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-minttl)
       */
      override fun minTtl(): Number? = unwrap(this).getMinTtl()

      /**
       * The unique identifier of the origin request policy that is attached to this cache behavior.
       *
       * For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * or [Using the managed origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-originrequestpolicyid)
       */
      override fun originRequestPolicyId(): String? = unwrap(this).getOriginRequestPolicyId()

      /**
       * The pattern (for example, `images/ *.jpg` ) that specifies which requests to apply the
       * behavior to. When CloudFront receives a viewer request, the requested path is compared with
       * path patterns in the order in which cache behaviors are listed in the distribution.
       *
       *
       * You can optionally include a slash ( `/` ) at the beginning of the path pattern. For
       * example, `/images/ *.jpg` . CloudFront behavior is the same with or without the leading `/` .
       *
       *
       * The path pattern for the default cache behavior is `*` and cannot be changed. If the
       * request for an object does not match the path pattern for any cache behaviors, CloudFront
       * applies the behavior in the default cache behavior.
       *
       * For more information, see [Path
       * Pattern](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesPathPattern)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-pathpattern)
       */
      override fun pathPattern(): String = unwrap(this).getPathPattern()

      /**
       * The Amazon Resource Name (ARN) of the real-time log configuration that is attached to this
       * cache behavior.
       *
       * For more information, see [Real-time
       * logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-realtimelogconfigarn)
       */
      override fun realtimeLogConfigArn(): String? = unwrap(this).getRealtimeLogConfigArn()

      /**
       * The identifier for a response headers policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-responseheaderspolicyid)
       */
      override fun responseHeadersPolicyId(): String? = unwrap(this).getResponseHeadersPolicyId()

      /**
       * Indicates whether you want to distribute media files in the Microsoft Smooth Streaming
       * format using the origin that is associated with this cache behavior.
       *
       * If so, specify `true` ; if not, specify `false` . If you specify `true` for
       * `SmoothStreaming` , you can still distribute other content using this cache behavior if the
       * content matches the value of `PathPattern` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-smoothstreaming)
       */
      override fun smoothStreaming(): Any? = unwrap(this).getSmoothStreaming()

      /**
       * The value of `ID` for the origin that you want CloudFront to route requests to when they
       * match this cache behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-targetoriginid)
       */
      override fun targetOriginId(): String = unwrap(this).getTargetOriginId()

      /**
       * A list of key groups that CloudFront can use to validate signed URLs or signed cookies.
       *
       * When a cache behavior contains trusted key groups, CloudFront requires signed URLs or
       * signed cookies for all requests that match the cache behavior. The URLs or cookies must be
       * signed with a private key whose corresponding public key is in the key group. The signed URL
       * or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedkeygroups)
       */
      override fun trustedKeyGroups(): List<String> = unwrap(this).getTrustedKeyGroups() ?:
          emptyList()

      /**
       * We recommend using `TrustedKeyGroups` instead of `TrustedSigners` .
       *
       * A list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
       * signed cookies.
       *
       * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
       * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
       * with the private key of a CloudFront key pair in the trusted signer's AWS account . The signed
       * URL or cookie contains information about which public key CloudFront should use to verify the
       * signature. For more information, see [Serving private
       * content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-trustedsigners)
       */
      override fun trustedSigners(): List<String> = unwrap(this).getTrustedSigners() ?: emptyList()

      /**
       * The protocol that viewers can use to access the files in the origin specified by
       * `TargetOriginId` when a request matches the path pattern in `PathPattern` .
       *
       * You can specify the following options:
       *
       * * `allow-all` : Viewers can use HTTP or HTTPS.
       * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
       * status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer then
       * resubmits the request using the new URL.
       * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code
       * of 403 (Forbidden).
       *
       * For more information about requiring the HTTPS protocol, see [Requiring HTTPS Between
       * Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * The only way to guarantee that viewers retrieve an object that was fetched from the origin
       * using HTTPS is never to use any other protocol to fetch the object. If you have recently
       * changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached
       * objects are protocol agnostic. That means that an edge location will return an object from the
       * cache regardless of whether the current request protocol matches the protocol used previously.
       * For more information, see [Managing Cache
       * Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html#cfn-cloudfront-distribution-cachebehavior-viewerprotocolpolicy)
       */
      override fun viewerProtocolPolicy(): String = unwrap(this).getViewerProtocolPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CacheBehaviorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty):
          CacheBehaviorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CacheBehaviorProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CacheBehaviorProperty
    }
  }

  /**
   * A complex data type for the origin groups specified for a distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginGroupsProperty originGroupsProperty = OriginGroupsProperty.builder()
   * .quantity(123)
   * // the properties below are optional
   * .items(List.of(OriginGroupProperty.builder()
   * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
   * .statusCodes(StatusCodesProperty.builder()
   * .items(List.of(123))
   * .quantity(123)
   * .build())
   * .build())
   * .id("id")
   * .members(OriginGroupMembersProperty.builder()
   * .items(List.of(OriginGroupMemberProperty.builder()
   * .originId("originId")
   * .build()))
   * .quantity(123)
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroups.html)
   */
  public interface OriginGroupsProperty {
    /**
     * The items (origin groups) in a distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroups.html#cfn-cloudfront-distribution-origingroups-items)
     */
    public fun items(): Any? = unwrap(this).getItems()

    /**
     * The number of origin groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroups.html#cfn-cloudfront-distribution-origingroups-quantity)
     */
    public fun quantity(): Number

    /**
     * A builder for [OriginGroupsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The items (origin groups) in a distribution.
       */
      public fun items(items: IResolvable)

      /**
       * @param items The items (origin groups) in a distribution.
       */
      public fun items(items: List<Any>)

      /**
       * @param items The items (origin groups) in a distribution.
       */
      public fun items(vararg items: Any)

      /**
       * @param quantity The number of origin groups. 
       */
      public fun quantity(quantity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty.builder()

      /**
       * @param items The items (origin groups) in a distribution.
       */
      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      /**
       * @param items The items (origin groups) in a distribution.
       */
      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The items (origin groups) in a distribution.
       */
      override fun items(vararg items: Any): Unit = items(items.toList())

      /**
       * @param quantity The number of origin groups. 
       */
      override fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty,
    ) : CdkObject(cdkObject), OriginGroupsProperty {
      /**
       * The items (origin groups) in a distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroups.html#cfn-cloudfront-distribution-origingroups-items)
       */
      override fun items(): Any? = unwrap(this).getItems()

      /**
       * The number of origin groups.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroups.html#cfn-cloudfront-distribution-origingroups-quantity)
       */
      override fun quantity(): Number = unwrap(this).getQuantity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty):
          OriginGroupsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupsProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupsProperty
    }
  }

  /**
   * A complex type that controls:.
   *
   * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
   * messages before returning the response to the viewer.
   * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
   *
   * For more information about custom error pages, see [Customizing Error
   * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CustomErrorResponseProperty customErrorResponseProperty = CustomErrorResponseProperty.builder()
   * .errorCode(123)
   * // the properties below are optional
   * .errorCachingMinTtl(123)
   * .responseCode(123)
   * .responsePagePath("responsePagePath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html)
   */
  public interface CustomErrorResponseProperty {
    /**
     * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status
     * code specified in `ErrorCode` .
     *
     * When this time period has elapsed, CloudFront queries your origin to see whether the problem
     * that caused the error has been resolved and the requested object is now available.
     *
     * For more information, see [Customizing Error
     * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - 300
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl)
     */
    public fun errorCachingMinTtl(): Number? = unwrap(this).getErrorCachingMinTtl()

    /**
     * The HTTP status code for which you want to specify a custom error page and/or a caching
     * duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode)
     */
    public fun errorCode(): Number

    /**
     * The HTTP status code that you want CloudFront to return to the viewer along with the custom
     * error page.
     *
     * There are a variety of reasons that you might want CloudFront to return a status code
     * different from the status code that your origin returned to CloudFront, for example:
     *
     * * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP
     * 4xx and 5xx and prevent the response from being returned to the viewer. If you substitute `200`
     * , the response typically won't be intercepted.
     * * If you don't care about distinguishing among different client errors or server errors, you
     * can specify `400` or `500` as the `ResponseCode` for all 4xx or 5xx errors.
     * * You might want to return a `200` status code (OK) and static website so your customers
     * don't know that your website is down.
     *
     * If you specify a value for `ResponseCode` , you must also specify a value for
     * `ResponsePagePath` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode)
     */
    public fun responseCode(): Number? = unwrap(this).getResponseCode()

    /**
     * The path to the custom error page that you want CloudFront to return to a viewer when your
     * origin returns the HTTP status code specified by `ErrorCode` , for example,
     * `/4xx-errors/403-forbidden.html` . If you want to store your objects and your custom error pages
     * in different locations, your distribution must include a cache behavior for which the following
     * is true:.
     *
     * * The value of `PathPattern` matches the path to your custom error messages. For example,
     * suppose you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory named
     * `/4xx-errors` . Your distribution must include a cache behavior for which the path pattern
     * routes requests for your custom error pages to that location, for example, `/4xx-errors/ *` .
     * * The value of `TargetOriginId` specifies the value of the `ID` element for the origin that
     * contains your custom error pages.
     *
     * If you specify a value for `ResponsePagePath` , you must also specify a value for
     * `ResponseCode` .
     *
     * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom
     * error pages on an HTTP server and the server starts to return 5xx errors, CloudFront can't get
     * the files that you want to return to viewers because the origin server is unavailable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath)
     */
    public fun responsePagePath(): String? = unwrap(this).getResponsePagePath()

    /**
     * A builder for [CustomErrorResponseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param errorCachingMinTtl The minimum amount of time, in seconds, that you want CloudFront
       * to cache the HTTP status code specified in `ErrorCode` .
       * When this time period has elapsed, CloudFront queries your origin to see whether the
       * problem that caused the error has been resolved and the requested object is now available.
       *
       * For more information, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun errorCachingMinTtl(errorCachingMinTtl: Number)

      /**
       * @param errorCode The HTTP status code for which you want to specify a custom error page
       * and/or a caching duration. 
       */
      public fun errorCode(errorCode: Number)

      /**
       * @param responseCode The HTTP status code that you want CloudFront to return to the viewer
       * along with the custom error page.
       * There are a variety of reasons that you might want CloudFront to return a status code
       * different from the status code that your origin returned to CloudFront, for example:
       *
       * * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP
       * 4xx and 5xx and prevent the response from being returned to the viewer. If you substitute
       * `200` , the response typically won't be intercepted.
       * * If you don't care about distinguishing among different client errors or server errors,
       * you can specify `400` or `500` as the `ResponseCode` for all 4xx or 5xx errors.
       * * You might want to return a `200` status code (OK) and static website so your customers
       * don't know that your website is down.
       *
       * If you specify a value for `ResponseCode` , you must also specify a value for
       * `ResponsePagePath` .
       */
      public fun responseCode(responseCode: Number)

      /**
       * @param responsePagePath The path to the custom error page that you want CloudFront to
       * return to a viewer when your origin returns the HTTP status code specified by `ErrorCode` ,
       * for example, `/4xx-errors/403-forbidden.html` . If you want to store your objects and your
       * custom error pages in different locations, your distribution must include a cache behavior for
       * which the following is true:.
       * * The value of `PathPattern` matches the path to your custom error messages. For example,
       * suppose you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory
       * named `/4xx-errors` . Your distribution must include a cache behavior for which the path
       * pattern routes requests for your custom error pages to that location, for example,
       * `/4xx-errors/ *` .
       * * The value of `TargetOriginId` specifies the value of the `ID` element for the origin that
       * contains your custom error pages.
       *
       * If you specify a value for `ResponsePagePath` , you must also specify a value for
       * `ResponseCode` .
       *
       * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom
       * error pages on an HTTP server and the server starts to return 5xx errors, CloudFront can't get
       * the files that you want to return to viewers because the origin server is unavailable.
       */
      public fun responsePagePath(responsePagePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty.builder()

      /**
       * @param errorCachingMinTtl The minimum amount of time, in seconds, that you want CloudFront
       * to cache the HTTP status code specified in `ErrorCode` .
       * When this time period has elapsed, CloudFront queries your origin to see whether the
       * problem that caused the error has been resolved and the requested object is now available.
       *
       * For more information, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun errorCachingMinTtl(errorCachingMinTtl: Number) {
        cdkBuilder.errorCachingMinTtl(errorCachingMinTtl)
      }

      /**
       * @param errorCode The HTTP status code for which you want to specify a custom error page
       * and/or a caching duration. 
       */
      override fun errorCode(errorCode: Number) {
        cdkBuilder.errorCode(errorCode)
      }

      /**
       * @param responseCode The HTTP status code that you want CloudFront to return to the viewer
       * along with the custom error page.
       * There are a variety of reasons that you might want CloudFront to return a status code
       * different from the status code that your origin returned to CloudFront, for example:
       *
       * * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP
       * 4xx and 5xx and prevent the response from being returned to the viewer. If you substitute
       * `200` , the response typically won't be intercepted.
       * * If you don't care about distinguishing among different client errors or server errors,
       * you can specify `400` or `500` as the `ResponseCode` for all 4xx or 5xx errors.
       * * You might want to return a `200` status code (OK) and static website so your customers
       * don't know that your website is down.
       *
       * If you specify a value for `ResponseCode` , you must also specify a value for
       * `ResponsePagePath` .
       */
      override fun responseCode(responseCode: Number) {
        cdkBuilder.responseCode(responseCode)
      }

      /**
       * @param responsePagePath The path to the custom error page that you want CloudFront to
       * return to a viewer when your origin returns the HTTP status code specified by `ErrorCode` ,
       * for example, `/4xx-errors/403-forbidden.html` . If you want to store your objects and your
       * custom error pages in different locations, your distribution must include a cache behavior for
       * which the following is true:.
       * * The value of `PathPattern` matches the path to your custom error messages. For example,
       * suppose you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory
       * named `/4xx-errors` . Your distribution must include a cache behavior for which the path
       * pattern routes requests for your custom error pages to that location, for example,
       * `/4xx-errors/ *` .
       * * The value of `TargetOriginId` specifies the value of the `ID` element for the origin that
       * contains your custom error pages.
       *
       * If you specify a value for `ResponsePagePath` , you must also specify a value for
       * `ResponseCode` .
       *
       * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom
       * error pages on an HTTP server and the server starts to return 5xx errors, CloudFront can't get
       * the files that you want to return to viewers because the origin server is unavailable.
       */
      override fun responsePagePath(responsePagePath: String) {
        cdkBuilder.responsePagePath(responsePagePath)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty,
    ) : CdkObject(cdkObject), CustomErrorResponseProperty {
      /**
       * The minimum amount of time, in seconds, that you want CloudFront to cache the HTTP status
       * code specified in `ErrorCode` .
       *
       * When this time period has elapsed, CloudFront queries your origin to see whether the
       * problem that caused the error has been resolved and the requested object is now available.
       *
       * For more information, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - 300
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl)
       */
      override fun errorCachingMinTtl(): Number? = unwrap(this).getErrorCachingMinTtl()

      /**
       * The HTTP status code for which you want to specify a custom error page and/or a caching
       * duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode)
       */
      override fun errorCode(): Number = unwrap(this).getErrorCode()

      /**
       * The HTTP status code that you want CloudFront to return to the viewer along with the custom
       * error page.
       *
       * There are a variety of reasons that you might want CloudFront to return a status code
       * different from the status code that your origin returned to CloudFront, for example:
       *
       * * Some Internet devices (some firewalls and corporate proxies, for example) intercept HTTP
       * 4xx and 5xx and prevent the response from being returned to the viewer. If you substitute
       * `200` , the response typically won't be intercepted.
       * * If you don't care about distinguishing among different client errors or server errors,
       * you can specify `400` or `500` as the `ResponseCode` for all 4xx or 5xx errors.
       * * You might want to return a `200` status code (OK) and static website so your customers
       * don't know that your website is down.
       *
       * If you specify a value for `ResponseCode` , you must also specify a value for
       * `ResponsePagePath` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode)
       */
      override fun responseCode(): Number? = unwrap(this).getResponseCode()

      /**
       * The path to the custom error page that you want CloudFront to return to a viewer when your
       * origin returns the HTTP status code specified by `ErrorCode` , for example,
       * `/4xx-errors/403-forbidden.html` . If you want to store your objects and your custom error
       * pages in different locations, your distribution must include a cache behavior for which the
       * following is true:.
       *
       * * The value of `PathPattern` matches the path to your custom error messages. For example,
       * suppose you saved custom error pages for 4xx errors in an Amazon S3 bucket in a directory
       * named `/4xx-errors` . Your distribution must include a cache behavior for which the path
       * pattern routes requests for your custom error pages to that location, for example,
       * `/4xx-errors/ *` .
       * * The value of `TargetOriginId` specifies the value of the `ID` element for the origin that
       * contains your custom error pages.
       *
       * If you specify a value for `ResponsePagePath` , you must also specify a value for
       * `ResponseCode` .
       *
       * We recommend that you store custom error pages in an Amazon S3 bucket. If you store custom
       * error pages on an HTTP server and the server starts to return 5xx errors, CloudFront can't get
       * the files that you want to return to viewers because the origin server is unavailable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath)
       */
      override fun responsePagePath(): String? = unwrap(this).getResponsePagePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomErrorResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty):
          CustomErrorResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomErrorResponseProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomErrorResponseProperty
    }
  }

  /**
   * A complex type that controls the countries in which your content is distributed.
   *
   * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To disable
   * geo restriction, remove the
   * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
   * property from your stack template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * GeoRestrictionProperty geoRestrictionProperty = GeoRestrictionProperty.builder()
   * .restrictionType("restrictionType")
   * // the properties below are optional
   * .locations(List.of("locations"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html)
   */
  public interface GeoRestrictionProperty {
    /**
     * A complex type that contains a `Location` element for each country in which you want
     * CloudFront either to distribute your content ( `whitelist` ) or not distribute your content (
     * `blacklist` ).
     *
     * The `Location` element is a two-letter, uppercase country code for a country that you want to
     * include in your `blacklist` or `whitelist` . Include one `Location` element for each country.
     *
     * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of countries
     * and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International Organization
     * for Standardization* website. You can also refer to the country list on the CloudFront console,
     * which includes both country names and codes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations)
     */
    public fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

    /**
     * The method that you want to use to restrict distribution of your content by country:.
     *
     * * `none` : No geo restriction is enabled, meaning access to content is not restricted by
     * client geo location.
     * * `blacklist` : The `Location` elements specify the countries in which you don't want
     * CloudFront to distribute your content.
     * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront to
     * distribute your content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype)
     */
    public fun restrictionType(): String

    /**
     * A builder for [GeoRestrictionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param locations A complex type that contains a `Location` element for each country in
       * which you want CloudFront either to distribute your content ( `whitelist` ) or not distribute
       * your content ( `blacklist` ).
       * The `Location` element is a two-letter, uppercase country code for a country that you want
       * to include in your `blacklist` or `whitelist` . Include one `Location` element for each
       * country.
       *
       * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of
       * countries and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International
       * Organization for Standardization* website. You can also refer to the country list on the
       * CloudFront console, which includes both country names and codes.
       */
      public fun locations(locations: List<String>)

      /**
       * @param locations A complex type that contains a `Location` element for each country in
       * which you want CloudFront either to distribute your content ( `whitelist` ) or not distribute
       * your content ( `blacklist` ).
       * The `Location` element is a two-letter, uppercase country code for a country that you want
       * to include in your `blacklist` or `whitelist` . Include one `Location` element for each
       * country.
       *
       * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of
       * countries and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International
       * Organization for Standardization* website. You can also refer to the country list on the
       * CloudFront console, which includes both country names and codes.
       */
      public fun locations(vararg locations: String)

      /**
       * @param restrictionType The method that you want to use to restrict distribution of your
       * content by country:. 
       * * `none` : No geo restriction is enabled, meaning access to content is not restricted by
       * client geo location.
       * * `blacklist` : The `Location` elements specify the countries in which you don't want
       * CloudFront to distribute your content.
       * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront
       * to distribute your content.
       */
      public fun restrictionType(restrictionType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty.builder()

      /**
       * @param locations A complex type that contains a `Location` element for each country in
       * which you want CloudFront either to distribute your content ( `whitelist` ) or not distribute
       * your content ( `blacklist` ).
       * The `Location` element is a two-letter, uppercase country code for a country that you want
       * to include in your `blacklist` or `whitelist` . Include one `Location` element for each
       * country.
       *
       * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of
       * countries and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International
       * Organization for Standardization* website. You can also refer to the country list on the
       * CloudFront console, which includes both country names and codes.
       */
      override fun locations(locations: List<String>) {
        cdkBuilder.locations(locations)
      }

      /**
       * @param locations A complex type that contains a `Location` element for each country in
       * which you want CloudFront either to distribute your content ( `whitelist` ) or not distribute
       * your content ( `blacklist` ).
       * The `Location` element is a two-letter, uppercase country code for a country that you want
       * to include in your `blacklist` or `whitelist` . Include one `Location` element for each
       * country.
       *
       * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of
       * countries and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International
       * Organization for Standardization* website. You can also refer to the country list on the
       * CloudFront console, which includes both country names and codes.
       */
      override fun locations(vararg locations: String): Unit = locations(locations.toList())

      /**
       * @param restrictionType The method that you want to use to restrict distribution of your
       * content by country:. 
       * * `none` : No geo restriction is enabled, meaning access to content is not restricted by
       * client geo location.
       * * `blacklist` : The `Location` elements specify the countries in which you don't want
       * CloudFront to distribute your content.
       * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront
       * to distribute your content.
       */
      override fun restrictionType(restrictionType: String) {
        cdkBuilder.restrictionType(restrictionType)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty,
    ) : CdkObject(cdkObject), GeoRestrictionProperty {
      /**
       * A complex type that contains a `Location` element for each country in which you want
       * CloudFront either to distribute your content ( `whitelist` ) or not distribute your content (
       * `blacklist` ).
       *
       * The `Location` element is a two-letter, uppercase country code for a country that you want
       * to include in your `blacklist` or `whitelist` . Include one `Location` element for each
       * country.
       *
       * CloudFront and `MaxMind` both use `ISO 3166` country codes. For the current list of
       * countries and the corresponding codes, see `ISO 3166-1-alpha-2` code on the *International
       * Organization for Standardization* website. You can also refer to the country list on the
       * CloudFront console, which includes both country names and codes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-locations)
       */
      override fun locations(): List<String> = unwrap(this).getLocations() ?: emptyList()

      /**
       * The method that you want to use to restrict distribution of your content by country:.
       *
       * * `none` : No geo restriction is enabled, meaning access to content is not restricted by
       * client geo location.
       * * `blacklist` : The `Location` elements specify the countries in which you don't want
       * CloudFront to distribute your content.
       * * `whitelist` : The `Location` elements specify the countries in which you want CloudFront
       * to distribute your content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html#cfn-cloudfront-distribution-georestriction-restrictiontype)
       */
      override fun restrictionType(): String = unwrap(this).getRestrictionType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GeoRestrictionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty):
          GeoRestrictionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GeoRestrictionProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.GeoRestrictionProperty
    }
  }

  /**
   * A complex type that contains information about the Amazon S3 origin.
   *
   * If the origin is a custom origin or an S3 bucket that is configured as a website endpoint, use
   * the `CustomOriginConfig` element instead.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * S3OriginConfigProperty s3OriginConfigProperty = S3OriginConfigProperty.builder()
   * .originAccessIdentity("originAccessIdentity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html)
   */
  public interface S3OriginConfigProperty {
    /**
     * If you're using origin access control (OAC) instead of origin access identity, specify an
     * empty `OriginAccessIdentity` element.
     *
     * For more information, see [Restricting access to an
     * AWS](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-origin.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The CloudFront origin access identity to associate with the origin. Use an origin access
     * identity to configure the origin so that viewers can *only* access objects in an Amazon S3
     * bucket through CloudFront. The format of the value is:
     *
     * `origin-access-identity/cloudfront/ID-of-origin-access-identity`
     *
     * The `*ID-of-origin-access-identity*` is the value that CloudFront returned in the `ID`
     * element when you created the origin access identity.
     *
     * If you want viewers to be able to access objects using either the CloudFront URL or the
     * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
     *
     * To delete the origin access identity from an existing distribution, update the distribution
     * configuration and include an empty `OriginAccessIdentity` element.
     *
     * To replace the origin access identity, update the distribution configuration and specify the
     * new origin access identity.
     *
     * For more information about the origin access identity, see [Serving Private Content through
     * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity)
     */
    public fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()

    /**
     * A builder for [S3OriginConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param originAccessIdentity If you're using origin access control (OAC) instead of origin
       * access identity, specify an empty `OriginAccessIdentity` element.
       * For more information, see [Restricting access to an
       * AWS](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-origin.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The CloudFront origin access identity to associate with the origin. Use an origin access
       * identity to configure the origin so that viewers can *only* access objects in an Amazon S3
       * bucket through CloudFront. The format of the value is:
       *
       * `origin-access-identity/cloudfront/ID-of-origin-access-identity`
       *
       * The `*ID-of-origin-access-identity*` is the value that CloudFront returned in the `ID`
       * element when you created the origin access identity.
       *
       * If you want viewers to be able to access objects using either the CloudFront URL or the
       * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
       *
       * To delete the origin access identity from an existing distribution, update the distribution
       * configuration and include an empty `OriginAccessIdentity` element.
       *
       * To replace the origin access identity, update the distribution configuration and specify
       * the new origin access identity.
       *
       * For more information about the origin access identity, see [Serving Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originAccessIdentity(originAccessIdentity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty.builder()

      /**
       * @param originAccessIdentity If you're using origin access control (OAC) instead of origin
       * access identity, specify an empty `OriginAccessIdentity` element.
       * For more information, see [Restricting access to an
       * AWS](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-origin.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The CloudFront origin access identity to associate with the origin. Use an origin access
       * identity to configure the origin so that viewers can *only* access objects in an Amazon S3
       * bucket through CloudFront. The format of the value is:
       *
       * `origin-access-identity/cloudfront/ID-of-origin-access-identity`
       *
       * The `*ID-of-origin-access-identity*` is the value that CloudFront returned in the `ID`
       * element when you created the origin access identity.
       *
       * If you want viewers to be able to access objects using either the CloudFront URL or the
       * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
       *
       * To delete the origin access identity from an existing distribution, update the distribution
       * configuration and include an empty `OriginAccessIdentity` element.
       *
       * To replace the origin access identity, update the distribution configuration and specify
       * the new origin access identity.
       *
       * For more information about the origin access identity, see [Serving Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty,
    ) : CdkObject(cdkObject), S3OriginConfigProperty {
      /**
       * If you're using origin access control (OAC) instead of origin access identity, specify an
       * empty `OriginAccessIdentity` element.
       *
       * For more information, see [Restricting access to an
       * AWS](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-origin.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The CloudFront origin access identity to associate with the origin. Use an origin access
       * identity to configure the origin so that viewers can *only* access objects in an Amazon S3
       * bucket through CloudFront. The format of the value is:
       *
       * `origin-access-identity/cloudfront/ID-of-origin-access-identity`
       *
       * The `*ID-of-origin-access-identity*` is the value that CloudFront returned in the `ID`
       * element when you created the origin access identity.
       *
       * If you want viewers to be able to access objects using either the CloudFront URL or the
       * Amazon S3 URL, specify an empty `OriginAccessIdentity` element.
       *
       * To delete the origin access identity from an existing distribution, update the distribution
       * configuration and include an empty `OriginAccessIdentity` element.
       *
       * To replace the origin access identity, update the distribution configuration and specify
       * the new origin access identity.
       *
       * For more information about the origin access identity, see [Serving Private Content through
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html#cfn-cloudfront-distribution-s3originconfig-originaccessidentity)
       */
      override fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OriginConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty):
          S3OriginConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OriginConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.S3OriginConfigProperty
    }
  }

  /**
   * A complex type that controls whether access logs are written for the distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * LoggingProperty loggingProperty = LoggingProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .includeCookies(false)
   * .prefix("prefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html)
   */
  public interface LoggingProperty {
    /**
     * The Amazon S3 bucket to store the access logs in, for example,
     * `myawslogbucket.s3.amazonaws.com` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-bucket)
     */
    public fun bucket(): String

    /**
     * Specifies whether you want CloudFront to include cookies in access logs, specify `true` for
     * `IncludeCookies` .
     *
     * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
     * configure the cache behaviors for this distribution. If you don't want to include cookies when
     * you create a distribution or if you want to disable include cookies for an existing
     * distribution, specify `false` for `IncludeCookies` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-includecookies)
     */
    public fun includeCookies(): Any? = unwrap(this).getIncludeCookies()

    /**
     * An optional string that you want CloudFront to prefix to the access log `filenames` for this
     * distribution, for example, `myprefix/` .
     *
     * If you want to enable logging, but you don't want to specify a prefix, you still must include
     * an empty `Prefix` element in the `Logging` element.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * A builder for [LoggingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket to store the access logs in, for example,
       * `myawslogbucket.s3.amazonaws.com` . 
       */
      public fun bucket(bucket: String)

      /**
       * @param includeCookies Specifies whether you want CloudFront to include cookies in access
       * logs, specify `true` for `IncludeCookies` .
       * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
       * configure the cache behaviors for this distribution. If you don't want to include cookies when
       * you create a distribution or if you want to disable include cookies for an existing
       * distribution, specify `false` for `IncludeCookies` .
       */
      public fun includeCookies(includeCookies: Boolean)

      /**
       * @param includeCookies Specifies whether you want CloudFront to include cookies in access
       * logs, specify `true` for `IncludeCookies` .
       * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
       * configure the cache behaviors for this distribution. If you don't want to include cookies when
       * you create a distribution or if you want to disable include cookies for an existing
       * distribution, specify `false` for `IncludeCookies` .
       */
      public fun includeCookies(includeCookies: IResolvable)

      /**
       * @param prefix An optional string that you want CloudFront to prefix to the access log
       * `filenames` for this distribution, for example, `myprefix/` .
       * If you want to enable logging, but you don't want to specify a prefix, you still must
       * include an empty `Prefix` element in the `Logging` element.
       */
      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket to store the access logs in, for example,
       * `myawslogbucket.s3.amazonaws.com` . 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param includeCookies Specifies whether you want CloudFront to include cookies in access
       * logs, specify `true` for `IncludeCookies` .
       * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
       * configure the cache behaviors for this distribution. If you don't want to include cookies when
       * you create a distribution or if you want to disable include cookies for an existing
       * distribution, specify `false` for `IncludeCookies` .
       */
      override fun includeCookies(includeCookies: Boolean) {
        cdkBuilder.includeCookies(includeCookies)
      }

      /**
       * @param includeCookies Specifies whether you want CloudFront to include cookies in access
       * logs, specify `true` for `IncludeCookies` .
       * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
       * configure the cache behaviors for this distribution. If you don't want to include cookies when
       * you create a distribution or if you want to disable include cookies for an existing
       * distribution, specify `false` for `IncludeCookies` .
       */
      override fun includeCookies(includeCookies: IResolvable) {
        cdkBuilder.includeCookies(includeCookies.let(IResolvable::unwrap))
      }

      /**
       * @param prefix An optional string that you want CloudFront to prefix to the access log
       * `filenames` for this distribution, for example, `myprefix/` .
       * If you want to enable logging, but you don't want to specify a prefix, you still must
       * include an empty `Prefix` element in the `Logging` element.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty,
    ) : CdkObject(cdkObject), LoggingProperty {
      /**
       * The Amazon S3 bucket to store the access logs in, for example,
       * `myawslogbucket.s3.amazonaws.com` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * Specifies whether you want CloudFront to include cookies in access logs, specify `true` for
       * `IncludeCookies` .
       *
       * If you choose to include cookies in logs, CloudFront logs all cookies regardless of how you
       * configure the cache behaviors for this distribution. If you don't want to include cookies when
       * you create a distribution or if you want to disable include cookies for an existing
       * distribution, specify `false` for `IncludeCookies` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-includecookies)
       */
      override fun includeCookies(): Any? = unwrap(this).getIncludeCookies()

      /**
       * An optional string that you want CloudFront to prefix to the access log `filenames` for
       * this distribution, for example, `myprefix/` .
       *
       * If you want to enable logging, but you don't want to specify a prefix, you still must
       * include an empty `Prefix` element in the `Logging` element.
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html#cfn-cloudfront-distribution-logging-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty):
          LoggingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LoggingProperty
    }
  }

  /**
   * This field is deprecated.
   *
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include cookies in the cache key, use a cache policy. For more information, see
   * [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send cookies to the origin but not include them in the cache key, use an origin
   * request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that specifies whether you want CloudFront to forward cookies to the origin and,
   * if so, which ones. For more information about forwarding cookies to the origin, see [How
   * CloudFront Forwards, Caches, and Logs
   * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in the
   * *Amazon CloudFront Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CookiesProperty cookiesProperty = CookiesProperty.builder()
   * .forward("forward")
   * // the properties below are optional
   * .whitelistedNames(List.of("whitelistedNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html)
   */
  public interface CookiesProperty {
    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include cookies in the cache key, use a cache policy. For more information,
     * see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send cookies to the origin but not include them in the cache key, use origin
     * request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the
     * list of cookies specified in the `WhitelistedNames` complex type.
     *
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an
     * Amazon S3 origin, specify none for the `Forward` element.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward)
     */
    public fun forward(): String

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include cookies in the cache key, use a cache policy. For more information,
     * see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send cookies to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Required if you specify `whitelist` for the value of `Forward` . A complex type that
     * specifies how many different cookies you want CloudFront to forward to the origin for this cache
     * behavior and, if you want to forward selected cookies, the names of those cookies.
     *
     * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If you
     * change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
     * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
     *
     * For the current limit on the number of cookie names that you can whitelist for each cache
     * behavior, see [CloudFront
     * Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
     * in the *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames)
     */
    public fun whitelistedNames(): List<String> = unwrap(this).getWhitelistedNames() ?: emptyList()

    /**
     * A builder for [CookiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param forward This field is deprecated. 
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use origin
       * request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the
       * list of cookies specified in the `WhitelistedNames` complex type.
       *
       * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an
       * Amazon S3 origin, specify none for the `Forward` element.
       */
      public fun forward(forward: String)

      /**
       * @param whitelistedNames This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Required if you specify `whitelist` for the value of `Forward` . A complex type that
       * specifies how many different cookies you want CloudFront to forward to the origin for this
       * cache behavior and, if you want to forward selected cookies, the names of those cookies.
       *
       * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If
       * you change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
       * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
       *
       * For the current limit on the number of cookie names that you can whitelist for each cache
       * behavior, see [CloudFront
       * Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
       * in the *AWS General Reference* .
       */
      public fun whitelistedNames(whitelistedNames: List<String>)

      /**
       * @param whitelistedNames This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Required if you specify `whitelist` for the value of `Forward` . A complex type that
       * specifies how many different cookies you want CloudFront to forward to the origin for this
       * cache behavior and, if you want to forward selected cookies, the names of those cookies.
       *
       * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If
       * you change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
       * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
       *
       * For the current limit on the number of cookie names that you can whitelist for each cache
       * behavior, see [CloudFront
       * Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
       * in the *AWS General Reference* .
       */
      public fun whitelistedNames(vararg whitelistedNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty.builder()

      /**
       * @param forward This field is deprecated. 
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use origin
       * request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the
       * list of cookies specified in the `WhitelistedNames` complex type.
       *
       * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an
       * Amazon S3 origin, specify none for the `Forward` element.
       */
      override fun forward(forward: String) {
        cdkBuilder.forward(forward)
      }

      /**
       * @param whitelistedNames This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Required if you specify `whitelist` for the value of `Forward` . A complex type that
       * specifies how many different cookies you want CloudFront to forward to the origin for this
       * cache behavior and, if you want to forward selected cookies, the names of those cookies.
       *
       * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If
       * you change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
       * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
       *
       * For the current limit on the number of cookie names that you can whitelist for each cache
       * behavior, see [CloudFront
       * Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
       * in the *AWS General Reference* .
       */
      override fun whitelistedNames(whitelistedNames: List<String>) {
        cdkBuilder.whitelistedNames(whitelistedNames)
      }

      /**
       * @param whitelistedNames This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Required if you specify `whitelist` for the value of `Forward` . A complex type that
       * specifies how many different cookies you want CloudFront to forward to the origin for this
       * cache behavior and, if you want to forward selected cookies, the names of those cookies.
       *
       * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If
       * you change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
       * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
       *
       * For the current limit on the number of cookie names that you can whitelist for each cache
       * behavior, see [CloudFront
       * Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
       * in the *AWS General Reference* .
       */
      override fun whitelistedNames(vararg whitelistedNames: String): Unit =
          whitelistedNames(whitelistedNames.toList())

      public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty,
    ) : CdkObject(cdkObject), CookiesProperty {
      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use origin
       * request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the
       * list of cookies specified in the `WhitelistedNames` complex type.
       *
       * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an
       * Amazon S3 origin, specify none for the `Forward` element.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward)
       */
      override fun forward(): String = unwrap(this).getForward()

      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Required if you specify `whitelist` for the value of `Forward` . A complex type that
       * specifies how many different cookies you want CloudFront to forward to the origin for this
       * cache behavior and, if you want to forward selected cookies, the names of those cookies.
       *
       * If you specify `all` or `none` for the value of `Forward` , omit `WhitelistedNames` . If
       * you change the value of `Forward` from `whitelist` to `all` or `none` and you don't delete the
       * `WhitelistedNames` element and its child elements, CloudFront deletes them automatically.
       *
       * For the current limit on the number of cookie names that you can whitelist for each cache
       * behavior, see [CloudFront
       * Limits](https://docs.aws.amazon.com/general/latest/gr/xrefaws_service_limits.html#limits_cloudfront)
       * in the *AWS General Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames)
       */
      override fun whitelistedNames(): List<String> = unwrap(this).getWhitelistedNames() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty):
          CookiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty
    }
  }

  /**
   * A CloudFront function that is associated with a cache behavior in a CloudFront distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * FunctionAssociationProperty functionAssociationProperty = FunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .functionArn("functionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-functionassociation.html)
   */
  public interface FunctionAssociationProperty {
    /**
     * The event type of the function, either `viewer-request` or `viewer-response` .
     *
     * You cannot use origin-facing event types ( `origin-request` and `origin-response` ) with a
     * CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-functionassociation.html#cfn-cloudfront-distribution-functionassociation-eventtype)
     */
    public fun eventType(): String? = unwrap(this).getEventType()

    /**
     * The Amazon Resource Name (ARN) of the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-functionassociation.html#cfn-cloudfront-distribution-functionassociation-functionarn)
     */
    public fun functionArn(): String? = unwrap(this).getFunctionArn()

    /**
     * A builder for [FunctionAssociationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventType The event type of the function, either `viewer-request` or
       * `viewer-response` .
       * You cannot use origin-facing event types ( `origin-request` and `origin-response` ) with a
       * CloudFront function.
       */
      public fun eventType(eventType: String)

      /**
       * @param functionArn The Amazon Resource Name (ARN) of the function.
       */
      public fun functionArn(functionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty.builder()

      /**
       * @param eventType The event type of the function, either `viewer-request` or
       * `viewer-response` .
       * You cannot use origin-facing event types ( `origin-request` and `origin-response` ) with a
       * CloudFront function.
       */
      override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      /**
       * @param functionArn The Amazon Resource Name (ARN) of the function.
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty,
    ) : CdkObject(cdkObject), FunctionAssociationProperty {
      /**
       * The event type of the function, either `viewer-request` or `viewer-response` .
       *
       * You cannot use origin-facing event types ( `origin-request` and `origin-response` ) with a
       * CloudFront function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-functionassociation.html#cfn-cloudfront-distribution-functionassociation-eventtype)
       */
      override fun eventType(): String? = unwrap(this).getEventType()

      /**
       * The Amazon Resource Name (ARN) of the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-functionassociation.html#cfn-cloudfront-distribution-functionassociation-functionarn)
       */
      override fun functionArn(): String? = unwrap(this).getFunctionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty):
          FunctionAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionAssociationProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.FunctionAssociationProperty
    }
  }

  /**
   * A custom origin.
   *
   * A custom origin is any origin that is *not* an Amazon S3 bucket, with one exception. An Amazon
   * S3 bucket that is [configured with static website
   * hosting](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html) *is* a custom
   * origin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CustomOriginConfigProperty customOriginConfigProperty = CustomOriginConfigProperty.builder()
   * .originProtocolPolicy("originProtocolPolicy")
   * // the properties below are optional
   * .httpPort(123)
   * .httpsPort(123)
   * .originKeepaliveTimeout(123)
   * .originReadTimeout(123)
   * .originSslProtocols(List.of("originSslProtocols"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html)
   */
  public interface CustomOriginConfigProperty {
    /**
     * The HTTP port that CloudFront uses to connect to the origin.
     *
     * Specify the HTTP port that the origin listens on.
     *
     * Default: - 80
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport)
     */
    public fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * The HTTPS port that CloudFront uses to connect to the origin.
     *
     * Specify the HTTPS port that the origin listens on.
     *
     * Default: - 443
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport)
     */
    public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    /**
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     *
     * The minimum timeout is 1 second, the maximum is 60 seconds, and the default (if you don't
     * specify otherwise) is 5 seconds.
     *
     * For more information, see [Origin Keep-alive
     * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - 5
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout)
     */
    public fun originKeepaliveTimeout(): Number? = unwrap(this).getOriginKeepaliveTimeout()

    /**
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin. Valid
     * values are:.
     *
     * * `http-only` – CloudFront always uses HTTP to connect to the origin.
     * * `match-viewer` – CloudFront connects to the origin using the same protocol that the viewer
     * used to connect to CloudFront.
     * * `https-only` – CloudFront always uses HTTPS to connect to the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy)
     */
    public fun originProtocolPolicy(): String

    /**
     * Specifies how long, in seconds, CloudFront waits for a response from the origin.
     *
     * This is also known as the *origin response timeout* . The minimum timeout is 1 second, the
     * maximum is 60 seconds, and the default (if you don't specify otherwise) is 30 seconds.
     *
     * For more information, see [Origin Response
     * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - 30
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout)
     */
    public fun originReadTimeout(): Number? = unwrap(this).getOriginReadTimeout()

    /**
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin
     * over HTTPS.
     *
     * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
     *
     * For more information, see [Minimum Origin SSL
     * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols)
     */
    public fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols() ?:
        emptyList()

    /**
     * A builder for [CustomOriginConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpPort The HTTP port that CloudFront uses to connect to the origin.
       * Specify the HTTP port that the origin listens on.
       */
      public fun httpPort(httpPort: Number)

      /**
       * @param httpsPort The HTTPS port that CloudFront uses to connect to the origin.
       * Specify the HTTPS port that the origin listens on.
       */
      public fun httpsPort(httpsPort: Number)

      /**
       * @param originKeepaliveTimeout Specifies how long, in seconds, CloudFront persists its
       * connection to the origin.
       * The minimum timeout is 1 second, the maximum is 60 seconds, and the default (if you don't
       * specify otherwise) is 5 seconds.
       *
       * For more information, see [Origin Keep-alive
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originKeepaliveTimeout(originKeepaliveTimeout: Number)

      /**
       * @param originProtocolPolicy Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
       * connect to the origin. Valid values are:. 
       * * `http-only` – CloudFront always uses HTTP to connect to the origin.
       * * `match-viewer` – CloudFront connects to the origin using the same protocol that the
       * viewer used to connect to CloudFront.
       * * `https-only` – CloudFront always uses HTTPS to connect to the origin.
       */
      public fun originProtocolPolicy(originProtocolPolicy: String)

      /**
       * @param originReadTimeout Specifies how long, in seconds, CloudFront waits for a response
       * from the origin.
       * This is also known as the *origin response timeout* . The minimum timeout is 1 second, the
       * maximum is 60 seconds, and the default (if you don't specify otherwise) is 30 seconds.
       *
       * For more information, see [Origin Response
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originReadTimeout(originReadTimeout: Number)

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originSslProtocols(originSslProtocols: List<String>)

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originSslProtocols(vararg originSslProtocols: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty.builder()

      /**
       * @param httpPort The HTTP port that CloudFront uses to connect to the origin.
       * Specify the HTTP port that the origin listens on.
       */
      override fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
      }

      /**
       * @param httpsPort The HTTPS port that CloudFront uses to connect to the origin.
       * Specify the HTTPS port that the origin listens on.
       */
      override fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
      }

      /**
       * @param originKeepaliveTimeout Specifies how long, in seconds, CloudFront persists its
       * connection to the origin.
       * The minimum timeout is 1 second, the maximum is 60 seconds, and the default (if you don't
       * specify otherwise) is 5 seconds.
       *
       * For more information, see [Origin Keep-alive
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originKeepaliveTimeout(originKeepaliveTimeout: Number) {
        cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout)
      }

      /**
       * @param originProtocolPolicy Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
       * connect to the origin. Valid values are:. 
       * * `http-only` – CloudFront always uses HTTP to connect to the origin.
       * * `match-viewer` – CloudFront connects to the origin using the same protocol that the
       * viewer used to connect to CloudFront.
       * * `https-only` – CloudFront always uses HTTPS to connect to the origin.
       */
      override fun originProtocolPolicy(originProtocolPolicy: String) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
      }

      /**
       * @param originReadTimeout Specifies how long, in seconds, CloudFront waits for a response
       * from the origin.
       * This is also known as the *origin response timeout* . The minimum timeout is 1 second, the
       * maximum is 60 seconds, and the default (if you don't specify otherwise) is 30 seconds.
       *
       * For more information, see [Origin Response
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originReadTimeout(originReadTimeout: Number) {
        cdkBuilder.originReadTimeout(originReadTimeout)
      }

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originSslProtocols(originSslProtocols: List<String>) {
        cdkBuilder.originSslProtocols(originSslProtocols)
      }

      /**
       * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
       * connecting to your origin over HTTPS.
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originSslProtocols(vararg originSslProtocols: String): Unit =
          originSslProtocols(originSslProtocols.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty,
    ) : CdkObject(cdkObject), CustomOriginConfigProperty {
      /**
       * The HTTP port that CloudFront uses to connect to the origin.
       *
       * Specify the HTTP port that the origin listens on.
       *
       * Default: - 80
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpport)
       */
      override fun httpPort(): Number? = unwrap(this).getHttpPort()

      /**
       * The HTTPS port that CloudFront uses to connect to the origin.
       *
       * Specify the HTTPS port that the origin listens on.
       *
       * Default: - 443
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-httpsport)
       */
      override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

      /**
       * Specifies how long, in seconds, CloudFront persists its connection to the origin.
       *
       * The minimum timeout is 1 second, the maximum is 60 seconds, and the default (if you don't
       * specify otherwise) is 5 seconds.
       *
       * For more information, see [Origin Keep-alive
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - 5
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originkeepalivetimeout)
       */
      override fun originKeepaliveTimeout(): Number? = unwrap(this).getOriginKeepaliveTimeout()

      /**
       * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin. Valid
       * values are:.
       *
       * * `http-only` – CloudFront always uses HTTP to connect to the origin.
       * * `match-viewer` – CloudFront connects to the origin using the same protocol that the
       * viewer used to connect to CloudFront.
       * * `https-only` – CloudFront always uses HTTPS to connect to the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originprotocolpolicy)
       */
      override fun originProtocolPolicy(): String = unwrap(this).getOriginProtocolPolicy()

      /**
       * Specifies how long, in seconds, CloudFront waits for a response from the origin.
       *
       * This is also known as the *origin response timeout* . The minimum timeout is 1 second, the
       * maximum is 60 seconds, and the default (if you don't specify otherwise) is 30 seconds.
       *
       * For more information, see [Origin Response
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - 30
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originreadtimeout)
       */
      override fun originReadTimeout(): Number? = unwrap(this).getOriginReadTimeout()

      /**
       * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin
       * over HTTPS.
       *
       * Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` , and `TLSv1.2` .
       *
       * For more information, see [Minimum Origin SSL
       * Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html#cfn-cloudfront-distribution-customoriginconfig-originsslprotocols)
       */
      override fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomOriginConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty):
          CustomOriginConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomOriginConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.CustomOriginConfigProperty
    }
  }

  /**
   * This field is deprecated.
   *
   * We recommend that you use a cache policy or an origin request policy instead of this field.
   *
   * If you want to include values in the cache key, use a cache policy. For more information, see
   * [Creating cache
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * If you want to send values to the origin but not include them in the cache key, use an origin
   * request policy. For more information, see [Creating origin request
   * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP headers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ForwardedValuesProperty forwardedValuesProperty = ForwardedValuesProperty.builder()
   * .queryString(false)
   * // the properties below are optional
   * .cookies(CookiesProperty.builder()
   * .forward("forward")
   * // the properties below are optional
   * .whitelistedNames(List.of("whitelistedNames"))
   * .build())
   * .headers(List.of("headers"))
   * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html)
   */
  public interface ForwardedValuesProperty {
    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include cookies in the cache key, use a cache policy. For more information,
     * see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send cookies to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A complex type that specifies whether you want CloudFront to forward cookies to the origin
     * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
     * CloudFront Forwards, Caches, and Logs
     * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in the
     * *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-cookies)
     */
    public fun cookies(): Any? = unwrap(this).getCookies()

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include headers in the cache key, use a cache policy. For more information,
     * see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send headers to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward to
     * the origin for this cache behavior (whitelisted headers). For the headers that you specify,
     * CloudFront also caches separate versions of a specified object that is based on the header
     * values in viewer requests.
     *
     * For more information, see [Caching Content Based on Request
     * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers)
     */
    public fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include query strings in the cache key, use a cache policy. For more
     * information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send query strings to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Indicates whether you want CloudFront to forward query strings to the origin that is
     * associated with this cache behavior and cache based on the query string parameters. CloudFront
     * behavior depends on the value of `QueryString` and on the values that you specify for
     * `QueryStringCacheKeys` , if any:
     *
     * If you specify true for `QueryString` and you don't specify any values for
     * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and
     * caches based on all query string parameters. Depending on how many query string parameters and
     * values you have, this can adversely affect performance because CloudFront must forward more
     * requests to the origin.
     *
     * If you specify true for `QueryString` and you specify one or more values for
     * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
     * only caches based on the query string parameters that you specify.
     *
     * If you specify false for `QueryString` , CloudFront doesn't forward any query string
     * parameters to the origin, and doesn't cache based on query string parameters.
     *
     * For more information, see [Configuring CloudFront to Cache Based on Query String
     * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring)
     */
    public fun queryString(): Any

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include query strings in the cache key, use a cache policy. For more
     * information, see [Creating cache
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send query strings to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see [Creating origin request
     * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A complex type that contains information about the query string parameters that you want
     * CloudFront to use for caching for this cache behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys)
     */
    public fun queryStringCacheKeys(): List<String> = unwrap(this).getQueryStringCacheKeys() ?:
        emptyList()

    /**
     * A builder for [ForwardedValuesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookies This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies whether you want CloudFront to forward cookies to the origin
       * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
       * CloudFront Forwards, Caches, and Logs
       * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      public fun cookies(cookies: IResolvable)

      /**
       * @param cookies This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies whether you want CloudFront to forward cookies to the origin
       * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
       * CloudFront Forwards, Caches, and Logs
       * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      public fun cookies(cookies: CookiesProperty)

      /**
       * @param cookies This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies whether you want CloudFront to forward cookies to the origin
       * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
       * CloudFront Forwards, Caches, and Logs
       * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("666e662212dff6226b09427b06ca346ed73b4e2e9770e95579189693bce8332b")
      public fun cookies(cookies: CookiesProperty.Builder.() -> Unit)

      /**
       * @param headers This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include headers in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send headers to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward
       * to the origin for this cache behavior (whitelisted headers). For the headers that you specify,
       * CloudFront also caches separate versions of a specified object that is based on the header
       * values in viewer requests.
       *
       * For more information, see [Caching Content Based on Request
       * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun headers(headers: List<String>)

      /**
       * @param headers This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include headers in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send headers to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward
       * to the origin for this cache behavior (whitelisted headers). For the headers that you specify,
       * CloudFront also caches separate versions of a specified object that is based on the header
       * values in viewer requests.
       *
       * For more information, see [Caching Content Based on Request
       * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun headers(vararg headers: String)

      /**
       * @param queryString This field is deprecated. 
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Indicates whether you want CloudFront to forward query strings to the origin that is
       * associated with this cache behavior and cache based on the query string parameters. CloudFront
       * behavior depends on the value of `QueryString` and on the values that you specify for
       * `QueryStringCacheKeys` , if any:
       *
       * If you specify true for `QueryString` and you don't specify any values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and
       * caches based on all query string parameters. Depending on how many query string parameters and
       * values you have, this can adversely affect performance because CloudFront must forward more
       * requests to the origin.
       *
       * If you specify true for `QueryString` and you specify one or more values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
       * only caches based on the query string parameters that you specify.
       *
       * If you specify false for `QueryString` , CloudFront doesn't forward any query string
       * parameters to the origin, and doesn't cache based on query string parameters.
       *
       * For more information, see [Configuring CloudFront to Cache Based on Query String
       * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun queryString(queryString: Boolean)

      /**
       * @param queryString This field is deprecated. 
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Indicates whether you want CloudFront to forward query strings to the origin that is
       * associated with this cache behavior and cache based on the query string parameters. CloudFront
       * behavior depends on the value of `QueryString` and on the values that you specify for
       * `QueryStringCacheKeys` , if any:
       *
       * If you specify true for `QueryString` and you don't specify any values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and
       * caches based on all query string parameters. Depending on how many query string parameters and
       * values you have, this can adversely affect performance because CloudFront must forward more
       * requests to the origin.
       *
       * If you specify true for `QueryString` and you specify one or more values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
       * only caches based on the query string parameters that you specify.
       *
       * If you specify false for `QueryString` , CloudFront doesn't forward any query string
       * parameters to the origin, and doesn't cache based on query string parameters.
       *
       * For more information, see [Configuring CloudFront to Cache Based on Query String
       * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun queryString(queryString: IResolvable)

      /**
       * @param queryStringCacheKeys This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that contains information about the query string parameters that you want
       * CloudFront to use for caching for this cache behavior.
       */
      public fun queryStringCacheKeys(queryStringCacheKeys: List<String>)

      /**
       * @param queryStringCacheKeys This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that contains information about the query string parameters that you want
       * CloudFront to use for caching for this cache behavior.
       */
      public fun queryStringCacheKeys(vararg queryStringCacheKeys: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.builder()

      /**
       * @param cookies This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies whether you want CloudFront to forward cookies to the origin
       * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
       * CloudFront Forwards, Caches, and Logs
       * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      override fun cookies(cookies: IResolvable) {
        cdkBuilder.cookies(cookies.let(IResolvable::unwrap))
      }

      /**
       * @param cookies This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies whether you want CloudFront to forward cookies to the origin
       * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
       * CloudFront Forwards, Caches, and Logs
       * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      override fun cookies(cookies: CookiesProperty) {
        cdkBuilder.cookies(cookies.let(CookiesProperty::unwrap))
      }

      /**
       * @param cookies This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies whether you want CloudFront to forward cookies to the origin
       * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
       * CloudFront Forwards, Caches, and Logs
       * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("666e662212dff6226b09427b06ca346ed73b4e2e9770e95579189693bce8332b")
      override fun cookies(cookies: CookiesProperty.Builder.() -> Unit): Unit =
          cookies(CookiesProperty(cookies))

      /**
       * @param headers This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include headers in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send headers to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward
       * to the origin for this cache behavior (whitelisted headers). For the headers that you specify,
       * CloudFront also caches separate versions of a specified object that is based on the header
       * values in viewer requests.
       *
       * For more information, see [Caching Content Based on Request
       * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun headers(headers: List<String>) {
        cdkBuilder.headers(headers)
      }

      /**
       * @param headers This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include headers in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send headers to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward
       * to the origin for this cache behavior (whitelisted headers). For the headers that you specify,
       * CloudFront also caches separate versions of a specified object that is based on the header
       * values in viewer requests.
       *
       * For more information, see [Caching Content Based on Request
       * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun headers(vararg headers: String): Unit = headers(headers.toList())

      /**
       * @param queryString This field is deprecated. 
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Indicates whether you want CloudFront to forward query strings to the origin that is
       * associated with this cache behavior and cache based on the query string parameters. CloudFront
       * behavior depends on the value of `QueryString` and on the values that you specify for
       * `QueryStringCacheKeys` , if any:
       *
       * If you specify true for `QueryString` and you don't specify any values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and
       * caches based on all query string parameters. Depending on how many query string parameters and
       * values you have, this can adversely affect performance because CloudFront must forward more
       * requests to the origin.
       *
       * If you specify true for `QueryString` and you specify one or more values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
       * only caches based on the query string parameters that you specify.
       *
       * If you specify false for `QueryString` , CloudFront doesn't forward any query string
       * parameters to the origin, and doesn't cache based on query string parameters.
       *
       * For more information, see [Configuring CloudFront to Cache Based on Query String
       * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun queryString(queryString: Boolean) {
        cdkBuilder.queryString(queryString)
      }

      /**
       * @param queryString This field is deprecated. 
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Indicates whether you want CloudFront to forward query strings to the origin that is
       * associated with this cache behavior and cache based on the query string parameters. CloudFront
       * behavior depends on the value of `QueryString` and on the values that you specify for
       * `QueryStringCacheKeys` , if any:
       *
       * If you specify true for `QueryString` and you don't specify any values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and
       * caches based on all query string parameters. Depending on how many query string parameters and
       * values you have, this can adversely affect performance because CloudFront must forward more
       * requests to the origin.
       *
       * If you specify true for `QueryString` and you specify one or more values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
       * only caches based on the query string parameters that you specify.
       *
       * If you specify false for `QueryString` , CloudFront doesn't forward any query string
       * parameters to the origin, and doesn't cache based on query string parameters.
       *
       * For more information, see [Configuring CloudFront to Cache Based on Query String
       * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun queryString(queryString: IResolvable) {
        cdkBuilder.queryString(queryString.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringCacheKeys This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that contains information about the query string parameters that you want
       * CloudFront to use for caching for this cache behavior.
       */
      override fun queryStringCacheKeys(queryStringCacheKeys: List<String>) {
        cdkBuilder.queryStringCacheKeys(queryStringCacheKeys)
      }

      /**
       * @param queryStringCacheKeys This field is deprecated.
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that contains information about the query string parameters that you want
       * CloudFront to use for caching for this cache behavior.
       */
      override fun queryStringCacheKeys(vararg queryStringCacheKeys: String): Unit =
          queryStringCacheKeys(queryStringCacheKeys.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty,
    ) : CdkObject(cdkObject), ForwardedValuesProperty {
      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include cookies in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send cookies to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies whether you want CloudFront to forward cookies to the origin
       * and, if so, which ones. For more information about forwarding cookies to the origin, see [How
       * CloudFront Forwards, Caches, and Logs
       * Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html) in
       * the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-cookies)
       */
      override fun cookies(): Any? = unwrap(this).getCookies()

      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include headers in the cache key, use a cache policy. For more information,
       * see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send headers to the origin but not include them in the cache key, use an
       * origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that specifies the `Headers` , if any, that you want CloudFront to forward
       * to the origin for this cache behavior (whitelisted headers). For the headers that you specify,
       * CloudFront also caches separate versions of a specified object that is based on the header
       * values in viewer requests.
       *
       * For more information, see [Caching Content Based on Request
       * Headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers)
       */
      override fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Indicates whether you want CloudFront to forward query strings to the origin that is
       * associated with this cache behavior and cache based on the query string parameters. CloudFront
       * behavior depends on the value of `QueryString` and on the values that you specify for
       * `QueryStringCacheKeys` , if any:
       *
       * If you specify true for `QueryString` and you don't specify any values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin and
       * caches based on all query string parameters. Depending on how many query string parameters and
       * values you have, this can adversely affect performance because CloudFront must forward more
       * requests to the origin.
       *
       * If you specify true for `QueryString` and you specify one or more values for
       * `QueryStringCacheKeys` , CloudFront forwards all query string parameters to the origin, but it
       * only caches based on the query string parameters that you specify.
       *
       * If you specify false for `QueryString` , CloudFront doesn't forward any query string
       * parameters to the origin, and doesn't cache based on query string parameters.
       *
       * For more information, see [Configuring CloudFront to Cache Based on Query String
       * Parameters](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/QueryStringParameters.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring)
       */
      override fun queryString(): Any = unwrap(this).getQueryString()

      /**
       * This field is deprecated.
       *
       * We recommend that you use a cache policy or an origin request policy instead of this field.
       *
       * If you want to include query strings in the cache key, use a cache policy. For more
       * information, see [Creating cache
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you want to send query strings to the origin but not include them in the cache key, use
       * an origin request policy. For more information, see [Creating origin request
       * policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * A complex type that contains information about the query string parameters that you want
       * CloudFront to use for caching for this cache behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys)
       */
      override fun queryStringCacheKeys(): List<String> = unwrap(this).getQueryStringCacheKeys() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ForwardedValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty):
          ForwardedValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForwardedValuesProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty
    }
  }

  /**
   * A complex type that determines the distribution's SSL/TLS configuration for communicating with
   * viewers.
   *
   * If the distribution doesn't use `Aliases` (also known as alternate domain names or CNAMEs)—that
   * is, if the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
   * —set `CloudFrontDefaultCertificate` to `true` and leave all other fields empty.
   *
   * If the distribution uses `Aliases` (alternate domain names or CNAMEs), use the fields in this
   * type to specify the following settings:
   *
   * * Which viewers the distribution accepts HTTPS connections from: only viewers that support
   * [server name indication
   * (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication)
   * (recommended), or all viewers including those that don't support SNI.
   * * To accept HTTPS connections from only viewers that support SNI, set `SSLSupportMethod` to
   * `sni-only` . This is recommended. Most browsers and clients support SNI. (In CloudFormation, the
   * field name is `SslSupportMethod` . Note the different capitalization.)
   * * To accept HTTPS connections from all viewers, including those that don't support SNI, set
   * `SSLSupportMethod` to `vip` . This is not recommended, and results in additional monthly charges
   * from CloudFront. (In CloudFormation, the field name is `SslSupportMethod` . Note the different
   * capitalization.)
   * * The minimum SSL/TLS protocol version that the distribution can use to communicate with
   * viewers. To specify a minimum version, choose a value for `MinimumProtocolVersion` . For more
   * information, see [Security
   * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
   * in the *Amazon CloudFront Developer Guide* .
   * * The location of the SSL/TLS certificate, [AWS Certificate Manager
   * (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html) (recommended) or [AWS
   * Identity and Access Management
   * (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) . You
   * specify the location by setting a value in one of the following fields (not both):
   * * `ACMCertificateArn` (In CloudFormation, this field name is `AcmCertificateArn` . Note the
   * different capitalization.)
   * * `IAMCertificateId` (In CloudFormation, this field name is `IamCertificateId` . Note the
   * different capitalization.)
   *
   * All distributions support HTTPS connections from viewers. To require viewers to use HTTPS only,
   * or to redirect them from HTTP to HTTPS, use `ViewerProtocolPolicy` in the `CacheBehavior` or
   * `DefaultCacheBehavior` . To specify how CloudFront should use SSL/TLS to communicate with your
   * custom origin, use `CustomOriginConfig` .
   *
   * For more information, see [Using HTTPS with
   * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https.html)
   * and [Using Alternate Domain Names and
   * HTTPS](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-alternate-domain-names.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ViewerCertificateProperty viewerCertificateProperty = ViewerCertificateProperty.builder()
   * .acmCertificateArn("acmCertificateArn")
   * .cloudFrontDefaultCertificate(false)
   * .iamCertificateId("iamCertificateId")
   * .minimumProtocolVersion("minimumProtocolVersion")
   * .sslSupportMethod("sslSupportMethod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html)
   */
  public interface ViewerCertificateProperty {
    /**
     * In CloudFormation, this field name is `AcmCertificateArn` . Note the different
     * capitalization.
     *
     * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
     * certificate is stored in [AWS Certificate Manager
     * (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html) , provide the Amazon
     * Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM certificates in the US
     * East (N. Virginia) Region ( `us-east-1` ).
     *
     * If you specify an ACM certificate ARN, you must also specify values for
     * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
     * `SslSupportMethod` . Note the different capitalization.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn)
     */
    public fun acmCertificateArn(): String? = unwrap(this).getAcmCertificateArn()

    /**
     * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net` ,
     * set this field to `true` .
     *
     * If the distribution uses `Aliases` (alternate domain names or CNAMEs), omit this field and
     * specify values for the following fields:
     *
     * * `AcmCertificateArn` or `IamCertificateId` (specify a value for one, not both)
     * * `MinimumProtocolVersion`
     * * `SslSupportMethod`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate)
     */
    public fun cloudFrontDefaultCertificate(): Any? = unwrap(this).getCloudFrontDefaultCertificate()

    /**
     * In CloudFormation, this field name is `IamCertificateId` . Note the different capitalization.
     *
     * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
     * certificate is stored in [AWS Identity and Access Management
     * (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) ,
     * provide the ID of the IAM certificate.
     *
     * If you specify an IAM certificate ID, you must also specify values for
     * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
     * `SslSupportMethod` . Note the different capitalization.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid)
     */
    public fun iamCertificateId(): String? = unwrap(this).getIamCertificateId()

    /**
     * If the distribution uses `Aliases` (alternate domain names or CNAMEs), specify the security
     * policy that you want CloudFront to use for HTTPS connections with viewers.
     *
     * The security policy determines two settings:
     *
     * * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
     * * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
     *
     * For more information, see [Security
     * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
     * and [Supported Protocols and Ciphers Between Viewers and
     * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers)
     * in the *Amazon CloudFront Developer Guide* .
     *
     *
     * On the CloudFront console, this setting is called *Security Policy* .
     *
     *
     * When you're using SNI only (you set `SSLSupportMethod` to `sni-only` ), you must specify
     * `TLSv1` or higher. (In CloudFormation, the field name is `SslSupportMethod` . Note the different
     * capitalization.)
     *
     * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
     * (you set `CloudFrontDefaultCertificate` to `true` ), CloudFront automatically sets the security
     * policy to `TLSv1` regardless of the value that you set here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion)
     */
    public fun minimumProtocolVersion(): String? = unwrap(this).getMinimumProtocolVersion()

    /**
     * In CloudFormation, this field name is `SslSupportMethod` . Note the different capitalization.
     *
     * If the distribution uses `Aliases` (alternate domain names or CNAMEs), specify which viewers
     * the distribution accepts HTTPS connections from.
     *
     * * `sni-only` – The distribution accepts HTTPS connections from only viewers that support
     * [server name indication
     * (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication) . This
     * is recommended. Most browsers and clients support SNI.
     * * `vip` – The distribution accepts HTTPS connections from all viewers including those that
     * don't support SNI. This is not recommended, and results in additional monthly charges from
     * CloudFront.
     * * `static-ip` - Do not specify this value unless your distribution has been enabled for this
     * feature by the CloudFront team. If you have a use case that requires static IP addresses for a
     * distribution, contact CloudFront through the [AWS Support
     * Center](https://docs.aws.amazon.com/support/home) .
     *
     * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net` ,
     * don't set a value for this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod)
     */
    public fun sslSupportMethod(): String? = unwrap(this).getSslSupportMethod()

    /**
     * A builder for [ViewerCertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param acmCertificateArn In CloudFormation, this field name is `AcmCertificateArn` . Note
       * the different capitalization.
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
       * certificate is stored in [AWS Certificate Manager
       * (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html) , provide the
       * Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM certificates
       * in the US East (N. Virginia) Region ( `us-east-1` ).
       *
       * If you specify an ACM certificate ARN, you must also specify values for
       * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
       * `SslSupportMethod` . Note the different capitalization.)
       */
      public fun acmCertificateArn(acmCertificateArn: String)

      /**
       * @param cloudFrontDefaultCertificate If the distribution uses the CloudFront domain name
       * such as `d111111abcdef8.cloudfront.net` , set this field to `true` .
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), omit this field and
       * specify values for the following fields:
       *
       * * `AcmCertificateArn` or `IamCertificateId` (specify a value for one, not both)
       * * `MinimumProtocolVersion`
       * * `SslSupportMethod`
       */
      public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: Boolean)

      /**
       * @param cloudFrontDefaultCertificate If the distribution uses the CloudFront domain name
       * such as `d111111abcdef8.cloudfront.net` , set this field to `true` .
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), omit this field and
       * specify values for the following fields:
       *
       * * `AcmCertificateArn` or `IamCertificateId` (specify a value for one, not both)
       * * `MinimumProtocolVersion`
       * * `SslSupportMethod`
       */
      public fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: IResolvable)

      /**
       * @param iamCertificateId In CloudFormation, this field name is `IamCertificateId` . Note the
       * different capitalization.
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
       * certificate is stored in [AWS Identity and Access Management
       * (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) ,
       * provide the ID of the IAM certificate.
       *
       * If you specify an IAM certificate ID, you must also specify values for
       * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
       * `SslSupportMethod` . Note the different capitalization.)
       */
      public fun iamCertificateId(iamCertificateId: String)

      /**
       * @param minimumProtocolVersion If the distribution uses `Aliases` (alternate domain names or
       * CNAMEs), specify the security policy that you want CloudFront to use for HTTPS connections
       * with viewers.
       * The security policy determines two settings:
       *
       * * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
       * * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
       *
       * For more information, see [Security
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
       * and [Supported Protocols and Ciphers Between Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * On the CloudFront console, this setting is called *Security Policy* .
       *
       *
       * When you're using SNI only (you set `SSLSupportMethod` to `sni-only` ), you must specify
       * `TLSv1` or higher. (In CloudFormation, the field name is `SslSupportMethod` . Note the
       * different capitalization.)
       *
       * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
       * (you set `CloudFrontDefaultCertificate` to `true` ), CloudFront automatically sets the
       * security policy to `TLSv1` regardless of the value that you set here.
       */
      public fun minimumProtocolVersion(minimumProtocolVersion: String)

      /**
       * @param sslSupportMethod In CloudFormation, this field name is `SslSupportMethod` . Note the
       * different capitalization.
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), specify which
       * viewers the distribution accepts HTTPS connections from.
       *
       * * `sni-only` – The distribution accepts HTTPS connections from only viewers that support
       * [server name indication
       * (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication) .
       * This is recommended. Most browsers and clients support SNI.
       * * `vip` – The distribution accepts HTTPS connections from all viewers including those that
       * don't support SNI. This is not recommended, and results in additional monthly charges from
       * CloudFront.
       * * `static-ip` - Do not specify this value unless your distribution has been enabled for
       * this feature by the CloudFront team. If you have a use case that requires static IP addresses
       * for a distribution, contact CloudFront through the [AWS Support
       * Center](https://docs.aws.amazon.com/support/home) .
       *
       * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
       * , don't set a value for this field.
       */
      public fun sslSupportMethod(sslSupportMethod: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty.builder()

      /**
       * @param acmCertificateArn In CloudFormation, this field name is `AcmCertificateArn` . Note
       * the different capitalization.
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
       * certificate is stored in [AWS Certificate Manager
       * (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html) , provide the
       * Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM certificates
       * in the US East (N. Virginia) Region ( `us-east-1` ).
       *
       * If you specify an ACM certificate ARN, you must also specify values for
       * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
       * `SslSupportMethod` . Note the different capitalization.)
       */
      override fun acmCertificateArn(acmCertificateArn: String) {
        cdkBuilder.acmCertificateArn(acmCertificateArn)
      }

      /**
       * @param cloudFrontDefaultCertificate If the distribution uses the CloudFront domain name
       * such as `d111111abcdef8.cloudfront.net` , set this field to `true` .
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), omit this field and
       * specify values for the following fields:
       *
       * * `AcmCertificateArn` or `IamCertificateId` (specify a value for one, not both)
       * * `MinimumProtocolVersion`
       * * `SslSupportMethod`
       */
      override fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: Boolean) {
        cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate)
      }

      /**
       * @param cloudFrontDefaultCertificate If the distribution uses the CloudFront domain name
       * such as `d111111abcdef8.cloudfront.net` , set this field to `true` .
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), omit this field and
       * specify values for the following fields:
       *
       * * `AcmCertificateArn` or `IamCertificateId` (specify a value for one, not both)
       * * `MinimumProtocolVersion`
       * * `SslSupportMethod`
       */
      override fun cloudFrontDefaultCertificate(cloudFrontDefaultCertificate: IResolvable) {
        cdkBuilder.cloudFrontDefaultCertificate(cloudFrontDefaultCertificate.let(IResolvable::unwrap))
      }

      /**
       * @param iamCertificateId In CloudFormation, this field name is `IamCertificateId` . Note the
       * different capitalization.
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
       * certificate is stored in [AWS Identity and Access Management
       * (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) ,
       * provide the ID of the IAM certificate.
       *
       * If you specify an IAM certificate ID, you must also specify values for
       * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
       * `SslSupportMethod` . Note the different capitalization.)
       */
      override fun iamCertificateId(iamCertificateId: String) {
        cdkBuilder.iamCertificateId(iamCertificateId)
      }

      /**
       * @param minimumProtocolVersion If the distribution uses `Aliases` (alternate domain names or
       * CNAMEs), specify the security policy that you want CloudFront to use for HTTPS connections
       * with viewers.
       * The security policy determines two settings:
       *
       * * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
       * * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
       *
       * For more information, see [Security
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
       * and [Supported Protocols and Ciphers Between Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * On the CloudFront console, this setting is called *Security Policy* .
       *
       *
       * When you're using SNI only (you set `SSLSupportMethod` to `sni-only` ), you must specify
       * `TLSv1` or higher. (In CloudFormation, the field name is `SslSupportMethod` . Note the
       * different capitalization.)
       *
       * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
       * (you set `CloudFrontDefaultCertificate` to `true` ), CloudFront automatically sets the
       * security policy to `TLSv1` regardless of the value that you set here.
       */
      override fun minimumProtocolVersion(minimumProtocolVersion: String) {
        cdkBuilder.minimumProtocolVersion(minimumProtocolVersion)
      }

      /**
       * @param sslSupportMethod In CloudFormation, this field name is `SslSupportMethod` . Note the
       * different capitalization.
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), specify which
       * viewers the distribution accepts HTTPS connections from.
       *
       * * `sni-only` – The distribution accepts HTTPS connections from only viewers that support
       * [server name indication
       * (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication) .
       * This is recommended. Most browsers and clients support SNI.
       * * `vip` – The distribution accepts HTTPS connections from all viewers including those that
       * don't support SNI. This is not recommended, and results in additional monthly charges from
       * CloudFront.
       * * `static-ip` - Do not specify this value unless your distribution has been enabled for
       * this feature by the CloudFront team. If you have a use case that requires static IP addresses
       * for a distribution, contact CloudFront through the [AWS Support
       * Center](https://docs.aws.amazon.com/support/home) .
       *
       * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
       * , don't set a value for this field.
       */
      override fun sslSupportMethod(sslSupportMethod: String) {
        cdkBuilder.sslSupportMethod(sslSupportMethod)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty,
    ) : CdkObject(cdkObject), ViewerCertificateProperty {
      /**
       * In CloudFormation, this field name is `AcmCertificateArn` . Note the different
       * capitalization.
       *
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
       * certificate is stored in [AWS Certificate Manager
       * (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html) , provide the
       * Amazon Resource Name (ARN) of the ACM certificate. CloudFront only supports ACM certificates
       * in the US East (N. Virginia) Region ( `us-east-1` ).
       *
       * If you specify an ACM certificate ARN, you must also specify values for
       * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
       * `SslSupportMethod` . Note the different capitalization.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn)
       */
      override fun acmCertificateArn(): String? = unwrap(this).getAcmCertificateArn()

      /**
       * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
       * , set this field to `true` .
       *
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), omit this field and
       * specify values for the following fields:
       *
       * * `AcmCertificateArn` or `IamCertificateId` (specify a value for one, not both)
       * * `MinimumProtocolVersion`
       * * `SslSupportMethod`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate)
       */
      override fun cloudFrontDefaultCertificate(): Any? =
          unwrap(this).getCloudFrontDefaultCertificate()

      /**
       * In CloudFormation, this field name is `IamCertificateId` . Note the different
       * capitalization.
       *
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs) and the SSL/TLS
       * certificate is stored in [AWS Identity and Access Management
       * (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html) ,
       * provide the ID of the IAM certificate.
       *
       * If you specify an IAM certificate ID, you must also specify values for
       * `MinimumProtocolVersion` and `SSLSupportMethod` . (In CloudFormation, the field name is
       * `SslSupportMethod` . Note the different capitalization.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid)
       */
      override fun iamCertificateId(): String? = unwrap(this).getIamCertificateId()

      /**
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), specify the security
       * policy that you want CloudFront to use for HTTPS connections with viewers.
       *
       * The security policy determines two settings:
       *
       * * The minimum SSL/TLS protocol that CloudFront can use to communicate with viewers.
       * * The ciphers that CloudFront can use to encrypt the content that it returns to viewers.
       *
       * For more information, see [Security
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
       * and [Supported Protocols and Ciphers Between Viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html#secure-connections-supported-ciphers)
       * in the *Amazon CloudFront Developer Guide* .
       *
       *
       * On the CloudFront console, this setting is called *Security Policy* .
       *
       *
       * When you're using SNI only (you set `SSLSupportMethod` to `sni-only` ), you must specify
       * `TLSv1` or higher. (In CloudFormation, the field name is `SslSupportMethod` . Note the
       * different capitalization.)
       *
       * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
       * (you set `CloudFrontDefaultCertificate` to `true` ), CloudFront automatically sets the
       * security policy to `TLSv1` regardless of the value that you set here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion)
       */
      override fun minimumProtocolVersion(): String? = unwrap(this).getMinimumProtocolVersion()

      /**
       * In CloudFormation, this field name is `SslSupportMethod` . Note the different
       * capitalization.
       *
       * If the distribution uses `Aliases` (alternate domain names or CNAMEs), specify which
       * viewers the distribution accepts HTTPS connections from.
       *
       * * `sni-only` – The distribution accepts HTTPS connections from only viewers that support
       * [server name indication
       * (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication) .
       * This is recommended. Most browsers and clients support SNI.
       * * `vip` – The distribution accepts HTTPS connections from all viewers including those that
       * don't support SNI. This is not recommended, and results in additional monthly charges from
       * CloudFront.
       * * `static-ip` - Do not specify this value unless your distribution has been enabled for
       * this feature by the CloudFront team. If you have a use case that requires static IP addresses
       * for a distribution, contact CloudFront through the [AWS Support
       * Center](https://docs.aws.amazon.com/support/home) .
       *
       * If the distribution uses the CloudFront domain name such as `d111111abcdef8.cloudfront.net`
       * , don't set a value for this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod)
       */
      override fun sslSupportMethod(): String? = unwrap(this).getSslSupportMethod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ViewerCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty):
          ViewerCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ViewerCertificateProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.ViewerCertificateProperty
    }
  }

  /**
   * A distribution configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * DistributionConfigProperty distributionConfigProperty = DistributionConfigProperty.builder()
   * .defaultCacheBehavior(DefaultCacheBehaviorProperty.builder()
   * .targetOriginId("targetOriginId")
   * .viewerProtocolPolicy("viewerProtocolPolicy")
   * // the properties below are optional
   * .allowedMethods(List.of("allowedMethods"))
   * .cachedMethods(List.of("cachedMethods"))
   * .cachePolicyId("cachePolicyId")
   * .compress(false)
   * .defaultTtl(123)
   * .fieldLevelEncryptionId("fieldLevelEncryptionId")
   * .forwardedValues(ForwardedValuesProperty.builder()
   * .queryString(false)
   * // the properties below are optional
   * .cookies(CookiesProperty.builder()
   * .forward("forward")
   * // the properties below are optional
   * .whitelistedNames(List.of("whitelistedNames"))
   * .build())
   * .headers(List.of("headers"))
   * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
   * .build())
   * .functionAssociations(List.of(FunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .functionArn("functionArn")
   * .build()))
   * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .includeBody(false)
   * .lambdaFunctionArn("lambdaFunctionArn")
   * .build()))
   * .maxTtl(123)
   * .minTtl(123)
   * .originRequestPolicyId("originRequestPolicyId")
   * .realtimeLogConfigArn("realtimeLogConfigArn")
   * .responseHeadersPolicyId("responseHeadersPolicyId")
   * .smoothStreaming(false)
   * .trustedKeyGroups(List.of("trustedKeyGroups"))
   * .trustedSigners(List.of("trustedSigners"))
   * .build())
   * .enabled(false)
   * // the properties below are optional
   * .aliases(List.of("aliases"))
   * .cacheBehaviors(List.of(CacheBehaviorProperty.builder()
   * .pathPattern("pathPattern")
   * .targetOriginId("targetOriginId")
   * .viewerProtocolPolicy("viewerProtocolPolicy")
   * // the properties below are optional
   * .allowedMethods(List.of("allowedMethods"))
   * .cachedMethods(List.of("cachedMethods"))
   * .cachePolicyId("cachePolicyId")
   * .compress(false)
   * .defaultTtl(123)
   * .fieldLevelEncryptionId("fieldLevelEncryptionId")
   * .forwardedValues(ForwardedValuesProperty.builder()
   * .queryString(false)
   * // the properties below are optional
   * .cookies(CookiesProperty.builder()
   * .forward("forward")
   * // the properties below are optional
   * .whitelistedNames(List.of("whitelistedNames"))
   * .build())
   * .headers(List.of("headers"))
   * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
   * .build())
   * .functionAssociations(List.of(FunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .functionArn("functionArn")
   * .build()))
   * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .includeBody(false)
   * .lambdaFunctionArn("lambdaFunctionArn")
   * .build()))
   * .maxTtl(123)
   * .minTtl(123)
   * .originRequestPolicyId("originRequestPolicyId")
   * .realtimeLogConfigArn("realtimeLogConfigArn")
   * .responseHeadersPolicyId("responseHeadersPolicyId")
   * .smoothStreaming(false)
   * .trustedKeyGroups(List.of("trustedKeyGroups"))
   * .trustedSigners(List.of("trustedSigners"))
   * .build()))
   * .cnamEs(List.of("cnamEs"))
   * .comment("comment")
   * .continuousDeploymentPolicyId("continuousDeploymentPolicyId")
   * .customErrorResponses(List.of(CustomErrorResponseProperty.builder()
   * .errorCode(123)
   * // the properties below are optional
   * .errorCachingMinTtl(123)
   * .responseCode(123)
   * .responsePagePath("responsePagePath")
   * .build()))
   * .customOrigin(LegacyCustomOriginProperty.builder()
   * .dnsName("dnsName")
   * .originProtocolPolicy("originProtocolPolicy")
   * .originSslProtocols(List.of("originSslProtocols"))
   * // the properties below are optional
   * .httpPort(123)
   * .httpsPort(123)
   * .build())
   * .defaultRootObject("defaultRootObject")
   * .httpVersion("httpVersion")
   * .ipv6Enabled(false)
   * .logging(LoggingProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .includeCookies(false)
   * .prefix("prefix")
   * .build())
   * .originGroups(OriginGroupsProperty.builder()
   * .quantity(123)
   * // the properties below are optional
   * .items(List.of(OriginGroupProperty.builder()
   * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
   * .statusCodes(StatusCodesProperty.builder()
   * .items(List.of(123))
   * .quantity(123)
   * .build())
   * .build())
   * .id("id")
   * .members(OriginGroupMembersProperty.builder()
   * .items(List.of(OriginGroupMemberProperty.builder()
   * .originId("originId")
   * .build()))
   * .quantity(123)
   * .build())
   * .build()))
   * .build())
   * .origins(List.of(OriginProperty.builder()
   * .domainName("domainName")
   * .id("id")
   * // the properties below are optional
   * .connectionAttempts(123)
   * .connectionTimeout(123)
   * .customOriginConfig(CustomOriginConfigProperty.builder()
   * .originProtocolPolicy("originProtocolPolicy")
   * // the properties below are optional
   * .httpPort(123)
   * .httpsPort(123)
   * .originKeepaliveTimeout(123)
   * .originReadTimeout(123)
   * .originSslProtocols(List.of("originSslProtocols"))
   * .build())
   * .originAccessControlId("originAccessControlId")
   * .originCustomHeaders(List.of(OriginCustomHeaderProperty.builder()
   * .headerName("headerName")
   * .headerValue("headerValue")
   * .build()))
   * .originPath("originPath")
   * .originShield(OriginShieldProperty.builder()
   * .enabled(false)
   * .originShieldRegion("originShieldRegion")
   * .build())
   * .s3OriginConfig(S3OriginConfigProperty.builder()
   * .originAccessIdentity("originAccessIdentity")
   * .build())
   * .build()))
   * .priceClass("priceClass")
   * .restrictions(RestrictionsProperty.builder()
   * .geoRestriction(GeoRestrictionProperty.builder()
   * .restrictionType("restrictionType")
   * // the properties below are optional
   * .locations(List.of("locations"))
   * .build())
   * .build())
   * .s3Origin(LegacyS3OriginProperty.builder()
   * .dnsName("dnsName")
   * // the properties below are optional
   * .originAccessIdentity("originAccessIdentity")
   * .build())
   * .staging(false)
   * .viewerCertificate(ViewerCertificateProperty.builder()
   * .acmCertificateArn("acmCertificateArn")
   * .cloudFrontDefaultCertificate(false)
   * .iamCertificateId("iamCertificateId")
   * .minimumProtocolVersion("minimumProtocolVersion")
   * .sslSupportMethod("sslSupportMethod")
   * .build())
   * .webAclId("webAclId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html)
   */
  public interface DistributionConfigProperty {
    /**
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for
     * this distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases)
     */
    public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    /**
     * A complex type that contains zero or more `CacheBehavior` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors)
     */
    public fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cnames)
     */
    public fun cnamEs(): List<String> = unwrap(this).getCnamEs() ?: emptyList()

    /**
     * A comment to describe the distribution.
     *
     * The comment cannot be longer than 128 characters.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The identifier of a continuous deployment policy.
     *
     * For more information, see `CreateContinuousDeploymentPolicy` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-continuousdeploymentpolicyid)
     */
    public fun continuousDeploymentPolicyId(): String? =
        unwrap(this).getContinuousDeploymentPolicyId()

    /**
     * A complex type that controls the following:.
     *
     * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
     * messages before returning the response to the viewer.
     * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
     *
     * For more information about custom error pages, see [Customizing Error
     * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses)
     */
    public fun customErrorResponses(): Any? = unwrap(this).getCustomErrorResponses()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customorigin)
     */
    public fun customOrigin(): Any? = unwrap(this).getCustomOrigin()

    /**
     * A complex type that describes the default cache behavior if you don't specify a
     * `CacheBehavior` element or if files don't match any of the values of `PathPattern` in
     * `CacheBehavior` elements.
     *
     * You must create exactly one default cache behavior.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultcachebehavior)
     */
    public fun defaultCacheBehavior(): Any

    /**
     * The object that you want CloudFront to request from your origin (for example, `index.html` )
     * when a viewer requests the root URL for your distribution ( `https://www.example.com` ) instead
     * of an object in your distribution ( `https://www.example.com/product-description.html` ).
     * Specifying a default root object avoids exposing the contents of your distribution.
     *
     * Specify only the object name, for example, `index.html` . Don't add a `/` before the object
     * name.
     *
     * If you don't want to specify a default root object when you create a distribution, include an
     * empty `DefaultRootObject` element.
     *
     * To delete the default root object from an existing distribution, update the distribution
     * configuration and include an empty `DefaultRootObject` element.
     *
     * To replace the default root object, update the distribution configuration and specify the new
     * object.
     *
     * For more information about the default root object, see [Creating a Default Root
     * Object](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject)
     */
    public fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

    /**
     * From this field, you can enable or disable the selected distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled)
     */
    public fun enabled(): Any

    /**
     * (Optional) Specify the maximum HTTP version(s) that you want viewers to use to communicate
     * with CloudFront .
     *
     * The default value for new distributions is `http1.1` .
     *
     * For viewers and CloudFront to use HTTP/2, viewers must support TLSv1.2 or later, and must
     * support Server Name Indication (SNI).
     *
     * For viewers and CloudFront to use HTTP/3, viewers must support TLSv1.3 and Server Name
     * Indication (SNI). CloudFront supports HTTP/3 connection migration to allow the viewer to switch
     * networks without losing connection. For more information about connection migration, see
     * [Connection
     * Migration](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc9000.html#name-connection-migration)
     * at RFC 9000. For more information about supported TLSv1.3 ciphers, see [Supported protocols and
     * ciphers between viewers and
     * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html)
     * .
     *
     * Default: - "http1.1"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion)
     */
    public fun httpVersion(): String? = unwrap(this).getHttpVersion()

    /**
     * If you want CloudFront to respond to IPv6 DNS requests with an IPv6 address for your
     * distribution, specify `true` .
     *
     * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response code
     * `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for an IPv4
     * address for your distribution.
     *
     * In general, you should enable IPv6 if you have users on IPv6 networks who want to access your
     * content. However, if you're using signed URLs or signed cookies to restrict access to your
     * content, and if you're using a custom policy that includes the `IpAddress` parameter to restrict
     * the IP addresses that can access your content, don't enable IPv6. If you want to restrict access
     * to some content by IP address and not restrict access to other content (or restrict access but
     * not by IP address), you can create two distributions. For more information, see [Creating a
     * Signed URL Using a Custom
     * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you're using an Amazon Route 53 AWS Integration alias resource record set to route traffic
     * to your CloudFront distribution, you need to create a second alias resource record set when both
     * of the following are true:
     *
     * * You enable IPv6 for the distribution
     * * You're using alternate domain names in the URLs for your objects
     *
     * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by Using
     * Your Domain
     * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
     * in the *Amazon Route 53 AWS Integration Developer Guide* .
     *
     * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or
     * with another DNS service, you don't need to make any changes. A CNAME record will route traffic
     * to your distribution regardless of the IP address format of the viewer request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled)
     */
    public fun ipv6Enabled(): Any? = unwrap(this).getIpv6Enabled()

    /**
     * A complex type that controls whether access logs are written for the distribution.
     *
     * For more information about logging, see [Access
     * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in the
     * *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-logging)
     */
    public fun logging(): Any? = unwrap(this).getLogging()

    /**
     * A complex type that contains information about origin groups for this distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origingroups)
     */
    public fun originGroups(): Any? = unwrap(this).getOriginGroups()

    /**
     * A complex type that contains information about origins for this distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins)
     */
    public fun origins(): Any? = unwrap(this).getOrigins()

    /**
     * The price class that corresponds with the maximum price that you want to pay for CloudFront
     * service.
     *
     * If you specify `PriceClass_All` , CloudFront responds to requests for your objects from all
     * CloudFront edge locations.
     *
     * If you specify a price class other than `PriceClass_All` , CloudFront serves your objects
     * from the CloudFront edge location that has the lowest latency among the edge locations in your
     * price class. Viewers who are in or near regions that are excluded from your specified price
     * class may encounter slower performance.
     *
     * For more information about price classes, see [Choosing the Price Class for a CloudFront
     * Distribution](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html)
     * in the *Amazon CloudFront Developer Guide* . For information about CloudFront pricing, including
     * how price classes (such as Price Class 100) map to CloudFront regions, see [Amazon CloudFront
     * Pricing](https://docs.aws.amazon.com/cloudfront/pricing/) .
     *
     * Default: - "PriceClass_All"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass)
     */
    public fun priceClass(): String? = unwrap(this).getPriceClass()

    /**
     * A complex type that identifies ways in which you want to restrict distribution of your
     * content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
     */
    public fun restrictions(): Any? = unwrap(this).getRestrictions()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-s3origin)
     */
    public fun s3Origin(): Any? = unwrap(this).getS3Origin()

    /**
     * A Boolean that indicates whether this is a staging distribution.
     *
     * When this value is `true` , this is a staging distribution. When this value is `false` , this
     * is not a staging distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-staging)
     */
    public fun staging(): Any? = unwrap(this).getStaging()

    /**
     * A complex type that determines the distribution's SSL/TLS configuration for communicating
     * with viewers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-viewercertificate)
     */
    public fun viewerCertificate(): Any? = unwrap(this).getViewerCertificate()

    /**
     * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF , use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
     * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` .
     *
     * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that
     * are forwarded to CloudFront, and lets you control access to your content. Based on conditions
     * that you specify, such as the IP addresses that requests originate from or the values of query
     * strings, CloudFront responds to requests either with the requested content or with an HTTP 403
     * status code (Forbidden). You can also configure CloudFront to return a custom error page when a
     * request is blocked. For more information about AWS WAF , see the [AWS WAF Developer
     * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html) .
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid)
     */
    public fun webAclId(): String? = unwrap(this).getWebAclId()

    /**
     * A builder for [DistributionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this distribution.
       */
      public fun aliases(aliases: List<String>)

      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this distribution.
       */
      public fun aliases(vararg aliases: String)

      /**
       * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
       */
      public fun cacheBehaviors(cacheBehaviors: IResolvable)

      /**
       * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
       */
      public fun cacheBehaviors(cacheBehaviors: List<Any>)

      /**
       * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
       */
      public fun cacheBehaviors(vararg cacheBehaviors: Any)

      /**
       * @param cnamEs the value to be set.
       */
      public fun cnamEs(cnamEs: List<String>)

      /**
       * @param cnamEs the value to be set.
       */
      public fun cnamEs(vararg cnamEs: String)

      /**
       * @param comment A comment to describe the distribution.
       * The comment cannot be longer than 128 characters.
       */
      public fun comment(comment: String)

      /**
       * @param continuousDeploymentPolicyId The identifier of a continuous deployment policy.
       * For more information, see `CreateContinuousDeploymentPolicy` .
       */
      public fun continuousDeploymentPolicyId(continuousDeploymentPolicyId: String)

      /**
       * @param customErrorResponses A complex type that controls the following:.
       * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
       * messages before returning the response to the viewer.
       * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
       *
       * For more information about custom error pages, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun customErrorResponses(customErrorResponses: IResolvable)

      /**
       * @param customErrorResponses A complex type that controls the following:.
       * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
       * messages before returning the response to the viewer.
       * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
       *
       * For more information about custom error pages, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun customErrorResponses(customErrorResponses: List<Any>)

      /**
       * @param customErrorResponses A complex type that controls the following:.
       * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
       * messages before returning the response to the viewer.
       * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
       *
       * For more information about custom error pages, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun customErrorResponses(vararg customErrorResponses: Any)

      /**
       * @param customOrigin the value to be set.
       */
      public fun customOrigin(customOrigin: IResolvable)

      /**
       * @param customOrigin the value to be set.
       */
      public fun customOrigin(customOrigin: LegacyCustomOriginProperty)

      /**
       * @param customOrigin the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("727a62ee2d654fbc3a1c3b7028a0c1e7cdb5dc3e7d19714972629cd0f8e2e5f0")
      public fun customOrigin(customOrigin: LegacyCustomOriginProperty.Builder.() -> Unit)

      /**
       * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
       * don't specify a `CacheBehavior` element or if files don't match any of the values of
       * `PathPattern` in `CacheBehavior` elements. 
       * You must create exactly one default cache behavior.
       */
      public fun defaultCacheBehavior(defaultCacheBehavior: IResolvable)

      /**
       * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
       * don't specify a `CacheBehavior` element or if files don't match any of the values of
       * `PathPattern` in `CacheBehavior` elements. 
       * You must create exactly one default cache behavior.
       */
      public fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty)

      /**
       * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
       * don't specify a `CacheBehavior` element or if files don't match any of the values of
       * `PathPattern` in `CacheBehavior` elements. 
       * You must create exactly one default cache behavior.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d62aa0f015521cdd4014cc800720d9a7da92b7f050630202b0f209e35d72d47")
      public
          fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty.Builder.() -> Unit)

      /**
       * @param defaultRootObject The object that you want CloudFront to request from your origin
       * (for example, `index.html` ) when a viewer requests the root URL for your distribution (
       * `https://www.example.com` ) instead of an object in your distribution (
       * `https://www.example.com/product-description.html` ). Specifying a default root object avoids
       * exposing the contents of your distribution.
       * Specify only the object name, for example, `index.html` . Don't add a `/` before the object
       * name.
       *
       * If you don't want to specify a default root object when you create a distribution, include
       * an empty `DefaultRootObject` element.
       *
       * To delete the default root object from an existing distribution, update the distribution
       * configuration and include an empty `DefaultRootObject` element.
       *
       * To replace the default root object, update the distribution configuration and specify the
       * new object.
       *
       * For more information about the default root object, see [Creating a Default Root
       * Object](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun defaultRootObject(defaultRootObject: String)

      /**
       * @param enabled From this field, you can enable or disable the selected distribution. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled From this field, you can enable or disable the selected distribution. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param httpVersion (Optional) Specify the maximum HTTP version(s) that you want viewers to
       * use to communicate with CloudFront .
       * The default value for new distributions is `http1.1` .
       *
       * For viewers and CloudFront to use HTTP/2, viewers must support TLSv1.2 or later, and must
       * support Server Name Indication (SNI).
       *
       * For viewers and CloudFront to use HTTP/3, viewers must support TLSv1.3 and Server Name
       * Indication (SNI). CloudFront supports HTTP/3 connection migration to allow the viewer to
       * switch networks without losing connection. For more information about connection migration,
       * see [Connection
       * Migration](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc9000.html#name-connection-migration)
       * at RFC 9000. For more information about supported TLSv1.3 ciphers, see [Supported protocols
       * and ciphers between viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html)
       * .
       */
      public fun httpVersion(httpVersion: String)

      /**
       * @param ipv6Enabled If you want CloudFront to respond to IPv6 DNS requests with an IPv6
       * address for your distribution, specify `true` .
       * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response
       * code `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for
       * an IPv4 address for your distribution.
       *
       * In general, you should enable IPv6 if you have users on IPv6 networks who want to access
       * your content. However, if you're using signed URLs or signed cookies to restrict access to
       * your content, and if you're using a custom policy that includes the `IpAddress` parameter to
       * restrict the IP addresses that can access your content, don't enable IPv6. If you want to
       * restrict access to some content by IP address and not restrict access to other content (or
       * restrict access but not by IP address), you can create two distributions. For more
       * information, see [Creating a Signed URL Using a Custom
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you're using an Amazon Route 53 AWS Integration alias resource record set to route
       * traffic to your CloudFront distribution, you need to create a second alias resource record set
       * when both of the following are true:
       *
       * * You enable IPv6 for the distribution
       * * You're using alternate domain names in the URLs for your objects
       *
       * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by
       * Using Your Domain
       * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
       * in the *Amazon Route 53 AWS Integration Developer Guide* .
       *
       * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or
       * with another DNS service, you don't need to make any changes. A CNAME record will route
       * traffic to your distribution regardless of the IP address format of the viewer request.
       */
      public fun ipv6Enabled(ipv6Enabled: Boolean)

      /**
       * @param ipv6Enabled If you want CloudFront to respond to IPv6 DNS requests with an IPv6
       * address for your distribution, specify `true` .
       * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response
       * code `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for
       * an IPv4 address for your distribution.
       *
       * In general, you should enable IPv6 if you have users on IPv6 networks who want to access
       * your content. However, if you're using signed URLs or signed cookies to restrict access to
       * your content, and if you're using a custom policy that includes the `IpAddress` parameter to
       * restrict the IP addresses that can access your content, don't enable IPv6. If you want to
       * restrict access to some content by IP address and not restrict access to other content (or
       * restrict access but not by IP address), you can create two distributions. For more
       * information, see [Creating a Signed URL Using a Custom
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you're using an Amazon Route 53 AWS Integration alias resource record set to route
       * traffic to your CloudFront distribution, you need to create a second alias resource record set
       * when both of the following are true:
       *
       * * You enable IPv6 for the distribution
       * * You're using alternate domain names in the URLs for your objects
       *
       * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by
       * Using Your Domain
       * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
       * in the *Amazon Route 53 AWS Integration Developer Guide* .
       *
       * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or
       * with another DNS service, you don't need to make any changes. A CNAME record will route
       * traffic to your distribution regardless of the IP address format of the viewer request.
       */
      public fun ipv6Enabled(ipv6Enabled: IResolvable)

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * distribution.
       * For more information about logging, see [Access
       * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      public fun logging(logging: IResolvable)

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * distribution.
       * For more information about logging, see [Access
       * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      public fun logging(logging: LoggingProperty)

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * distribution.
       * For more information about logging, see [Access
       * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c19cbffc19f9f89fba25e2fea7e0041578689fa928da7d6223b5ac0763213e")
      public fun logging(logging: LoggingProperty.Builder.() -> Unit)

      /**
       * @param originGroups A complex type that contains information about origin groups for this
       * distribution.
       */
      public fun originGroups(originGroups: IResolvable)

      /**
       * @param originGroups A complex type that contains information about origin groups for this
       * distribution.
       */
      public fun originGroups(originGroups: OriginGroupsProperty)

      /**
       * @param originGroups A complex type that contains information about origin groups for this
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f59d2af37d5e0c1affac226dd716cf3cf68ab60464638dfe4625c532a25e3ad")
      public fun originGroups(originGroups: OriginGroupsProperty.Builder.() -> Unit)

      /**
       * @param origins A complex type that contains information about origins for this
       * distribution.
       */
      public fun origins(origins: IResolvable)

      /**
       * @param origins A complex type that contains information about origins for this
       * distribution.
       */
      public fun origins(origins: List<Any>)

      /**
       * @param origins A complex type that contains information about origins for this
       * distribution.
       */
      public fun origins(vararg origins: Any)

      /**
       * @param priceClass The price class that corresponds with the maximum price that you want to
       * pay for CloudFront service.
       * If you specify `PriceClass_All` , CloudFront responds to requests for your objects from all
       * CloudFront edge locations.
       *
       * If you specify a price class other than `PriceClass_All` , CloudFront serves your objects
       * from the CloudFront edge location that has the lowest latency among the edge locations in your
       * price class. Viewers who are in or near regions that are excluded from your specified price
       * class may encounter slower performance.
       *
       * For more information about price classes, see [Choosing the Price Class for a CloudFront
       * Distribution](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html)
       * in the *Amazon CloudFront Developer Guide* . For information about CloudFront pricing,
       * including how price classes (such as Price Class 100) map to CloudFront regions, see [Amazon
       * CloudFront Pricing](https://docs.aws.amazon.com/cloudfront/pricing/) .
       */
      public fun priceClass(priceClass: String)

      /**
       * @param restrictions A complex type that identifies ways in which you want to restrict
       * distribution of your content.
       */
      public fun restrictions(restrictions: IResolvable)

      /**
       * @param restrictions A complex type that identifies ways in which you want to restrict
       * distribution of your content.
       */
      public fun restrictions(restrictions: RestrictionsProperty)

      /**
       * @param restrictions A complex type that identifies ways in which you want to restrict
       * distribution of your content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dd22e126e2e93ff812a180da99a1548020ec556b2734fa09087fbbaf07e47b3")
      public fun restrictions(restrictions: RestrictionsProperty.Builder.() -> Unit)

      /**
       * @param s3Origin the value to be set.
       */
      public fun s3Origin(s3Origin: IResolvable)

      /**
       * @param s3Origin the value to be set.
       */
      public fun s3Origin(s3Origin: LegacyS3OriginProperty)

      /**
       * @param s3Origin the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("634153888b6910f25984f15fc15a9cfd8cfcd431da7d237de24a0c3c46dccd4a")
      public fun s3Origin(s3Origin: LegacyS3OriginProperty.Builder.() -> Unit)

      /**
       * @param staging A Boolean that indicates whether this is a staging distribution.
       * When this value is `true` , this is a staging distribution. When this value is `false` ,
       * this is not a staging distribution.
       */
      public fun staging(staging: Boolean)

      /**
       * @param staging A Boolean that indicates whether this is a staging distribution.
       * When this value is `true` , this is a staging distribution. When this value is `false` ,
       * this is not a staging distribution.
       */
      public fun staging(staging: IResolvable)

      /**
       * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
       * configuration for communicating with viewers.
       */
      public fun viewerCertificate(viewerCertificate: IResolvable)

      /**
       * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
       * configuration for communicating with viewers.
       */
      public fun viewerCertificate(viewerCertificate: ViewerCertificateProperty)

      /**
       * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
       * configuration for communicating with viewers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3fcb2f5f45457646e32f82b20be2f6c740f0ffbd4e51595da0a7e5e7bacfb32")
      public fun viewerCertificate(viewerCertificate: ViewerCertificateProperty.Builder.() -> Unit)

      /**
       * @param webAclId A unique identifier that specifies the AWS WAF web ACL, if any, to
       * associate with this distribution.
       * To specify a web ACL created using the latest version of AWS WAF , use the ACL ARN, for
       * example
       * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
       * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
       * `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` .
       *
       * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests
       * that are forwarded to CloudFront, and lets you control access to your content. Based on
       * conditions that you specify, such as the IP addresses that requests originate from or the
       * values of query strings, CloudFront responds to requests either with the requested content or
       * with an HTTP 403 status code (Forbidden). You can also configure CloudFront to return a custom
       * error page when a request is blocked. For more information about AWS WAF , see the [AWS WAF
       * Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html) .
       */
      public fun webAclId(webAclId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty.builder()

      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this distribution.
       */
      override fun aliases(aliases: List<String>) {
        cdkBuilder.aliases(aliases)
      }

      /**
       * @param aliases A complex type that contains information about CNAMEs (alternate domain
       * names), if any, for this distribution.
       */
      override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

      /**
       * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
       */
      override fun cacheBehaviors(cacheBehaviors: IResolvable) {
        cdkBuilder.cacheBehaviors(cacheBehaviors.let(IResolvable::unwrap))
      }

      /**
       * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
       */
      override fun cacheBehaviors(cacheBehaviors: List<Any>) {
        cdkBuilder.cacheBehaviors(cacheBehaviors)
      }

      /**
       * @param cacheBehaviors A complex type that contains zero or more `CacheBehavior` elements.
       */
      override fun cacheBehaviors(vararg cacheBehaviors: Any): Unit =
          cacheBehaviors(cacheBehaviors.toList())

      /**
       * @param cnamEs the value to be set.
       */
      override fun cnamEs(cnamEs: List<String>) {
        cdkBuilder.cnamEs(cnamEs)
      }

      /**
       * @param cnamEs the value to be set.
       */
      override fun cnamEs(vararg cnamEs: String): Unit = cnamEs(cnamEs.toList())

      /**
       * @param comment A comment to describe the distribution.
       * The comment cannot be longer than 128 characters.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param continuousDeploymentPolicyId The identifier of a continuous deployment policy.
       * For more information, see `CreateContinuousDeploymentPolicy` .
       */
      override fun continuousDeploymentPolicyId(continuousDeploymentPolicyId: String) {
        cdkBuilder.continuousDeploymentPolicyId(continuousDeploymentPolicyId)
      }

      /**
       * @param customErrorResponses A complex type that controls the following:.
       * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
       * messages before returning the response to the viewer.
       * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
       *
       * For more information about custom error pages, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun customErrorResponses(customErrorResponses: IResolvable) {
        cdkBuilder.customErrorResponses(customErrorResponses.let(IResolvable::unwrap))
      }

      /**
       * @param customErrorResponses A complex type that controls the following:.
       * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
       * messages before returning the response to the viewer.
       * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
       *
       * For more information about custom error pages, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun customErrorResponses(customErrorResponses: List<Any>) {
        cdkBuilder.customErrorResponses(customErrorResponses)
      }

      /**
       * @param customErrorResponses A complex type that controls the following:.
       * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
       * messages before returning the response to the viewer.
       * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
       *
       * For more information about custom error pages, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun customErrorResponses(vararg customErrorResponses: Any): Unit =
          customErrorResponses(customErrorResponses.toList())

      /**
       * @param customOrigin the value to be set.
       */
      override fun customOrigin(customOrigin: IResolvable) {
        cdkBuilder.customOrigin(customOrigin.let(IResolvable::unwrap))
      }

      /**
       * @param customOrigin the value to be set.
       */
      override fun customOrigin(customOrigin: LegacyCustomOriginProperty) {
        cdkBuilder.customOrigin(customOrigin.let(LegacyCustomOriginProperty::unwrap))
      }

      /**
       * @param customOrigin the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("727a62ee2d654fbc3a1c3b7028a0c1e7cdb5dc3e7d19714972629cd0f8e2e5f0")
      override fun customOrigin(customOrigin: LegacyCustomOriginProperty.Builder.() -> Unit): Unit =
          customOrigin(LegacyCustomOriginProperty(customOrigin))

      /**
       * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
       * don't specify a `CacheBehavior` element or if files don't match any of the values of
       * `PathPattern` in `CacheBehavior` elements. 
       * You must create exactly one default cache behavior.
       */
      override fun defaultCacheBehavior(defaultCacheBehavior: IResolvable) {
        cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(IResolvable::unwrap))
      }

      /**
       * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
       * don't specify a `CacheBehavior` element or if files don't match any of the values of
       * `PathPattern` in `CacheBehavior` elements. 
       * You must create exactly one default cache behavior.
       */
      override fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty) {
        cdkBuilder.defaultCacheBehavior(defaultCacheBehavior.let(DefaultCacheBehaviorProperty::unwrap))
      }

      /**
       * @param defaultCacheBehavior A complex type that describes the default cache behavior if you
       * don't specify a `CacheBehavior` element or if files don't match any of the values of
       * `PathPattern` in `CacheBehavior` elements. 
       * You must create exactly one default cache behavior.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8d62aa0f015521cdd4014cc800720d9a7da92b7f050630202b0f209e35d72d47")
      override
          fun defaultCacheBehavior(defaultCacheBehavior: DefaultCacheBehaviorProperty.Builder.() -> Unit):
          Unit = defaultCacheBehavior(DefaultCacheBehaviorProperty(defaultCacheBehavior))

      /**
       * @param defaultRootObject The object that you want CloudFront to request from your origin
       * (for example, `index.html` ) when a viewer requests the root URL for your distribution (
       * `https://www.example.com` ) instead of an object in your distribution (
       * `https://www.example.com/product-description.html` ). Specifying a default root object avoids
       * exposing the contents of your distribution.
       * Specify only the object name, for example, `index.html` . Don't add a `/` before the object
       * name.
       *
       * If you don't want to specify a default root object when you create a distribution, include
       * an empty `DefaultRootObject` element.
       *
       * To delete the default root object from an existing distribution, update the distribution
       * configuration and include an empty `DefaultRootObject` element.
       *
       * To replace the default root object, update the distribution configuration and specify the
       * new object.
       *
       * For more information about the default root object, see [Creating a Default Root
       * Object](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun defaultRootObject(defaultRootObject: String) {
        cdkBuilder.defaultRootObject(defaultRootObject)
      }

      /**
       * @param enabled From this field, you can enable or disable the selected distribution. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled From this field, you can enable or disable the selected distribution. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param httpVersion (Optional) Specify the maximum HTTP version(s) that you want viewers to
       * use to communicate with CloudFront .
       * The default value for new distributions is `http1.1` .
       *
       * For viewers and CloudFront to use HTTP/2, viewers must support TLSv1.2 or later, and must
       * support Server Name Indication (SNI).
       *
       * For viewers and CloudFront to use HTTP/3, viewers must support TLSv1.3 and Server Name
       * Indication (SNI). CloudFront supports HTTP/3 connection migration to allow the viewer to
       * switch networks without losing connection. For more information about connection migration,
       * see [Connection
       * Migration](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc9000.html#name-connection-migration)
       * at RFC 9000. For more information about supported TLSv1.3 ciphers, see [Supported protocols
       * and ciphers between viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html)
       * .
       */
      override fun httpVersion(httpVersion: String) {
        cdkBuilder.httpVersion(httpVersion)
      }

      /**
       * @param ipv6Enabled If you want CloudFront to respond to IPv6 DNS requests with an IPv6
       * address for your distribution, specify `true` .
       * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response
       * code `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for
       * an IPv4 address for your distribution.
       *
       * In general, you should enable IPv6 if you have users on IPv6 networks who want to access
       * your content. However, if you're using signed URLs or signed cookies to restrict access to
       * your content, and if you're using a custom policy that includes the `IpAddress` parameter to
       * restrict the IP addresses that can access your content, don't enable IPv6. If you want to
       * restrict access to some content by IP address and not restrict access to other content (or
       * restrict access but not by IP address), you can create two distributions. For more
       * information, see [Creating a Signed URL Using a Custom
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you're using an Amazon Route 53 AWS Integration alias resource record set to route
       * traffic to your CloudFront distribution, you need to create a second alias resource record set
       * when both of the following are true:
       *
       * * You enable IPv6 for the distribution
       * * You're using alternate domain names in the URLs for your objects
       *
       * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by
       * Using Your Domain
       * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
       * in the *Amazon Route 53 AWS Integration Developer Guide* .
       *
       * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or
       * with another DNS service, you don't need to make any changes. A CNAME record will route
       * traffic to your distribution regardless of the IP address format of the viewer request.
       */
      override fun ipv6Enabled(ipv6Enabled: Boolean) {
        cdkBuilder.ipv6Enabled(ipv6Enabled)
      }

      /**
       * @param ipv6Enabled If you want CloudFront to respond to IPv6 DNS requests with an IPv6
       * address for your distribution, specify `true` .
       * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response
       * code `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for
       * an IPv4 address for your distribution.
       *
       * In general, you should enable IPv6 if you have users on IPv6 networks who want to access
       * your content. However, if you're using signed URLs or signed cookies to restrict access to
       * your content, and if you're using a custom policy that includes the `IpAddress` parameter to
       * restrict the IP addresses that can access your content, don't enable IPv6. If you want to
       * restrict access to some content by IP address and not restrict access to other content (or
       * restrict access but not by IP address), you can create two distributions. For more
       * information, see [Creating a Signed URL Using a Custom
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you're using an Amazon Route 53 AWS Integration alias resource record set to route
       * traffic to your CloudFront distribution, you need to create a second alias resource record set
       * when both of the following are true:
       *
       * * You enable IPv6 for the distribution
       * * You're using alternate domain names in the URLs for your objects
       *
       * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by
       * Using Your Domain
       * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
       * in the *Amazon Route 53 AWS Integration Developer Guide* .
       *
       * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or
       * with another DNS service, you don't need to make any changes. A CNAME record will route
       * traffic to your distribution regardless of the IP address format of the viewer request.
       */
      override fun ipv6Enabled(ipv6Enabled: IResolvable) {
        cdkBuilder.ipv6Enabled(ipv6Enabled.let(IResolvable::unwrap))
      }

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * distribution.
       * For more information about logging, see [Access
       * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      override fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging.let(IResolvable::unwrap))
      }

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * distribution.
       * For more information about logging, see [Access
       * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      override fun logging(logging: LoggingProperty) {
        cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
      }

      /**
       * @param logging A complex type that controls whether access logs are written for the
       * distribution.
       * For more information about logging, see [Access
       * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in
       * the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c19cbffc19f9f89fba25e2fea7e0041578689fa928da7d6223b5ac0763213e")
      override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
          logging(LoggingProperty(logging))

      /**
       * @param originGroups A complex type that contains information about origin groups for this
       * distribution.
       */
      override fun originGroups(originGroups: IResolvable) {
        cdkBuilder.originGroups(originGroups.let(IResolvable::unwrap))
      }

      /**
       * @param originGroups A complex type that contains information about origin groups for this
       * distribution.
       */
      override fun originGroups(originGroups: OriginGroupsProperty) {
        cdkBuilder.originGroups(originGroups.let(OriginGroupsProperty::unwrap))
      }

      /**
       * @param originGroups A complex type that contains information about origin groups for this
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f59d2af37d5e0c1affac226dd716cf3cf68ab60464638dfe4625c532a25e3ad")
      override fun originGroups(originGroups: OriginGroupsProperty.Builder.() -> Unit): Unit =
          originGroups(OriginGroupsProperty(originGroups))

      /**
       * @param origins A complex type that contains information about origins for this
       * distribution.
       */
      override fun origins(origins: IResolvable) {
        cdkBuilder.origins(origins.let(IResolvable::unwrap))
      }

      /**
       * @param origins A complex type that contains information about origins for this
       * distribution.
       */
      override fun origins(origins: List<Any>) {
        cdkBuilder.origins(origins)
      }

      /**
       * @param origins A complex type that contains information about origins for this
       * distribution.
       */
      override fun origins(vararg origins: Any): Unit = origins(origins.toList())

      /**
       * @param priceClass The price class that corresponds with the maximum price that you want to
       * pay for CloudFront service.
       * If you specify `PriceClass_All` , CloudFront responds to requests for your objects from all
       * CloudFront edge locations.
       *
       * If you specify a price class other than `PriceClass_All` , CloudFront serves your objects
       * from the CloudFront edge location that has the lowest latency among the edge locations in your
       * price class. Viewers who are in or near regions that are excluded from your specified price
       * class may encounter slower performance.
       *
       * For more information about price classes, see [Choosing the Price Class for a CloudFront
       * Distribution](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html)
       * in the *Amazon CloudFront Developer Guide* . For information about CloudFront pricing,
       * including how price classes (such as Price Class 100) map to CloudFront regions, see [Amazon
       * CloudFront Pricing](https://docs.aws.amazon.com/cloudfront/pricing/) .
       */
      override fun priceClass(priceClass: String) {
        cdkBuilder.priceClass(priceClass)
      }

      /**
       * @param restrictions A complex type that identifies ways in which you want to restrict
       * distribution of your content.
       */
      override fun restrictions(restrictions: IResolvable) {
        cdkBuilder.restrictions(restrictions.let(IResolvable::unwrap))
      }

      /**
       * @param restrictions A complex type that identifies ways in which you want to restrict
       * distribution of your content.
       */
      override fun restrictions(restrictions: RestrictionsProperty) {
        cdkBuilder.restrictions(restrictions.let(RestrictionsProperty::unwrap))
      }

      /**
       * @param restrictions A complex type that identifies ways in which you want to restrict
       * distribution of your content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dd22e126e2e93ff812a180da99a1548020ec556b2734fa09087fbbaf07e47b3")
      override fun restrictions(restrictions: RestrictionsProperty.Builder.() -> Unit): Unit =
          restrictions(RestrictionsProperty(restrictions))

      /**
       * @param s3Origin the value to be set.
       */
      override fun s3Origin(s3Origin: IResolvable) {
        cdkBuilder.s3Origin(s3Origin.let(IResolvable::unwrap))
      }

      /**
       * @param s3Origin the value to be set.
       */
      override fun s3Origin(s3Origin: LegacyS3OriginProperty) {
        cdkBuilder.s3Origin(s3Origin.let(LegacyS3OriginProperty::unwrap))
      }

      /**
       * @param s3Origin the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("634153888b6910f25984f15fc15a9cfd8cfcd431da7d237de24a0c3c46dccd4a")
      override fun s3Origin(s3Origin: LegacyS3OriginProperty.Builder.() -> Unit): Unit =
          s3Origin(LegacyS3OriginProperty(s3Origin))

      /**
       * @param staging A Boolean that indicates whether this is a staging distribution.
       * When this value is `true` , this is a staging distribution. When this value is `false` ,
       * this is not a staging distribution.
       */
      override fun staging(staging: Boolean) {
        cdkBuilder.staging(staging)
      }

      /**
       * @param staging A Boolean that indicates whether this is a staging distribution.
       * When this value is `true` , this is a staging distribution. When this value is `false` ,
       * this is not a staging distribution.
       */
      override fun staging(staging: IResolvable) {
        cdkBuilder.staging(staging.let(IResolvable::unwrap))
      }

      /**
       * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
       * configuration for communicating with viewers.
       */
      override fun viewerCertificate(viewerCertificate: IResolvable) {
        cdkBuilder.viewerCertificate(viewerCertificate.let(IResolvable::unwrap))
      }

      /**
       * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
       * configuration for communicating with viewers.
       */
      override fun viewerCertificate(viewerCertificate: ViewerCertificateProperty) {
        cdkBuilder.viewerCertificate(viewerCertificate.let(ViewerCertificateProperty::unwrap))
      }

      /**
       * @param viewerCertificate A complex type that determines the distribution's SSL/TLS
       * configuration for communicating with viewers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3fcb2f5f45457646e32f82b20be2f6c740f0ffbd4e51595da0a7e5e7bacfb32")
      override
          fun viewerCertificate(viewerCertificate: ViewerCertificateProperty.Builder.() -> Unit):
          Unit = viewerCertificate(ViewerCertificateProperty(viewerCertificate))

      /**
       * @param webAclId A unique identifier that specifies the AWS WAF web ACL, if any, to
       * associate with this distribution.
       * To specify a web ACL created using the latest version of AWS WAF , use the ACL ARN, for
       * example
       * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
       * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
       * `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` .
       *
       * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests
       * that are forwarded to CloudFront, and lets you control access to your content. Based on
       * conditions that you specify, such as the IP addresses that requests originate from or the
       * values of query strings, CloudFront responds to requests either with the requested content or
       * with an HTTP 403 status code (Forbidden). You can also configure CloudFront to return a custom
       * error page when a request is blocked. For more information about AWS WAF , see the [AWS WAF
       * Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html) .
       */
      override fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty,
    ) : CdkObject(cdkObject), DistributionConfigProperty {
      /**
       * A complex type that contains information about CNAMEs (alternate domain names), if any, for
       * this distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-aliases)
       */
      override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

      /**
       * A complex type that contains zero or more `CacheBehavior` elements.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cachebehaviors)
       */
      override fun cacheBehaviors(): Any? = unwrap(this).getCacheBehaviors()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-cnames)
       */
      override fun cnamEs(): List<String> = unwrap(this).getCnamEs() ?: emptyList()

      /**
       * A comment to describe the distribution.
       *
       * The comment cannot be longer than 128 characters.
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The identifier of a continuous deployment policy.
       *
       * For more information, see `CreateContinuousDeploymentPolicy` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-continuousdeploymentpolicyid)
       */
      override fun continuousDeploymentPolicyId(): String? =
          unwrap(this).getContinuousDeploymentPolicyId()

      /**
       * A complex type that controls the following:.
       *
       * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
       * messages before returning the response to the viewer.
       * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
       *
       * For more information about custom error pages, see [Customizing Error
       * Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customerrorresponses)
       */
      override fun customErrorResponses(): Any? = unwrap(this).getCustomErrorResponses()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-customorigin)
       */
      override fun customOrigin(): Any? = unwrap(this).getCustomOrigin()

      /**
       * A complex type that describes the default cache behavior if you don't specify a
       * `CacheBehavior` element or if files don't match any of the values of `PathPattern` in
       * `CacheBehavior` elements.
       *
       * You must create exactly one default cache behavior.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultcachebehavior)
       */
      override fun defaultCacheBehavior(): Any = unwrap(this).getDefaultCacheBehavior()

      /**
       * The object that you want CloudFront to request from your origin (for example, `index.html`
       * ) when a viewer requests the root URL for your distribution ( `https://www.example.com` )
       * instead of an object in your distribution ( `https://www.example.com/product-description.html`
       * ). Specifying a default root object avoids exposing the contents of your distribution.
       *
       * Specify only the object name, for example, `index.html` . Don't add a `/` before the object
       * name.
       *
       * If you don't want to specify a default root object when you create a distribution, include
       * an empty `DefaultRootObject` element.
       *
       * To delete the default root object from an existing distribution, update the distribution
       * configuration and include an empty `DefaultRootObject` element.
       *
       * To replace the default root object, update the distribution configuration and specify the
       * new object.
       *
       * For more information about the default root object, see [Creating a Default Root
       * Object](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/DefaultRootObject.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-defaultrootobject)
       */
      override fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

      /**
       * From this field, you can enable or disable the selected distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * (Optional) Specify the maximum HTTP version(s) that you want viewers to use to communicate
       * with CloudFront .
       *
       * The default value for new distributions is `http1.1` .
       *
       * For viewers and CloudFront to use HTTP/2, viewers must support TLSv1.2 or later, and must
       * support Server Name Indication (SNI).
       *
       * For viewers and CloudFront to use HTTP/3, viewers must support TLSv1.3 and Server Name
       * Indication (SNI). CloudFront supports HTTP/3 connection migration to allow the viewer to
       * switch networks without losing connection. For more information about connection migration,
       * see [Connection
       * Migration](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc9000.html#name-connection-migration)
       * at RFC 9000. For more information about supported TLSv1.3 ciphers, see [Supported protocols
       * and ciphers between viewers and
       * CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html)
       * .
       *
       * Default: - "http1.1"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-httpversion)
       */
      override fun httpVersion(): String? = unwrap(this).getHttpVersion()

      /**
       * If you want CloudFront to respond to IPv6 DNS requests with an IPv6 address for your
       * distribution, specify `true` .
       *
       * If you specify `false` , CloudFront responds to IPv6 DNS requests with the DNS response
       * code `NOERROR` and with no IP addresses. This allows viewers to submit a second request, for
       * an IPv4 address for your distribution.
       *
       * In general, you should enable IPv6 if you have users on IPv6 networks who want to access
       * your content. However, if you're using signed URLs or signed cookies to restrict access to
       * your content, and if you're using a custom policy that includes the `IpAddress` parameter to
       * restrict the IP addresses that can access your content, don't enable IPv6. If you want to
       * restrict access to some content by IP address and not restrict access to other content (or
       * restrict access but not by IP address), you can create two distributions. For more
       * information, see [Creating a Signed URL Using a Custom
       * Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-creating-signed-url-custom-policy.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you're using an Amazon Route 53 AWS Integration alias resource record set to route
       * traffic to your CloudFront distribution, you need to create a second alias resource record set
       * when both of the following are true:
       *
       * * You enable IPv6 for the distribution
       * * You're using alternate domain names in the URLs for your objects
       *
       * For more information, see [Routing Traffic to an Amazon CloudFront Web Distribution by
       * Using Your Domain
       * Name](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-to-cloudfront-distribution.html)
       * in the *Amazon Route 53 AWS Integration Developer Guide* .
       *
       * If you created a CNAME resource record set, either with Amazon Route 53 AWS Integration or
       * with another DNS service, you don't need to make any changes. A CNAME record will route
       * traffic to your distribution regardless of the IP address format of the viewer request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-ipv6enabled)
       */
      override fun ipv6Enabled(): Any? = unwrap(this).getIpv6Enabled()

      /**
       * A complex type that controls whether access logs are written for the distribution.
       *
       * For more information about logging, see [Access
       * Logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) in
       * the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-logging)
       */
      override fun logging(): Any? = unwrap(this).getLogging()

      /**
       * A complex type that contains information about origin groups for this distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origingroups)
       */
      override fun originGroups(): Any? = unwrap(this).getOriginGroups()

      /**
       * A complex type that contains information about origins for this distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-origins)
       */
      override fun origins(): Any? = unwrap(this).getOrigins()

      /**
       * The price class that corresponds with the maximum price that you want to pay for CloudFront
       * service.
       *
       * If you specify `PriceClass_All` , CloudFront responds to requests for your objects from all
       * CloudFront edge locations.
       *
       * If you specify a price class other than `PriceClass_All` , CloudFront serves your objects
       * from the CloudFront edge location that has the lowest latency among the edge locations in your
       * price class. Viewers who are in or near regions that are excluded from your specified price
       * class may encounter slower performance.
       *
       * For more information about price classes, see [Choosing the Price Class for a CloudFront
       * Distribution](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PriceClass.html)
       * in the *Amazon CloudFront Developer Guide* . For information about CloudFront pricing,
       * including how price classes (such as Price Class 100) map to CloudFront regions, see [Amazon
       * CloudFront Pricing](https://docs.aws.amazon.com/cloudfront/pricing/) .
       *
       * Default: - "PriceClass_All"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-priceclass)
       */
      override fun priceClass(): String? = unwrap(this).getPriceClass()

      /**
       * A complex type that identifies ways in which you want to restrict distribution of your
       * content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       */
      override fun restrictions(): Any? = unwrap(this).getRestrictions()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-s3origin)
       */
      override fun s3Origin(): Any? = unwrap(this).getS3Origin()

      /**
       * A Boolean that indicates whether this is a staging distribution.
       *
       * When this value is `true` , this is a staging distribution. When this value is `false` ,
       * this is not a staging distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-staging)
       */
      override fun staging(): Any? = unwrap(this).getStaging()

      /**
       * A complex type that determines the distribution's SSL/TLS configuration for communicating
       * with viewers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-viewercertificate)
       */
      override fun viewerCertificate(): Any? = unwrap(this).getViewerCertificate()

      /**
       * A unique identifier that specifies the AWS WAF web ACL, if any, to associate with this
       * distribution.
       *
       * To specify a web ACL created using the latest version of AWS WAF , use the ACL ARN, for
       * example
       * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/a1b2c3d4-5678-90ab-cdef-EXAMPLE11111`
       * . To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
       * `a1b2c3d4-5678-90ab-cdef-EXAMPLE11111` .
       *
       * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests
       * that are forwarded to CloudFront, and lets you control access to your content. Based on
       * conditions that you specify, such as the IP addresses that requests originate from or the
       * values of query strings, CloudFront responds to requests either with the requested content or
       * with an HTTP 403 status code (Forbidden). You can also configure CloudFront to return a custom
       * error page when a request is blocked. For more information about AWS WAF , see the [AWS WAF
       * Developer Guide](https://docs.aws.amazon.com/waf/latest/developerguide/what-is-aws-waf.html) .
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-webaclid)
       */
      override fun webAclId(): String? = unwrap(this).getWebAclId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DistributionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty):
          DistributionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DistributionConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.DistributionConfigProperty
    }
  }

  /**
   * CloudFront Origin Shield.
   *
   * Using Origin Shield can help reduce the load on your origin. For more information, see [Using
   * Origin
   * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html) in
   * the *Amazon CloudFront Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginShieldProperty originShieldProperty = OriginShieldProperty.builder()
   * .enabled(false)
   * .originShieldRegion("originShieldRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-originshield.html)
   */
  public interface OriginShieldProperty {
    /**
     * A flag that specifies whether Origin Shield is enabled.
     *
     * When it's enabled, CloudFront routes all requests through Origin Shield, which can help
     * protect your origin. When it's disabled, CloudFront might send requests directly to your origin
     * from multiple edge locations or regional edge caches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-originshield.html#cfn-cloudfront-distribution-originshield-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The AWS Region for Origin Shield.
     *
     * Specify the AWS Region that has the lowest latency to your origin. To specify a region, use
     * the region code, not the region name. For example, specify the US East (Ohio) region as
     * `us-east-2` .
     *
     * When you enable CloudFront Origin Shield, you must specify the AWS Region for Origin Shield.
     * For the list of AWS Regions that you can specify, and for help choosing the best Region for your
     * origin, see [Choosing the AWS Region for Origin
     * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-originshield.html#cfn-cloudfront-distribution-originshield-originshieldregion)
     */
    public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    /**
     * A builder for [OriginShieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled A flag that specifies whether Origin Shield is enabled.
       * When it's enabled, CloudFront routes all requests through Origin Shield, which can help
       * protect your origin. When it's disabled, CloudFront might send requests directly to your
       * origin from multiple edge locations or regional edge caches.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled A flag that specifies whether Origin Shield is enabled.
       * When it's enabled, CloudFront routes all requests through Origin Shield, which can help
       * protect your origin. When it's disabled, CloudFront might send requests directly to your
       * origin from multiple edge locations or regional edge caches.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param originShieldRegion The AWS Region for Origin Shield.
       * Specify the AWS Region that has the lowest latency to your origin. To specify a region, use
       * the region code, not the region name. For example, specify the US East (Ohio) region as
       * `us-east-2` .
       *
       * When you enable CloudFront Origin Shield, you must specify the AWS Region for Origin
       * Shield. For the list of AWS Regions that you can specify, and for help choosing the best
       * Region for your origin, see [Choosing the AWS Region for Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originShieldRegion(originShieldRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty.builder()

      /**
       * @param enabled A flag that specifies whether Origin Shield is enabled.
       * When it's enabled, CloudFront routes all requests through Origin Shield, which can help
       * protect your origin. When it's disabled, CloudFront might send requests directly to your
       * origin from multiple edge locations or regional edge caches.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled A flag that specifies whether Origin Shield is enabled.
       * When it's enabled, CloudFront routes all requests through Origin Shield, which can help
       * protect your origin. When it's disabled, CloudFront might send requests directly to your
       * origin from multiple edge locations or regional edge caches.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param originShieldRegion The AWS Region for Origin Shield.
       * Specify the AWS Region that has the lowest latency to your origin. To specify a region, use
       * the region code, not the region name. For example, specify the US East (Ohio) region as
       * `us-east-2` .
       *
       * When you enable CloudFront Origin Shield, you must specify the AWS Region for Origin
       * Shield. For the list of AWS Regions that you can specify, and for help choosing the best
       * Region for your origin, see [Choosing the AWS Region for Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty,
    ) : CdkObject(cdkObject), OriginShieldProperty {
      /**
       * A flag that specifies whether Origin Shield is enabled.
       *
       * When it's enabled, CloudFront routes all requests through Origin Shield, which can help
       * protect your origin. When it's disabled, CloudFront might send requests directly to your
       * origin from multiple edge locations or regional edge caches.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-originshield.html#cfn-cloudfront-distribution-originshield-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The AWS Region for Origin Shield.
       *
       * Specify the AWS Region that has the lowest latency to your origin. To specify a region, use
       * the region code, not the region name. For example, specify the US East (Ohio) region as
       * `us-east-2` .
       *
       * When you enable CloudFront Origin Shield, you must specify the AWS Region for Origin
       * Shield. For the list of AWS Regions that you can specify, and for help choosing the best
       * Region for your origin, see [Choosing the AWS Region for Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-originshield.html#cfn-cloudfront-distribution-originshield-originshieldregion)
       */
      override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginShieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty):
          OriginShieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginShieldProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginShieldProperty
    }
  }

  /**
   * A complex data type for the status codes that you specify that, when returned by a primary
   * origin, trigger CloudFront to failover to a second origin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * StatusCodesProperty statusCodesProperty = StatusCodesProperty.builder()
   * .items(List.of(123))
   * .quantity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html)
   */
  public interface StatusCodesProperty {
    /**
     * The items (status codes) for an origin group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html#cfn-cloudfront-distribution-statuscodes-items)
     */
    public fun items(): Any

    /**
     * The number of status codes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html#cfn-cloudfront-distribution-statuscodes-quantity)
     */
    public fun quantity(): Number

    /**
     * A builder for [StatusCodesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The items (status codes) for an origin group. 
       */
      public fun items(items: IResolvable)

      /**
       * @param items The items (status codes) for an origin group. 
       */
      public fun items(items: List<Number>)

      /**
       * @param items The items (status codes) for an origin group. 
       */
      public fun items(vararg items: Number)

      /**
       * @param quantity The number of status codes. 
       */
      public fun quantity(quantity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty.builder()

      /**
       * @param items The items (status codes) for an origin group. 
       */
      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      /**
       * @param items The items (status codes) for an origin group. 
       */
      override fun items(items: List<Number>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The items (status codes) for an origin group. 
       */
      override fun items(vararg items: Number): Unit = items(items.toList())

      /**
       * @param quantity The number of status codes. 
       */
      override fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty,
    ) : CdkObject(cdkObject), StatusCodesProperty {
      /**
       * The items (status codes) for an origin group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html#cfn-cloudfront-distribution-statuscodes-items)
       */
      override fun items(): Any = unwrap(this).getItems()

      /**
       * The number of status codes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html#cfn-cloudfront-distribution-statuscodes-quantity)
       */
      override fun quantity(): Number = unwrap(this).getQuantity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StatusCodesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty):
          StatusCodesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatusCodesProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.StatusCodesProperty
    }
  }

  /**
   * A complex data type that includes information about the failover criteria for an origin group,
   * including the status codes for which CloudFront will failover from the primary origin to the
   * second origin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginGroupFailoverCriteriaProperty originGroupFailoverCriteriaProperty =
   * OriginGroupFailoverCriteriaProperty.builder()
   * .statusCodes(StatusCodesProperty.builder()
   * .items(List.of(123))
   * .quantity(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html)
   */
  public interface OriginGroupFailoverCriteriaProperty {
    /**
     * The status codes that, when returned from the primary origin, will trigger CloudFront to
     * failover to the second origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html#cfn-cloudfront-distribution-origingroupfailovercriteria-statuscodes)
     */
    public fun statusCodes(): Any

    /**
     * A builder for [OriginGroupFailoverCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param statusCodes The status codes that, when returned from the primary origin, will
       * trigger CloudFront to failover to the second origin. 
       */
      public fun statusCodes(statusCodes: IResolvable)

      /**
       * @param statusCodes The status codes that, when returned from the primary origin, will
       * trigger CloudFront to failover to the second origin. 
       */
      public fun statusCodes(statusCodes: StatusCodesProperty)

      /**
       * @param statusCodes The status codes that, when returned from the primary origin, will
       * trigger CloudFront to failover to the second origin. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c997e834a3ff812829e5458abdbdc4343717bb3acf0af3ba1122ba6ad465bcfc")
      public fun statusCodes(statusCodes: StatusCodesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty.builder()

      /**
       * @param statusCodes The status codes that, when returned from the primary origin, will
       * trigger CloudFront to failover to the second origin. 
       */
      override fun statusCodes(statusCodes: IResolvable) {
        cdkBuilder.statusCodes(statusCodes.let(IResolvable::unwrap))
      }

      /**
       * @param statusCodes The status codes that, when returned from the primary origin, will
       * trigger CloudFront to failover to the second origin. 
       */
      override fun statusCodes(statusCodes: StatusCodesProperty) {
        cdkBuilder.statusCodes(statusCodes.let(StatusCodesProperty::unwrap))
      }

      /**
       * @param statusCodes The status codes that, when returned from the primary origin, will
       * trigger CloudFront to failover to the second origin. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c997e834a3ff812829e5458abdbdc4343717bb3acf0af3ba1122ba6ad465bcfc")
      override fun statusCodes(statusCodes: StatusCodesProperty.Builder.() -> Unit): Unit =
          statusCodes(StatusCodesProperty(statusCodes))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty,
    ) : CdkObject(cdkObject), OriginGroupFailoverCriteriaProperty {
      /**
       * The status codes that, when returned from the primary origin, will trigger CloudFront to
       * failover to the second origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html#cfn-cloudfront-distribution-origingroupfailovercriteria-statuscodes)
       */
      override fun statusCodes(): Any = unwrap(this).getStatusCodes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OriginGroupFailoverCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty):
          OriginGroupFailoverCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupFailoverCriteriaProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupFailoverCriteriaProperty
    }
  }

  /**
   * A complex data type for the origins included in an origin group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginGroupMembersProperty originGroupMembersProperty = OriginGroupMembersProperty.builder()
   * .items(List.of(OriginGroupMemberProperty.builder()
   * .originId("originId")
   * .build()))
   * .quantity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html)
   */
  public interface OriginGroupMembersProperty {
    /**
     * Items (origins) in an origin group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-items)
     */
    public fun items(): Any

    /**
     * The number of origins in an origin group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-quantity)
     */
    public fun quantity(): Number

    /**
     * A builder for [OriginGroupMembersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items Items (origins) in an origin group. 
       */
      public fun items(items: IResolvable)

      /**
       * @param items Items (origins) in an origin group. 
       */
      public fun items(items: List<Any>)

      /**
       * @param items Items (origins) in an origin group. 
       */
      public fun items(vararg items: Any)

      /**
       * @param quantity The number of origins in an origin group. 
       */
      public fun quantity(quantity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty.builder()

      /**
       * @param items Items (origins) in an origin group. 
       */
      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      /**
       * @param items Items (origins) in an origin group. 
       */
      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items Items (origins) in an origin group. 
       */
      override fun items(vararg items: Any): Unit = items(items.toList())

      /**
       * @param quantity The number of origins in an origin group. 
       */
      override fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty,
    ) : CdkObject(cdkObject), OriginGroupMembersProperty {
      /**
       * Items (origins) in an origin group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-items)
       */
      override fun items(): Any = unwrap(this).getItems()

      /**
       * The number of origins in an origin group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html#cfn-cloudfront-distribution-origingroupmembers-quantity)
       */
      override fun quantity(): Number = unwrap(this).getQuantity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupMembersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty):
          OriginGroupMembersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupMembersProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMembersProperty
    }
  }

  /**
   * A complex type that contains a Lambda&#64;Edge function association.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * LambdaFunctionAssociationProperty lambdaFunctionAssociationProperty =
   * LambdaFunctionAssociationProperty.builder()
   * .eventType("eventType")
   * .includeBody(false)
   * .lambdaFunctionArn("lambdaFunctionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html)
   */
  public interface LambdaFunctionAssociationProperty {
    /**
     * Specifies the event type that triggers a Lambda&#64;Edge function invocation. You can specify
     * the following values:.
     *
     * * `viewer-request` : The function executes when CloudFront receives a request from a viewer
     * and before it checks to see whether the requested object is in the edge cache.
     * * `origin-request` : The function executes only when CloudFront sends a request to your
     * origin. When the requested object is in the edge cache, the function doesn't execute.
     * * `origin-response` : The function executes after CloudFront receives a response from the
     * origin and before it caches the object in the response. When the requested object is in the edge
     * cache, the function doesn't execute.
     * * `viewer-response` : The function executes before CloudFront returns the requested object to
     * the viewer. The function executes regardless of whether the object was already in the edge
     * cache.
     *
     * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't
     * execute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype)
     */
    public fun eventType(): String? = unwrap(this).getEventType()

    /**
     * A flag that allows a Lambda&#64;Edge function to have read access to the body content.
     *
     * For more information, see [Accessing the Request Body by Choosing the Include Body
     * Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
     * in the Amazon CloudFront Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-includebody)
     */
    public fun includeBody(): Any? = unwrap(this).getIncludeBody()

    /**
     * The ARN of the Lambda&#64;Edge function.
     *
     * You must specify the ARN of a function version; you can't specify an alias or $LATEST.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn)
     */
    public fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()

    /**
     * A builder for [LambdaFunctionAssociationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eventType Specifies the event type that triggers a Lambda&#64;Edge function
       * invocation. You can specify the following values:.
       * * `viewer-request` : The function executes when CloudFront receives a request from a viewer
       * and before it checks to see whether the requested object is in the edge cache.
       * * `origin-request` : The function executes only when CloudFront sends a request to your
       * origin. When the requested object is in the edge cache, the function doesn't execute.
       * * `origin-response` : The function executes after CloudFront receives a response from the
       * origin and before it caches the object in the response. When the requested object is in the
       * edge cache, the function doesn't execute.
       * * `viewer-response` : The function executes before CloudFront returns the requested object
       * to the viewer. The function executes regardless of whether the object was already in the edge
       * cache.
       *
       * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't
       * execute.
       */
      public fun eventType(eventType: String)

      /**
       * @param includeBody A flag that allows a Lambda&#64;Edge function to have read access to the
       * body content.
       * For more information, see [Accessing the Request Body by Choosing the Include Body
       * Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
       * in the Amazon CloudFront Developer Guide.
       */
      public fun includeBody(includeBody: Boolean)

      /**
       * @param includeBody A flag that allows a Lambda&#64;Edge function to have read access to the
       * body content.
       * For more information, see [Accessing the Request Body by Choosing the Include Body
       * Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
       * in the Amazon CloudFront Developer Guide.
       */
      public fun includeBody(includeBody: IResolvable)

      /**
       * @param lambdaFunctionArn The ARN of the Lambda&#64;Edge function.
       * You must specify the ARN of a function version; you can't specify an alias or $LATEST.
       */
      public fun lambdaFunctionArn(lambdaFunctionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty.builder()

      /**
       * @param eventType Specifies the event type that triggers a Lambda&#64;Edge function
       * invocation. You can specify the following values:.
       * * `viewer-request` : The function executes when CloudFront receives a request from a viewer
       * and before it checks to see whether the requested object is in the edge cache.
       * * `origin-request` : The function executes only when CloudFront sends a request to your
       * origin. When the requested object is in the edge cache, the function doesn't execute.
       * * `origin-response` : The function executes after CloudFront receives a response from the
       * origin and before it caches the object in the response. When the requested object is in the
       * edge cache, the function doesn't execute.
       * * `viewer-response` : The function executes before CloudFront returns the requested object
       * to the viewer. The function executes regardless of whether the object was already in the edge
       * cache.
       *
       * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't
       * execute.
       */
      override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      /**
       * @param includeBody A flag that allows a Lambda&#64;Edge function to have read access to the
       * body content.
       * For more information, see [Accessing the Request Body by Choosing the Include Body
       * Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
       * in the Amazon CloudFront Developer Guide.
       */
      override fun includeBody(includeBody: Boolean) {
        cdkBuilder.includeBody(includeBody)
      }

      /**
       * @param includeBody A flag that allows a Lambda&#64;Edge function to have read access to the
       * body content.
       * For more information, see [Accessing the Request Body by Choosing the Include Body
       * Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
       * in the Amazon CloudFront Developer Guide.
       */
      override fun includeBody(includeBody: IResolvable) {
        cdkBuilder.includeBody(includeBody.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaFunctionArn The ARN of the Lambda&#64;Edge function.
       * You must specify the ARN of a function version; you can't specify an alias or $LATEST.
       */
      override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty,
    ) : CdkObject(cdkObject), LambdaFunctionAssociationProperty {
      /**
       * Specifies the event type that triggers a Lambda&#64;Edge function invocation. You can
       * specify the following values:.
       *
       * * `viewer-request` : The function executes when CloudFront receives a request from a viewer
       * and before it checks to see whether the requested object is in the edge cache.
       * * `origin-request` : The function executes only when CloudFront sends a request to your
       * origin. When the requested object is in the edge cache, the function doesn't execute.
       * * `origin-response` : The function executes after CloudFront receives a response from the
       * origin and before it caches the object in the response. When the requested object is in the
       * edge cache, the function doesn't execute.
       * * `viewer-response` : The function executes before CloudFront returns the requested object
       * to the viewer. The function executes regardless of whether the object was already in the edge
       * cache.
       *
       * If the origin returns an HTTP status code other than HTTP 200 (OK), the function doesn't
       * execute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype)
       */
      override fun eventType(): String? = unwrap(this).getEventType()

      /**
       * A flag that allows a Lambda&#64;Edge function to have read access to the body content.
       *
       * For more information, see [Accessing the Request Body by Choosing the Include Body
       * Option](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html)
       * in the Amazon CloudFront Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-includebody)
       */
      override fun includeBody(): Any? = unwrap(this).getIncludeBody()

      /**
       * The ARN of the Lambda&#64;Edge function.
       *
       * You must specify the ARN of a function version; you can't specify an alias or $LATEST.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn)
       */
      override fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaFunctionAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty):
          LambdaFunctionAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionAssociationProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LambdaFunctionAssociationProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * LegacyS3OriginProperty legacyS3OriginProperty = LegacyS3OriginProperty.builder()
   * .dnsName("dnsName")
   * // the properties below are optional
   * .originAccessIdentity("originAccessIdentity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacys3origin.html)
   */
  public interface LegacyS3OriginProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacys3origin.html#cfn-cloudfront-distribution-legacys3origin-dnsname)
     */
    public fun dnsName(): String

    /**
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacys3origin.html#cfn-cloudfront-distribution-legacys3origin-originaccessidentity)
     */
    public fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()

    /**
     * A builder for [LegacyS3OriginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsName the value to be set. 
       */
      public fun dnsName(dnsName: String)

      /**
       * @param originAccessIdentity the value to be set.
       */
      public fun originAccessIdentity(originAccessIdentity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty.builder()

      /**
       * @param dnsName the value to be set. 
       */
      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      /**
       * @param originAccessIdentity the value to be set.
       */
      override fun originAccessIdentity(originAccessIdentity: String) {
        cdkBuilder.originAccessIdentity(originAccessIdentity)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty,
    ) : CdkObject(cdkObject), LegacyS3OriginProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacys3origin.html#cfn-cloudfront-distribution-legacys3origin-dnsname)
       */
      override fun dnsName(): String = unwrap(this).getDnsName()

      /**
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacys3origin.html#cfn-cloudfront-distribution-legacys3origin-originaccessidentity)
       */
      override fun originAccessIdentity(): String? = unwrap(this).getOriginAccessIdentity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LegacyS3OriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty):
          LegacyS3OriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LegacyS3OriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyS3OriginProperty
    }
  }

  /**
   * An origin group includes two origins (a primary origin and a second origin to failover to) and
   * a failover criteria that you specify.
   *
   * You create an origin group to support origin failover in CloudFront. When you create or update
   * a distribution, you can specify the origin group instead of a single origin, and CloudFront will
   * failover from the primary origin to the second origin under the failover conditions that you've
   * chosen.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginGroupProperty originGroupProperty = OriginGroupProperty.builder()
   * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
   * .statusCodes(StatusCodesProperty.builder()
   * .items(List.of(123))
   * .quantity(123)
   * .build())
   * .build())
   * .id("id")
   * .members(OriginGroupMembersProperty.builder()
   * .items(List.of(OriginGroupMemberProperty.builder()
   * .originId("originId")
   * .build()))
   * .quantity(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html)
   */
  public interface OriginGroupProperty {
    /**
     * A complex type that contains information about the failover criteria for an origin group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-failovercriteria)
     */
    public fun failoverCriteria(): Any

    /**
     * The origin group's ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-id)
     */
    public fun id(): String

    /**
     * A complex type that contains information about the origins in an origin group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-members)
     */
    public fun members(): Any

    /**
     * A builder for [OriginGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failoverCriteria A complex type that contains information about the failover
       * criteria for an origin group. 
       */
      public fun failoverCriteria(failoverCriteria: IResolvable)

      /**
       * @param failoverCriteria A complex type that contains information about the failover
       * criteria for an origin group. 
       */
      public fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty)

      /**
       * @param failoverCriteria A complex type that contains information about the failover
       * criteria for an origin group. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f4d787b4e92fe92e336afdb492b94f8b4716801cfb8fce8dc7508cce0320d34")
      public
          fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty.Builder.() -> Unit)

      /**
       * @param id The origin group's ID. 
       */
      public fun id(id: String)

      /**
       * @param members A complex type that contains information about the origins in an origin
       * group. 
       */
      public fun members(members: IResolvable)

      /**
       * @param members A complex type that contains information about the origins in an origin
       * group. 
       */
      public fun members(members: OriginGroupMembersProperty)

      /**
       * @param members A complex type that contains information about the origins in an origin
       * group. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97933107d8a6aac776e575fc5da0ed9131a507ebb8949d354f76489a3be51a4e")
      public fun members(members: OriginGroupMembersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty.builder()

      /**
       * @param failoverCriteria A complex type that contains information about the failover
       * criteria for an origin group. 
       */
      override fun failoverCriteria(failoverCriteria: IResolvable) {
        cdkBuilder.failoverCriteria(failoverCriteria.let(IResolvable::unwrap))
      }

      /**
       * @param failoverCriteria A complex type that contains information about the failover
       * criteria for an origin group. 
       */
      override fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty) {
        cdkBuilder.failoverCriteria(failoverCriteria.let(OriginGroupFailoverCriteriaProperty::unwrap))
      }

      /**
       * @param failoverCriteria A complex type that contains information about the failover
       * criteria for an origin group. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7f4d787b4e92fe92e336afdb492b94f8b4716801cfb8fce8dc7508cce0320d34")
      override
          fun failoverCriteria(failoverCriteria: OriginGroupFailoverCriteriaProperty.Builder.() -> Unit):
          Unit = failoverCriteria(OriginGroupFailoverCriteriaProperty(failoverCriteria))

      /**
       * @param id The origin group's ID. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param members A complex type that contains information about the origins in an origin
       * group. 
       */
      override fun members(members: IResolvable) {
        cdkBuilder.members(members.let(IResolvable::unwrap))
      }

      /**
       * @param members A complex type that contains information about the origins in an origin
       * group. 
       */
      override fun members(members: OriginGroupMembersProperty) {
        cdkBuilder.members(members.let(OriginGroupMembersProperty::unwrap))
      }

      /**
       * @param members A complex type that contains information about the origins in an origin
       * group. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97933107d8a6aac776e575fc5da0ed9131a507ebb8949d354f76489a3be51a4e")
      override fun members(members: OriginGroupMembersProperty.Builder.() -> Unit): Unit =
          members(OriginGroupMembersProperty(members))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty,
    ) : CdkObject(cdkObject), OriginGroupProperty {
      /**
       * A complex type that contains information about the failover criteria for an origin group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-failovercriteria)
       */
      override fun failoverCriteria(): Any = unwrap(this).getFailoverCriteria()

      /**
       * The origin group's ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * A complex type that contains information about the origins in an origin group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-members)
       */
      override fun members(): Any = unwrap(this).getMembers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty):
          OriginGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupProperty
    }
  }

  /**
   * An origin.
   *
   * An origin is the location where content is stored, and from which CloudFront gets content to
   * serve to viewers. To specify an origin:
   *
   * * Use `S3OriginConfig` to specify an Amazon S3 bucket that is not configured with static
   * website hosting.
   * * Use `CustomOriginConfig` to specify all other kinds of origins, including:
   * * An Amazon S3 bucket that is configured with static website hosting
   * * An Elastic Load Balancing load balancer
   * * An AWS Elemental MediaPackage endpoint
   * * An AWS Elemental MediaStore container
   * * Any other HTTP server, running on an Amazon EC2 instance or any other kind of host
   *
   * For the current maximum number of origins that you can specify per distribution, see [General
   * Quotas on Web
   * Distributions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html#limits-web-distributions)
   * in the *Amazon CloudFront Developer Guide* (quotas were formerly referred to as limits).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginProperty originProperty = OriginProperty.builder()
   * .domainName("domainName")
   * .id("id")
   * // the properties below are optional
   * .connectionAttempts(123)
   * .connectionTimeout(123)
   * .customOriginConfig(CustomOriginConfigProperty.builder()
   * .originProtocolPolicy("originProtocolPolicy")
   * // the properties below are optional
   * .httpPort(123)
   * .httpsPort(123)
   * .originKeepaliveTimeout(123)
   * .originReadTimeout(123)
   * .originSslProtocols(List.of("originSslProtocols"))
   * .build())
   * .originAccessControlId("originAccessControlId")
   * .originCustomHeaders(List.of(OriginCustomHeaderProperty.builder()
   * .headerName("headerName")
   * .headerValue("headerValue")
   * .build()))
   * .originPath("originPath")
   * .originShield(OriginShieldProperty.builder()
   * .enabled(false)
   * .originShieldRegion("originShieldRegion")
   * .build())
   * .s3OriginConfig(S3OriginConfigProperty.builder()
   * .originAccessIdentity("originAccessIdentity")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html)
   */
  public interface OriginProperty {
    /**
     * The number of times that CloudFront attempts to connect to the origin.
     *
     * The minimum number is 1, the maximum is 3, and the default (if you don't specify otherwise)
     * is 3.
     *
     * For a custom origin (including an Amazon S3 bucket that's configured with static website
     * hosting), this value also specifies the number of times that CloudFront attempts to get a
     * response from the origin, in the case of an [Origin Response
     * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
     * .
     *
     * For more information, see [Origin Connection
     * Attempts](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-connectionattempts)
     */
    public fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the
     * origin.
     *
     * The minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don't
     * specify otherwise) is 10 seconds.
     *
     * For more information, see [Origin Connection
     * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-connectiontimeout)
     */
    public fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

    /**
     * Use this type to specify an origin that is not an Amazon S3 bucket, with one exception.
     *
     * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
     * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
     * instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-customoriginconfig)
     */
    public fun customOriginConfig(): Any? = unwrap(this).getCustomOriginConfig()

    /**
     * The domain name for the origin.
     *
     * For more information, see [Origin Domain
     * Name](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname)
     */
    public fun domainName(): String

    /**
     * A unique identifier for the origin. This value must be unique within the distribution.
     *
     * Use this value to specify the `TargetOriginId` in a `CacheBehavior` or `DefaultCacheBehavior`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id)
     */
    public fun id(): String

    /**
     * The unique identifier of an origin access control for this origin.
     *
     * For more information, see [Restricting access to an Amazon S3
     * origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originaccesscontrolid)
     */
    public fun originAccessControlId(): String? = unwrap(this).getOriginAccessControlId()

    /**
     * A list of HTTP header names and values that CloudFront adds to the requests that it sends to
     * the origin.
     *
     * For more information, see [Adding Custom Headers to Origin
     * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders)
     */
    public fun originCustomHeaders(): Any? = unwrap(this).getOriginCustomHeaders()

    /**
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests
     * content from the origin.
     *
     * For more information, see [Origin
     * Path](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath)
     */
    public fun originPath(): String? = unwrap(this).getOriginPath()

    /**
     * CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.
     *
     * For more information, see [Using Origin
     * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originshield)
     */
    public fun originShield(): Any? = unwrap(this).getOriginShield()

    /**
     * Use this type to specify an origin that is an Amazon S3 bucket that is not configured with
     * static website hosting.
     *
     * To specify any other type of origin, including an Amazon S3 bucket that is configured with
     * static website hosting, use the `CustomOriginConfig` type instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-s3originconfig)
     */
    public fun s3OriginConfig(): Any? = unwrap(this).getS3OriginConfig()

    /**
     * A builder for [OriginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionAttempts The number of times that CloudFront attempts to connect to the
       * origin.
       * The minimum number is 1, the maximum is 3, and the default (if you don't specify otherwise)
       * is 3.
       *
       * For a custom origin (including an Amazon S3 bucket that's configured with static website
       * hosting), this value also specifies the number of times that CloudFront attempts to get a
       * response from the origin, in the case of an [Origin Response
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
       * .
       *
       * For more information, see [Origin Connection
       * Attempts](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun connectionAttempts(connectionAttempts: Number)

      /**
       * @param connectionTimeout The number of seconds that CloudFront waits when trying to
       * establish a connection to the origin.
       * The minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don't
       * specify otherwise) is 10 seconds.
       *
       * For more information, see [Origin Connection
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun connectionTimeout(connectionTimeout: Number)

      /**
       * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3
       * bucket, with one exception.
       * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
       * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
       * instead.
       */
      public fun customOriginConfig(customOriginConfig: IResolvable)

      /**
       * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3
       * bucket, with one exception.
       * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
       * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
       * instead.
       */
      public fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty)

      /**
       * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3
       * bucket, with one exception.
       * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
       * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
       * instead.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("673786f28187da609be6f59efa8a3d8d357f3ffa2f59a93f79f80c4940585d7f")
      public
          fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty.Builder.() -> Unit)

      /**
       * @param domainName The domain name for the origin. 
       * For more information, see [Origin Domain
       * Name](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun domainName(domainName: String)

      /**
       * @param id A unique identifier for the origin. This value must be unique within the
       * distribution. 
       * Use this value to specify the `TargetOriginId` in a `CacheBehavior` or
       * `DefaultCacheBehavior` .
       */
      public fun id(id: String)

      /**
       * @param originAccessControlId The unique identifier of an origin access control for this
       * origin.
       * For more information, see [Restricting access to an Amazon S3
       * origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originAccessControlId(originAccessControlId: String)

      /**
       * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to
       * the requests that it sends to the origin.
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originCustomHeaders(originCustomHeaders: IResolvable)

      /**
       * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to
       * the requests that it sends to the origin.
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originCustomHeaders(originCustomHeaders: List<Any>)

      /**
       * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to
       * the requests that it sends to the origin.
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originCustomHeaders(vararg originCustomHeaders: Any)

      /**
       * @param originPath An optional path that CloudFront appends to the origin domain name when
       * CloudFront requests content from the origin.
       * For more information, see [Origin
       * Path](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originPath(originPath: String)

      /**
       * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load
       * on your origin.
       * For more information, see [Using Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originShield(originShield: IResolvable)

      /**
       * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load
       * on your origin.
       * For more information, see [Using Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun originShield(originShield: OriginShieldProperty)

      /**
       * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load
       * on your origin.
       * For more information, see [Using Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39f284527bb4abacf89ca1a17e2c98adcb7d71c7f4863bde84c03ebc84d1de75")
      public fun originShield(originShield: OriginShieldProperty.Builder.() -> Unit)

      /**
       * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that
       * is not configured with static website hosting.
       * To specify any other type of origin, including an Amazon S3 bucket that is configured with
       * static website hosting, use the `CustomOriginConfig` type instead.
       */
      public fun s3OriginConfig(s3OriginConfig: IResolvable)

      /**
       * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that
       * is not configured with static website hosting.
       * To specify any other type of origin, including an Amazon S3 bucket that is configured with
       * static website hosting, use the `CustomOriginConfig` type instead.
       */
      public fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty)

      /**
       * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that
       * is not configured with static website hosting.
       * To specify any other type of origin, including an Amazon S3 bucket that is configured with
       * static website hosting, use the `CustomOriginConfig` type instead.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("345ceecbfefa4e6f7dfc83aa125d7e491472a25e0620b0a0ff0e1fa09fe5eea9")
      public fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty.builder()

      /**
       * @param connectionAttempts The number of times that CloudFront attempts to connect to the
       * origin.
       * The minimum number is 1, the maximum is 3, and the default (if you don't specify otherwise)
       * is 3.
       *
       * For a custom origin (including an Amazon S3 bucket that's configured with static website
       * hosting), this value also specifies the number of times that CloudFront attempts to get a
       * response from the origin, in the case of an [Origin Response
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
       * .
       *
       * For more information, see [Origin Connection
       * Attempts](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
      }

      /**
       * @param connectionTimeout The number of seconds that CloudFront waits when trying to
       * establish a connection to the origin.
       * The minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don't
       * specify otherwise) is 10 seconds.
       *
       * For more information, see [Origin Connection
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
      }

      /**
       * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3
       * bucket, with one exception.
       * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
       * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
       * instead.
       */
      override fun customOriginConfig(customOriginConfig: IResolvable) {
        cdkBuilder.customOriginConfig(customOriginConfig.let(IResolvable::unwrap))
      }

      /**
       * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3
       * bucket, with one exception.
       * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
       * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
       * instead.
       */
      override fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty) {
        cdkBuilder.customOriginConfig(customOriginConfig.let(CustomOriginConfigProperty::unwrap))
      }

      /**
       * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3
       * bucket, with one exception.
       * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
       * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
       * instead.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("673786f28187da609be6f59efa8a3d8d357f3ffa2f59a93f79f80c4940585d7f")
      override
          fun customOriginConfig(customOriginConfig: CustomOriginConfigProperty.Builder.() -> Unit):
          Unit = customOriginConfig(CustomOriginConfigProperty(customOriginConfig))

      /**
       * @param domainName The domain name for the origin. 
       * For more information, see [Origin Domain
       * Name](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      /**
       * @param id A unique identifier for the origin. This value must be unique within the
       * distribution. 
       * Use this value to specify the `TargetOriginId` in a `CacheBehavior` or
       * `DefaultCacheBehavior` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param originAccessControlId The unique identifier of an origin access control for this
       * origin.
       * For more information, see [Restricting access to an Amazon S3
       * origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originAccessControlId(originAccessControlId: String) {
        cdkBuilder.originAccessControlId(originAccessControlId)
      }

      /**
       * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to
       * the requests that it sends to the origin.
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originCustomHeaders(originCustomHeaders: IResolvable) {
        cdkBuilder.originCustomHeaders(originCustomHeaders.let(IResolvable::unwrap))
      }

      /**
       * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to
       * the requests that it sends to the origin.
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originCustomHeaders(originCustomHeaders: List<Any>) {
        cdkBuilder.originCustomHeaders(originCustomHeaders)
      }

      /**
       * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to
       * the requests that it sends to the origin.
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originCustomHeaders(vararg originCustomHeaders: Any): Unit =
          originCustomHeaders(originCustomHeaders.toList())

      /**
       * @param originPath An optional path that CloudFront appends to the origin domain name when
       * CloudFront requests content from the origin.
       * For more information, see [Origin
       * Path](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
      }

      /**
       * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load
       * on your origin.
       * For more information, see [Using Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originShield(originShield: IResolvable) {
        cdkBuilder.originShield(originShield.let(IResolvable::unwrap))
      }

      /**
       * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load
       * on your origin.
       * For more information, see [Using Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun originShield(originShield: OriginShieldProperty) {
        cdkBuilder.originShield(originShield.let(OriginShieldProperty::unwrap))
      }

      /**
       * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load
       * on your origin.
       * For more information, see [Using Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("39f284527bb4abacf89ca1a17e2c98adcb7d71c7f4863bde84c03ebc84d1de75")
      override fun originShield(originShield: OriginShieldProperty.Builder.() -> Unit): Unit =
          originShield(OriginShieldProperty(originShield))

      /**
       * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that
       * is not configured with static website hosting.
       * To specify any other type of origin, including an Amazon S3 bucket that is configured with
       * static website hosting, use the `CustomOriginConfig` type instead.
       */
      override fun s3OriginConfig(s3OriginConfig: IResolvable) {
        cdkBuilder.s3OriginConfig(s3OriginConfig.let(IResolvable::unwrap))
      }

      /**
       * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that
       * is not configured with static website hosting.
       * To specify any other type of origin, including an Amazon S3 bucket that is configured with
       * static website hosting, use the `CustomOriginConfig` type instead.
       */
      override fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty) {
        cdkBuilder.s3OriginConfig(s3OriginConfig.let(S3OriginConfigProperty::unwrap))
      }

      /**
       * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that
       * is not configured with static website hosting.
       * To specify any other type of origin, including an Amazon S3 bucket that is configured with
       * static website hosting, use the `CustomOriginConfig` type instead.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("345ceecbfefa4e6f7dfc83aa125d7e491472a25e0620b0a0ff0e1fa09fe5eea9")
      override fun s3OriginConfig(s3OriginConfig: S3OriginConfigProperty.Builder.() -> Unit): Unit =
          s3OriginConfig(S3OriginConfigProperty(s3OriginConfig))

      public fun build(): software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty,
    ) : CdkObject(cdkObject), OriginProperty {
      /**
       * The number of times that CloudFront attempts to connect to the origin.
       *
       * The minimum number is 1, the maximum is 3, and the default (if you don't specify otherwise)
       * is 3.
       *
       * For a custom origin (including an Amazon S3 bucket that's configured with static website
       * hosting), this value also specifies the number of times that CloudFront attempts to get a
       * response from the origin, in the case of an [Origin Response
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
       * .
       *
       * For more information, see [Origin Connection
       * Attempts](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-connectionattempts)
       */
      override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

      /**
       * The number of seconds that CloudFront waits when trying to establish a connection to the
       * origin.
       *
       * The minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don't
       * specify otherwise) is 10 seconds.
       *
       * For more information, see [Origin Connection
       * Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-connectiontimeout)
       */
      override fun connectionTimeout(): Number? = unwrap(this).getConnectionTimeout()

      /**
       * Use this type to specify an origin that is not an Amazon S3 bucket, with one exception.
       *
       * If the Amazon S3 bucket is configured with static website hosting, use this type. If the
       * Amazon S3 bucket is not configured with static website hosting, use the `S3OriginConfig` type
       * instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-customoriginconfig)
       */
      override fun customOriginConfig(): Any? = unwrap(this).getCustomOriginConfig()

      /**
       * The domain name for the origin.
       *
       * For more information, see [Origin Domain
       * Name](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-domainname)
       */
      override fun domainName(): String = unwrap(this).getDomainName()

      /**
       * A unique identifier for the origin. This value must be unique within the distribution.
       *
       * Use this value to specify the `TargetOriginId` in a `CacheBehavior` or
       * `DefaultCacheBehavior` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The unique identifier of an origin access control for this origin.
       *
       * For more information, see [Restricting access to an Amazon S3
       * origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originaccesscontrolid)
       */
      override fun originAccessControlId(): String? = unwrap(this).getOriginAccessControlId()

      /**
       * A list of HTTP header names and values that CloudFront adds to the requests that it sends
       * to the origin.
       *
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-origincustomheaders)
       */
      override fun originCustomHeaders(): Any? = unwrap(this).getOriginCustomHeaders()

      /**
       * An optional path that CloudFront appends to the origin domain name when CloudFront requests
       * content from the origin.
       *
       * For more information, see [Origin
       * Path](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * Default: - ""
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originpath)
       */
      override fun originPath(): String? = unwrap(this).getOriginPath()

      /**
       * CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.
       *
       * For more information, see [Using Origin
       * Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-originshield)
       */
      override fun originShield(): Any? = unwrap(this).getOriginShield()

      /**
       * Use this type to specify an origin that is an Amazon S3 bucket that is not configured with
       * static website hosting.
       *
       * To specify any other type of origin, including an Amazon S3 bucket that is configured with
       * static website hosting, use the `CustomOriginConfig` type instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html#cfn-cloudfront-distribution-origin-s3originconfig)
       */
      override fun s3OriginConfig(): Any? = unwrap(this).getS3OriginConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty):
          OriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginProperty
    }
  }

  /**
   * An origin in an origin group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginGroupMemberProperty originGroupMemberProperty = OriginGroupMemberProperty.builder()
   * .originId("originId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html)
   */
  public interface OriginGroupMemberProperty {
    /**
     * The ID for an origin in an origin group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html#cfn-cloudfront-distribution-origingroupmember-originid)
     */
    public fun originId(): String

    /**
     * A builder for [OriginGroupMemberProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param originId The ID for an origin in an origin group. 
       */
      public fun originId(originId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty.builder()

      /**
       * @param originId The ID for an origin in an origin group. 
       */
      override fun originId(originId: String) {
        cdkBuilder.originId(originId)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty,
    ) : CdkObject(cdkObject), OriginGroupMemberProperty {
      /**
       * The ID for an origin in an origin group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html#cfn-cloudfront-distribution-origingroupmember-originid)
       */
      override fun originId(): String = unwrap(this).getOriginId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginGroupMemberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty):
          OriginGroupMemberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginGroupMemberProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginGroupMemberProperty
    }
  }

  /**
   * A complex type that contains `HeaderName` and `HeaderValue` elements, if any, for this
   * distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginCustomHeaderProperty originCustomHeaderProperty = OriginCustomHeaderProperty.builder()
   * .headerName("headerName")
   * .headerValue("headerValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html)
   */
  public interface OriginCustomHeaderProperty {
    /**
     * The name of a header that you want CloudFront to send to your origin.
     *
     * For more information, see [Adding Custom Headers to Origin
     * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername)
     */
    public fun headerName(): String

    /**
     * The value for the header that you specified in the `HeaderName` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue)
     */
    public fun headerValue(): String

    /**
     * A builder for [OriginCustomHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerName The name of a header that you want CloudFront to send to your origin. 
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun headerName(headerName: String)

      /**
       * @param headerValue The value for the header that you specified in the `HeaderName` field. 
       */
      public fun headerValue(headerValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty.builder()

      /**
       * @param headerName The name of a header that you want CloudFront to send to your origin. 
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      /**
       * @param headerValue The value for the header that you specified in the `HeaderName` field. 
       */
      override fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty,
    ) : CdkObject(cdkObject), OriginCustomHeaderProperty {
      /**
       * The name of a header that you want CloudFront to send to your origin.
       *
       * For more information, see [Adding Custom Headers to Origin
       * Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/forward-custom-headers.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername)
       */
      override fun headerName(): String = unwrap(this).getHeaderName()

      /**
       * The value for the header that you specified in the `HeaderName` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue)
       */
      override fun headerValue(): String = unwrap(this).getHeaderValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OriginCustomHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty):
          OriginCustomHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginCustomHeaderProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.OriginCustomHeaderProperty
    }
  }

  /**
   * A complex type that identifies ways in which you want to restrict distribution of your content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * RestrictionsProperty restrictionsProperty = RestrictionsProperty.builder()
   * .geoRestriction(GeoRestrictionProperty.builder()
   * .restrictionType("restrictionType")
   * // the properties below are optional
   * .locations(List.of("locations"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html)
   */
  public interface RestrictionsProperty {
    /**
     * A complex type that controls the countries in which your content is distributed.
     *
     * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To disable
     * geo restriction, remove the
     * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
     * property from your stack template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html#cfn-cloudfront-distribution-restrictions-georestriction)
     */
    public fun geoRestriction(): Any

    /**
     * A builder for [RestrictionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param geoRestriction A complex type that controls the countries in which your content is
       * distributed. 
       * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To
       * disable geo restriction, remove the
       * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       * property from your stack template.
       */
      public fun geoRestriction(geoRestriction: IResolvable)

      /**
       * @param geoRestriction A complex type that controls the countries in which your content is
       * distributed. 
       * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To
       * disable geo restriction, remove the
       * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       * property from your stack template.
       */
      public fun geoRestriction(geoRestriction: GeoRestrictionProperty)

      /**
       * @param geoRestriction A complex type that controls the countries in which your content is
       * distributed. 
       * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To
       * disable geo restriction, remove the
       * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       * property from your stack template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f953f010c1b6055a54f92673e021554d06508699325e69a30cbf137403e63ba8")
      public fun geoRestriction(geoRestriction: GeoRestrictionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty.builder()

      /**
       * @param geoRestriction A complex type that controls the countries in which your content is
       * distributed. 
       * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To
       * disable geo restriction, remove the
       * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       * property from your stack template.
       */
      override fun geoRestriction(geoRestriction: IResolvable) {
        cdkBuilder.geoRestriction(geoRestriction.let(IResolvable::unwrap))
      }

      /**
       * @param geoRestriction A complex type that controls the countries in which your content is
       * distributed. 
       * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To
       * disable geo restriction, remove the
       * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       * property from your stack template.
       */
      override fun geoRestriction(geoRestriction: GeoRestrictionProperty) {
        cdkBuilder.geoRestriction(geoRestriction.let(GeoRestrictionProperty::unwrap))
      }

      /**
       * @param geoRestriction A complex type that controls the countries in which your content is
       * distributed. 
       * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To
       * disable geo restriction, remove the
       * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       * property from your stack template.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f953f010c1b6055a54f92673e021554d06508699325e69a30cbf137403e63ba8")
      override fun geoRestriction(geoRestriction: GeoRestrictionProperty.Builder.() -> Unit): Unit =
          geoRestriction(GeoRestrictionProperty(geoRestriction))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty,
    ) : CdkObject(cdkObject), RestrictionsProperty {
      /**
       * A complex type that controls the countries in which your content is distributed.
       *
       * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To
       * disable geo restriction, remove the
       * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
       * property from your stack template.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html#cfn-cloudfront-distribution-restrictions-georestriction)
       */
      override fun geoRestriction(): Any = unwrap(this).getGeoRestriction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RestrictionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty):
          RestrictionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestrictionsProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.RestrictionsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * LegacyCustomOriginProperty legacyCustomOriginProperty = LegacyCustomOriginProperty.builder()
   * .dnsName("dnsName")
   * .originProtocolPolicy("originProtocolPolicy")
   * .originSslProtocols(List.of("originSslProtocols"))
   * // the properties below are optional
   * .httpPort(123)
   * .httpsPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html)
   */
  public interface LegacyCustomOriginProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-dnsname)
     */
    public fun dnsName(): String

    /**
     * Default: - 80
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-httpport)
     */
    public fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * Default: - 443
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-httpsport)
     */
    public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-originprotocolpolicy)
     */
    public fun originProtocolPolicy(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-originsslprotocols)
     */
    public fun originSslProtocols(): List<String>

    /**
     * A builder for [LegacyCustomOriginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsName the value to be set. 
       */
      public fun dnsName(dnsName: String)

      /**
       * @param httpPort the value to be set.
       */
      public fun httpPort(httpPort: Number)

      /**
       * @param httpsPort the value to be set.
       */
      public fun httpsPort(httpsPort: Number)

      /**
       * @param originProtocolPolicy the value to be set. 
       */
      public fun originProtocolPolicy(originProtocolPolicy: String)

      /**
       * @param originSslProtocols the value to be set. 
       */
      public fun originSslProtocols(originSslProtocols: List<String>)

      /**
       * @param originSslProtocols the value to be set. 
       */
      public fun originSslProtocols(vararg originSslProtocols: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty.builder()

      /**
       * @param dnsName the value to be set. 
       */
      override fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
      }

      /**
       * @param httpPort the value to be set.
       */
      override fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
      }

      /**
       * @param httpsPort the value to be set.
       */
      override fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
      }

      /**
       * @param originProtocolPolicy the value to be set. 
       */
      override fun originProtocolPolicy(originProtocolPolicy: String) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
      }

      /**
       * @param originSslProtocols the value to be set. 
       */
      override fun originSslProtocols(originSslProtocols: List<String>) {
        cdkBuilder.originSslProtocols(originSslProtocols)
      }

      /**
       * @param originSslProtocols the value to be set. 
       */
      override fun originSslProtocols(vararg originSslProtocols: String): Unit =
          originSslProtocols(originSslProtocols.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty,
    ) : CdkObject(cdkObject), LegacyCustomOriginProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-dnsname)
       */
      override fun dnsName(): String = unwrap(this).getDnsName()

      /**
       * Default: - 80
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-httpport)
       */
      override fun httpPort(): Number? = unwrap(this).getHttpPort()

      /**
       * Default: - 443
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-httpsport)
       */
      override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-originprotocolpolicy)
       */
      override fun originProtocolPolicy(): String = unwrap(this).getOriginProtocolPolicy()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html#cfn-cloudfront-distribution-legacycustomorigin-originsslprotocols)
       */
      override fun originSslProtocols(): List<String> = unwrap(this).getOriginSslProtocols()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LegacyCustomOriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty):
          LegacyCustomOriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LegacyCustomOriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnDistribution.LegacyCustomOriginProperty
    }
  }
}
