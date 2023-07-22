@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.TokenAuthorizer
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct

@CdkDslMarker
public class TokenAuthorizerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: TokenAuthorizer.Builder = TokenAuthorizer.Builder.create(scope, id)

  /**
   * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
   *
   * The IAM role must be
   * assumable by 'apigateway.amazonaws.com'.
   *
   * Default: - A resource policy is added to the Lambda function allowing apigateway.amazonaws.com
   * to invoke the function.
   *
   * @param assumeRole An optional IAM role for APIGateway to assume before calling the Lambda-based
   * authorizer. 
   */
  public fun assumeRole(assumeRole: IRole) {
    cdkBuilder.assumeRole(assumeRole)
  }

  /**
   * An optional human friendly name for the authorizer.
   *
   * Note that, this is not the primary identifier of the authorizer.
   *
   * Default: - the unique construct ID
   *
   * @param authorizerName An optional human friendly name for the authorizer. 
   */
  public fun authorizerName(authorizerName: String) {
    cdkBuilder.authorizerName(authorizerName)
  }

  /**
   * The handler for the authorizer lambda function.
   *
   * The handler must follow a very specific protocol on the input it receives
   * and the output it needs to produce.  API Gateway has documented the
   * handler's [input
   * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
   * and [output
   * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
   *
   * @param handler The handler for the authorizer lambda function. 
   */
  public fun handler(handler: IFunction) {
    cdkBuilder.handler(handler)
  }

  /**
   * The request header mapping expression for the bearer token.
   *
   * This is typically passed as part of the header, in which case
   * this should be `method.request.header.Authorizer` where Authorizer is the header containing the
   * bearer token.
   *
   * Default: `IdentitySource.header('Authorization')`
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/link-relation/authorizer-create/#identitySource)
   * @param identitySource The request header mapping expression for the bearer token. 
   */
  public fun identitySource(identitySource: String) {
    cdkBuilder.identitySource(identitySource)
  }

  /**
   * How long APIGateway should cache the results.
   *
   * Max 1 hour.
   * Disable caching by setting this to 0.
   *
   * Default: Duration.minutes(5)
   *
   * @param resultsCacheTtl How long APIGateway should cache the results. 
   */
  public fun resultsCacheTtl(resultsCacheTtl: Duration) {
    cdkBuilder.resultsCacheTtl(resultsCacheTtl)
  }

  /**
   * An optional regex to be matched against the authorization token.
   *
   * When matched the authorizer lambda is invoked,
   * otherwise a 401 Unauthorized is returned to the client.
   *
   * Default: - no regex filter will be applied.
   *
   * @param validationRegex An optional regex to be matched against the authorization token. 
   */
  public fun validationRegex(validationRegex: String) {
    cdkBuilder.validationRegex(validationRegex)
  }

  public fun build(): TokenAuthorizer = cdkBuilder.build()
}
