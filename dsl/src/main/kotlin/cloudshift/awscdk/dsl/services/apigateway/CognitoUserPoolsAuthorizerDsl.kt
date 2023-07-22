@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizer
import software.amazon.awscdk.services.cognito.IUserPool
import software.constructs.Construct

@CdkDslMarker
public class CognitoUserPoolsAuthorizerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CognitoUserPoolsAuthorizer.Builder =
      CognitoUserPoolsAuthorizer.Builder.create(scope, id)

  private val _cognitoUserPools: MutableList<IUserPool> = mutableListOf()

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
   * The user pools to associate with this authorizer.
   *
   * @param cognitoUserPools The user pools to associate with this authorizer. 
   */
  public fun cognitoUserPools(vararg cognitoUserPools: IUserPool) {
    _cognitoUserPools.addAll(listOf(*cognitoUserPools))
  }

  /**
   * The user pools to associate with this authorizer.
   *
   * @param cognitoUserPools The user pools to associate with this authorizer. 
   */
  public fun cognitoUserPools(cognitoUserPools: Collection<IUserPool>) {
    _cognitoUserPools.addAll(cognitoUserPools)
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

  public fun build(): CognitoUserPoolsAuthorizer {
    if(_cognitoUserPools.isNotEmpty()) cdkBuilder.cognitoUserPools(_cognitoUserPools)
    return cdkBuilder.build()
  }
}
