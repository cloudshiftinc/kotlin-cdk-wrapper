@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

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
 * The `AWS::Lambda::Url` resource creates a function URL with the specified configuration
 * parameters.
 *
 * A [function URL](https://docs.aws.amazon.com/lambda/latest/dg/lambda-urls.html) is a dedicated
 * HTTP(S) endpoint that you can use to invoke your function.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnUrl cfnUrl = CfnUrl.Builder.create(this, "MyCfnUrl")
 * .authType("authType")
 * .targetFunctionArn("targetFunctionArn")
 * // the properties below are optional
 * .cors(CorsProperty.builder()
 * .allowCredentials(false)
 * .allowHeaders(List.of("allowHeaders"))
 * .allowMethods(List.of("allowMethods"))
 * .allowOrigins(List.of("allowOrigins"))
 * .exposeHeaders(List.of("exposeHeaders"))
 * .maxAge(123)
 * .build())
 * .invokeMode("invokeMode")
 * .qualifier("qualifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html)
 */
public open class CfnUrl(
  cdkObject: software.amazon.awscdk.services.lambda.CfnUrl,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUrlProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CfnUrl(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnUrlProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUrlProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUrlProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the function.
   */
  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  /**
   * The HTTP URL endpoint for your function.
   */
  public open fun attrFunctionUrl(): String = unwrap(this).getAttrFunctionUrl()

  /**
   * The type of authentication that your function URL uses.
   */
  public open fun authType(): String = unwrap(this).getAuthType()

  /**
   * The type of authentication that your function URL uses.
   */
  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
  }

  /**
   * The [Cross-Origin Resource Sharing
   * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * settings for your function URL.
   */
  public open fun cors(): Any? = unwrap(this).getCors()

  /**
   * The [Cross-Origin Resource Sharing
   * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * settings for your function URL.
   */
  public open fun cors(`value`: IResolvable) {
    unwrap(this).setCors(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The [Cross-Origin Resource Sharing
   * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * settings for your function URL.
   */
  public open fun cors(`value`: CorsProperty) {
    unwrap(this).setCors(`value`.let(CorsProperty.Companion::unwrap))
  }

  /**
   * The [Cross-Origin Resource Sharing
   * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * settings for your function URL.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f0d7ee6657ffecedf3b3276313ad4d8dec6e9c6d79513633cdbe241acb21866")
  public open fun cors(`value`: CorsProperty.Builder.() -> Unit): Unit = cors(CorsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Use one of the following options:.
   */
  public open fun invokeMode(): String? = unwrap(this).getInvokeMode()

  /**
   * Use one of the following options:.
   */
  public open fun invokeMode(`value`: String) {
    unwrap(this).setInvokeMode(`value`)
  }

  /**
   * The alias name.
   */
  public open fun qualifier(): String? = unwrap(this).getQualifier()

  /**
   * The alias name.
   */
  public open fun qualifier(`value`: String) {
    unwrap(this).setQualifier(`value`)
  }

  /**
   * The name of the Lambda function.
   */
  public open fun targetFunctionArn(): String = unwrap(this).getTargetFunctionArn()

  /**
   * The name of the Lambda function.
   */
  public open fun targetFunctionArn(`value`: String) {
    unwrap(this).setTargetFunctionArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnUrl].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of authentication that your function URL uses.
     *
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-authtype)
     * @param authType The type of authentication that your function URL uses. 
     */
    public fun authType(authType: String)

    /**
     * The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL. 
     */
    public fun cors(cors: IResolvable)

    /**
     * The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL. 
     */
    public fun cors(cors: CorsProperty)

    /**
     * The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb00e11b11a16df477e0773c2b9462c72137d14c0e7628a27c63bbe1cbe0c1a")
    public fun cors(cors: CorsProperty.Builder.() -> Unit)

    /**
     * Use one of the following options:.
     *
     * * `BUFFERED` – This is the default option. Lambda invokes your function using the `Invoke`
     * API operation. Invocation results are available when the payload is complete. The maximum
     * payload size is 6 MB.
     * * `RESPONSE_STREAM` – Your function streams payload results as they become available. Lambda
     * invokes your function using the `InvokeWithResponseStream` API operation. The maximum response
     * payload size is 20 MB, however, you can [request a quota
     * increase](https://docs.aws.amazon.com/servicequotas/latest/userguide/request-quota-increase.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-invokemode)
     * @param invokeMode Use one of the following options:. 
     */
    public fun invokeMode(invokeMode: String)

    /**
     * The alias name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-qualifier)
     * @param qualifier The alias name. 
     */
    public fun qualifier(qualifier: String)

    /**
     * The name of the Lambda function.
     *
     * **Name formats** - *Function name* - `my-function` .
     *
     * * *Function ARN* - `lambda:  :  :function:my-function` .
     * * *Partial ARN* - `:function:my-function` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-targetfunctionarn)
     * @param targetFunctionArn The name of the Lambda function. 
     */
    public fun targetFunctionArn(targetFunctionArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnUrl.Builder =
        software.amazon.awscdk.services.lambda.CfnUrl.Builder.create(scope, id)

    /**
     * The type of authentication that your function URL uses.
     *
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-authtype)
     * @param authType The type of authentication that your function URL uses. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL. 
     */
    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable.Companion::unwrap))
    }

    /**
     * The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL. 
     */
    override fun cors(cors: CorsProperty) {
      cdkBuilder.cors(cors.let(CorsProperty.Companion::unwrap))
    }

    /**
     * The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cb00e11b11a16df477e0773c2b9462c72137d14c0e7628a27c63bbe1cbe0c1a")
    override fun cors(cors: CorsProperty.Builder.() -> Unit): Unit = cors(CorsProperty(cors))

    /**
     * Use one of the following options:.
     *
     * * `BUFFERED` – This is the default option. Lambda invokes your function using the `Invoke`
     * API operation. Invocation results are available when the payload is complete. The maximum
     * payload size is 6 MB.
     * * `RESPONSE_STREAM` – Your function streams payload results as they become available. Lambda
     * invokes your function using the `InvokeWithResponseStream` API operation. The maximum response
     * payload size is 20 MB, however, you can [request a quota
     * increase](https://docs.aws.amazon.com/servicequotas/latest/userguide/request-quota-increase.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-invokemode)
     * @param invokeMode Use one of the following options:. 
     */
    override fun invokeMode(invokeMode: String) {
      cdkBuilder.invokeMode(invokeMode)
    }

    /**
     * The alias name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-qualifier)
     * @param qualifier The alias name. 
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    /**
     * The name of the Lambda function.
     *
     * **Name formats** - *Function name* - `my-function` .
     *
     * * *Function ARN* - `lambda:  :  :function:my-function` .
     * * *Partial ARN* - `:function:my-function` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-targetfunctionarn)
     * @param targetFunctionArn The name of the Lambda function. 
     */
    override fun targetFunctionArn(targetFunctionArn: String) {
      cdkBuilder.targetFunctionArn(targetFunctionArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnUrl = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnUrl.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUrl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUrl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnUrl): CfnUrl =
        CfnUrl(cdkObject)

    internal fun unwrap(wrapped: CfnUrl): software.amazon.awscdk.services.lambda.CfnUrl =
        wrapped.cdkObject as software.amazon.awscdk.services.lambda.CfnUrl
  }

  /**
   * The [Cross-Origin Resource Sharing
   * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * settings for your function URL. Use CORS to grant access to your function URL from any origin. You
   * can also use CORS to control access for specific HTTP headers and methods in requests to your
   * function URL.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * CorsProperty corsProperty = CorsProperty.builder()
   * .allowCredentials(false)
   * .allowHeaders(List.of("allowHeaders"))
   * .allowMethods(List.of("allowMethods"))
   * .allowOrigins(List.of("allowOrigins"))
   * .exposeHeaders(List.of("exposeHeaders"))
   * .maxAge(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html)
   */
  public interface CorsProperty {
    /**
     * Whether you want to allow cookies or other credentials in requests to your function URL.
     *
     * The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-allowcredentials)
     */
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    /**
     * The HTTP headers that origins can include in requests to your function URL.
     *
     * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-allowheaders)
     */
    public fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

    /**
     * The HTTP methods that are allowed when calling your function URL.
     *
     * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-allowmethods)
     */
    public fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

    /**
     * The origins that can access your function URL.
     *
     * You can list any number of specific origins, separated by a comma. For example:
     * `https://www.example.com` , `http://localhost:60905` .
     *
     * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-alloworigins)
     */
    public fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

    /**
     * The HTTP headers in your function response that you want to expose to origins that call your
     * function URL.
     *
     * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-exposeheaders)
     */
    public fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

    /**
     * The maximum amount of time, in seconds, that browsers can cache results of a preflight
     * request.
     *
     * By default, this is set to `0` , which means the browser will not cache results.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-maxage)
     */
    public fun maxAge(): Number? = unwrap(this).getMaxAge()

    /**
     * A builder for [CorsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowCredentials Whether you want to allow cookies or other credentials in requests
       * to your function URL.
       * The default is `false` .
       */
      public fun allowCredentials(allowCredentials: Boolean)

      /**
       * @param allowCredentials Whether you want to allow cookies or other credentials in requests
       * to your function URL.
       * The default is `false` .
       */
      public fun allowCredentials(allowCredentials: IResolvable)

      /**
       * @param allowHeaders The HTTP headers that origins can include in requests to your function
       * URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      public fun allowHeaders(allowHeaders: List<String>)

      /**
       * @param allowHeaders The HTTP headers that origins can include in requests to your function
       * URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      public fun allowHeaders(vararg allowHeaders: String)

      /**
       * @param allowMethods The HTTP methods that are allowed when calling your function URL.
       * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
       */
      public fun allowMethods(allowMethods: List<String>)

      /**
       * @param allowMethods The HTTP methods that are allowed when calling your function URL.
       * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
       */
      public fun allowMethods(vararg allowMethods: String)

      /**
       * @param allowOrigins The origins that can access your function URL.
       * You can list any number of specific origins, separated by a comma. For example:
       * `https://www.example.com` , `http://localhost:60905` .
       *
       * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
       */
      public fun allowOrigins(allowOrigins: List<String>)

      /**
       * @param allowOrigins The origins that can access your function URL.
       * You can list any number of specific origins, separated by a comma. For example:
       * `https://www.example.com` , `http://localhost:60905` .
       *
       * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
       */
      public fun allowOrigins(vararg allowOrigins: String)

      /**
       * @param exposeHeaders The HTTP headers in your function response that you want to expose to
       * origins that call your function URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      public fun exposeHeaders(exposeHeaders: List<String>)

      /**
       * @param exposeHeaders The HTTP headers in your function response that you want to expose to
       * origins that call your function URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      public fun exposeHeaders(vararg exposeHeaders: String)

      /**
       * @param maxAge The maximum amount of time, in seconds, that browsers can cache results of a
       * preflight request.
       * By default, this is set to `0` , which means the browser will not cache results.
       */
      public fun maxAge(maxAge: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty.builder()

      /**
       * @param allowCredentials Whether you want to allow cookies or other credentials in requests
       * to your function URL.
       * The default is `false` .
       */
      override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      /**
       * @param allowCredentials Whether you want to allow cookies or other credentials in requests
       * to your function URL.
       * The default is `false` .
       */
      override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param allowHeaders The HTTP headers that origins can include in requests to your function
       * URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      override fun allowHeaders(allowHeaders: List<String>) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      /**
       * @param allowHeaders The HTTP headers that origins can include in requests to your function
       * URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      override fun allowHeaders(vararg allowHeaders: String): Unit =
          allowHeaders(allowHeaders.toList())

      /**
       * @param allowMethods The HTTP methods that are allowed when calling your function URL.
       * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
       */
      override fun allowMethods(allowMethods: List<String>) {
        cdkBuilder.allowMethods(allowMethods)
      }

      /**
       * @param allowMethods The HTTP methods that are allowed when calling your function URL.
       * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
       */
      override fun allowMethods(vararg allowMethods: String): Unit =
          allowMethods(allowMethods.toList())

      /**
       * @param allowOrigins The origins that can access your function URL.
       * You can list any number of specific origins, separated by a comma. For example:
       * `https://www.example.com` , `http://localhost:60905` .
       *
       * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
       */
      override fun allowOrigins(allowOrigins: List<String>) {
        cdkBuilder.allowOrigins(allowOrigins)
      }

      /**
       * @param allowOrigins The origins that can access your function URL.
       * You can list any number of specific origins, separated by a comma. For example:
       * `https://www.example.com` , `http://localhost:60905` .
       *
       * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
       */
      override fun allowOrigins(vararg allowOrigins: String): Unit =
          allowOrigins(allowOrigins.toList())

      /**
       * @param exposeHeaders The HTTP headers in your function response that you want to expose to
       * origins that call your function URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      override fun exposeHeaders(exposeHeaders: List<String>) {
        cdkBuilder.exposeHeaders(exposeHeaders)
      }

      /**
       * @param exposeHeaders The HTTP headers in your function response that you want to expose to
       * origins that call your function URL.
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       */
      override fun exposeHeaders(vararg exposeHeaders: String): Unit =
          exposeHeaders(exposeHeaders.toList())

      /**
       * @param maxAge The maximum amount of time, in seconds, that browsers can cache results of a
       * preflight request.
       * By default, this is set to `0` , which means the browser will not cache results.
       */
      override fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty,
    ) : CdkObject(cdkObject),
        CorsProperty {
      /**
       * Whether you want to allow cookies or other credentials in requests to your function URL.
       *
       * The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-allowcredentials)
       */
      override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      /**
       * The HTTP headers that origins can include in requests to your function URL.
       *
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-allowheaders)
       */
      override fun allowHeaders(): List<String> = unwrap(this).getAllowHeaders() ?: emptyList()

      /**
       * The HTTP methods that are allowed when calling your function URL.
       *
       * For example: `GET` , `POST` , `DELETE` , or the wildcard character ( `*` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-allowmethods)
       */
      override fun allowMethods(): List<String> = unwrap(this).getAllowMethods() ?: emptyList()

      /**
       * The origins that can access your function URL.
       *
       * You can list any number of specific origins, separated by a comma. For example:
       * `https://www.example.com` , `http://localhost:60905` .
       *
       * Alternatively, you can grant access to all origins with the wildcard character ( `*` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-alloworigins)
       */
      override fun allowOrigins(): List<String> = unwrap(this).getAllowOrigins() ?: emptyList()

      /**
       * The HTTP headers in your function response that you want to expose to origins that call
       * your function URL.
       *
       * For example: `Date` , `Keep-Alive` , `X-Custom-Header` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-exposeheaders)
       */
      override fun exposeHeaders(): List<String> = unwrap(this).getExposeHeaders() ?: emptyList()

      /**
       * The maximum amount of time, in seconds, that browsers can cache results of a preflight
       * request.
       *
       * By default, this is set to `0` , which means the browser will not cache results.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-url-cors.html#cfn-lambda-url-cors-maxage)
       */
      override fun maxAge(): Number? = unwrap(this).getMaxAge()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CorsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty):
          CorsProperty = CdkObjectWrappers.wrap(cdkObject) as? CorsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsProperty):
          software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnUrl.CorsProperty
    }
  }
}
