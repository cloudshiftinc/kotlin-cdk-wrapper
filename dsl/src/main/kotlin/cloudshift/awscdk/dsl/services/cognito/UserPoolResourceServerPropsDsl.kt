@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps

@CdkDslMarker
public class UserPoolResourceServerPropsDsl {
  private val cdkBuilder: UserPoolResourceServerProps.Builder =
      UserPoolResourceServerProps.builder()

  private val _scopes: MutableList<ResourceServerScope> = mutableListOf()

  /**
   * @param identifier A unique resource server identifier for the resource server. 
   */
  public fun identifier(identifier: String) {
    cdkBuilder.identifier(identifier)
  }

  /**
   * @param scopes Oauth scopes.
   */
  public fun scopes(scopes: ResourceServerScopeDsl.() -> Unit) {
    _scopes.add(ResourceServerScopeDsl().apply(scopes).build())
  }

  /**
   * @param scopes Oauth scopes.
   */
  public fun scopes(scopes: Collection<ResourceServerScope>) {
    _scopes.addAll(scopes)
  }

  /**
   * @param userPool The user pool to add this resource server to. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  /**
   * @param userPoolResourceServerName A friendly name for the resource server.
   */
  public fun userPoolResourceServerName(userPoolResourceServerName: String) {
    cdkBuilder.userPoolResourceServerName(userPoolResourceServerName)
  }

  public fun build(): UserPoolResourceServerProps {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
