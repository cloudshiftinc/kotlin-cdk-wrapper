@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig
import software.amazon.awscdk.services.lambda.IFunction

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
