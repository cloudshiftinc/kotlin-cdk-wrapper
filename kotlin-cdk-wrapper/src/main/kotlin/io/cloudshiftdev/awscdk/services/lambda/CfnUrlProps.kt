@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnUrl`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CfnUrlProps cfnUrlProps = CfnUrlProps.builder()
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
public interface CfnUrlProps {
  /**
   * The type of authentication that your function URL uses.
   *
   * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
   * you want to bypass IAM authentication to create a public endpoint. For more information, see
   * [Security and auth model for Lambda function
   * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-authtype)
   */
  public fun authType(): String

  /**
   * The [Cross-Origin Resource Sharing
   * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
   * settings for your function URL.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
   */
  public fun cors(): Any? = unwrap(this).getCors()

  /**
   * Use one of the following options:.
   *
   * * `BUFFERED` – This is the default option. Lambda invokes your function using the `Invoke` API
   * operation. Invocation results are available when the payload is complete. The maximum payload size
   * is 6 MB.
   * * `RESPONSE_STREAM` – Your function streams payload results as they become available. Lambda
   * invokes your function using the `InvokeWithResponseStream` API operation. The maximum response
   * payload size is 20 MB, however, you can [request a quota
   * increase](https://docs.aws.amazon.com/servicequotas/latest/userguide/request-quota-increase.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-invokemode)
   */
  public fun invokeMode(): String? = unwrap(this).getInvokeMode()

  /**
   * The alias name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-qualifier)
   */
  public fun qualifier(): String? = unwrap(this).getQualifier()

  /**
   * The name of the Lambda function.
   *
   * **Name formats** - *Function name* - `my-function` .
   *
   * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
   * * *Partial ARN* - `123456789012:function:my-function` .
   *
   * The length constraint applies only to the full ARN. If you specify only the function name, it
   * is limited to 64 characters in length.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-targetfunctionarn)
   */
  public fun targetFunctionArn(): String

  /**
   * A builder for [CfnUrlProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authType The type of authentication that your function URL uses. 
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     */
    public fun authType(authType: String)

    /**
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     */
    public fun cors(cors: IResolvable)

    /**
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     */
    public fun cors(cors: CfnUrl.CorsProperty)

    /**
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3593d16b618ac085cb40e18d89350f3fbaf5cba06fe707494e4cfc28151e21f7")
    public fun cors(cors: CfnUrl.CorsProperty.Builder.() -> Unit)

    /**
     * @param invokeMode Use one of the following options:.
     * * `BUFFERED` – This is the default option. Lambda invokes your function using the `Invoke`
     * API operation. Invocation results are available when the payload is complete. The maximum
     * payload size is 6 MB.
     * * `RESPONSE_STREAM` – Your function streams payload results as they become available. Lambda
     * invokes your function using the `InvokeWithResponseStream` API operation. The maximum response
     * payload size is 20 MB, however, you can [request a quota
     * increase](https://docs.aws.amazon.com/servicequotas/latest/userguide/request-quota-increase.html)
     * .
     */
    public fun invokeMode(invokeMode: String)

    /**
     * @param qualifier The alias name.
     */
    public fun qualifier(qualifier: String)

    /**
     * @param targetFunctionArn The name of the Lambda function. 
     * **Name formats** - *Function name* - `my-function` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* - `123456789012:function:my-function` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    public fun targetFunctionArn(targetFunctionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnUrlProps.Builder =
        software.amazon.awscdk.services.lambda.CfnUrlProps.builder()

    /**
     * @param authType The type of authentication that your function URL uses. 
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     */
    override fun cors(cors: IResolvable) {
      cdkBuilder.cors(cors.let(IResolvable::unwrap))
    }

    /**
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     */
    override fun cors(cors: CfnUrl.CorsProperty) {
      cdkBuilder.cors(cors.let(CfnUrl.CorsProperty::unwrap))
    }

    /**
     * @param cors The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3593d16b618ac085cb40e18d89350f3fbaf5cba06fe707494e4cfc28151e21f7")
    override fun cors(cors: CfnUrl.CorsProperty.Builder.() -> Unit): Unit =
        cors(CfnUrl.CorsProperty(cors))

    /**
     * @param invokeMode Use one of the following options:.
     * * `BUFFERED` – This is the default option. Lambda invokes your function using the `Invoke`
     * API operation. Invocation results are available when the payload is complete. The maximum
     * payload size is 6 MB.
     * * `RESPONSE_STREAM` – Your function streams payload results as they become available. Lambda
     * invokes your function using the `InvokeWithResponseStream` API operation. The maximum response
     * payload size is 20 MB, however, you can [request a quota
     * increase](https://docs.aws.amazon.com/servicequotas/latest/userguide/request-quota-increase.html)
     * .
     */
    override fun invokeMode(invokeMode: String) {
      cdkBuilder.invokeMode(invokeMode)
    }

    /**
     * @param qualifier The alias name.
     */
    override fun qualifier(qualifier: String) {
      cdkBuilder.qualifier(qualifier)
    }

    /**
     * @param targetFunctionArn The name of the Lambda function. 
     * **Name formats** - *Function name* - `my-function` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* - `123456789012:function:my-function` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     */
    override fun targetFunctionArn(targetFunctionArn: String) {
      cdkBuilder.targetFunctionArn(targetFunctionArn)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnUrlProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnUrlProps,
  ) : CdkObject(cdkObject), CfnUrlProps {
    /**
     * The type of authentication that your function URL uses.
     *
     * Set to `AWS_IAM` if you want to restrict access to authenticated users only. Set to `NONE` if
     * you want to bypass IAM authentication to create a public endpoint. For more information, see
     * [Security and auth model for Lambda function
     * URLs](https://docs.aws.amazon.com/lambda/latest/dg/urls-auth.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-authtype)
     */
    override fun authType(): String = unwrap(this).getAuthType()

    /**
     * The [Cross-Origin Resource Sharing
     * (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * settings for your function URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-cors)
     */
    override fun cors(): Any? = unwrap(this).getCors()

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
     */
    override fun invokeMode(): String? = unwrap(this).getInvokeMode()

    /**
     * The alias name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-qualifier)
     */
    override fun qualifier(): String? = unwrap(this).getQualifier()

    /**
     * The name of the Lambda function.
     *
     * **Name formats** - *Function name* - `my-function` .
     *
     * * *Function ARN* - `arn:aws:lambda:us-west-2:123456789012:function:my-function` .
     * * *Partial ARN* - `123456789012:function:my-function` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name, it
     * is limited to 64 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-url.html#cfn-lambda-url-targetfunctionarn)
     */
    override fun targetFunctionArn(): String = unwrap(this).getTargetFunctionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUrlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnUrlProps): CfnUrlProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUrlProps): software.amazon.awscdk.services.lambda.CfnUrlProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnUrlProps
  }
}
