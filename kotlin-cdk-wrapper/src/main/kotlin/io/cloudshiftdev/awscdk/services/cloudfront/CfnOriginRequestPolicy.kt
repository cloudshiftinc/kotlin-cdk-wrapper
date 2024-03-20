@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An origin request policy.
 *
 * When it's attached to a cache behavior, the origin request policy determines the values that
 * CloudFront includes in requests that it sends to the origin. Each request that CloudFront sends to
 * the origin includes the following:
 *
 * * The request body and the URL path (without the domain name) from the viewer request.
 * * The headers that CloudFront automatically includes in every origin request, including `Host` ,
 * `User-Agent` , and `X-Amz-Cf-Id` .
 * * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the
 * origin request policy. These can include items from the viewer request and, in the case of headers,
 * additional ones that are added by CloudFront.
 *
 * CloudFront sends a request when it can't find an object in its cache that matches the request. If
 * you want to send values to the origin and also include them in the cache key, use `CachePolicy` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnOriginRequestPolicy cfnOriginRequestPolicy = CfnOriginRequestPolicy.Builder.create(this,
 * "MyCfnOriginRequestPolicy")
 * .originRequestPolicyConfig(OriginRequestPolicyConfigProperty.builder()
 * .cookiesConfig(CookiesConfigProperty.builder()
 * .cookieBehavior("cookieBehavior")
 * // the properties below are optional
 * .cookies(List.of("cookies"))
 * .build())
 * .headersConfig(HeadersConfigProperty.builder()
 * .headerBehavior("headerBehavior")
 * // the properties below are optional
 * .headers(List.of("headers"))
 * .build())
 * .name("name")
 * .queryStringsConfig(QueryStringsConfigProperty.builder()
 * .queryStringBehavior("queryStringBehavior")
 * // the properties below are optional
 * .queryStrings(List.of("queryStrings"))
 * .build())
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html)
 */
