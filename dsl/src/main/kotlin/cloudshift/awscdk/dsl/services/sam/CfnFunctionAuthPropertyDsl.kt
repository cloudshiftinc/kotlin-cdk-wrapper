@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionAuthPropertyDsl {
  private val cdkBuilder: CfnFunction.AuthProperty.Builder = CfnFunction.AuthProperty.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  public fun apiKeyRequired(apiKeyRequired: Boolean) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  public fun apiKeyRequired(apiKeyRequired: IResolvable) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

  public fun authorizer(authorizer: String) {
    cdkBuilder.authorizer(authorizer)
  }

  public fun resourcePolicy(resourcePolicy: IResolvable) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  public fun resourcePolicy(resourcePolicy: CfnFunction.AuthResourcePolicyProperty) {
    cdkBuilder.resourcePolicy(resourcePolicy)
  }

  public fun build(): CfnFunction.AuthProperty {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    return cdkBuilder.build()
  }
}
