@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Configuration for Lambda authorization in AppSync.
 *
 * Note that you can only have a single AWS Lambda function configured to authorize your API.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function authFunction;
 * GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .schema(SchemaFile.fromAsset(join(__dirname, "appsync.test.graphql")))
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
@CdkDslMarker
public class LambdaAuthorizerConfigDsl {
  private val cdkBuilder: LambdaAuthorizerConfig.Builder = LambdaAuthorizerConfig.builder()

  /**
   * @param handler The authorizer lambda function. 
   */
  public fun handler(handler: IFunction) {
    cdkBuilder.handler(handler)
  }

  /**
   * @param resultsCacheTtl How long the results are cached.
   * Disable caching by setting this to 0.
   */
  public fun resultsCacheTtl(resultsCacheTtl: Duration) {
    cdkBuilder.resultsCacheTtl(resultsCacheTtl)
  }

  /**
   * @param validationRegex A regular expression for validation of tokens before the Lambda function
   * is called.
   */
  public fun validationRegex(validationRegex: String) {
    cdkBuilder.validationRegex(validationRegex)
  }

  public fun build(): LambdaAuthorizerConfig = cdkBuilder.build()
}
