@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnGraphQLApi

@CdkDslMarker
public class CfnGraphQLApiLambdaAuthorizerConfigPropertyDsl {
  private val cdkBuilder: CfnGraphQLApi.LambdaAuthorizerConfigProperty.Builder =
      CfnGraphQLApi.LambdaAuthorizerConfigProperty.builder()

  /**
   * @param authorizerResultTtlInSeconds The number of seconds a response should be cached for.
   * The default is 0 seconds, which disables caching. If you don't specify a value for
   * `authorizerResultTtlInSeconds` , the default value is used. The maximum value is one hour (3600
   * seconds). The Lambda function can override this by returning a `ttlOverride` key in its response.
   */
  public fun authorizerResultTtlInSeconds(authorizerResultTtlInSeconds: Number) {
    cdkBuilder.authorizerResultTtlInSeconds(authorizerResultTtlInSeconds)
  }

  /**
   * @param authorizerUri The ARN of the Lambda function to be called for authorization.
   * This may be a standard Lambda ARN, a version ARN ( `.../v3` ) or alias ARN.
   *
   * *Note* : This Lambda function must have the following resource-based policy assigned to it.
   * When configuring Lambda authorizers in the console, this is done for you. To do so with the AWS
   * CLI , run the following:
   *
   * `aws lambda add-permission --function-name
   * "arn:aws:lambda:us-east-2:111122223333:function:my-function" --statement-id "appsync" --principal
   * appsync.amazonaws.com --action lambda:InvokeFunction`
   */
  public fun authorizerUri(authorizerUri: String) {
    cdkBuilder.authorizerUri(authorizerUri)
  }

  /**
   * @param identityValidationExpression A regular expression for validation of tokens before the
   * Lambda function is called.
   */
  public fun identityValidationExpression(identityValidationExpression: String) {
    cdkBuilder.identityValidationExpression(identityValidationExpression)
  }

  public fun build(): CfnGraphQLApi.LambdaAuthorizerConfigProperty = cdkBuilder.build()
}
