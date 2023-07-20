@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon
import software.constructs.Construct

@CdkDslMarker
public class UserPoolIdentityProviderAmazonDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UserPoolIdentityProviderAmazon.Builder =
      UserPoolIdentityProviderAmazon.Builder.create(scope, id)

  private val _scopes: MutableList<String> = mutableListOf()

  public fun attributeMapping(block: AttributeMappingDsl.() -> Unit = {}) {
    val builder = AttributeMappingDsl()
    builder.apply(block)
    cdkBuilder.attributeMapping(builder.build())
  }

  public fun attributeMapping(attributeMapping: AttributeMapping) {
    cdkBuilder.attributeMapping(attributeMapping)
  }

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  public fun scopes(vararg scopes: String) {
    _scopes.addAll(listOf(*scopes))
  }

  public fun scopes(scopes: Collection<String>) {
    _scopes.addAll(scopes)
  }

  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolIdentityProviderAmazon {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
