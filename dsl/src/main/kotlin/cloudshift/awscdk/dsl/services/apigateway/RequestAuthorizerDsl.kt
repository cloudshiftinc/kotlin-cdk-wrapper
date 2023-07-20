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

  public fun assumeRole(assumeRole: IRole) {
    cdkBuilder.assumeRole(assumeRole)
  }

  public fun authorizerName(authorizerName: String) {
    cdkBuilder.authorizerName(authorizerName)
  }

  public fun handler(handler: IFunction) {
    cdkBuilder.handler(handler)
  }

  public fun identitySources(vararg identitySources: String) {
    _identitySources.addAll(listOf(*identitySources))
  }

  public fun identitySources(identitySources: Collection<String>) {
    _identitySources.addAll(identitySources)
  }

  public fun resultsCacheTtl(resultsCacheTtl: Duration) {
    cdkBuilder.resultsCacheTtl(resultsCacheTtl)
  }

  public fun build(): RequestAuthorizer {
    if(_identitySources.isNotEmpty()) cdkBuilder.identitySources(_identitySources)
    return cdkBuilder.build()
  }
}
