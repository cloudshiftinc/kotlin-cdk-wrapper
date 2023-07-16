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

  public fun authorizerName(authorizerName: String) {
    cdkBuilder.authorizerName(authorizerName)
  }

  public fun cognitoUserPools(vararg cognitoUserPools: IUserPool) {
    _cognitoUserPools.addAll(listOf(*cognitoUserPools))
  }

  public fun cognitoUserPools(cognitoUserPools: Collection<IUserPool>) {
    _cognitoUserPools.addAll(cognitoUserPools)
  }

  public fun identitySource(identitySource: String) {
    cdkBuilder.identitySource(identitySource)
  }

  public fun resultsCacheTtl(resultsCacheTtl: Duration) {
    cdkBuilder.resultsCacheTtl(resultsCacheTtl)
  }

  public fun build(): CognitoUserPoolsAuthorizer {
    if(_cognitoUserPools.isNotEmpty()) cdkBuilder.cognitoUserPools(_cognitoUserPools)
    return cdkBuilder.build()
  }
}
