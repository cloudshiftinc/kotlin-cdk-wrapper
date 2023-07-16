@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.UserPoolResourceServer
import software.constructs.Construct

@CdkDslMarker
public class UserPoolResourceServerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UserPoolResourceServer.Builder =
      UserPoolResourceServer.Builder.create(scope, id)

  private val _scopes: MutableList<ResourceServerScope> = mutableListOf()

  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  public fun scopes(scopes: ResourceServerScopeDsl.() -> Unit) {
    _scopes.add(ResourceServerScopeDsl().apply(scopes).build())
  }

  public fun scopes(scopes: Collection<ResourceServerScope>) {
    _scopes.addAll(scopes)
  }

  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun userPoolResourceServerName(userPoolResourceServerName: String) {
    cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
  }

  public fun build(): UserPoolResourceServer {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
