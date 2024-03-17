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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A response headers policy.
 *
 * A response headers policy contains information about a set of HTTP response headers.
 *
 * After you create a response headers policy, you can use its ID to attach it to one or more cache
 * behaviors in a CloudFront distribution. When it's attached to a cache behavior, the response headers
 * policy affects the HTTP headers that CloudFront includes in HTTP responses to requests that match
 * the cache behavior. CloudFront adds or removes response headers according to the configuration of
 * the response headers policy.
 *
 * For more information, see [Adding or removing HTTP headers in CloudFront
 * responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/modifying-response-headers.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnResponseHeadersPolicy cfnResponseHeadersPolicy = CfnResponseHeadersPolicy.Builder.create(this,
 * "MyCfnResponseHeadersPolicy")
 * .responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .corsConfig(CorsConfigProperty.builder()
 * .accessControlAllowCredentials(false)
 * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .originOverride(false)
 * // the properties below are optional
 * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
 * .items(List.of("items"))
 * .build())
 * .accessControlMaxAgeSec(123)
 * .build())
 * .customHeadersConfig(CustomHeadersConfigProperty.builder()
 * .items(List.of(CustomHeaderProperty.builder()
 * .header("header")
 * .override(false)
 * .value("value")
 * .build()))
 * .build())
 * .removeHeadersConfig(RemoveHeadersConfigProperty.builder()
 * .items(List.of(RemoveHeaderProperty.builder()
 * .header("header")
 * .build()))
 * .build())
 * .securityHeadersConfig(SecurityHeadersConfigProperty.builder()
 * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
 * .contentSecurityPolicy("contentSecurityPolicy")
 * .override(false)
 * .build())
 * .contentTypeOptions(ContentTypeOptionsProperty.builder()
 * .override(false)
 * .build())
 * .frameOptions(FrameOptionsProperty.builder()
 * .frameOption("frameOption")
 * .override(false)
 * .build())
 * .referrerPolicy(ReferrerPolicyProperty.builder()
 * .override(false)
 * .referrerPolicy("referrerPolicy")
 * .build())
 * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
 * .accessControlMaxAgeSec(123)
 * .override(false)
 * // the properties below are optional
 * .includeSubdomains(false)
 * .preload(false)
 * .build())
 * .xssProtection(XSSProtectionProperty.builder()
 * .override(false)
 * .protection(false)
 * // the properties below are optional
 * .modeBlock(false)
 * .reportUri("reportUri")
 * .build())
 * .build())
 * .serverTimingHeadersConfig(ServerTimingHeadersConfigProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .samplingRate(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html)
 */
public open class CfnResponseHeadersPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The unique identifier for the response headers policy.
   *
   * For example: `57f99797-3b20-4e1b-a728-27972a74082a` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time when the response headers policy was last modified.
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
   * A response headers policy configuration.
   */
  public open fun responseHeadersPolicyConfig(): Any = unwrap(this).getResponseHeadersPolicyConfig()

  /**
   * A response headers policy configuration.
   */
  public open fun responseHeadersPolicyConfig(`value`: IResolvable) {
    unwrap(this).setResponseHeadersPolicyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A response headers policy configuration.
   */
  public open fun responseHeadersPolicyConfig(`value`: ResponseHeadersPolicyConfigProperty) {
    unwrap(this).setResponseHeadersPolicyConfig(`value`.let(ResponseHeadersPolicyConfigProperty::unwrap))
  }

  /**
   * A response headers policy configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8f48ddae8e1a44d81c5154d0916dd7ca141838c199530902cd081c8d5479a8f4")
  public open
      fun responseHeadersPolicyConfig(`value`: ResponseHeadersPolicyConfigProperty.Builder.() -> Unit):
      Unit = responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnResponseHeadersPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    public fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable)

    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    public
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty)

    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c99e743ffd5ce67e0dcdef51f8a24d55b599527880267c5f6c826e1e916d6b0")
    public
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.Builder.create(scope,
        id)

    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    override fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: IResolvable) {
      cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    override
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty) {
      cdkBuilder.responseHeadersPolicyConfig(responseHeadersPolicyConfig.let(ResponseHeadersPolicyConfigProperty::unwrap))
    }

    /**
     * A response headers policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig)
     * @param responseHeadersPolicyConfig A response headers policy configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c99e743ffd5ce67e0dcdef51f8a24d55b599527880267c5f6c826e1e916d6b0")
    override
        fun responseHeadersPolicyConfig(responseHeadersPolicyConfig: ResponseHeadersPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty(responseHeadersPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResponseHeadersPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResponseHeadersPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy):
        CfnResponseHeadersPolicy = CfnResponseHeadersPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResponseHeadersPolicy):
        software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy = wrapped.cdkObject
  }

  /**
   * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the
   * header's value.
   *
   * For more information about the `X-Frame-Options` HTTP response header, see
   * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * FrameOptionsProperty frameOptionsProperty = FrameOptionsProperty.builder()
   * .frameOption("frameOption")
   * .override(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-frameoptions.html)
   */
  public interface FrameOptionsProperty {
    /**
     * The value of the `X-Frame-Options` HTTP response header. Valid values are `DENY` and
     * `SAMEORIGIN` .
     *
     * For more information about these values, see
     * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-frameoptions.html#cfn-cloudfront-responseheaderspolicy-frameoptions-frameoption)
     */
    public fun frameOption(): String

    /**
     * A Boolean that determines whether CloudFront overrides the `X-Frame-Options` HTTP response
     * header received from the origin with the one specified in this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-frameoptions.html#cfn-cloudfront-responseheaderspolicy-frameoptions-override)
     */
    public fun `override`(): Any

    /**
     * A builder for [FrameOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param frameOption The value of the `X-Frame-Options` HTTP response header. Valid values
       * are `DENY` and `SAMEORIGIN` . 
       * For more information about these values, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      public fun frameOption(frameOption: String)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Frame-Options` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      public fun `override`(`override`: Boolean)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Frame-Options` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      public fun `override`(`override`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty.builder()

      /**
       * @param frameOption The value of the `X-Frame-Options` HTTP response header. Valid values
       * are `DENY` and `SAMEORIGIN` . 
       * For more information about these values, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      override fun frameOption(frameOption: String) {
        cdkBuilder.frameOption(frameOption)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Frame-Options` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Frame-Options` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty,
    ) : CdkObject(cdkObject), FrameOptionsProperty {
      /**
       * The value of the `X-Frame-Options` HTTP response header. Valid values are `DENY` and
       * `SAMEORIGIN` .
       *
       * For more information about these values, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-frameoptions.html#cfn-cloudfront-responseheaderspolicy-frameoptions-frameoption)
       */
      override fun frameOption(): String = unwrap(this).getFrameOption()

      /**
       * A Boolean that determines whether CloudFront overrides the `X-Frame-Options` HTTP response
       * header received from the origin with the one specified in this response headers policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-frameoptions.html#cfn-cloudfront-responseheaderspolicy-frameoptions-override)
       */
      override fun `override`(): Any = unwrap(this).getOverride()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrameOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty):
          FrameOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? FrameOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FrameOptionsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty
    }
  }

  /**
   * A list of HTTP methods that CloudFront includes as values for the
   * `Access-Control-Allow-Methods` HTTP response header.
   *
   * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
   * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * AccessControlAllowMethodsProperty accessControlAllowMethodsProperty =
   * AccessControlAllowMethodsProperty.builder()
   * .items(List.of("items"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowmethods.html)
   */
  public interface AccessControlAllowMethodsProperty {
    /**
     * The list of HTTP methods. Valid values are:.
     *
     * * `GET`
     * * `DELETE`
     * * `HEAD`
     * * `OPTIONS`
     * * `PATCH`
     * * `POST`
     * * `PUT`
     * * `ALL`
     *
     * `ALL` is a special value that includes all of the listed HTTP methods.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowmethods.html#cfn-cloudfront-responseheaderspolicy-accesscontrolallowmethods-items)
     */
    public fun items(): List<String>

    /**
     * A builder for [AccessControlAllowMethodsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The list of HTTP methods. Valid values are:. 
       * * `GET`
       * * `DELETE`
       * * `HEAD`
       * * `OPTIONS`
       * * `PATCH`
       * * `POST`
       * * `PUT`
       * * `ALL`
       *
       * `ALL` is a special value that includes all of the listed HTTP methods.
       */
      public fun items(items: List<String>)

      /**
       * @param items The list of HTTP methods. Valid values are:. 
       * * `GET`
       * * `DELETE`
       * * `HEAD`
       * * `OPTIONS`
       * * `PATCH`
       * * `POST`
       * * `PUT`
       * * `ALL`
       *
       * `ALL` is a special value that includes all of the listed HTTP methods.
       */
      public fun items(vararg items: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.builder()

      /**
       * @param items The list of HTTP methods. Valid values are:. 
       * * `GET`
       * * `DELETE`
       * * `HEAD`
       * * `OPTIONS`
       * * `PATCH`
       * * `POST`
       * * `PUT`
       * * `ALL`
       *
       * `ALL` is a special value that includes all of the listed HTTP methods.
       */
      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The list of HTTP methods. Valid values are:. 
       * * `GET`
       * * `DELETE`
       * * `HEAD`
       * * `OPTIONS`
       * * `PATCH`
       * * `POST`
       * * `PUT`
       * * `ALL`
       *
       * `ALL` is a special value that includes all of the listed HTTP methods.
       */
      override fun items(vararg items: String): Unit = items(items.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty,
    ) : CdkObject(cdkObject), AccessControlAllowMethodsProperty {
      /**
       * The list of HTTP methods. Valid values are:.
       *
       * * `GET`
       * * `DELETE`
       * * `HEAD`
       * * `OPTIONS`
       * * `PATCH`
       * * `POST`
       * * `PUT`
       * * `ALL`
       *
       * `ALL` is a special value that includes all of the listed HTTP methods.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowmethods.html#cfn-cloudfront-responseheaderspolicy-accesscontrolallowmethods-items)
       */
      override fun items(): List<String> = unwrap(this).getItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAllowMethodsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty):
          AccessControlAllowMethodsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessControlAllowMethodsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAllowMethodsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty
    }
  }

  /**
   * An HTTP response header name and its value.
   *
   * CloudFront includes this header in HTTP responses that it sends for requests that match a cache
   * behavior that's associated with this response headers policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CustomHeaderProperty customHeaderProperty = CustomHeaderProperty.builder()
   * .header("header")
   * .override(false)
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html)
   */
  public interface CustomHeaderProperty {
    /**
     * The HTTP response header name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html#cfn-cloudfront-responseheaderspolicy-customheader-header)
     */
    public fun `header`(): String

    /**
     * A Boolean that determines whether CloudFront overrides a response header with the same name
     * received from the origin with the header specified here.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html#cfn-cloudfront-responseheaderspolicy-customheader-override)
     */
    public fun `override`(): Any

    /**
     * The value for the HTTP response header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html#cfn-cloudfront-responseheaderspolicy-customheader-value)
     */
    public fun `value`(): String

    /**
     * A builder for [CustomHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header The HTTP response header name. 
       */
      public fun `header`(`header`: String)

      /**
       * @param override A Boolean that determines whether CloudFront overrides a response header
       * with the same name received from the origin with the header specified here. 
       */
      public fun `override`(`override`: Boolean)

      /**
       * @param override A Boolean that determines whether CloudFront overrides a response header
       * with the same name received from the origin with the header specified here. 
       */
      public fun `override`(`override`: IResolvable)

      /**
       * @param value The value for the HTTP response header. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty.builder()

      /**
       * @param header The HTTP response header name. 
       */
      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides a response header
       * with the same name received from the origin with the header specified here. 
       */
      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides a response header
       * with the same name received from the origin with the header specified here. 
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      /**
       * @param value The value for the HTTP response header. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty,
    ) : CdkObject(cdkObject), CustomHeaderProperty {
      /**
       * The HTTP response header name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html#cfn-cloudfront-responseheaderspolicy-customheader-header)
       */
      override fun `header`(): String = unwrap(this).getHeader()

      /**
       * A Boolean that determines whether CloudFront overrides a response header with the same name
       * received from the origin with the header specified here.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html#cfn-cloudfront-responseheaderspolicy-customheader-override)
       */
      override fun `override`(): Any = unwrap(this).getOverride()

      /**
       * The value for the HTTP response header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html#cfn-cloudfront-responseheaderspolicy-customheader-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty):
          CustomHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as? CustomHeaderProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHeaderProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeaderProperty
    }
  }

  /**
   * A configuration for a set of security-related HTTP response headers.
   *
   * CloudFront adds these headers to HTTP responses that it sends for requests that match a cache
   * behavior associated with this response headers policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * SecurityHeadersConfigProperty securityHeadersConfigProperty =
   * SecurityHeadersConfigProperty.builder()
   * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
   * .contentSecurityPolicy("contentSecurityPolicy")
   * .override(false)
   * .build())
   * .contentTypeOptions(ContentTypeOptionsProperty.builder()
   * .override(false)
   * .build())
   * .frameOptions(FrameOptionsProperty.builder()
   * .frameOption("frameOption")
   * .override(false)
   * .build())
   * .referrerPolicy(ReferrerPolicyProperty.builder()
   * .override(false)
   * .referrerPolicy("referrerPolicy")
   * .build())
   * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
   * .accessControlMaxAgeSec(123)
   * .override(false)
   * // the properties below are optional
   * .includeSubdomains(false)
   * .preload(false)
   * .build())
   * .xssProtection(XSSProtectionProperty.builder()
   * .override(false)
   * .protection(false)
   * // the properties below are optional
   * .modeBlock(false)
   * .reportUri("reportUri")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html)
   */
  public interface SecurityHeadersConfigProperty {
    /**
     * The policy directives and their values that CloudFront includes as values for the
     * `Content-Security-Policy` HTTP response header.
     *
     * For more information about the `Content-Security-Policy` HTTP response header, see
     * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-contentsecuritypolicy)
     */
    public fun contentSecurityPolicy(): Any? = unwrap(this).getContentSecurityPolicy()

    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with
     * its value set to `nosniff` .
     *
     * For more information about the `X-Content-Type-Options` HTTP response header, see
     * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-contenttypeoptions)
     */
    public fun contentTypeOptions(): Any? = unwrap(this).getContentTypeOptions()

    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the
     * header's value.
     *
     * For more information about the `X-Frame-Options` HTTP response header, see
     * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-frameoptions)
     */
    public fun frameOptions(): Any? = unwrap(this).getFrameOptions()

    /**
     * Determines whether CloudFront includes the `Referrer-Policy` HTTP response header and the
     * header's value.
     *
     * For more information about the `Referrer-Policy` HTTP response header, see
     * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-referrerpolicy)
     */
    public fun referrerPolicy(): Any? = unwrap(this).getReferrerPolicy()

    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header
     * and the header's value.
     *
     * For more information about the `Strict-Transport-Security` HTTP response header, see
     * [Security
     * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
     * in the *Amazon CloudFront Developer Guide* and
     * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-stricttransportsecurity)
     */
    public fun strictTransportSecurity(): Any? = unwrap(this).getStrictTransportSecurity()

    /**
     * Determines whether CloudFront includes the `X-XSS-Protection` HTTP response header and the
     * header's value.
     *
     * For more information about the `X-XSS-Protection` HTTP response header, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-xssprotection)
     */
    public fun xssProtection(): Any? = unwrap(this).getXssProtection()

    /**
     * A builder for [SecurityHeadersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header.
       * For more information about the `Content-Security-Policy` HTTP response header, see
       * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
       * in the MDN Web Docs.
       */
      public fun contentSecurityPolicy(contentSecurityPolicy: IResolvable)

      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header.
       * For more information about the `Content-Security-Policy` HTTP response header, see
       * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
       * in the MDN Web Docs.
       */
      public fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty)

      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header.
       * For more information about the `Content-Security-Policy` HTTP response header, see
       * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("760fb682a1ea8478bf5eb7b354cee7bbec18c9fc074dfb46bd11ec9f83e2be0c")
      public
          fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty.Builder.() -> Unit)

      /**
       * @param contentTypeOptions Determines whether CloudFront includes the
       * `X-Content-Type-Options` HTTP response header with its value set to `nosniff` .
       * For more information about the `X-Content-Type-Options` HTTP response header, see
       * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
       * in the MDN Web Docs.
       */
      public fun contentTypeOptions(contentTypeOptions: IResolvable)

      /**
       * @param contentTypeOptions Determines whether CloudFront includes the
       * `X-Content-Type-Options` HTTP response header with its value set to `nosniff` .
       * For more information about the `X-Content-Type-Options` HTTP response header, see
       * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
       * in the MDN Web Docs.
       */
      public fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty)

      /**
       * @param contentTypeOptions Determines whether CloudFront includes the
       * `X-Content-Type-Options` HTTP response header with its value set to `nosniff` .
       * For more information about the `X-Content-Type-Options` HTTP response header, see
       * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee14cc438ef422dc195f6786d93efba9a379fbe1f804766c7606b9defcc45868")
      public
          fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty.Builder.() -> Unit)

      /**
       * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP
       * response header and the header's value.
       * For more information about the `X-Frame-Options` HTTP response header, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      public fun frameOptions(frameOptions: IResolvable)

      /**
       * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP
       * response header and the header's value.
       * For more information about the `X-Frame-Options` HTTP response header, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      public fun frameOptions(frameOptions: FrameOptionsProperty)

      /**
       * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP
       * response header and the header's value.
       * For more information about the `X-Frame-Options` HTTP response header, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f7486599835a4add69d3d02f8dd61b960b1fc6e8d3f404c03e7b1191ed06a3")
      public fun frameOptions(frameOptions: FrameOptionsProperty.Builder.() -> Unit)

      /**
       * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
       * response header and the header's value.
       * For more information about the `Referrer-Policy` HTTP response header, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      public fun referrerPolicy(referrerPolicy: IResolvable)

      /**
       * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
       * response header and the header's value.
       * For more information about the `Referrer-Policy` HTTP response header, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      public fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty)

      /**
       * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
       * response header and the header's value.
       * For more information about the `Referrer-Policy` HTTP response header, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b628b0330a44076207101ae815f397c9f2f3c9d9b4a43593cdc2616707969705")
      public fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty.Builder.() -> Unit)

      /**
       * @param strictTransportSecurity Determines whether CloudFront includes the
       * `Strict-Transport-Security` HTTP response header and the header's value.
       * For more information about the `Strict-Transport-Security` HTTP response header, see
       * [Security
       * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
       * in the *Amazon CloudFront Developer Guide* and
       * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
       * in the MDN Web Docs.
       */
      public fun strictTransportSecurity(strictTransportSecurity: IResolvable)

      /**
       * @param strictTransportSecurity Determines whether CloudFront includes the
       * `Strict-Transport-Security` HTTP response header and the header's value.
       * For more information about the `Strict-Transport-Security` HTTP response header, see
       * [Security
       * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
       * in the *Amazon CloudFront Developer Guide* and
       * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
       * in the MDN Web Docs.
       */
      public fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty)

      /**
       * @param strictTransportSecurity Determines whether CloudFront includes the
       * `Strict-Transport-Security` HTTP response header and the header's value.
       * For more information about the `Strict-Transport-Security` HTTP response header, see
       * [Security
       * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
       * in the *Amazon CloudFront Developer Guide* and
       * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0e4cc64d64398f8a65f156738c9f0f08804a45f6ae25d4bb3817277ce0675d9")
      public
          fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty.Builder.() -> Unit)

      /**
       * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
       * response header and the header's value.
       * For more information about the `X-XSS-Protection` HTTP response header, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      public fun xssProtection(xssProtection: IResolvable)

      /**
       * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
       * response header and the header's value.
       * For more information about the `X-XSS-Protection` HTTP response header, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      public fun xssProtection(xssProtection: XSSProtectionProperty)

      /**
       * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
       * response header and the header's value.
       * For more information about the `X-XSS-Protection` HTTP response header, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fae93bcf0b927f7dd0729ae813c7ca1d8e2089326ac039c019cca22bcc2a6fa8")
      public fun xssProtection(xssProtection: XSSProtectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.builder()

      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header.
       * For more information about the `Content-Security-Policy` HTTP response header, see
       * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
       * in the MDN Web Docs.
       */
      override fun contentSecurityPolicy(contentSecurityPolicy: IResolvable) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header.
       * For more information about the `Content-Security-Policy` HTTP response header, see
       * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
       * in the MDN Web Docs.
       */
      override fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy.let(ContentSecurityPolicyProperty::unwrap))
      }

      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header.
       * For more information about the `Content-Security-Policy` HTTP response header, see
       * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("760fb682a1ea8478bf5eb7b354cee7bbec18c9fc074dfb46bd11ec9f83e2be0c")
      override
          fun contentSecurityPolicy(contentSecurityPolicy: ContentSecurityPolicyProperty.Builder.() -> Unit):
          Unit = contentSecurityPolicy(ContentSecurityPolicyProperty(contentSecurityPolicy))

      /**
       * @param contentTypeOptions Determines whether CloudFront includes the
       * `X-Content-Type-Options` HTTP response header with its value set to `nosniff` .
       * For more information about the `X-Content-Type-Options` HTTP response header, see
       * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
       * in the MDN Web Docs.
       */
      override fun contentTypeOptions(contentTypeOptions: IResolvable) {
        cdkBuilder.contentTypeOptions(contentTypeOptions.let(IResolvable::unwrap))
      }

      /**
       * @param contentTypeOptions Determines whether CloudFront includes the
       * `X-Content-Type-Options` HTTP response header with its value set to `nosniff` .
       * For more information about the `X-Content-Type-Options` HTTP response header, see
       * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
       * in the MDN Web Docs.
       */
      override fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty) {
        cdkBuilder.contentTypeOptions(contentTypeOptions.let(ContentTypeOptionsProperty::unwrap))
      }

      /**
       * @param contentTypeOptions Determines whether CloudFront includes the
       * `X-Content-Type-Options` HTTP response header with its value set to `nosniff` .
       * For more information about the `X-Content-Type-Options` HTTP response header, see
       * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ee14cc438ef422dc195f6786d93efba9a379fbe1f804766c7606b9defcc45868")
      override
          fun contentTypeOptions(contentTypeOptions: ContentTypeOptionsProperty.Builder.() -> Unit):
          Unit = contentTypeOptions(ContentTypeOptionsProperty(contentTypeOptions))

      /**
       * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP
       * response header and the header's value.
       * For more information about the `X-Frame-Options` HTTP response header, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      override fun frameOptions(frameOptions: IResolvable) {
        cdkBuilder.frameOptions(frameOptions.let(IResolvable::unwrap))
      }

      /**
       * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP
       * response header and the header's value.
       * For more information about the `X-Frame-Options` HTTP response header, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      override fun frameOptions(frameOptions: FrameOptionsProperty) {
        cdkBuilder.frameOptions(frameOptions.let(FrameOptionsProperty::unwrap))
      }

      /**
       * @param frameOptions Determines whether CloudFront includes the `X-Frame-Options` HTTP
       * response header and the header's value.
       * For more information about the `X-Frame-Options` HTTP response header, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f9f7486599835a4add69d3d02f8dd61b960b1fc6e8d3f404c03e7b1191ed06a3")
      override fun frameOptions(frameOptions: FrameOptionsProperty.Builder.() -> Unit): Unit =
          frameOptions(FrameOptionsProperty(frameOptions))

      /**
       * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
       * response header and the header's value.
       * For more information about the `Referrer-Policy` HTTP response header, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      override fun referrerPolicy(referrerPolicy: IResolvable) {
        cdkBuilder.referrerPolicy(referrerPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
       * response header and the header's value.
       * For more information about the `Referrer-Policy` HTTP response header, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      override fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty) {
        cdkBuilder.referrerPolicy(referrerPolicy.let(ReferrerPolicyProperty::unwrap))
      }

      /**
       * @param referrerPolicy Determines whether CloudFront includes the `Referrer-Policy` HTTP
       * response header and the header's value.
       * For more information about the `Referrer-Policy` HTTP response header, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b628b0330a44076207101ae815f397c9f2f3c9d9b4a43593cdc2616707969705")
      override fun referrerPolicy(referrerPolicy: ReferrerPolicyProperty.Builder.() -> Unit): Unit =
          referrerPolicy(ReferrerPolicyProperty(referrerPolicy))

      /**
       * @param strictTransportSecurity Determines whether CloudFront includes the
       * `Strict-Transport-Security` HTTP response header and the header's value.
       * For more information about the `Strict-Transport-Security` HTTP response header, see
       * [Security
       * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
       * in the *Amazon CloudFront Developer Guide* and
       * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
       * in the MDN Web Docs.
       */
      override fun strictTransportSecurity(strictTransportSecurity: IResolvable) {
        cdkBuilder.strictTransportSecurity(strictTransportSecurity.let(IResolvable::unwrap))
      }

      /**
       * @param strictTransportSecurity Determines whether CloudFront includes the
       * `Strict-Transport-Security` HTTP response header and the header's value.
       * For more information about the `Strict-Transport-Security` HTTP response header, see
       * [Security
       * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
       * in the *Amazon CloudFront Developer Guide* and
       * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
       * in the MDN Web Docs.
       */
      override
          fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty) {
        cdkBuilder.strictTransportSecurity(strictTransportSecurity.let(StrictTransportSecurityProperty::unwrap))
      }

      /**
       * @param strictTransportSecurity Determines whether CloudFront includes the
       * `Strict-Transport-Security` HTTP response header and the header's value.
       * For more information about the `Strict-Transport-Security` HTTP response header, see
       * [Security
       * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
       * in the *Amazon CloudFront Developer Guide* and
       * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b0e4cc64d64398f8a65f156738c9f0f08804a45f6ae25d4bb3817277ce0675d9")
      override
          fun strictTransportSecurity(strictTransportSecurity: StrictTransportSecurityProperty.Builder.() -> Unit):
          Unit = strictTransportSecurity(StrictTransportSecurityProperty(strictTransportSecurity))

      /**
       * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
       * response header and the header's value.
       * For more information about the `X-XSS-Protection` HTTP response header, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      override fun xssProtection(xssProtection: IResolvable) {
        cdkBuilder.xssProtection(xssProtection.let(IResolvable::unwrap))
      }

      /**
       * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
       * response header and the header's value.
       * For more information about the `X-XSS-Protection` HTTP response header, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      override fun xssProtection(xssProtection: XSSProtectionProperty) {
        cdkBuilder.xssProtection(xssProtection.let(XSSProtectionProperty::unwrap))
      }

      /**
       * @param xssProtection Determines whether CloudFront includes the `X-XSS-Protection` HTTP
       * response header and the header's value.
       * For more information about the `X-XSS-Protection` HTTP response header, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fae93bcf0b927f7dd0729ae813c7ca1d8e2089326ac039c019cca22bcc2a6fa8")
      override fun xssProtection(xssProtection: XSSProtectionProperty.Builder.() -> Unit): Unit =
          xssProtection(XSSProtectionProperty(xssProtection))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty,
    ) : CdkObject(cdkObject), SecurityHeadersConfigProperty {
      /**
       * The policy directives and their values that CloudFront includes as values for the
       * `Content-Security-Policy` HTTP response header.
       *
       * For more information about the `Content-Security-Policy` HTTP response header, see
       * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-contentsecuritypolicy)
       */
      override fun contentSecurityPolicy(): Any? = unwrap(this).getContentSecurityPolicy()

      /**
       * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header
       * with its value set to `nosniff` .
       *
       * For more information about the `X-Content-Type-Options` HTTP response header, see
       * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-contenttypeoptions)
       */
      override fun contentTypeOptions(): Any? = unwrap(this).getContentTypeOptions()

      /**
       * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the
       * header's value.
       *
       * For more information about the `X-Frame-Options` HTTP response header, see
       * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-frameoptions)
       */
      override fun frameOptions(): Any? = unwrap(this).getFrameOptions()

      /**
       * Determines whether CloudFront includes the `Referrer-Policy` HTTP response header and the
       * header's value.
       *
       * For more information about the `Referrer-Policy` HTTP response header, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-referrerpolicy)
       */
      override fun referrerPolicy(): Any? = unwrap(this).getReferrerPolicy()

      /**
       * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header
       * and the header's value.
       *
       * For more information about the `Strict-Transport-Security` HTTP response header, see
       * [Security
       * headers](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#understanding-response-headers-policies-security)
       * in the *Amazon CloudFront Developer Guide* and
       * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-stricttransportsecurity)
       */
      override fun strictTransportSecurity(): Any? = unwrap(this).getStrictTransportSecurity()

      /**
       * Determines whether CloudFront includes the `X-XSS-Protection` HTTP response header and the
       * header's value.
       *
       * For more information about the `X-XSS-Protection` HTTP response header, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html#cfn-cloudfront-responseheaderspolicy-securityheadersconfig-xssprotection)
       */
      override fun xssProtection(): Any? = unwrap(this).getXssProtection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty):
          SecurityHeadersConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SecurityHeadersConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty
    }
  }

  /**
   * Determines whether CloudFront includes the `Referrer-Policy` HTTP response header and the
   * header's value.
   *
   * For more information about the `Referrer-Policy` HTTP response header, see
   * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ReferrerPolicyProperty referrerPolicyProperty = ReferrerPolicyProperty.builder()
   * .override(false)
   * .referrerPolicy("referrerPolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-referrerpolicy.html)
   */
  public interface ReferrerPolicyProperty {
    /**
     * A Boolean that determines whether CloudFront overrides the `Referrer-Policy` HTTP response
     * header received from the origin with the one specified in this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-referrerpolicy.html#cfn-cloudfront-responseheaderspolicy-referrerpolicy-override)
     */
    public fun `override`(): Any

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid values are:.
     *
     * * `no-referrer`
     * * `no-referrer-when-downgrade`
     * * `origin`
     * * `origin-when-cross-origin`
     * * `same-origin`
     * * `strict-origin`
     * * `strict-origin-when-cross-origin`
     * * `unsafe-url`
     *
     * For more information about these values, see
     * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-referrerpolicy.html#cfn-cloudfront-responseheaderspolicy-referrerpolicy-referrerpolicy)
     */
    public fun referrerPolicy(): String

    /**
     * A builder for [ReferrerPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Referrer-Policy` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      public fun `override`(`override`: Boolean)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Referrer-Policy` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      public fun `override`(`override`: IResolvable)

      /**
       * @param referrerPolicy The value of the `Referrer-Policy` HTTP response header. Valid values
       * are:. 
       * * `no-referrer`
       * * `no-referrer-when-downgrade`
       * * `origin`
       * * `origin-when-cross-origin`
       * * `same-origin`
       * * `strict-origin`
       * * `strict-origin-when-cross-origin`
       * * `unsafe-url`
       *
       * For more information about these values, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      public fun referrerPolicy(referrerPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty.builder()

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Referrer-Policy` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Referrer-Policy` HTTP response header received from the origin with the one specified in this
       * response headers policy. 
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      /**
       * @param referrerPolicy The value of the `Referrer-Policy` HTTP response header. Valid values
       * are:. 
       * * `no-referrer`
       * * `no-referrer-when-downgrade`
       * * `origin`
       * * `origin-when-cross-origin`
       * * `same-origin`
       * * `strict-origin`
       * * `strict-origin-when-cross-origin`
       * * `unsafe-url`
       *
       * For more information about these values, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       */
      override fun referrerPolicy(referrerPolicy: String) {
        cdkBuilder.referrerPolicy(referrerPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty,
    ) : CdkObject(cdkObject), ReferrerPolicyProperty {
      /**
       * A Boolean that determines whether CloudFront overrides the `Referrer-Policy` HTTP response
       * header received from the origin with the one specified in this response headers policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-referrerpolicy.html#cfn-cloudfront-responseheaderspolicy-referrerpolicy-override)
       */
      override fun `override`(): Any = unwrap(this).getOverride()

      /**
       * The value of the `Referrer-Policy` HTTP response header. Valid values are:.
       *
       * * `no-referrer`
       * * `no-referrer-when-downgrade`
       * * `origin`
       * * `origin-when-cross-origin`
       * * `same-origin`
       * * `strict-origin`
       * * `strict-origin-when-cross-origin`
       * * `unsafe-url`
       *
       * For more information about these values, see
       * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-referrerpolicy.html#cfn-cloudfront-responseheaderspolicy-referrerpolicy-referrerpolicy)
       */
      override fun referrerPolicy(): String = unwrap(this).getReferrerPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferrerPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty):
          ReferrerPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ReferrerPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferrerPolicyProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty
    }
  }

  /**
   * A list of origins (domain names) that CloudFront can use as the value for the
   * `Access-Control-Allow-Origin` HTTP response header.
   *
   * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
   * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * AccessControlAllowOriginsProperty accessControlAllowOriginsProperty =
   * AccessControlAllowOriginsProperty.builder()
   * .items(List.of("items"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolalloworigins.html)
   */
  public interface AccessControlAllowOriginsProperty {
    /**
     * The list of origins (domain names).
     *
     * You can specify `*` to allow all origins.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolalloworigins.html#cfn-cloudfront-responseheaderspolicy-accesscontrolalloworigins-items)
     */
    public fun items(): List<String>

    /**
     * A builder for [AccessControlAllowOriginsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The list of origins (domain names). 
       * You can specify `*` to allow all origins.
       */
      public fun items(items: List<String>)

      /**
       * @param items The list of origins (domain names). 
       * You can specify `*` to allow all origins.
       */
      public fun items(vararg items: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.builder()

      /**
       * @param items The list of origins (domain names). 
       * You can specify `*` to allow all origins.
       */
      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The list of origins (domain names). 
       * You can specify `*` to allow all origins.
       */
      override fun items(vararg items: String): Unit = items(items.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty,
    ) : CdkObject(cdkObject), AccessControlAllowOriginsProperty {
      /**
       * The list of origins (domain names).
       *
       * You can specify `*` to allow all origins.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolalloworigins.html#cfn-cloudfront-responseheaderspolicy-accesscontrolalloworigins-items)
       */
      override fun items(): List<String> = unwrap(this).getItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAllowOriginsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty):
          AccessControlAllowOriginsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessControlAllowOriginsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAllowOriginsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty
    }
  }

  /**
   * A response headers policy configuration.
   *
   * A response headers policy configuration contains metadata about the response headers policy,
   * and configurations for sets of HTTP response headers.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ResponseHeadersPolicyConfigProperty responseHeadersPolicyConfigProperty =
   * ResponseHeadersPolicyConfigProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .comment("comment")
   * .corsConfig(CorsConfigProperty.builder()
   * .accessControlAllowCredentials(false)
   * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .originOverride(false)
   * // the properties below are optional
   * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .accessControlMaxAgeSec(123)
   * .build())
   * .customHeadersConfig(CustomHeadersConfigProperty.builder()
   * .items(List.of(CustomHeaderProperty.builder()
   * .header("header")
   * .override(false)
   * .value("value")
   * .build()))
   * .build())
   * .removeHeadersConfig(RemoveHeadersConfigProperty.builder()
   * .items(List.of(RemoveHeaderProperty.builder()
   * .header("header")
   * .build()))
   * .build())
   * .securityHeadersConfig(SecurityHeadersConfigProperty.builder()
   * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
   * .contentSecurityPolicy("contentSecurityPolicy")
   * .override(false)
   * .build())
   * .contentTypeOptions(ContentTypeOptionsProperty.builder()
   * .override(false)
   * .build())
   * .frameOptions(FrameOptionsProperty.builder()
   * .frameOption("frameOption")
   * .override(false)
   * .build())
   * .referrerPolicy(ReferrerPolicyProperty.builder()
   * .override(false)
   * .referrerPolicy("referrerPolicy")
   * .build())
   * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
   * .accessControlMaxAgeSec(123)
   * .override(false)
   * // the properties below are optional
   * .includeSubdomains(false)
   * .preload(false)
   * .build())
   * .xssProtection(XSSProtectionProperty.builder()
   * .override(false)
   * .protection(false)
   * // the properties below are optional
   * .modeBlock(false)
   * .reportUri("reportUri")
   * .build())
   * .build())
   * .serverTimingHeadersConfig(ServerTimingHeadersConfigProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .samplingRate(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html)
   */
  public interface ResponseHeadersPolicyConfigProperty {
    /**
     * A comment to describe the response headers policy.
     *
     * The comment cannot be longer than 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * A configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-corsconfig)
     */
    public fun corsConfig(): Any? = unwrap(this).getCorsConfig()

    /**
     * A configuration for a set of custom HTTP response headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-customheadersconfig)
     */
    public fun customHeadersConfig(): Any? = unwrap(this).getCustomHeadersConfig()

    /**
     * A name to identify the response headers policy.
     *
     * The name must be unique for response headers policies in this AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-name)
     */
    public fun name(): String

    /**
     * A configuration for a set of HTTP headers to remove from the HTTP response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-removeheadersconfig)
     */
    public fun removeHeadersConfig(): Any? = unwrap(this).getRemoveHeadersConfig()

    /**
     * A configuration for a set of security-related HTTP response headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-securityheadersconfig)
     */
    public fun securityHeadersConfig(): Any? = unwrap(this).getSecurityHeadersConfig()

    /**
     * A configuration for enabling the `Server-Timing` header in HTTP responses sent from
     * CloudFront.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-servertimingheadersconfig)
     */
    public fun serverTimingHeadersConfig(): Any? = unwrap(this).getServerTimingHeadersConfig()

    /**
     * A builder for [ResponseHeadersPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment A comment to describe the response headers policy.
       * The comment cannot be longer than 128 characters.
       */
      public fun comment(comment: String)

      /**
       * @param corsConfig A configuration for a set of HTTP response headers that are used for
       * cross-origin resource sharing (CORS).
       */
      public fun corsConfig(corsConfig: IResolvable)

      /**
       * @param corsConfig A configuration for a set of HTTP response headers that are used for
       * cross-origin resource sharing (CORS).
       */
      public fun corsConfig(corsConfig: CorsConfigProperty)

      /**
       * @param corsConfig A configuration for a set of HTTP response headers that are used for
       * cross-origin resource sharing (CORS).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a3bed57ef421e819b18d210af15e22c39e9ce5a2c26ea5f666831538c0dddb")
      public fun corsConfig(corsConfig: CorsConfigProperty.Builder.() -> Unit)

      /**
       * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
       */
      public fun customHeadersConfig(customHeadersConfig: IResolvable)

      /**
       * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
       */
      public fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty)

      /**
       * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f939a3337362614a1fa52773bdecf03e5e8f12aeb6872e583c00f92c0a70e1a0")
      public
          fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty.Builder.() -> Unit)

      /**
       * @param name A name to identify the response headers policy. 
       * The name must be unique for response headers policies in this AWS account .
       */
      public fun name(name: String)

      /**
       * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the
       * HTTP response.
       */
      public fun removeHeadersConfig(removeHeadersConfig: IResolvable)

      /**
       * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the
       * HTTP response.
       */
      public fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty)

      /**
       * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the
       * HTTP response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f027ac414d9aa7f3a962ec1e494f1d195c397f2bd170517c9309f84218568d")
      public
          fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty.Builder.() -> Unit)

      /**
       * @param securityHeadersConfig A configuration for a set of security-related HTTP response
       * headers.
       */
      public fun securityHeadersConfig(securityHeadersConfig: IResolvable)

      /**
       * @param securityHeadersConfig A configuration for a set of security-related HTTP response
       * headers.
       */
      public fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty)

      /**
       * @param securityHeadersConfig A configuration for a set of security-related HTTP response
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec350537ed8704161521a2a0ea42d6d39495942dee0591bb00700be0b7556d8e")
      public
          fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty.Builder.() -> Unit)

      /**
       * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
       * HTTP responses sent from CloudFront.
       */
      public fun serverTimingHeadersConfig(serverTimingHeadersConfig: IResolvable)

      /**
       * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
       * HTTP responses sent from CloudFront.
       */
      public
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty)

      /**
       * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
       * HTTP responses sent from CloudFront.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("613d322e21df88d714eab3ef3bc3763263ef620308e0ee79809f3cd7def609ca")
      public
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.builder()

      /**
       * @param comment A comment to describe the response headers policy.
       * The comment cannot be longer than 128 characters.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param corsConfig A configuration for a set of HTTP response headers that are used for
       * cross-origin resource sharing (CORS).
       */
      override fun corsConfig(corsConfig: IResolvable) {
        cdkBuilder.corsConfig(corsConfig.let(IResolvable::unwrap))
      }

      /**
       * @param corsConfig A configuration for a set of HTTP response headers that are used for
       * cross-origin resource sharing (CORS).
       */
      override fun corsConfig(corsConfig: CorsConfigProperty) {
        cdkBuilder.corsConfig(corsConfig.let(CorsConfigProperty::unwrap))
      }

      /**
       * @param corsConfig A configuration for a set of HTTP response headers that are used for
       * cross-origin resource sharing (CORS).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9a3bed57ef421e819b18d210af15e22c39e9ce5a2c26ea5f666831538c0dddb")
      override fun corsConfig(corsConfig: CorsConfigProperty.Builder.() -> Unit): Unit =
          corsConfig(CorsConfigProperty(corsConfig))

      /**
       * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
       */
      override fun customHeadersConfig(customHeadersConfig: IResolvable) {
        cdkBuilder.customHeadersConfig(customHeadersConfig.let(IResolvable::unwrap))
      }

      /**
       * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
       */
      override fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty) {
        cdkBuilder.customHeadersConfig(customHeadersConfig.let(CustomHeadersConfigProperty::unwrap))
      }

      /**
       * @param customHeadersConfig A configuration for a set of custom HTTP response headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f939a3337362614a1fa52773bdecf03e5e8f12aeb6872e583c00f92c0a70e1a0")
      override
          fun customHeadersConfig(customHeadersConfig: CustomHeadersConfigProperty.Builder.() -> Unit):
          Unit = customHeadersConfig(CustomHeadersConfigProperty(customHeadersConfig))

      /**
       * @param name A name to identify the response headers policy. 
       * The name must be unique for response headers policies in this AWS account .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the
       * HTTP response.
       */
      override fun removeHeadersConfig(removeHeadersConfig: IResolvable) {
        cdkBuilder.removeHeadersConfig(removeHeadersConfig.let(IResolvable::unwrap))
      }

      /**
       * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the
       * HTTP response.
       */
      override fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty) {
        cdkBuilder.removeHeadersConfig(removeHeadersConfig.let(RemoveHeadersConfigProperty::unwrap))
      }

      /**
       * @param removeHeadersConfig A configuration for a set of HTTP headers to remove from the
       * HTTP response.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b9f027ac414d9aa7f3a962ec1e494f1d195c397f2bd170517c9309f84218568d")
      override
          fun removeHeadersConfig(removeHeadersConfig: RemoveHeadersConfigProperty.Builder.() -> Unit):
          Unit = removeHeadersConfig(RemoveHeadersConfigProperty(removeHeadersConfig))

      /**
       * @param securityHeadersConfig A configuration for a set of security-related HTTP response
       * headers.
       */
      override fun securityHeadersConfig(securityHeadersConfig: IResolvable) {
        cdkBuilder.securityHeadersConfig(securityHeadersConfig.let(IResolvable::unwrap))
      }

      /**
       * @param securityHeadersConfig A configuration for a set of security-related HTTP response
       * headers.
       */
      override fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty) {
        cdkBuilder.securityHeadersConfig(securityHeadersConfig.let(SecurityHeadersConfigProperty::unwrap))
      }

      /**
       * @param securityHeadersConfig A configuration for a set of security-related HTTP response
       * headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec350537ed8704161521a2a0ea42d6d39495942dee0591bb00700be0b7556d8e")
      override
          fun securityHeadersConfig(securityHeadersConfig: SecurityHeadersConfigProperty.Builder.() -> Unit):
          Unit = securityHeadersConfig(SecurityHeadersConfigProperty(securityHeadersConfig))

      /**
       * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
       * HTTP responses sent from CloudFront.
       */
      override fun serverTimingHeadersConfig(serverTimingHeadersConfig: IResolvable) {
        cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig.let(IResolvable::unwrap))
      }

      /**
       * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
       * HTTP responses sent from CloudFront.
       */
      override
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty) {
        cdkBuilder.serverTimingHeadersConfig(serverTimingHeadersConfig.let(ServerTimingHeadersConfigProperty::unwrap))
      }

      /**
       * @param serverTimingHeadersConfig A configuration for enabling the `Server-Timing` header in
       * HTTP responses sent from CloudFront.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("613d322e21df88d714eab3ef3bc3763263ef620308e0ee79809f3cd7def609ca")
      override
          fun serverTimingHeadersConfig(serverTimingHeadersConfig: ServerTimingHeadersConfigProperty.Builder.() -> Unit):
          Unit =
          serverTimingHeadersConfig(ServerTimingHeadersConfigProperty(serverTimingHeadersConfig))

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty,
    ) : CdkObject(cdkObject), ResponseHeadersPolicyConfigProperty {
      /**
       * A comment to describe the response headers policy.
       *
       * The comment cannot be longer than 128 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * A configuration for a set of HTTP response headers that are used for cross-origin resource
       * sharing (CORS).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-corsconfig)
       */
      override fun corsConfig(): Any? = unwrap(this).getCorsConfig()

      /**
       * A configuration for a set of custom HTTP response headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-customheadersconfig)
       */
      override fun customHeadersConfig(): Any? = unwrap(this).getCustomHeadersConfig()

      /**
       * A name to identify the response headers policy.
       *
       * The name must be unique for response headers policies in this AWS account .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A configuration for a set of HTTP headers to remove from the HTTP response.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-removeheadersconfig)
       */
      override fun removeHeadersConfig(): Any? = unwrap(this).getRemoveHeadersConfig()

      /**
       * A configuration for a set of security-related HTTP response headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-securityheadersconfig)
       */
      override fun securityHeadersConfig(): Any? = unwrap(this).getSecurityHeadersConfig()

      /**
       * A configuration for enabling the `Server-Timing` header in HTTP responses sent from
       * CloudFront.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html#cfn-cloudfront-responseheaderspolicy-responseheaderspolicyconfig-servertimingheadersconfig)
       */
      override fun serverTimingHeadersConfig(): Any? = unwrap(this).getServerTimingHeadersConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResponseHeadersPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty):
          ResponseHeadersPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResponseHeadersPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResponseHeadersPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty
    }
  }

  /**
   * A configuration for enabling the `Server-Timing` header in HTTP responses sent from CloudFront.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ServerTimingHeadersConfigProperty serverTimingHeadersConfigProperty =
   * ServerTimingHeadersConfigProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .samplingRate(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-servertimingheadersconfig.html)
   */
  public interface ServerTimingHeadersConfigProperty {
    /**
     * A Boolean that determines whether CloudFront adds the `Server-Timing` header to HTTP
     * responses that it sends in response to requests that match a cache behavior that's associated
     * with this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-servertimingheadersconfig.html#cfn-cloudfront-responseheaderspolicy-servertimingheadersconfig-enabled)
     */
    public fun enabled(): Any

    /**
     * A number 0–100 (inclusive) that specifies the percentage of responses that you want
     * CloudFront to add the `Server-Timing` header to.
     *
     * When you set the sampling rate to 100, CloudFront adds the `Server-Timing` header to the HTTP
     * response for every request that matches the cache behavior that this response headers policy is
     * attached to. When you set it to 50, CloudFront adds the header to 50% of the responses for
     * requests that match the cache behavior. You can set the sampling rate to any number 0–100 with
     * up to four decimal places.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-servertimingheadersconfig.html#cfn-cloudfront-responseheaderspolicy-servertimingheadersconfig-samplingrate)
     */
    public fun samplingRate(): Number? = unwrap(this).getSamplingRate()

    /**
     * A builder for [ServerTimingHeadersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled A Boolean that determines whether CloudFront adds the `Server-Timing` header
       * to HTTP responses that it sends in response to requests that match a cache behavior that's
       * associated with this response headers policy. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled A Boolean that determines whether CloudFront adds the `Server-Timing` header
       * to HTTP responses that it sends in response to requests that match a cache behavior that's
       * associated with this response headers policy. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param samplingRate A number 0–100 (inclusive) that specifies the percentage of responses
       * that you want CloudFront to add the `Server-Timing` header to.
       * When you set the sampling rate to 100, CloudFront adds the `Server-Timing` header to the
       * HTTP response for every request that matches the cache behavior that this response headers
       * policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the
       * responses for requests that match the cache behavior. You can set the sampling rate to any
       * number 0–100 with up to four decimal places.
       */
      public fun samplingRate(samplingRate: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.builder()

      /**
       * @param enabled A Boolean that determines whether CloudFront adds the `Server-Timing` header
       * to HTTP responses that it sends in response to requests that match a cache behavior that's
       * associated with this response headers policy. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled A Boolean that determines whether CloudFront adds the `Server-Timing` header
       * to HTTP responses that it sends in response to requests that match a cache behavior that's
       * associated with this response headers policy. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param samplingRate A number 0–100 (inclusive) that specifies the percentage of responses
       * that you want CloudFront to add the `Server-Timing` header to.
       * When you set the sampling rate to 100, CloudFront adds the `Server-Timing` header to the
       * HTTP response for every request that matches the cache behavior that this response headers
       * policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the
       * responses for requests that match the cache behavior. You can set the sampling rate to any
       * number 0–100 with up to four decimal places.
       */
      override fun samplingRate(samplingRate: Number) {
        cdkBuilder.samplingRate(samplingRate)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty,
    ) : CdkObject(cdkObject), ServerTimingHeadersConfigProperty {
      /**
       * A Boolean that determines whether CloudFront adds the `Server-Timing` header to HTTP
       * responses that it sends in response to requests that match a cache behavior that's associated
       * with this response headers policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-servertimingheadersconfig.html#cfn-cloudfront-responseheaderspolicy-servertimingheadersconfig-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * A number 0–100 (inclusive) that specifies the percentage of responses that you want
       * CloudFront to add the `Server-Timing` header to.
       *
       * When you set the sampling rate to 100, CloudFront adds the `Server-Timing` header to the
       * HTTP response for every request that matches the cache behavior that this response headers
       * policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the
       * responses for requests that match the cache behavior. You can set the sampling rate to any
       * number 0–100 with up to four decimal places.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-servertimingheadersconfig.html#cfn-cloudfront-responseheaderspolicy-servertimingheadersconfig-samplingrate)
       */
      override fun samplingRate(): Number? = unwrap(this).getSamplingRate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerTimingHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty):
          ServerTimingHeadersConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerTimingHeadersConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerTimingHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty
    }
  }

  /**
   * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and
   * the header's value.
   *
   * For more information about the `Strict-Transport-Security` HTTP response header, see
   * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * StrictTransportSecurityProperty strictTransportSecurityProperty =
   * StrictTransportSecurityProperty.builder()
   * .accessControlMaxAgeSec(123)
   * .override(false)
   * // the properties below are optional
   * .includeSubdomains(false)
   * .preload(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html)
   */
  public interface StrictTransportSecurityProperty {
    /**
     * A number that CloudFront uses as the value for the `max-age` directive in the
     * `Strict-Transport-Security` HTTP response header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-accesscontrolmaxagesec)
     */
    public fun accessControlMaxAgeSec(): Number

    /**
     * A Boolean that determines whether CloudFront includes the `includeSubDomains` directive in
     * the `Strict-Transport-Security` HTTP response header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-includesubdomains)
     */
    public fun includeSubdomains(): Any? = unwrap(this).getIncludeSubdomains()

    /**
     * A Boolean that determines whether CloudFront overrides the `Strict-Transport-Security` HTTP
     * response header received from the origin with the one specified in this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-override)
     */
    public fun `override`(): Any

    /**
     * A Boolean that determines whether CloudFront includes the `preload` directive in the
     * `Strict-Transport-Security` HTTP response header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-preload)
     */
    public fun preload(): Any? = unwrap(this).getPreload()

    /**
     * A builder for [StrictTransportSecurityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the `max-age`
       * directive in the `Strict-Transport-Security` HTTP response header. 
       */
      public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number)

      /**
       * @param includeSubdomains A Boolean that determines whether CloudFront includes the
       * `includeSubDomains` directive in the `Strict-Transport-Security` HTTP response header.
       */
      public fun includeSubdomains(includeSubdomains: Boolean)

      /**
       * @param includeSubdomains A Boolean that determines whether CloudFront includes the
       * `includeSubDomains` directive in the `Strict-Transport-Security` HTTP response header.
       */
      public fun includeSubdomains(includeSubdomains: IResolvable)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Strict-Transport-Security` HTTP response header received from the origin with the one
       * specified in this response headers policy. 
       */
      public fun `override`(`override`: Boolean)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Strict-Transport-Security` HTTP response header received from the origin with the one
       * specified in this response headers policy. 
       */
      public fun `override`(`override`: IResolvable)

      /**
       * @param preload A Boolean that determines whether CloudFront includes the `preload`
       * directive in the `Strict-Transport-Security` HTTP response header.
       */
      public fun preload(preload: Boolean)

      /**
       * @param preload A Boolean that determines whether CloudFront includes the `preload`
       * directive in the `Strict-Transport-Security` HTTP response header.
       */
      public fun preload(preload: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty.builder()

      /**
       * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the `max-age`
       * directive in the `Strict-Transport-Security` HTTP response header. 
       */
      override fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
        cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
      }

      /**
       * @param includeSubdomains A Boolean that determines whether CloudFront includes the
       * `includeSubDomains` directive in the `Strict-Transport-Security` HTTP response header.
       */
      override fun includeSubdomains(includeSubdomains: Boolean) {
        cdkBuilder.includeSubdomains(includeSubdomains)
      }

      /**
       * @param includeSubdomains A Boolean that determines whether CloudFront includes the
       * `includeSubDomains` directive in the `Strict-Transport-Security` HTTP response header.
       */
      override fun includeSubdomains(includeSubdomains: IResolvable) {
        cdkBuilder.includeSubdomains(includeSubdomains.let(IResolvable::unwrap))
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Strict-Transport-Security` HTTP response header received from the origin with the one
       * specified in this response headers policy. 
       */
      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Strict-Transport-Security` HTTP response header received from the origin with the one
       * specified in this response headers policy. 
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      /**
       * @param preload A Boolean that determines whether CloudFront includes the `preload`
       * directive in the `Strict-Transport-Security` HTTP response header.
       */
      override fun preload(preload: Boolean) {
        cdkBuilder.preload(preload)
      }

      /**
       * @param preload A Boolean that determines whether CloudFront includes the `preload`
       * directive in the `Strict-Transport-Security` HTTP response header.
       */
      override fun preload(preload: IResolvable) {
        cdkBuilder.preload(preload.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty,
    ) : CdkObject(cdkObject), StrictTransportSecurityProperty {
      /**
       * A number that CloudFront uses as the value for the `max-age` directive in the
       * `Strict-Transport-Security` HTTP response header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-accesscontrolmaxagesec)
       */
      override fun accessControlMaxAgeSec(): Number = unwrap(this).getAccessControlMaxAgeSec()

      /**
       * A Boolean that determines whether CloudFront includes the `includeSubDomains` directive in
       * the `Strict-Transport-Security` HTTP response header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-includesubdomains)
       */
      override fun includeSubdomains(): Any? = unwrap(this).getIncludeSubdomains()

      /**
       * A Boolean that determines whether CloudFront overrides the `Strict-Transport-Security` HTTP
       * response header received from the origin with the one specified in this response headers
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-override)
       */
      override fun `override`(): Any = unwrap(this).getOverride()

      /**
       * A Boolean that determines whether CloudFront includes the `preload` directive in the
       * `Strict-Transport-Security` HTTP response header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html#cfn-cloudfront-responseheaderspolicy-stricttransportsecurity-preload)
       */
      override fun preload(): Any? = unwrap(this).getPreload()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StrictTransportSecurityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty):
          StrictTransportSecurityProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StrictTransportSecurityProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StrictTransportSecurityProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty
    }
  }

  /**
   * A configuration for a set of HTTP response headers that are used for cross-origin resource
   * sharing (CORS).
   *
   * CloudFront adds these headers to HTTP responses that it sends for CORS requests that match a
   * cache behavior associated with this response headers policy.
   *
   * For more information about CORS, see [Cross-Origin Resource Sharing
   * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) in the
   * MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CorsConfigProperty corsConfigProperty = CorsConfigProperty.builder()
   * .accessControlAllowCredentials(false)
   * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .originOverride(false)
   * // the properties below are optional
   * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
   * .items(List.of("items"))
   * .build())
   * .accessControlMaxAgeSec(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html)
   */
  public interface CorsConfigProperty {
    /**
     * A Boolean that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP
     * response header.
     *
     * For more information about the `Access-Control-Allow-Credentials` HTTP response header, see
     * [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolallowcredentials)
     */
    public fun accessControlAllowCredentials(): Any

    /**
     * A list of HTTP header names that CloudFront includes as values for the
     * `Access-Control-Allow-Headers` HTTP response header.
     *
     * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
     * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolallowheaders)
     */
    public fun accessControlAllowHeaders(): Any

    /**
     * A list of HTTP methods that CloudFront includes as values for the
     * `Access-Control-Allow-Methods` HTTP response header.
     *
     * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
     * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolallowmethods)
     */
    public fun accessControlAllowMethods(): Any

    /**
     * A list of origins (domain names) that CloudFront can use as the value for the
     * `Access-Control-Allow-Origin` HTTP response header.
     *
     * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
     * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolalloworigins)
     */
    public fun accessControlAllowOrigins(): Any

    /**
     * A list of HTTP headers that CloudFront includes as values for the
     * `Access-Control-Expose-Headers` HTTP response header.
     *
     * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
     * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolexposeheaders)
     */
    public fun accessControlExposeHeaders(): Any? = unwrap(this).getAccessControlExposeHeaders()

    /**
     * A number that CloudFront uses as the value for the `Access-Control-Max-Age` HTTP response
     * header.
     *
     * For more information about the `Access-Control-Max-Age` HTTP response header, see
     * [Access-Control-Max-Age](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolmaxagesec)
     */
    public fun accessControlMaxAgeSec(): Number? = unwrap(this).getAccessControlMaxAgeSec()

    /**
     * A Boolean that determines whether CloudFront overrides HTTP response headers received from
     * the origin with the ones specified in this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-originoverride)
     */
    public fun originOverride(): Any

    /**
     * A builder for [CorsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
       * `Access-Control-Allow-Credentials` HTTP response header. 
       * For more information about the `Access-Control-Allow-Credentials` HTTP response header, see
       * [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
       * in the MDN Web Docs.
       */
      public fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean)

      /**
       * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
       * `Access-Control-Allow-Credentials` HTTP response header. 
       * For more information about the `Access-Control-Allow-Credentials` HTTP response header, see
       * [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
       * in the MDN Web Docs.
       */
      public fun accessControlAllowCredentials(accessControlAllowCredentials: IResolvable)

      /**
       * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
       * values for the `Access-Control-Allow-Headers` HTTP response header. 
       * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
       * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
       * in the MDN Web Docs.
       */
      public fun accessControlAllowHeaders(accessControlAllowHeaders: IResolvable)

      /**
       * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
       * values for the `Access-Control-Allow-Headers` HTTP response header. 
       * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
       * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
       * in the MDN Web Docs.
       */
      public
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty)

      /**
       * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
       * values for the `Access-Control-Allow-Headers` HTTP response header. 
       * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
       * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3bcde99d4105a597f432e2c2ed6c5d4fc2fbc8a6147c06fa73267c62f585ea13")
      public
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty.Builder.() -> Unit)

      /**
       * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
       * for the `Access-Control-Allow-Methods` HTTP response header. 
       * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
       * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
       * in the MDN Web Docs.
       */
      public fun accessControlAllowMethods(accessControlAllowMethods: IResolvable)

      /**
       * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
       * for the `Access-Control-Allow-Methods` HTTP response header. 
       * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
       * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
       * in the MDN Web Docs.
       */
      public
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty)

      /**
       * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
       * for the `Access-Control-Allow-Methods` HTTP response header. 
       * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
       * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b680abc572b1934f4cdf2bf54e34f8816cbb88b5222d2b111bcb6dd11f87a5b")
      public
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty.Builder.() -> Unit)

      /**
       * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use
       * as the value for the `Access-Control-Allow-Origin` HTTP response header. 
       * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
       * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
       * in the MDN Web Docs.
       */
      public fun accessControlAllowOrigins(accessControlAllowOrigins: IResolvable)

      /**
       * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use
       * as the value for the `Access-Control-Allow-Origin` HTTP response header. 
       * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
       * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
       * in the MDN Web Docs.
       */
      public
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty)

      /**
       * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use
       * as the value for the `Access-Control-Allow-Origin` HTTP response header. 
       * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
       * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("444a95bdbc2520e95344520931fcf2ac8cb4045c5967fd889c4981e7806275f9")
      public
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty.Builder.() -> Unit)

      /**
       * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
       * for the `Access-Control-Expose-Headers` HTTP response header.
       * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
       * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
       * in the MDN Web Docs.
       */
      public fun accessControlExposeHeaders(accessControlExposeHeaders: IResolvable)

      /**
       * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
       * for the `Access-Control-Expose-Headers` HTTP response header.
       * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
       * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
       * in the MDN Web Docs.
       */
      public
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty)

      /**
       * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
       * for the `Access-Control-Expose-Headers` HTTP response header.
       * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
       * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c8372b795594c49a504376dbb0e2762eb84886ac7ed2fc07745d334ae728355")
      public
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty.Builder.() -> Unit)

      /**
       * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the
       * `Access-Control-Max-Age` HTTP response header.
       * For more information about the `Access-Control-Max-Age` HTTP response header, see
       * [Access-Control-Max-Age](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age)
       * in the MDN Web Docs.
       */
      public fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number)

      /**
       * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
       * headers received from the origin with the ones specified in this response headers policy. 
       */
      public fun originOverride(originOverride: Boolean)

      /**
       * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
       * headers received from the origin with the ones specified in this response headers policy. 
       */
      public fun originOverride(originOverride: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty.builder()

      /**
       * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
       * `Access-Control-Allow-Credentials` HTTP response header. 
       * For more information about the `Access-Control-Allow-Credentials` HTTP response header, see
       * [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
       * in the MDN Web Docs.
       */
      override fun accessControlAllowCredentials(accessControlAllowCredentials: Boolean) {
        cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials)
      }

      /**
       * @param accessControlAllowCredentials A Boolean that CloudFront uses as the value for the
       * `Access-Control-Allow-Credentials` HTTP response header. 
       * For more information about the `Access-Control-Allow-Credentials` HTTP response header, see
       * [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
       * in the MDN Web Docs.
       */
      override fun accessControlAllowCredentials(accessControlAllowCredentials: IResolvable) {
        cdkBuilder.accessControlAllowCredentials(accessControlAllowCredentials.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
       * values for the `Access-Control-Allow-Headers` HTTP response header. 
       * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
       * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
       * in the MDN Web Docs.
       */
      override fun accessControlAllowHeaders(accessControlAllowHeaders: IResolvable) {
        cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
       * values for the `Access-Control-Allow-Headers` HTTP response header. 
       * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
       * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
       * in the MDN Web Docs.
       */
      override
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty) {
        cdkBuilder.accessControlAllowHeaders(accessControlAllowHeaders.let(AccessControlAllowHeadersProperty::unwrap))
      }

      /**
       * @param accessControlAllowHeaders A list of HTTP header names that CloudFront includes as
       * values for the `Access-Control-Allow-Headers` HTTP response header. 
       * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
       * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3bcde99d4105a597f432e2c2ed6c5d4fc2fbc8a6147c06fa73267c62f585ea13")
      override
          fun accessControlAllowHeaders(accessControlAllowHeaders: AccessControlAllowHeadersProperty.Builder.() -> Unit):
          Unit =
          accessControlAllowHeaders(AccessControlAllowHeadersProperty(accessControlAllowHeaders))

      /**
       * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
       * for the `Access-Control-Allow-Methods` HTTP response header. 
       * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
       * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
       * in the MDN Web Docs.
       */
      override fun accessControlAllowMethods(accessControlAllowMethods: IResolvable) {
        cdkBuilder.accessControlAllowMethods(accessControlAllowMethods.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
       * for the `Access-Control-Allow-Methods` HTTP response header. 
       * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
       * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
       * in the MDN Web Docs.
       */
      override
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty) {
        cdkBuilder.accessControlAllowMethods(accessControlAllowMethods.let(AccessControlAllowMethodsProperty::unwrap))
      }

      /**
       * @param accessControlAllowMethods A list of HTTP methods that CloudFront includes as values
       * for the `Access-Control-Allow-Methods` HTTP response header. 
       * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
       * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b680abc572b1934f4cdf2bf54e34f8816cbb88b5222d2b111bcb6dd11f87a5b")
      override
          fun accessControlAllowMethods(accessControlAllowMethods: AccessControlAllowMethodsProperty.Builder.() -> Unit):
          Unit =
          accessControlAllowMethods(AccessControlAllowMethodsProperty(accessControlAllowMethods))

      /**
       * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use
       * as the value for the `Access-Control-Allow-Origin` HTTP response header. 
       * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
       * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
       * in the MDN Web Docs.
       */
      override fun accessControlAllowOrigins(accessControlAllowOrigins: IResolvable) {
        cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use
       * as the value for the `Access-Control-Allow-Origin` HTTP response header. 
       * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
       * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
       * in the MDN Web Docs.
       */
      override
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty) {
        cdkBuilder.accessControlAllowOrigins(accessControlAllowOrigins.let(AccessControlAllowOriginsProperty::unwrap))
      }

      /**
       * @param accessControlAllowOrigins A list of origins (domain names) that CloudFront can use
       * as the value for the `Access-Control-Allow-Origin` HTTP response header. 
       * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
       * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("444a95bdbc2520e95344520931fcf2ac8cb4045c5967fd889c4981e7806275f9")
      override
          fun accessControlAllowOrigins(accessControlAllowOrigins: AccessControlAllowOriginsProperty.Builder.() -> Unit):
          Unit =
          accessControlAllowOrigins(AccessControlAllowOriginsProperty(accessControlAllowOrigins))

      /**
       * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
       * for the `Access-Control-Expose-Headers` HTTP response header.
       * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
       * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
       * in the MDN Web Docs.
       */
      override fun accessControlExposeHeaders(accessControlExposeHeaders: IResolvable) {
        cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders.let(IResolvable::unwrap))
      }

      /**
       * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
       * for the `Access-Control-Expose-Headers` HTTP response header.
       * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
       * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
       * in the MDN Web Docs.
       */
      override
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty) {
        cdkBuilder.accessControlExposeHeaders(accessControlExposeHeaders.let(AccessControlExposeHeadersProperty::unwrap))
      }

      /**
       * @param accessControlExposeHeaders A list of HTTP headers that CloudFront includes as values
       * for the `Access-Control-Expose-Headers` HTTP response header.
       * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
       * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
       * in the MDN Web Docs.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9c8372b795594c49a504376dbb0e2762eb84886ac7ed2fc07745d334ae728355")
      override
          fun accessControlExposeHeaders(accessControlExposeHeaders: AccessControlExposeHeadersProperty.Builder.() -> Unit):
          Unit =
          accessControlExposeHeaders(AccessControlExposeHeadersProperty(accessControlExposeHeaders))

      /**
       * @param accessControlMaxAgeSec A number that CloudFront uses as the value for the
       * `Access-Control-Max-Age` HTTP response header.
       * For more information about the `Access-Control-Max-Age` HTTP response header, see
       * [Access-Control-Max-Age](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age)
       * in the MDN Web Docs.
       */
      override fun accessControlMaxAgeSec(accessControlMaxAgeSec: Number) {
        cdkBuilder.accessControlMaxAgeSec(accessControlMaxAgeSec)
      }

      /**
       * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
       * headers received from the origin with the ones specified in this response headers policy. 
       */
      override fun originOverride(originOverride: Boolean) {
        cdkBuilder.originOverride(originOverride)
      }

      /**
       * @param originOverride A Boolean that determines whether CloudFront overrides HTTP response
       * headers received from the origin with the ones specified in this response headers policy. 
       */
      override fun originOverride(originOverride: IResolvable) {
        cdkBuilder.originOverride(originOverride.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty,
    ) : CdkObject(cdkObject), CorsConfigProperty {
      /**
       * A Boolean that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP
       * response header.
       *
       * For more information about the `Access-Control-Allow-Credentials` HTTP response header, see
       * [Access-Control-Allow-Credentials](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolallowcredentials)
       */
      override fun accessControlAllowCredentials(): Any =
          unwrap(this).getAccessControlAllowCredentials()

      /**
       * A list of HTTP header names that CloudFront includes as values for the
       * `Access-Control-Allow-Headers` HTTP response header.
       *
       * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
       * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolallowheaders)
       */
      override fun accessControlAllowHeaders(): Any = unwrap(this).getAccessControlAllowHeaders()

      /**
       * A list of HTTP methods that CloudFront includes as values for the
       * `Access-Control-Allow-Methods` HTTP response header.
       *
       * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
       * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolallowmethods)
       */
      override fun accessControlAllowMethods(): Any = unwrap(this).getAccessControlAllowMethods()

      /**
       * A list of origins (domain names) that CloudFront can use as the value for the
       * `Access-Control-Allow-Origin` HTTP response header.
       *
       * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
       * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolalloworigins)
       */
      override fun accessControlAllowOrigins(): Any = unwrap(this).getAccessControlAllowOrigins()

      /**
       * A list of HTTP headers that CloudFront includes as values for the
       * `Access-Control-Expose-Headers` HTTP response header.
       *
       * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
       * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolexposeheaders)
       */
      override fun accessControlExposeHeaders(): Any? = unwrap(this).getAccessControlExposeHeaders()

      /**
       * A number that CloudFront uses as the value for the `Access-Control-Max-Age` HTTP response
       * header.
       *
       * For more information about the `Access-Control-Max-Age` HTTP response header, see
       * [Access-Control-Max-Age](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Max-Age)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-accesscontrolmaxagesec)
       */
      override fun accessControlMaxAgeSec(): Number? = unwrap(this).getAccessControlMaxAgeSec()

      /**
       * A Boolean that determines whether CloudFront overrides HTTP response headers received from
       * the origin with the ones specified in this response headers policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html#cfn-cloudfront-responseheaderspolicy-corsconfig-originoverride)
       */
      override fun originOverride(): Any = unwrap(this).getOriginOverride()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty):
          CorsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? CorsConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty
    }
  }

  /**
   * The name of an HTTP header that CloudFront removes from HTTP responses to requests that match
   * the cache behavior that this response headers policy is attached to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * RemoveHeaderProperty removeHeaderProperty = RemoveHeaderProperty.builder()
   * .header("header")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheader.html)
   */
  public interface RemoveHeaderProperty {
    /**
     * The HTTP header name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheader.html#cfn-cloudfront-responseheaderspolicy-removeheader-header)
     */
    public fun `header`(): String

    /**
     * A builder for [RemoveHeaderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header The HTTP header name. 
       */
      public fun `header`(`header`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty.builder()

      /**
       * @param header The HTTP header name. 
       */
      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty,
    ) : CdkObject(cdkObject), RemoveHeaderProperty {
      /**
       * The HTTP header name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheader.html#cfn-cloudfront-responseheaderspolicy-removeheader-header)
       */
      override fun `header`(): String = unwrap(this).getHeader()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RemoveHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty):
          RemoveHeaderProperty = CdkObjectWrappers.wrap(cdkObject) as? RemoveHeaderProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoveHeaderProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeaderProperty
    }
  }

  /**
   * A list of HTTP response header names and their values.
   *
   * CloudFront includes these headers in HTTP responses that it sends for requests that match a
   * cache behavior that's associated with this response headers policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * CustomHeadersConfigProperty customHeadersConfigProperty = CustomHeadersConfigProperty.builder()
   * .items(List.of(CustomHeaderProperty.builder()
   * .header("header")
   * .override(false)
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheadersconfig.html)
   */
  public interface CustomHeadersConfigProperty {
    /**
     * The list of HTTP response headers and their values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheadersconfig.html#cfn-cloudfront-responseheaderspolicy-customheadersconfig-items)
     */
    public fun items(): Any

    /**
     * A builder for [CustomHeadersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The list of HTTP response headers and their values. 
       */
      public fun items(items: IResolvable)

      /**
       * @param items The list of HTTP response headers and their values. 
       */
      public fun items(items: List<Any>)

      /**
       * @param items The list of HTTP response headers and their values. 
       */
      public fun items(vararg items: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty.builder()

      /**
       * @param items The list of HTTP response headers and their values. 
       */
      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      /**
       * @param items The list of HTTP response headers and their values. 
       */
      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The list of HTTP response headers and their values. 
       */
      override fun items(vararg items: Any): Unit = items(items.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty,
    ) : CdkObject(cdkObject), CustomHeadersConfigProperty {
      /**
       * The list of HTTP response headers and their values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheadersconfig.html#cfn-cloudfront-responseheaderspolicy-customheadersconfig-items)
       */
      override fun items(): Any = unwrap(this).getItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty):
          CustomHeadersConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomHeadersConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty
    }
  }

  /**
   * A list of HTTP header names that CloudFront removes from HTTP responses to requests that match
   * the cache behavior that this response headers policy is attached to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * RemoveHeadersConfigProperty removeHeadersConfigProperty = RemoveHeadersConfigProperty.builder()
   * .items(List.of(RemoveHeaderProperty.builder()
   * .header("header")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheadersconfig.html)
   */
  public interface RemoveHeadersConfigProperty {
    /**
     * The list of HTTP header names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheadersconfig.html#cfn-cloudfront-responseheaderspolicy-removeheadersconfig-items)
     */
    public fun items(): Any

    /**
     * A builder for [RemoveHeadersConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The list of HTTP header names. 
       */
      public fun items(items: IResolvable)

      /**
       * @param items The list of HTTP header names. 
       */
      public fun items(items: List<Any>)

      /**
       * @param items The list of HTTP header names. 
       */
      public fun items(vararg items: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.builder()

      /**
       * @param items The list of HTTP header names. 
       */
      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      /**
       * @param items The list of HTTP header names. 
       */
      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The list of HTTP header names. 
       */
      override fun items(vararg items: Any): Unit = items(items.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty,
    ) : CdkObject(cdkObject), RemoveHeadersConfigProperty {
      /**
       * The list of HTTP header names.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheadersconfig.html#cfn-cloudfront-responseheaderspolicy-removeheadersconfig-items)
       */
      override fun items(): Any = unwrap(this).getItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RemoveHeadersConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty):
          RemoveHeadersConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RemoveHeadersConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoveHeadersConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.RemoveHeadersConfigProperty
    }
  }

  /**
   * The policy directives and their values that CloudFront includes as values for the
   * `Content-Security-Policy` HTTP response header.
   *
   * For more information about the `Content-Security-Policy` HTTP response header, see
   * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ContentSecurityPolicyProperty contentSecurityPolicyProperty =
   * ContentSecurityPolicyProperty.builder()
   * .contentSecurityPolicy("contentSecurityPolicy")
   * .override(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contentsecuritypolicy.html)
   */
  public interface ContentSecurityPolicyProperty {
    /**
     * The policy directives and their values that CloudFront includes as values for the
     * `Content-Security-Policy` HTTP response header.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contentsecuritypolicy.html#cfn-cloudfront-responseheaderspolicy-contentsecuritypolicy-contentsecuritypolicy)
     */
    public fun contentSecurityPolicy(): String

    /**
     * A Boolean that determines whether CloudFront overrides the `Content-Security-Policy` HTTP
     * response header received from the origin with the one specified in this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contentsecuritypolicy.html#cfn-cloudfront-responseheaderspolicy-contentsecuritypolicy-override)
     */
    public fun `override`(): Any

    /**
     * A builder for [ContentSecurityPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header. 
       */
      public fun contentSecurityPolicy(contentSecurityPolicy: String)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Content-Security-Policy` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      public fun `override`(`override`: Boolean)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Content-Security-Policy` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      public fun `override`(`override`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.builder()

      /**
       * @param contentSecurityPolicy The policy directives and their values that CloudFront
       * includes as values for the `Content-Security-Policy` HTTP response header. 
       */
      override fun contentSecurityPolicy(contentSecurityPolicy: String) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Content-Security-Policy` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `Content-Security-Policy` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty,
    ) : CdkObject(cdkObject), ContentSecurityPolicyProperty {
      /**
       * The policy directives and their values that CloudFront includes as values for the
       * `Content-Security-Policy` HTTP response header.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contentsecuritypolicy.html#cfn-cloudfront-responseheaderspolicy-contentsecuritypolicy-contentsecuritypolicy)
       */
      override fun contentSecurityPolicy(): String = unwrap(this).getContentSecurityPolicy()

      /**
       * A Boolean that determines whether CloudFront overrides the `Content-Security-Policy` HTTP
       * response header received from the origin with the one specified in this response headers
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contentsecuritypolicy.html#cfn-cloudfront-responseheaderspolicy-contentsecuritypolicy-override)
       */
      override fun `override`(): Any = unwrap(this).getOverride()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentSecurityPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty):
          ContentSecurityPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContentSecurityPolicyProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentSecurityPolicyProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty
    }
  }

  /**
   * A list of HTTP header names that CloudFront includes as values for the
   * `Access-Control-Allow-Headers` HTTP response header.
   *
   * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
   * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * AccessControlAllowHeadersProperty accessControlAllowHeadersProperty =
   * AccessControlAllowHeadersProperty.builder()
   * .items(List.of("items"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowheaders.html)
   */
  public interface AccessControlAllowHeadersProperty {
    /**
     * The list of HTTP header names.
     *
     * You can specify `*` to allow all headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowheaders.html#cfn-cloudfront-responseheaderspolicy-accesscontrolallowheaders-items)
     */
    public fun items(): List<String>

    /**
     * A builder for [AccessControlAllowHeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The list of HTTP header names. 
       * You can specify `*` to allow all headers.
       */
      public fun items(items: List<String>)

      /**
       * @param items The list of HTTP header names. 
       * You can specify `*` to allow all headers.
       */
      public fun items(vararg items: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty.builder()

      /**
       * @param items The list of HTTP header names. 
       * You can specify `*` to allow all headers.
       */
      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The list of HTTP header names. 
       * You can specify `*` to allow all headers.
       */
      override fun items(vararg items: String): Unit = items(items.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty,
    ) : CdkObject(cdkObject), AccessControlAllowHeadersProperty {
      /**
       * The list of HTTP header names.
       *
       * You can specify `*` to allow all headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowheaders.html#cfn-cloudfront-responseheaderspolicy-accesscontrolallowheaders-items)
       */
      override fun items(): List<String> = unwrap(this).getItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlAllowHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty):
          AccessControlAllowHeadersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessControlAllowHeadersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlAllowHeadersProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty
    }
  }

  /**
   * A list of HTTP headers that CloudFront includes as values for the
   * `Access-Control-Expose-Headers` HTTP response header.
   *
   * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
   * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * AccessControlExposeHeadersProperty accessControlExposeHeadersProperty =
   * AccessControlExposeHeadersProperty.builder()
   * .items(List.of("items"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolexposeheaders.html)
   */
  public interface AccessControlExposeHeadersProperty {
    /**
     * The list of HTTP headers.
     *
     * You can specify `*` to expose all headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolexposeheaders.html#cfn-cloudfront-responseheaderspolicy-accesscontrolexposeheaders-items)
     */
    public fun items(): List<String>

    /**
     * A builder for [AccessControlExposeHeadersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param items The list of HTTP headers. 
       * You can specify `*` to expose all headers.
       */
      public fun items(items: List<String>)

      /**
       * @param items The list of HTTP headers. 
       * You can specify `*` to expose all headers.
       */
      public fun items(vararg items: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.builder()

      /**
       * @param items The list of HTTP headers. 
       * You can specify `*` to expose all headers.
       */
      override fun items(items: List<String>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The list of HTTP headers. 
       * You can specify `*` to expose all headers.
       */
      override fun items(vararg items: String): Unit = items(items.toList())

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty,
    ) : CdkObject(cdkObject), AccessControlExposeHeadersProperty {
      /**
       * The list of HTTP headers.
       *
       * You can specify `*` to expose all headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolexposeheaders.html#cfn-cloudfront-responseheaderspolicy-accesscontrolexposeheaders-items)
       */
      override fun items(): List<String> = unwrap(this).getItems()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlExposeHeadersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty):
          AccessControlExposeHeadersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessControlExposeHeadersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlExposeHeadersProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty
    }
  }

  /**
   * Determines whether CloudFront includes the `X-XSS-Protection` HTTP response header and the
   * header's value.
   *
   * For more information about the `X-XSS-Protection` HTTP response header, see
   * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * XSSProtectionProperty xSSProtectionProperty = XSSProtectionProperty.builder()
   * .override(false)
   * .protection(false)
   * // the properties below are optional
   * .modeBlock(false)
   * .reportUri("reportUri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html)
   */
  public interface XSSProtectionProperty {
    /**
     * A Boolean that determines whether CloudFront includes the `mode=block` directive in the
     * `X-XSS-Protection` header.
     *
     * For more information about this directive, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-modeblock)
     */
    public fun modeBlock(): Any? = unwrap(this).getModeBlock()

    /**
     * A Boolean that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response
     * header received from the origin with the one specified in this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-override)
     */
    public fun `override`(): Any

    /**
     * A Boolean that determines the value of the `X-XSS-Protection` HTTP response header.
     *
     * When this setting is `true` , the value of the `X-XSS-Protection` header is `1` . When this
     * setting is `false` , the value of the `X-XSS-Protection` header is `0` .
     *
     * For more information about these settings, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-protection)
     */
    public fun protection(): Any

    /**
     * A reporting URI, which CloudFront uses as the value of the `report` directive in the
     * `X-XSS-Protection` header.
     *
     * You cannot specify a `ReportUri` when `ModeBlock` is `true` .
     *
     * For more information about using a reporting URL, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-reporturi)
     */
    public fun reportUri(): String? = unwrap(this).getReportUri()

    /**
     * A builder for [XSSProtectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param modeBlock A Boolean that determines whether CloudFront includes the `mode=block`
       * directive in the `X-XSS-Protection` header.
       * For more information about this directive, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      public fun modeBlock(modeBlock: Boolean)

      /**
       * @param modeBlock A Boolean that determines whether CloudFront includes the `mode=block`
       * directive in the `X-XSS-Protection` header.
       * For more information about this directive, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      public fun modeBlock(modeBlock: IResolvable)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-XSS-Protection` HTTP response header received from the origin with the one specified in
       * this response headers policy. 
       */
      public fun `override`(`override`: Boolean)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-XSS-Protection` HTTP response header received from the origin with the one specified in
       * this response headers policy. 
       */
      public fun `override`(`override`: IResolvable)

      /**
       * @param protection A Boolean that determines the value of the `X-XSS-Protection` HTTP
       * response header. 
       * When this setting is `true` , the value of the `X-XSS-Protection` header is `1` . When this
       * setting is `false` , the value of the `X-XSS-Protection` header is `0` .
       *
       * For more information about these settings, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      public fun protection(protection: Boolean)

      /**
       * @param protection A Boolean that determines the value of the `X-XSS-Protection` HTTP
       * response header. 
       * When this setting is `true` , the value of the `X-XSS-Protection` header is `1` . When this
       * setting is `false` , the value of the `X-XSS-Protection` header is `0` .
       *
       * For more information about these settings, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      public fun protection(protection: IResolvable)

      /**
       * @param reportUri A reporting URI, which CloudFront uses as the value of the `report`
       * directive in the `X-XSS-Protection` header.
       * You cannot specify a `ReportUri` when `ModeBlock` is `true` .
       *
       * For more information about using a reporting URL, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      public fun reportUri(reportUri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty.builder()

      /**
       * @param modeBlock A Boolean that determines whether CloudFront includes the `mode=block`
       * directive in the `X-XSS-Protection` header.
       * For more information about this directive, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      override fun modeBlock(modeBlock: Boolean) {
        cdkBuilder.modeBlock(modeBlock)
      }

      /**
       * @param modeBlock A Boolean that determines whether CloudFront includes the `mode=block`
       * directive in the `X-XSS-Protection` header.
       * For more information about this directive, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      override fun modeBlock(modeBlock: IResolvable) {
        cdkBuilder.modeBlock(modeBlock.let(IResolvable::unwrap))
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-XSS-Protection` HTTP response header received from the origin with the one specified in
       * this response headers policy. 
       */
      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-XSS-Protection` HTTP response header received from the origin with the one specified in
       * this response headers policy. 
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      /**
       * @param protection A Boolean that determines the value of the `X-XSS-Protection` HTTP
       * response header. 
       * When this setting is `true` , the value of the `X-XSS-Protection` header is `1` . When this
       * setting is `false` , the value of the `X-XSS-Protection` header is `0` .
       *
       * For more information about these settings, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      override fun protection(protection: Boolean) {
        cdkBuilder.protection(protection)
      }

      /**
       * @param protection A Boolean that determines the value of the `X-XSS-Protection` HTTP
       * response header. 
       * When this setting is `true` , the value of the `X-XSS-Protection` header is `1` . When this
       * setting is `false` , the value of the `X-XSS-Protection` header is `0` .
       *
       * For more information about these settings, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      override fun protection(protection: IResolvable) {
        cdkBuilder.protection(protection.let(IResolvable::unwrap))
      }

      /**
       * @param reportUri A reporting URI, which CloudFront uses as the value of the `report`
       * directive in the `X-XSS-Protection` header.
       * You cannot specify a `ReportUri` when `ModeBlock` is `true` .
       *
       * For more information about using a reporting URL, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       */
      override fun reportUri(reportUri: String) {
        cdkBuilder.reportUri(reportUri)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty,
    ) : CdkObject(cdkObject), XSSProtectionProperty {
      /**
       * A Boolean that determines whether CloudFront includes the `mode=block` directive in the
       * `X-XSS-Protection` header.
       *
       * For more information about this directive, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-modeblock)
       */
      override fun modeBlock(): Any? = unwrap(this).getModeBlock()

      /**
       * A Boolean that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response
       * header received from the origin with the one specified in this response headers policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-override)
       */
      override fun `override`(): Any = unwrap(this).getOverride()

      /**
       * A Boolean that determines the value of the `X-XSS-Protection` HTTP response header.
       *
       * When this setting is `true` , the value of the `X-XSS-Protection` header is `1` . When this
       * setting is `false` , the value of the `X-XSS-Protection` header is `0` .
       *
       * For more information about these settings, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-protection)
       */
      override fun protection(): Any = unwrap(this).getProtection()

      /**
       * A reporting URI, which CloudFront uses as the value of the `report` directive in the
       * `X-XSS-Protection` header.
       *
       * You cannot specify a `ReportUri` when `ModeBlock` is `true` .
       *
       * For more information about using a reporting URL, see
       * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
       * in the MDN Web Docs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html#cfn-cloudfront-responseheaderspolicy-xssprotection-reporturi)
       */
      override fun reportUri(): String? = unwrap(this).getReportUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): XSSProtectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty):
          XSSProtectionProperty = CdkObjectWrappers.wrap(cdkObject) as? XSSProtectionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: XSSProtectionProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty
    }
  }

  /**
   * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with
   * its value set to `nosniff` .
   *
   * For more information about the `X-Content-Type-Options` HTTP response header, see
   * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
   * in the MDN Web Docs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ContentTypeOptionsProperty contentTypeOptionsProperty = ContentTypeOptionsProperty.builder()
   * .override(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contenttypeoptions.html)
   */
  public interface ContentTypeOptionsProperty {
    /**
     * A Boolean that determines whether CloudFront overrides the `X-Content-Type-Options` HTTP
     * response header received from the origin with the one specified in this response headers policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contenttypeoptions.html#cfn-cloudfront-responseheaderspolicy-contenttypeoptions-override)
     */
    public fun `override`(): Any

    /**
     * A builder for [ContentTypeOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Content-Type-Options` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      public fun `override`(`override`: Boolean)

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Content-Type-Options` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      public fun `override`(`override`: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty.builder()

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Content-Type-Options` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      override fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
      }

      /**
       * @param override A Boolean that determines whether CloudFront overrides the
       * `X-Content-Type-Options` HTTP response header received from the origin with the one specified
       * in this response headers policy. 
       */
      override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty,
    ) : CdkObject(cdkObject), ContentTypeOptionsProperty {
      /**
       * A Boolean that determines whether CloudFront overrides the `X-Content-Type-Options` HTTP
       * response header received from the origin with the one specified in this response headers
       * policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contenttypeoptions.html#cfn-cloudfront-responseheaderspolicy-contenttypeoptions-override)
       */
      override fun `override`(): Any = unwrap(this).getOverride()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ContentTypeOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty):
          ContentTypeOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContentTypeOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentTypeOptionsProperty):
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty
    }
  }
}
