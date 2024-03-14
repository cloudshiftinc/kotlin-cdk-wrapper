package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCachePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The unique identifier for the cache policy.
   *
   * For example: `2766f7b2-75c5-41c6-8f06-bf4303a2f2f5` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time when the cache policy was last modified.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * The cache policy configuration.
   */
  public open fun cachePolicyConfig(): Any = unwrap(this).getCachePolicyConfig()

  /**
   * The cache policy configuration.
   */
  public open fun cachePolicyConfig(`value`: IResolvable) {
    unwrap(this).setCachePolicyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The cache policy configuration.
   */
  public open fun cachePolicyConfig(`value`: CachePolicyConfigProperty) {
    unwrap(this).setCachePolicyConfig(`value`.let(CachePolicyConfigProperty::unwrap))
  }

  /**
   * The cache policy configuration.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0327f7068e2c26ae7ca2e311cd280c733fe8760df83548dbb931da2dcb8107e0")
  public open fun cachePolicyConfig(`value`: CachePolicyConfigProperty.Builder.() -> Unit): Unit =
      cachePolicyConfig(CachePolicyConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnCachePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     * @param cachePolicyConfig The cache policy configuration. 
     */
    public fun cachePolicyConfig(cachePolicyConfig: IResolvable)

    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     * @param cachePolicyConfig The cache policy configuration. 
     */
    public fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty)

    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     * @param cachePolicyConfig The cache policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fda54e25ac114759a639535f6dbaf9669165446bd1b2f9c3b537ceb0eced2e3")
    public fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnCachePolicy.Builder.create(scope, id)

    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     * @param cachePolicyConfig The cache policy configuration. 
     */
    override fun cachePolicyConfig(cachePolicyConfig: IResolvable) {
      cdkBuilder.cachePolicyConfig(cachePolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     * @param cachePolicyConfig The cache policy configuration. 
     */
    override fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty) {
      cdkBuilder.cachePolicyConfig(cachePolicyConfig.let(CachePolicyConfigProperty::unwrap))
    }

    /**
     * The cache policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html#cfn-cloudfront-cachepolicy-cachepolicyconfig)
     * @param cachePolicyConfig The cache policy configuration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fda54e25ac114759a639535f6dbaf9669165446bd1b2f9c3b537ceb0eced2e3")
    override fun cachePolicyConfig(cachePolicyConfig: CachePolicyConfigProperty.Builder.() -> Unit):
        Unit = cachePolicyConfig(CachePolicyConfigProperty(cachePolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnCachePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCachePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCachePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy):
        CfnCachePolicy = CfnCachePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnCachePolicy):
        software.amazon.awscdk.services.cloudfront.CfnCachePolicy = wrapped.cdkObject
  }

  public interface HeadersConfigProperty {
    /**
     * Determines whether any HTTP headers are included in the cache key and in requests that
     * CloudFront sends to the origin.
     *
     * Valid values are:
     *
     * * `none` – No HTTP headers are included in the cache key or in requests that CloudFront sends
     * to the origin. Even when this field is set to `none` , any headers that are listed in an
     * `OriginRequestPolicy` *are* included in origin requests.
     * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
     * the cache key and in requests that CloudFront sends to the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-headersconfig.html#cfn-cloudfront-cachepolicy-headersconfig-headerbehavior)
     */
    public fun headerBehavior(): String

    /**
     * Contains a list of HTTP header names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-headersconfig.html#cfn-cloudfront-cachepolicy-headersconfig-headers)
     */
    public fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

    /**
     * A builder for [HeadersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
       * in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No HTTP headers are included in the cache key or in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any headers that are listed in an
       * `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
       * the cache key and in requests that CloudFront sends to the origin.
       */
      public fun headerBehavior(headerBehavior: String)

      /**
       * @param headers Contains a list of HTTP header names.
       */
      public fun headers(headers: List<String>)

      /**
       * @param headers Contains a list of HTTP header names.
       */
      public fun headers(vararg headers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty.builder()

      /**
       * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
       * in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No HTTP headers are included in the cache key or in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any headers that are listed in an
       * `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
       * the cache key and in requests that CloudFront sends to the origin.
       */
      override fun headerBehavior(headerBehavior: String) {
        cdkBuilder.headerBehavior(headerBehavior)
      }

      /**
       * @param headers Contains a list of HTTP header names.
       */
      override fun headers(headers: List<String>) {
        cdkBuilder.headers(headers)
      }

      /**
       * @param headers Contains a list of HTTP header names.
       */
      override fun headers(vararg headers: String): Unit = headers(headers.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty,
    ) : CdkObject(cdkObject), HeadersConfigProperty {
      /**
       * Determines whether any HTTP headers are included in the cache key and in requests that
       * CloudFront sends to the origin.
       *
       * Valid values are:
       *
       * * `none` – No HTTP headers are included in the cache key or in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any headers that are listed in an
       * `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
       * the cache key and in requests that CloudFront sends to the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-headersconfig.html#cfn-cloudfront-cachepolicy-headersconfig-headerbehavior)
       */
      override fun headerBehavior(): String = unwrap(this).getHeaderBehavior()

      /**
       * Contains a list of HTTP header names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-headersconfig.html#cfn-cloudfront-cachepolicy-headersconfig-headers)
       */
      override fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty):
          HeadersConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty
    }
  }

  public interface ParametersInCacheKeyAndForwardedToOriginProperty {
    /**
     * An object that determines whether any cookies in viewer requests (and if so, which cookies)
     * are included in the cache key and in requests that CloudFront sends to the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-cookiesconfig)
     */
    public fun cookiesConfig(): Any

    /**
     * A flag that can affect whether the `Accept-Encoding` HTTP header is included in the cache key
     * and included in requests that CloudFront sends to the origin.
     *
     * This field is related to the `EnableAcceptEncodingGzip` field. If one or both of these fields
     * is `true` *and* the viewer request includes the `Accept-Encoding` header, then CloudFront does
     * the following:
     *
     * * Normalizes the value of the viewer's `Accept-Encoding` header
     * * Includes the normalized header in the cache key
     * * Includes the normalized header in the request to the origin, if a request is necessary
     *
     * For more information, see [Compression
     * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you set this value to `true` , and this cache behavior also has an origin request policy
     * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
     * always includes the `Accept-Encoding` header in origin requests when the value of this field is
     * `true` , so including this header in an origin request policy has no effect.
     *
     * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header the
     * same as any other HTTP header in the viewer request. By default, it's not included in the cache
     * key and it's not included in origin requests. In this case, you can manually add
     * `Accept-Encoding` to the headers whitelist like any other HTTP header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-enableacceptencodingbrotli)
     */
    public fun enableAcceptEncodingBrotli(): Any? = unwrap(this).getEnableAcceptEncodingBrotli()

    /**
     * A flag that can affect whether the `Accept-Encoding` HTTP header is included in the cache key
     * and included in requests that CloudFront sends to the origin.
     *
     * This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of these
     * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then CloudFront
     * does the following:
     *
     * * Normalizes the value of the viewer's `Accept-Encoding` header
     * * Includes the normalized header in the cache key
     * * Includes the normalized header in the request to the origin, if a request is necessary
     *
     * For more information, see [Compression
     * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you set this value to `true` , and this cache behavior also has an origin request policy
     * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
     * always includes the `Accept-Encoding` header in origin requests when the value of this field is
     * `true` , so including this header in an origin request policy has no effect.
     *
     * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header the
     * same as any other HTTP header in the viewer request. By default, it's not included in the cache
     * key and it's not included in origin requests. In this case, you can manually add
     * `Accept-Encoding` to the headers whitelist like any other HTTP header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-enableacceptencodinggzip)
     */
    public fun enableAcceptEncodingGzip(): Any

    /**
     * An object that determines whether any HTTP headers (and if so, which headers) are included in
     * the cache key and in requests that CloudFront sends to the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-headersconfig)
     */
    public fun headersConfig(): Any

    /**
     * An object that determines whether any URL query strings in viewer requests (and if so, which
     * query strings) are included in the cache key and in requests that CloudFront sends to the
     * origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-querystringsconfig)
     */
    public fun queryStringsConfig(): Any

    /**
     * A builder for [ParametersInCacheKeyAndForwardedToOriginProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookiesConfig An object that determines whether any cookies in viewer requests (and
       * if so, which cookies) are included in the cache key and in requests that CloudFront sends to
       * the origin. 
       */
      public fun cookiesConfig(cookiesConfig: IResolvable)

      /**
       * @param cookiesConfig An object that determines whether any cookies in viewer requests (and
       * if so, which cookies) are included in the cache key and in requests that CloudFront sends to
       * the origin. 
       */
      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty)

      /**
       * @param cookiesConfig An object that determines whether any cookies in viewer requests (and
       * if so, which cookies) are included in the cache key and in requests that CloudFront sends to
       * the origin. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd73846cce71a0b5ddc21e71b0389d3a5f0b8a86832fe7ab38b9e11c3c050129")
      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit)

      /**
       * @param enableAcceptEncodingBrotli A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin.
       * This field is related to the `EnableAcceptEncodingGzip` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean)

      /**
       * @param enableAcceptEncodingBrotli A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin.
       * This field is related to the `EnableAcceptEncodingGzip` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: IResolvable)

      /**
       * @param enableAcceptEncodingGzip A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin. 
       * This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean)

      /**
       * @param enableAcceptEncodingGzip A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin. 
       * This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: IResolvable)

      /**
       * @param headersConfig An object that determines whether any HTTP headers (and if so, which
       * headers) are included in the cache key and in requests that CloudFront sends to the origin. 
       */
      public fun headersConfig(headersConfig: IResolvable)

      /**
       * @param headersConfig An object that determines whether any HTTP headers (and if so, which
       * headers) are included in the cache key and in requests that CloudFront sends to the origin. 
       */
      public fun headersConfig(headersConfig: HeadersConfigProperty)

      /**
       * @param headersConfig An object that determines whether any HTTP headers (and if so, which
       * headers) are included in the cache key and in requests that CloudFront sends to the origin. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45c52ffde49eb8eb105709b889f144604b1745146eb4d92c5ab4efc984ed406b")
      public fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit)

      /**
       * @param queryStringsConfig An object that determines whether any URL query strings in viewer
       * requests (and if so, which query strings) are included in the cache key and in requests that
       * CloudFront sends to the origin. 
       */
      public fun queryStringsConfig(queryStringsConfig: IResolvable)

      /**
       * @param queryStringsConfig An object that determines whether any URL query strings in viewer
       * requests (and if so, which query strings) are included in the cache key and in requests that
       * CloudFront sends to the origin. 
       */
      public fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty)

      /**
       * @param queryStringsConfig An object that determines whether any URL query strings in viewer
       * requests (and if so, which query strings) are included in the cache key and in requests that
       * CloudFront sends to the origin. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e895acf57abba00224b945c1c7b5a23ebc86968d55485206445b4be7aca139")
      public
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.builder()

      /**
       * @param cookiesConfig An object that determines whether any cookies in viewer requests (and
       * if so, which cookies) are included in the cache key and in requests that CloudFront sends to
       * the origin. 
       */
      override fun cookiesConfig(cookiesConfig: IResolvable) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(IResolvable::unwrap))
      }

      /**
       * @param cookiesConfig An object that determines whether any cookies in viewer requests (and
       * if so, which cookies) are included in the cache key and in requests that CloudFront sends to
       * the origin. 
       */
      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(CookiesConfigProperty::unwrap))
      }

      /**
       * @param cookiesConfig An object that determines whether any cookies in viewer requests (and
       * if so, which cookies) are included in the cache key and in requests that CloudFront sends to
       * the origin. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd73846cce71a0b5ddc21e71b0389d3a5f0b8a86832fe7ab38b9e11c3c050129")
      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit): Unit =
          cookiesConfig(CookiesConfigProperty(cookiesConfig))

      /**
       * @param enableAcceptEncodingBrotli A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin.
       * This field is related to the `EnableAcceptEncodingGzip` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
      }

      /**
       * @param enableAcceptEncodingBrotli A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin.
       * This field is related to the `EnableAcceptEncodingGzip` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: IResolvable) {
        cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli.let(IResolvable::unwrap))
      }

      /**
       * @param enableAcceptEncodingGzip A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin. 
       * This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
      }

      /**
       * @param enableAcceptEncodingGzip A flag that can affect whether the `Accept-Encoding` HTTP
       * header is included in the cache key and included in requests that CloudFront sends to the
       * origin. 
       * This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       */
      override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: IResolvable) {
        cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip.let(IResolvable::unwrap))
      }

      /**
       * @param headersConfig An object that determines whether any HTTP headers (and if so, which
       * headers) are included in the cache key and in requests that CloudFront sends to the origin. 
       */
      override fun headersConfig(headersConfig: IResolvable) {
        cdkBuilder.headersConfig(headersConfig.let(IResolvable::unwrap))
      }

      /**
       * @param headersConfig An object that determines whether any HTTP headers (and if so, which
       * headers) are included in the cache key and in requests that CloudFront sends to the origin. 
       */
      override fun headersConfig(headersConfig: HeadersConfigProperty) {
        cdkBuilder.headersConfig(headersConfig.let(HeadersConfigProperty::unwrap))
      }

      /**
       * @param headersConfig An object that determines whether any HTTP headers (and if so, which
       * headers) are included in the cache key and in requests that CloudFront sends to the origin. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("45c52ffde49eb8eb105709b889f144604b1745146eb4d92c5ab4efc984ed406b")
      override fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit): Unit =
          headersConfig(HeadersConfigProperty(headersConfig))

      /**
       * @param queryStringsConfig An object that determines whether any URL query strings in viewer
       * requests (and if so, which query strings) are included in the cache key and in requests that
       * CloudFront sends to the origin. 
       */
      override fun queryStringsConfig(queryStringsConfig: IResolvable) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringsConfig An object that determines whether any URL query strings in viewer
       * requests (and if so, which query strings) are included in the cache key and in requests that
       * CloudFront sends to the origin. 
       */
      override fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(QueryStringsConfigProperty::unwrap))
      }

      /**
       * @param queryStringsConfig An object that determines whether any URL query strings in viewer
       * requests (and if so, which query strings) are included in the cache key and in requests that
       * CloudFront sends to the origin. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("91e895acf57abba00224b945c1c7b5a23ebc86968d55485206445b4be7aca139")
      override
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit):
          Unit = queryStringsConfig(QueryStringsConfigProperty(queryStringsConfig))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty,
    ) : CdkObject(cdkObject), ParametersInCacheKeyAndForwardedToOriginProperty {
      /**
       * An object that determines whether any cookies in viewer requests (and if so, which cookies)
       * are included in the cache key and in requests that CloudFront sends to the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-cookiesconfig)
       */
      override fun cookiesConfig(): Any = unwrap(this).getCookiesConfig()

      /**
       * A flag that can affect whether the `Accept-Encoding` HTTP header is included in the cache
       * key and included in requests that CloudFront sends to the origin.
       *
       * This field is related to the `EnableAcceptEncodingGzip` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-enableacceptencodingbrotli)
       */
      override fun enableAcceptEncodingBrotli(): Any? = unwrap(this).getEnableAcceptEncodingBrotli()

      /**
       * A flag that can affect whether the `Accept-Encoding` HTTP header is included in the cache
       * key and included in requests that CloudFront sends to the origin.
       *
       * This field is related to the `EnableAcceptEncodingBrotli` field. If one or both of these
       * fields is `true` *and* the viewer request includes the `Accept-Encoding` header, then
       * CloudFront does the following:
       *
       * * Normalizes the value of the viewer's `Accept-Encoding` header
       * * Includes the normalized header in the cache key
       * * Includes the normalized header in the request to the origin, if a request is necessary
       *
       * For more information, see [Compression
       * support](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-policy-compressed-objects)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * If you set this value to `true` , and this cache behavior also has an origin request policy
       * attached, do not include the `Accept-Encoding` header in the origin request policy. CloudFront
       * always includes the `Accept-Encoding` header in origin requests when the value of this field
       * is `true` , so including this header in an origin request policy has no effect.
       *
       * If both of these fields are `false` , then CloudFront treats the `Accept-Encoding` header
       * the same as any other HTTP header in the viewer request. By default, it's not included in the
       * cache key and it's not included in origin requests. In this case, you can manually add
       * `Accept-Encoding` to the headers whitelist like any other HTTP header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-enableacceptencodinggzip)
       */
      override fun enableAcceptEncodingGzip(): Any = unwrap(this).getEnableAcceptEncodingGzip()

      /**
       * An object that determines whether any HTTP headers (and if so, which headers) are included
       * in the cache key and in requests that CloudFront sends to the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-headersconfig)
       */
      override fun headersConfig(): Any = unwrap(this).getHeadersConfig()

      /**
       * An object that determines whether any URL query strings in viewer requests (and if so,
       * which query strings) are included in the cache key and in requests that CloudFront sends to
       * the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html#cfn-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin-querystringsconfig)
       */
      override fun queryStringsConfig(): Any = unwrap(this).getQueryStringsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ParametersInCacheKeyAndForwardedToOriginProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty):
          ParametersInCacheKeyAndForwardedToOriginProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParametersInCacheKeyAndForwardedToOriginProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty
    }
  }

  public interface CookiesConfigProperty {
    /**
     * Determines whether any cookies in viewer requests are included in the cache key and in
     * requests that CloudFront sends to the origin.
     *
     * Valid values are:
     *
     * * `none` – No cookies in viewer requests are included in the cache key or in requests that
     * CloudFront sends to the origin. Even when this field is set to `none` , any cookies that are
     * listed in an `OriginRequestPolicy` *are* included in origin requests.
     * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames` type
     * are included in the cache key and in requests that CloudFront sends to the origin.
     * * `allExcept` – All cookies in viewer requests are included in the cache key and in requests
     * that CloudFront sends to the origin, **except** for those that are listed in the `CookieNames`
     * type, which are not included.
     * * `all` – All cookies in viewer requests are included in the cache key and in requests that
     * CloudFront sends to the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cookiesconfig.html#cfn-cloudfront-cachepolicy-cookiesconfig-cookiebehavior)
     */
    public fun cookieBehavior(): String

    /**
     * Contains a list of cookie names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cookiesconfig.html#cfn-cloudfront-cachepolicy-cookiesconfig-cookies)
     */
    public fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()

    /**
     * A builder for [CookiesConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
       * cache key and in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No cookies in viewer requests are included in the cache key or in requests that
       * CloudFront sends to the origin. Even when this field is set to `none` , any cookies that are
       * listed in an `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames`
       * type are included in the cache key and in requests that CloudFront sends to the origin.
       * * `allExcept` – All cookies in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin, **except** for those that are listed in the
       * `CookieNames` type, which are not included.
       * * `all` – All cookies in viewer requests are included in the cache key and in requests that
       * CloudFront sends to the origin.
       */
      public fun cookieBehavior(cookieBehavior: String)

      /**
       * @param cookies Contains a list of cookie names.
       */
      public fun cookies(cookies: List<String>)

      /**
       * @param cookies Contains a list of cookie names.
       */
      public fun cookies(vararg cookies: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty.builder()

      /**
       * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
       * cache key and in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No cookies in viewer requests are included in the cache key or in requests that
       * CloudFront sends to the origin. Even when this field is set to `none` , any cookies that are
       * listed in an `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames`
       * type are included in the cache key and in requests that CloudFront sends to the origin.
       * * `allExcept` – All cookies in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin, **except** for those that are listed in the
       * `CookieNames` type, which are not included.
       * * `all` – All cookies in viewer requests are included in the cache key and in requests that
       * CloudFront sends to the origin.
       */
      override fun cookieBehavior(cookieBehavior: String) {
        cdkBuilder.cookieBehavior(cookieBehavior)
      }

      /**
       * @param cookies Contains a list of cookie names.
       */
      override fun cookies(cookies: List<String>) {
        cdkBuilder.cookies(cookies)
      }

      /**
       * @param cookies Contains a list of cookie names.
       */
      override fun cookies(vararg cookies: String): Unit = cookies(cookies.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty,
    ) : CdkObject(cdkObject), CookiesConfigProperty {
      /**
       * Determines whether any cookies in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin.
       *
       * Valid values are:
       *
       * * `none` – No cookies in viewer requests are included in the cache key or in requests that
       * CloudFront sends to the origin. Even when this field is set to `none` , any cookies that are
       * listed in an `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames`
       * type are included in the cache key and in requests that CloudFront sends to the origin.
       * * `allExcept` – All cookies in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin, **except** for those that are listed in the
       * `CookieNames` type, which are not included.
       * * `all` – All cookies in viewer requests are included in the cache key and in requests that
       * CloudFront sends to the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cookiesconfig.html#cfn-cloudfront-cachepolicy-cookiesconfig-cookiebehavior)
       */
      override fun cookieBehavior(): String = unwrap(this).getCookieBehavior()

      /**
       * Contains a list of cookie names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cookiesconfig.html#cfn-cloudfront-cachepolicy-cookiesconfig-cookies)
       */
      override fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty):
          CookiesConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty
    }
  }

  public interface QueryStringsConfigProperty {
    /**
     * Determines whether any URL query strings in viewer requests are included in the cache key and
     * in requests that CloudFront sends to the origin.
     *
     * Valid values are:
     *
     * * `none` – No query strings in viewer requests are included in the cache key or in requests
     * that CloudFront sends to the origin. Even when this field is set to `none` , any query strings
     * that are listed in an `OriginRequestPolicy` *are* included in origin requests.
     * * `whitelist` – Only the query strings in viewer requests that are listed in the
     * `QueryStringNames` type are included in the cache key and in requests that CloudFront sends to
     * the origin.
     * * `allExcept` – All query strings in viewer requests are included in the cache key and in
     * requests that CloudFront sends to the origin, **except** those that are listed in the
     * `QueryStringNames` type, which are not included.
     * * `all` – All query strings in viewer requests are included in the cache key and in requests
     * that CloudFront sends to the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-querystringsconfig.html#cfn-cloudfront-cachepolicy-querystringsconfig-querystringbehavior)
     */
    public fun queryStringBehavior(): String

    /**
     * Contains a list of query string names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-querystringsconfig.html#cfn-cloudfront-cachepolicy-querystringsconfig-querystrings)
     */
    public fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

    /**
     * A builder for [QueryStringsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queryStringBehavior Determines whether any URL query strings in viewer requests are
       * included in the cache key and in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No query strings in viewer requests are included in the cache key or in requests
       * that CloudFront sends to the origin. Even when this field is set to `none` , any query strings
       * that are listed in an `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the query strings in viewer requests that are listed in the
       * `QueryStringNames` type are included in the cache key and in requests that CloudFront sends to
       * the origin.
       * * `allExcept` – All query strings in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin, **except** those that are listed in the
       * `QueryStringNames` type, which are not included.
       * * `all` – All query strings in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin.
       */
      public fun queryStringBehavior(queryStringBehavior: String)

      /**
       * @param queryStrings Contains a list of query string names.
       */
      public fun queryStrings(queryStrings: List<String>)

      /**
       * @param queryStrings Contains a list of query string names.
       */
      public fun queryStrings(vararg queryStrings: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty.builder()

      /**
       * @param queryStringBehavior Determines whether any URL query strings in viewer requests are
       * included in the cache key and in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No query strings in viewer requests are included in the cache key or in requests
       * that CloudFront sends to the origin. Even when this field is set to `none` , any query strings
       * that are listed in an `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the query strings in viewer requests that are listed in the
       * `QueryStringNames` type are included in the cache key and in requests that CloudFront sends to
       * the origin.
       * * `allExcept` – All query strings in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin, **except** those that are listed in the
       * `QueryStringNames` type, which are not included.
       * * `all` – All query strings in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin.
       */
      override fun queryStringBehavior(queryStringBehavior: String) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
      }

      /**
       * @param queryStrings Contains a list of query string names.
       */
      override fun queryStrings(queryStrings: List<String>) {
        cdkBuilder.queryStrings(queryStrings)
      }

      /**
       * @param queryStrings Contains a list of query string names.
       */
      override fun queryStrings(vararg queryStrings: String): Unit =
          queryStrings(queryStrings.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty,
    ) : CdkObject(cdkObject), QueryStringsConfigProperty {
      /**
       * Determines whether any URL query strings in viewer requests are included in the cache key
       * and in requests that CloudFront sends to the origin.
       *
       * Valid values are:
       *
       * * `none` – No query strings in viewer requests are included in the cache key or in requests
       * that CloudFront sends to the origin. Even when this field is set to `none` , any query strings
       * that are listed in an `OriginRequestPolicy` *are* included in origin requests.
       * * `whitelist` – Only the query strings in viewer requests that are listed in the
       * `QueryStringNames` type are included in the cache key and in requests that CloudFront sends to
       * the origin.
       * * `allExcept` – All query strings in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin, **except** those that are listed in the
       * `QueryStringNames` type, which are not included.
       * * `all` – All query strings in viewer requests are included in the cache key and in
       * requests that CloudFront sends to the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-querystringsconfig.html#cfn-cloudfront-cachepolicy-querystringsconfig-querystringbehavior)
       */
      override fun queryStringBehavior(): String = unwrap(this).getQueryStringBehavior()

      /**
       * Contains a list of query string names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-querystringsconfig.html#cfn-cloudfront-cachepolicy-querystringsconfig-querystrings)
       */
      override fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty):
          QueryStringsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringsConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty
    }
  }

  public interface CachePolicyConfigProperty {
    /**
     * A comment to describe the cache policy.
     *
     * The comment cannot be longer than 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The default amount of time, in seconds, that you want objects to stay in the CloudFront cache
     * before CloudFront sends another request to the origin to see if the object has been updated.
     *
     * CloudFront uses this value as the object's time to live (TTL) only when the origin does *not*
     * send `Cache-Control` or `Expires` headers with the object. For more information, see [Managing
     * How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The default value for this field is 86400 seconds (one day). If the value of `MinTTL` is more
     * than 86400 seconds, then the default value for this field is the same as the value of `MinTTL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-defaultttl)
     */
    public fun defaultTtl(): Number

    /**
     * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before
     * CloudFront sends another request to the origin to see if the object has been updated.
     *
     * CloudFront uses this value only when the origin sends `Cache-Control` or `Expires` headers
     * with the object. For more information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The default value for this field is 31536000 seconds (one year). If the value of `MinTTL` or
     * `DefaultTTL` is more than 31536000 seconds, then the default value for this field is the same as
     * the value of `DefaultTTL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-maxttl)
     */
    public fun maxTtl(): Number

    /**
     * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront cache
     * before CloudFront sends another request to the origin to see if the object has been updated.
     *
     * For more information, see [Managing How Long Content Stays in an Edge Cache
     * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-minttl)
     */
    public fun minTtl(): Number

    /**
     * A unique name to identify the cache policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-name)
     */
    public fun name(): String

    /**
     * The HTTP headers, cookies, and URL query strings to include in the cache key.
     *
     * The values included in the cache key are also included in requests that CloudFront sends to
     * the origin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-parametersincachekeyandforwardedtoorigin)
     */
    public fun parametersInCacheKeyAndForwardedToOrigin(): Any

    /**
     * A builder for [CachePolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment A comment to describe the cache policy.
       * The comment cannot be longer than 128 characters.
       */
      public fun comment(comment: String)

      /**
       * @param defaultTtl The default amount of time, in seconds, that you want objects to stay in
       * the CloudFront cache before CloudFront sends another request to the origin to see if the
       * object has been updated. 
       * CloudFront uses this value as the object's time to live (TTL) only when the origin does
       * *not* send `Cache-Control` or `Expires` headers with the object. For more information, see
       * [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default value for this field is 86400 seconds (one day). If the value of `MinTTL` is
       * more than 86400 seconds, then the default value for this field is the same as the value of
       * `MinTTL` .
       */
      public fun defaultTtl(defaultTtl: Number)

      /**
       * @param maxTtl The maximum amount of time, in seconds, that objects stay in the CloudFront
       * cache before CloudFront sends another request to the origin to see if the object has been
       * updated. 
       * CloudFront uses this value only when the origin sends `Cache-Control` or `Expires` headers
       * with the object. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default value for this field is 31536000 seconds (one year). If the value of `MinTTL`
       * or `DefaultTTL` is more than 31536000 seconds, then the default value for this field is the
       * same as the value of `DefaultTTL` .
       */
      public fun maxTtl(maxTtl: Number)

      /**
       * @param minTtl The minimum amount of time, in seconds, that you want objects to stay in the
       * CloudFront cache before CloudFront sends another request to the origin to see if the object
       * has been updated. 
       * For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      public fun minTtl(minTtl: Number)

      /**
       * @param name A unique name to identify the cache policy. 
       */
      public fun name(name: String)

      /**
       * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
       * strings to include in the cache key. 
       * The values included in the cache key are also included in requests that CloudFront sends to
       * the origin.
       */
      public
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: IResolvable)

      /**
       * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
       * strings to include in the cache key. 
       * The values included in the cache key are also included in requests that CloudFront sends to
       * the origin.
       */
      public
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty)

      /**
       * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
       * strings to include in the cache key. 
       * The values included in the cache key are also included in requests that CloudFront sends to
       * the origin.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89df2634fea665831b079caea320d3657ed6ac143669c7ff2ec8b99e6c38256")
      public
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty.builder()

      /**
       * @param comment A comment to describe the cache policy.
       * The comment cannot be longer than 128 characters.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param defaultTtl The default amount of time, in seconds, that you want objects to stay in
       * the CloudFront cache before CloudFront sends another request to the origin to see if the
       * object has been updated. 
       * CloudFront uses this value as the object's time to live (TTL) only when the origin does
       * *not* send `Cache-Control` or `Expires` headers with the object. For more information, see
       * [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default value for this field is 86400 seconds (one day). If the value of `MinTTL` is
       * more than 86400 seconds, then the default value for this field is the same as the value of
       * `MinTTL` .
       */
      override fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
      }

      /**
       * @param maxTtl The maximum amount of time, in seconds, that objects stay in the CloudFront
       * cache before CloudFront sends another request to the origin to see if the object has been
       * updated. 
       * CloudFront uses this value only when the origin sends `Cache-Control` or `Expires` headers
       * with the object. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default value for this field is 31536000 seconds (one year). If the value of `MinTTL`
       * or `DefaultTTL` is more than 31536000 seconds, then the default value for this field is the
       * same as the value of `DefaultTTL` .
       */
      override fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
      }

      /**
       * @param minTtl The minimum amount of time, in seconds, that you want objects to stay in the
       * CloudFront cache before CloudFront sends another request to the origin to see if the object
       * has been updated. 
       * For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       */
      override fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
      }

      /**
       * @param name A unique name to identify the cache policy. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
       * strings to include in the cache key. 
       * The values included in the cache key are also included in requests that CloudFront sends to
       * the origin.
       */
      override
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: IResolvable) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin.let(IResolvable::unwrap))
      }

      /**
       * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
       * strings to include in the cache key. 
       * The values included in the cache key are also included in requests that CloudFront sends to
       * the origin.
       */
      override
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty) {
        cdkBuilder.parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin.let(ParametersInCacheKeyAndForwardedToOriginProperty::unwrap))
      }

      /**
       * @param parametersInCacheKeyAndForwardedToOrigin The HTTP headers, cookies, and URL query
       * strings to include in the cache key. 
       * The values included in the cache key are also included in requests that CloudFront sends to
       * the origin.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f89df2634fea665831b079caea320d3657ed6ac143669c7ff2ec8b99e6c38256")
      override
          fun parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin: ParametersInCacheKeyAndForwardedToOriginProperty.Builder.() -> Unit):
          Unit =
          parametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOriginProperty(parametersInCacheKeyAndForwardedToOrigin))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty,
    ) : CdkObject(cdkObject), CachePolicyConfigProperty {
      /**
       * A comment to describe the cache policy.
       *
       * The comment cannot be longer than 128 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The default amount of time, in seconds, that you want objects to stay in the CloudFront
       * cache before CloudFront sends another request to the origin to see if the object has been
       * updated.
       *
       * CloudFront uses this value as the object's time to live (TTL) only when the origin does
       * *not* send `Cache-Control` or `Expires` headers with the object. For more information, see
       * [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default value for this field is 86400 seconds (one day). If the value of `MinTTL` is
       * more than 86400 seconds, then the default value for this field is the same as the value of
       * `MinTTL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-defaultttl)
       */
      override fun defaultTtl(): Number = unwrap(this).getDefaultTtl()

      /**
       * The maximum amount of time, in seconds, that objects stay in the CloudFront cache before
       * CloudFront sends another request to the origin to see if the object has been updated.
       *
       * CloudFront uses this value only when the origin sends `Cache-Control` or `Expires` headers
       * with the object. For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * The default value for this field is 31536000 seconds (one year). If the value of `MinTTL`
       * or `DefaultTTL` is more than 31536000 seconds, then the default value for this field is the
       * same as the value of `DefaultTTL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-maxttl)
       */
      override fun maxTtl(): Number = unwrap(this).getMaxTtl()

      /**
       * The minimum amount of time, in seconds, that you want objects to stay in the CloudFront
       * cache before CloudFront sends another request to the origin to see if the object has been
       * updated.
       *
       * For more information, see [Managing How Long Content Stays in an Edge Cache
       * (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
       * in the *Amazon CloudFront Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-minttl)
       */
      override fun minTtl(): Number = unwrap(this).getMinTtl()

      /**
       * A unique name to identify the cache policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The HTTP headers, cookies, and URL query strings to include in the cache key.
       *
       * The values included in the cache key are also included in requests that CloudFront sends to
       * the origin.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html#cfn-cloudfront-cachepolicy-cachepolicyconfig-parametersincachekeyandforwardedtoorigin)
       */
      override fun parametersInCacheKeyAndForwardedToOrigin(): Any =
          unwrap(this).getParametersInCacheKeyAndForwardedToOrigin()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CachePolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty):
          CachePolicyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CachePolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty
    }
  }
}