public open class CfnOriginRequestPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOriginRequestPolicyProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnOriginRequestPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOriginRequestPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOriginRequestPolicyProps(props)
  )

  /**
   * The unique identifier for the origin request policy.
   *
   * For example: `befd7079-9bbc-4ebf-8ade-498a3694176c` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time when the origin request policy was last modified.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The origin request policy configuration.
   */
  public open fun originRequestPolicyConfig(): Any = unwrap(this).getOriginRequestPolicyConfig()

  /**
   * The origin request policy configuration.
   */
  public open fun originRequestPolicyConfig(`value`: IResolvable) {
    unwrap(this).setOriginRequestPolicyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The origin request policy configuration.
   */
  public open fun originRequestPolicyConfig(`value`: OriginRequestPolicyConfigProperty) {
    unwrap(this).setOriginRequestPolicyConfig(`value`.let(OriginRequestPolicyConfigProperty::unwrap))
  }

  /**
   * The origin request policy configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5d24f8568e37342a8d4504597487f1a88a47c8e7a1a4b3f5c6d6f138a2a32b9a")
  public open
      fun originRequestPolicyConfig(`value`: OriginRequestPolicyConfigProperty.Builder.() -> Unit):
      Unit = originRequestPolicyConfig(OriginRequestPolicyConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnOriginRequestPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable)

    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty)

    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("718e1855ddc4310816c9d042a20dc1906cbfa8a9f199a420b180c639b83855d2")
    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.Builder.create(scope, id)

    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    override fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(OriginRequestPolicyConfigProperty::unwrap))
    }

    /**
     * The origin request policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig)
     * @param originRequestPolicyConfig The origin request policy configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("718e1855ddc4310816c9d042a20dc1906cbfa8a9f199a420b180c639b83855d2")
    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: OriginRequestPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        originRequestPolicyConfig(OriginRequestPolicyConfigProperty(originRequestPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginRequestPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginRequestPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy):
        CfnOriginRequestPolicy = CfnOriginRequestPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnOriginRequestPolicy):
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy = wrapped.cdkObject
  }

  /**
   * An origin request policy configuration.
   *
   * This configuration determines the values that CloudFront includes in requests that it sends to
   * the origin. Each request that CloudFront sends to the origin includes the following:
   *
   * * The request body and the URL path (without the domain name) from the viewer request.
   * * The headers that CloudFront automatically includes in every origin request, including `Host`
   * , `User-Agent` , and `X-Amz-Cf-Id` .
   * * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or
   * the origin request policy. These can include items from the viewer request and, in the case of
   * headers, additional ones that are added by CloudFront.
   *
   * CloudFront sends a request when it can't find an object in its cache that matches the request.
   * If you want to send values to the origin and also include them in the cache key, use `CachePolicy`
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * OriginRequestPolicyConfigProperty originRequestPolicyConfigProperty =
   * OriginRequestPolicyConfigProperty.builder()
   * .cookiesConfig(CookiesConfigProperty.builder()
   * .cookieBehavior("cookieBehavior")
   * // the properties below are optional
   * .cookies(List.of("cookies"))
   * .build())
   * .headersConfig(HeadersConfigProperty.builder()
   * .headerBehavior("headerBehavior")
   * // the properties below are optional
   * .headers(List.of("headers"))
   * .build())
   * .name("name")
   * .queryStringsConfig(QueryStringsConfigProperty.builder()
   * .queryStringBehavior("queryStringBehavior")
   * // the properties below are optional
   * .queryStrings(List.of("queryStrings"))
   * .build())
   * // the properties below are optional
   * .comment("comment")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html)
   */
  public interface OriginRequestPolicyConfigProperty {
    /**
     * A comment to describe the origin request policy.
     *
     * The comment cannot be longer than 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The cookies from viewer requests to include in origin requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-cookiesconfig)
     */
    public fun cookiesConfig(): Any

    /**
     * The HTTP headers to include in origin requests.
     *
     * These can include headers from viewer requests and additional headers added by CloudFront.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-headersconfig)
     */
    public fun headersConfig(): Any

    /**
     * A unique name to identify the origin request policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-name)
     */
    public fun name(): String

    /**
     * The URL query strings from viewer requests to include in origin requests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-querystringsconfig)
     */
    public fun queryStringsConfig(): Any

    /**
     * A builder for [OriginRequestPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment A comment to describe the origin request policy.
       * The comment cannot be longer than 128 characters.
       */
      public fun comment(comment: String)

      /**
       * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
       */
      public fun cookiesConfig(cookiesConfig: IResolvable)

      /**
       * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
       */
      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty)

      /**
       * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1335106fdfc8f035449e4314e1bcc9c09ae33b5be995f1b54ae8fa181bf24684")
      public fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit)

      /**
       * @param headersConfig The HTTP headers to include in origin requests. 
       * These can include headers from viewer requests and additional headers added by CloudFront.
       */
      public fun headersConfig(headersConfig: IResolvable)

      /**
       * @param headersConfig The HTTP headers to include in origin requests. 
       * These can include headers from viewer requests and additional headers added by CloudFront.
       */
      public fun headersConfig(headersConfig: HeadersConfigProperty)

      /**
       * @param headersConfig The HTTP headers to include in origin requests. 
       * These can include headers from viewer requests and additional headers added by CloudFront.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7231e27fb43bbb74dd27667dff9091b756ff94392dbecc842399ef98ecec854")
      public fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit)

      /**
       * @param name A unique name to identify the origin request policy. 
       */
      public fun name(name: String)

      /**
       * @param queryStringsConfig The URL query strings from viewer requests to include in origin
       * requests. 
       */
      public fun queryStringsConfig(queryStringsConfig: IResolvable)

      /**
       * @param queryStringsConfig The URL query strings from viewer requests to include in origin
       * requests. 
       */
      public fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty)

      /**
       * @param queryStringsConfig The URL query strings from viewer requests to include in origin
       * requests. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c408a9a2d988cdc3875e3fb60917fa135bb14539772c640f28e651c5f2412b78")
      public
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.builder()

      /**
       * @param comment A comment to describe the origin request policy.
       * The comment cannot be longer than 128 characters.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
       */
      override fun cookiesConfig(cookiesConfig: IResolvable) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(IResolvable::unwrap))
      }

      /**
       * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
       */
      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty) {
        cdkBuilder.cookiesConfig(cookiesConfig.let(CookiesConfigProperty::unwrap))
      }

      /**
       * @param cookiesConfig The cookies from viewer requests to include in origin requests. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1335106fdfc8f035449e4314e1bcc9c09ae33b5be995f1b54ae8fa181bf24684")
      override fun cookiesConfig(cookiesConfig: CookiesConfigProperty.Builder.() -> Unit): Unit =
          cookiesConfig(CookiesConfigProperty(cookiesConfig))

      /**
       * @param headersConfig The HTTP headers to include in origin requests. 
       * These can include headers from viewer requests and additional headers added by CloudFront.
       */
      override fun headersConfig(headersConfig: IResolvable) {
        cdkBuilder.headersConfig(headersConfig.let(IResolvable::unwrap))
      }

      /**
       * @param headersConfig The HTTP headers to include in origin requests. 
       * These can include headers from viewer requests and additional headers added by CloudFront.
       */
      override fun headersConfig(headersConfig: HeadersConfigProperty) {
        cdkBuilder.headersConfig(headersConfig.let(HeadersConfigProperty::unwrap))
      }

      /**
       * @param headersConfig The HTTP headers to include in origin requests. 
       * These can include headers from viewer requests and additional headers added by CloudFront.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7231e27fb43bbb74dd27667dff9091b756ff94392dbecc842399ef98ecec854")
      override fun headersConfig(headersConfig: HeadersConfigProperty.Builder.() -> Unit): Unit =
          headersConfig(HeadersConfigProperty(headersConfig))

      /**
       * @param name A unique name to identify the origin request policy. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param queryStringsConfig The URL query strings from viewer requests to include in origin
       * requests. 
       */
      override fun queryStringsConfig(queryStringsConfig: IResolvable) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringsConfig The URL query strings from viewer requests to include in origin
       * requests. 
       */
      override fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty) {
        cdkBuilder.queryStringsConfig(queryStringsConfig.let(QueryStringsConfigProperty::unwrap))
      }

      /**
       * @param queryStringsConfig The URL query strings from viewer requests to include in origin
       * requests. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c408a9a2d988cdc3875e3fb60917fa135bb14539772c640f28e651c5f2412b78")
      override
          fun queryStringsConfig(queryStringsConfig: QueryStringsConfigProperty.Builder.() -> Unit):
          Unit = queryStringsConfig(QueryStringsConfigProperty(queryStringsConfig))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty,
    ) : CdkObject(cdkObject), OriginRequestPolicyConfigProperty {
      /**
       * A comment to describe the origin request policy.
       *
       * The comment cannot be longer than 128 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The cookies from viewer requests to include in origin requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-cookiesconfig)
       */
      override fun cookiesConfig(): Any = unwrap(this).getCookiesConfig()

      /**
       * The HTTP headers to include in origin requests.
       *
       * These can include headers from viewer requests and additional headers added by CloudFront.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-headersconfig)
       */
      override fun headersConfig(): Any = unwrap(this).getHeadersConfig()

      /**
       * A unique name to identify the origin request policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The URL query strings from viewer requests to include in origin requests.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html#cfn-cloudfront-originrequestpolicy-originrequestpolicyconfig-querystringsconfig)
       */
      override fun queryStringsConfig(): Any = unwrap(this).getQueryStringsConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OriginRequestPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty):
          OriginRequestPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OriginRequestPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OriginRequestPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
    }
  }

  /**
   * An object that determines whether any HTTP headers (and if so, which headers) are included in
   * requests that CloudFront sends to the origin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * HeadersConfigProperty headersConfigProperty = HeadersConfigProperty.builder()
   * .headerBehavior("headerBehavior")
   * // the properties below are optional
   * .headers(List.of("headers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-headersconfig.html)
   */
  public interface HeadersConfigProperty {
    /**
     * Determines whether any HTTP headers are included in requests that CloudFront sends to the
     * origin. Valid values are:.
     *
     * * `none` – No HTTP headers in viewer requests are included in requests that CloudFront sends
     * to the origin. Even when this field is set to `none` , any headers that are listed in a
     * `CachePolicy` *are* included in origin requests.
     * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
     * requests that CloudFront sends to the origin.
     * * `allViewer` – All HTTP headers in viewer requests are included in requests that CloudFront
     * sends to the origin.
     * * `allViewerAndWhitelistCloudFront` – All HTTP headers in viewer requests and the additional
     * CloudFront headers that are listed in the `Headers` type are included in requests that
     * CloudFront sends to the origin. The additional headers are added by CloudFront.
     * * `allExcept` – All HTTP headers in viewer requests are included in requests that CloudFront
     * sends to the origin, **except** for those listed in the `Headers` type, which are not included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-headersconfig.html#cfn-cloudfront-originrequestpolicy-headersconfig-headerbehavior)
     */
    public fun headerBehavior(): String

    /**
     * Contains a list of HTTP header names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-headersconfig.html#cfn-cloudfront-originrequestpolicy-headersconfig-headers)
     */
    public fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

    /**
     * A builder for [HeadersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerBehavior Determines whether any HTTP headers are included in requests that
       * CloudFront sends to the origin. Valid values are:. 
       * * `none` – No HTTP headers in viewer requests are included in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any headers that are listed in a
       * `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
       * requests that CloudFront sends to the origin.
       * * `allViewer` – All HTTP headers in viewer requests are included in requests that
       * CloudFront sends to the origin.
       * * `allViewerAndWhitelistCloudFront` – All HTTP headers in viewer requests and the
       * additional CloudFront headers that are listed in the `Headers` type are included in requests
       * that CloudFront sends to the origin. The additional headers are added by CloudFront.
       * * `allExcept` – All HTTP headers in viewer requests are included in requests that
       * CloudFront sends to the origin, **except** for those listed in the `Headers` type, which are
       * not included.
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
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty.builder()

      /**
       * @param headerBehavior Determines whether any HTTP headers are included in requests that
       * CloudFront sends to the origin. Valid values are:. 
       * * `none` – No HTTP headers in viewer requests are included in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any headers that are listed in a
       * `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
       * requests that CloudFront sends to the origin.
       * * `allViewer` – All HTTP headers in viewer requests are included in requests that
       * CloudFront sends to the origin.
       * * `allViewerAndWhitelistCloudFront` – All HTTP headers in viewer requests and the
       * additional CloudFront headers that are listed in the `Headers` type are included in requests
       * that CloudFront sends to the origin. The additional headers are added by CloudFront.
       * * `allExcept` – All HTTP headers in viewer requests are included in requests that
       * CloudFront sends to the origin, **except** for those listed in the `Headers` type, which are
       * not included.
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
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty,
    ) : CdkObject(cdkObject), HeadersConfigProperty {
      /**
       * Determines whether any HTTP headers are included in requests that CloudFront sends to the
       * origin. Valid values are:.
       *
       * * `none` – No HTTP headers in viewer requests are included in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any headers that are listed in a
       * `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the HTTP headers that are listed in the `Headers` type are included in
       * requests that CloudFront sends to the origin.
       * * `allViewer` – All HTTP headers in viewer requests are included in requests that
       * CloudFront sends to the origin.
       * * `allViewerAndWhitelistCloudFront` – All HTTP headers in viewer requests and the
       * additional CloudFront headers that are listed in the `Headers` type are included in requests
       * that CloudFront sends to the origin. The additional headers are added by CloudFront.
       * * `allExcept` – All HTTP headers in viewer requests are included in requests that
       * CloudFront sends to the origin, **except** for those listed in the `Headers` type, which are
       * not included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-headersconfig.html#cfn-cloudfront-originrequestpolicy-headersconfig-headerbehavior)
       */
      override fun headerBehavior(): String = unwrap(this).getHeaderBehavior()

      /**
       * Contains a list of HTTP header names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-headersconfig.html#cfn-cloudfront-originrequestpolicy-headersconfig-headers)
       */
      override fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty):
          HeadersConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? HeadersConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty
    }
  }

  /**
   * An object that determines whether any cookies in viewer requests (and if so, which cookies) are
   * included in requests that CloudFront sends to the origin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CookiesConfigProperty cookiesConfigProperty = CookiesConfigProperty.builder()
   * .cookieBehavior("cookieBehavior")
   * // the properties below are optional
   * .cookies(List.of("cookies"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-cookiesconfig.html)
   */
  public interface CookiesConfigProperty {
    /**
     * Determines whether cookies in viewer requests are included in requests that CloudFront sends
     * to the origin. Valid values are:.
     *
     * * `none` – No cookies in viewer requests are included in requests that CloudFront sends to
     * the origin. Even when this field is set to `none` , any cookies that are listed in a
     * `CachePolicy` *are* included in origin requests.
     * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames` type
     * are included in requests that CloudFront sends to the origin.
     * * `all` – All cookies in viewer requests are included in requests that CloudFront sends to
     * the origin.
     * * `allExcept` – All cookies in viewer requests are included in requests that CloudFront sends
     * to the origin, **except** for those listed in the `CookieNames` type, which are not included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-cookiesconfig.html#cfn-cloudfront-originrequestpolicy-cookiesconfig-cookiebehavior)
     */
    public fun cookieBehavior(): String

    /**
     * Contains a list of cookie names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-cookiesconfig.html#cfn-cloudfront-originrequestpolicy-cookiesconfig-cookies)
     */
    public fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()

    /**
     * A builder for [CookiesConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookieBehavior Determines whether cookies in viewer requests are included in
       * requests that CloudFront sends to the origin. Valid values are:. 
       * * `none` – No cookies in viewer requests are included in requests that CloudFront sends to
       * the origin. Even when this field is set to `none` , any cookies that are listed in a
       * `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames`
       * type are included in requests that CloudFront sends to the origin.
       * * `all` – All cookies in viewer requests are included in requests that CloudFront sends to
       * the origin.
       * * `allExcept` – All cookies in viewer requests are included in requests that CloudFront
       * sends to the origin, **except** for those listed in the `CookieNames` type, which are not
       * included.
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
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty.builder()

      /**
       * @param cookieBehavior Determines whether cookies in viewer requests are included in
       * requests that CloudFront sends to the origin. Valid values are:. 
       * * `none` – No cookies in viewer requests are included in requests that CloudFront sends to
       * the origin. Even when this field is set to `none` , any cookies that are listed in a
       * `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames`
       * type are included in requests that CloudFront sends to the origin.
       * * `all` – All cookies in viewer requests are included in requests that CloudFront sends to
       * the origin.
       * * `allExcept` – All cookies in viewer requests are included in requests that CloudFront
       * sends to the origin, **except** for those listed in the `CookieNames` type, which are not
       * included.
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
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty,
    ) : CdkObject(cdkObject), CookiesConfigProperty {
      /**
       * Determines whether cookies in viewer requests are included in requests that CloudFront
       * sends to the origin. Valid values are:.
       *
       * * `none` – No cookies in viewer requests are included in requests that CloudFront sends to
       * the origin. Even when this field is set to `none` , any cookies that are listed in a
       * `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the cookies in viewer requests that are listed in the `CookieNames`
       * type are included in requests that CloudFront sends to the origin.
       * * `all` – All cookies in viewer requests are included in requests that CloudFront sends to
       * the origin.
       * * `allExcept` – All cookies in viewer requests are included in requests that CloudFront
       * sends to the origin, **except** for those listed in the `CookieNames` type, which are not
       * included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-cookiesconfig.html#cfn-cloudfront-originrequestpolicy-cookiesconfig-cookiebehavior)
       */
      override fun cookieBehavior(): String = unwrap(this).getCookieBehavior()

      /**
       * Contains a list of cookie names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-cookiesconfig.html#cfn-cloudfront-originrequestpolicy-cookiesconfig-cookies)
       */
      override fun cookies(): List<String> = unwrap(this).getCookies() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CookiesConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty):
          CookiesConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? CookiesConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CookiesConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty
    }
  }

  /**
   * An object that determines whether any URL query strings in viewer requests (and if so, which
   * query strings) are included in requests that CloudFront sends to the origin.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * QueryStringsConfigProperty queryStringsConfigProperty = QueryStringsConfigProperty.builder()
   * .queryStringBehavior("queryStringBehavior")
   * // the properties below are optional
   * .queryStrings(List.of("queryStrings"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-querystringsconfig.html)
   */
  public interface QueryStringsConfigProperty {
    /**
     * Determines whether any URL query strings in viewer requests are included in requests that
     * CloudFront sends to the origin.
     *
     * Valid values are:
     *
     * * `none` – No query strings in viewer requests are included in requests that CloudFront sends
     * to the origin. Even when this field is set to `none` , any query strings that are listed in a
     * `CachePolicy` *are* included in origin requests.
     * * `whitelist` – Only the query strings in viewer requests that are listed in the
     * `QueryStringNames` type are included in requests that CloudFront sends to the origin.
     * * `all` – All query strings in viewer requests are included in requests that CloudFront sends
     * to the origin.
     * * `allExcept` – All query strings in viewer requests are included in requests that CloudFront
     * sends to the origin, **except** for those listed in the `QueryStringNames` type, which are not
     * included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-querystringsconfig.html#cfn-cloudfront-originrequestpolicy-querystringsconfig-querystringbehavior)
     */
    public fun queryStringBehavior(): String

    /**
     * Contains a list of query string names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-querystringsconfig.html#cfn-cloudfront-originrequestpolicy-querystringsconfig-querystrings)
     */
    public fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()

    /**
     * A builder for [QueryStringsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queryStringBehavior Determines whether any URL query strings in viewer requests are
       * included in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No query strings in viewer requests are included in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any query strings that are listed
       * in a `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the query strings in viewer requests that are listed in the
       * `QueryStringNames` type are included in requests that CloudFront sends to the origin.
       * * `all` – All query strings in viewer requests are included in requests that CloudFront
       * sends to the origin.
       * * `allExcept` – All query strings in viewer requests are included in requests that
       * CloudFront sends to the origin, **except** for those listed in the `QueryStringNames` type,
       * which are not included.
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
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty.builder()

      /**
       * @param queryStringBehavior Determines whether any URL query strings in viewer requests are
       * included in requests that CloudFront sends to the origin. 
       * Valid values are:
       *
       * * `none` – No query strings in viewer requests are included in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any query strings that are listed
       * in a `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the query strings in viewer requests that are listed in the
       * `QueryStringNames` type are included in requests that CloudFront sends to the origin.
       * * `all` – All query strings in viewer requests are included in requests that CloudFront
       * sends to the origin.
       * * `allExcept` – All query strings in viewer requests are included in requests that
       * CloudFront sends to the origin, **except** for those listed in the `QueryStringNames` type,
       * which are not included.
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
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty,
    ) : CdkObject(cdkObject), QueryStringsConfigProperty {
      /**
       * Determines whether any URL query strings in viewer requests are included in requests that
       * CloudFront sends to the origin.
       *
       * Valid values are:
       *
       * * `none` – No query strings in viewer requests are included in requests that CloudFront
       * sends to the origin. Even when this field is set to `none` , any query strings that are listed
       * in a `CachePolicy` *are* included in origin requests.
       * * `whitelist` – Only the query strings in viewer requests that are listed in the
       * `QueryStringNames` type are included in requests that CloudFront sends to the origin.
       * * `all` – All query strings in viewer requests are included in requests that CloudFront
       * sends to the origin.
       * * `allExcept` – All query strings in viewer requests are included in requests that
       * CloudFront sends to the origin, **except** for those listed in the `QueryStringNames` type,
       * which are not included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-querystringsconfig.html#cfn-cloudfront-originrequestpolicy-querystringsconfig-querystringbehavior)
       */
      override fun queryStringBehavior(): String = unwrap(this).getQueryStringBehavior()

      /**
       * Contains a list of query string names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-querystringsconfig.html#cfn-cloudfront-originrequestpolicy-querystringsconfig-querystrings)
       */
      override fun queryStrings(): List<String> = unwrap(this).getQueryStrings() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryStringsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty):
          QueryStringsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueryStringsConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryStringsConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty
    }
  }
}
