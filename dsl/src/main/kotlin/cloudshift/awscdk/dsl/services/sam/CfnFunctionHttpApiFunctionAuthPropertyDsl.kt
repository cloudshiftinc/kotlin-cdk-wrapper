@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionHttpApiFunctionAuthPropertyDsl {
  private val cdkBuilder: CfnFunction.HttpApiFunctionAuthProperty.Builder =
      CfnFunction.HttpApiFunctionAuthProperty.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

  public fun authorizer(authorizer: String) {
    cdkBuilder.authorizer(authorizer)
  }

  public fun build(): CfnFunction.HttpApiFunctionAuthProperty {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    return cdkBuilder.build()
  }
}
