@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit

/**
 * Configuration for Lambda authorization in AppSync.
 *
 * Note that you can only have a single AWS Lambda function configured to authorize your API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function authFunction;
 * GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .definition(Definition.fromFile(join(__dirname, "appsync.test.graphql")))
 * .authorizationConfig(AuthorizationConfig.builder()
 * .defaultAuthorization(AuthorizationMode.builder()
 * .authorizationType(AuthorizationType.LAMBDA)
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfig.builder()
 * .handler(authFunction)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface LambdaAuthorizerConfig {
  /**
   * The authorizer lambda function.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html)
   */
  public fun handler(): IFunction

  /**
   * How long the results are cached.
   *
   * Disable caching by setting this to 0.
   *
   * Default: Duration.minutes(5)
   */
  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  /**
   * A regular expression for validation of tokens before the Lambda function is called.
   *
   * Default: - no regex filter will be applied.
   */
  public fun validationRegex(): String? = unwrap(this).getValidationRegex()

  /**
   * A builder for [LambdaAuthorizerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param handler The authorizer lambda function. 
     */
    public fun handler(handler: IFunction)

    /**
     * @param resultsCacheTtl How long the results are cached.
     * Disable caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    /**
     * @param validationRegex A regular expression for validation of tokens before the Lambda
     * function is called.
     */
    public fun validationRegex(validationRegex: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig.Builder =
        software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig.builder()

    /**
     * @param handler The authorizer lambda function. 
     */
    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction.Companion::unwrap))
    }

    /**
     * @param resultsCacheTtl How long the results are cached.
     * Disable caching by setting this to 0.
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param validationRegex A regular expression for validation of tokens before the Lambda
     * function is called.
     */
    override fun validationRegex(validationRegex: String) {
      cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig,
  ) : CdkObject(cdkObject),
      LambdaAuthorizerConfig {
    /**
     * The authorizer lambda function.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-lambdaauthorizerconfig.html)
     */
    override fun handler(): IFunction = unwrap(this).getHandler().let(IFunction::wrap)

    /**
     * How long the results are cached.
     *
     * Disable caching by setting this to 0.
     *
     * Default: Duration.minutes(5)
     */
    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

    /**
     * A regular expression for validation of tokens before the Lambda function is called.
     *
     * Default: - no regex filter will be applied.
     */
    override fun validationRegex(): String? = unwrap(this).getValidationRegex()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaAuthorizerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig):
        LambdaAuthorizerConfig = CdkObjectWrappers.wrap(cdkObject) as? LambdaAuthorizerConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaAuthorizerConfig):
        software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig
  }
}
