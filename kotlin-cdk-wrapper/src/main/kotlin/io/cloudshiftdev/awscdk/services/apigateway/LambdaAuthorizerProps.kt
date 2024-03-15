@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit

/**
 * Base properties for all lambda authorizers.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function function_;
 * Role role;
 * LambdaAuthorizerProps lambdaAuthorizerProps = LambdaAuthorizerProps.builder()
 * .handler(function_)
 * // the properties below are optional
 * .assumeRole(role)
 * .authorizerName("authorizerName")
 * .resultsCacheTtl(Duration.minutes(30))
 * .build();
 * ```
 */
public interface LambdaAuthorizerProps {
  /**
   * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
   *
   * The IAM role must be
   * assumable by 'apigateway.amazonaws.com'.
   *
   * Default: - A resource policy is added to the Lambda function allowing apigateway.amazonaws.com
   * to invoke the function.
   */
  public fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

  /**
   * An optional human friendly name for the authorizer.
   *
   * Note that, this is not the primary identifier of the authorizer.
   *
   * Default: - the unique construct ID
   */
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * The handler for the authorizer lambda function.
   *
   * The handler must follow a very specific protocol on the input it receives
   * and the output it needs to produce.  API Gateway has documented the
   * handler's [input
   * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
   * and [output
   * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
   */
  public fun handler(): IFunction

  /**
   * How long APIGateway should cache the results.
   *
   * Max 1 hour.
   * Disable caching by setting this to 0.
   *
   * Default: - Duration.minutes(5)
   */
  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  /**
   * A builder for [LambdaAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     * Lambda-based authorizer.
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     */
    public fun assumeRole(assumeRole: IRole)

    /**
     * @param authorizerName An optional human friendly name for the authorizer.
     * Note that, this is not the primary identifier of the authorizer.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param handler The handler for the authorizer lambda function. 
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    public fun handler(handler: IFunction)

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps.Builder
        = software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps.builder()

    /**
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     * Lambda-based authorizer.
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     */
    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    /**
     * @param authorizerName An optional human friendly name for the authorizer.
     * Note that, this is not the primary identifier of the authorizer.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param handler The handler for the authorizer lambda function. 
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps,
  ) : CdkObject(cdkObject), LambdaAuthorizerProps {
    /**
     * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
     *
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     *
     * Default: - A resource policy is added to the Lambda function allowing
     * apigateway.amazonaws.com to invoke the function.
     */
    override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    /**
     * An optional human friendly name for the authorizer.
     *
     * Note that, this is not the primary identifier of the authorizer.
     *
     * Default: - the unique construct ID
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * The handler for the authorizer lambda function.
     *
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    override fun handler(): IFunction = unwrap(this).getHandler().let(IFunction::wrap)

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to 0.
     *
     * Default: - Duration.minutes(5)
     */
    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps):
        LambdaAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaAuthorizerProps):
        software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps
  }
}
