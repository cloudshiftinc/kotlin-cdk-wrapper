@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.CognitoUserPoolsAuthorizerProps
import software.amazon.awscdk.services.cognito.IUserPool

@CdkDslMarker
public class CognitoUserPoolsAuthorizerPropsDsl {
  private val cdkBuilder: CognitoUserPoolsAuthorizerProps.Builder =
      CognitoUserPoolsAuthorizerProps.builder()

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

  public fun build(): CognitoUserPoolsAuthorizerProps {
    if(_cognitoUserPools.isNotEmpty()) cdkBuilder.cognitoUserPools(_cognitoUserPools)
    return cdkBuilder.build()
  }
}
