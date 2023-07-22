@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.RequestAuthorizer
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct

@CdkDslMarker
public class RequestAuthorizerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: RequestAuthorizer.Builder = RequestAuthorizer.Builder.create(scope, id)

  private val _identitySources: MutableList<String> = mutableListOf()

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
   * An array of request header mapping expressions for identities.
   *
   * Supported parameter types are
   * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
   * token from a header would use the identity source `IdentitySource.header('Authorizer')`.
   *
   * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
   * When caching is
   * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
   * that all the
   * specified identity sources are present at runtime. If a specified identify source is missing,
   * null, or empty,
   * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda function.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/link-relation/authorizer-create/#identitySource)
   * @param identitySources An array of request header mapping expressions for identities. 
   */
  public fun identitySources(vararg identitySources: String) {
    _identitySources.addAll(listOf(*identitySources))
  }

  /**
   * An array of request header mapping expressions for identities.
   *
   * Supported parameter types are
   * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
   * token from a header would use the identity source `IdentitySource.header('Authorizer')`.
   *
   * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
   * When caching is
   * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
   * that all the
   * specified identity sources are present at runtime. If a specified identify source is missing,
   * null, or empty,
   * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda function.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/link-relation/authorizer-create/#identitySource)
   * @param identitySources An array of request header mapping expressions for identities. 
   */
  public fun identitySources(identitySources: Collection<String>) {
    _identitySources.addAll(identitySources)
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

  public fun build(): RequestAuthorizer {
    if(_identitySources.isNotEmpty()) cdkBuilder.identitySources(_identitySources)
    return cdkBuilder.build()
  }
}
