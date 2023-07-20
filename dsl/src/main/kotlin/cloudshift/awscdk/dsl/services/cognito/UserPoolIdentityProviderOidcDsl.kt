@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.OidcAttributeRequestMethod
import software.amazon.awscdk.services.cognito.OidcEndpoints
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc
import software.constructs.Construct

@CdkDslMarker
public class UserPoolIdentityProviderOidcDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UserPoolIdentityProviderOidc.Builder =
      UserPoolIdentityProviderOidc.Builder.create(scope, id)

  private val _identifiers: MutableList<String> = mutableListOf()

  private val _scopes: MutableList<String> = mutableListOf()

  public fun attributeMapping(block: AttributeMappingDsl.() -> Unit = {}) {
    val builder = AttributeMappingDsl()
    builder.apply(block)
    cdkBuilder.attributeMapping(builder.build())
  }

  public fun attributeMapping(attributeMapping: AttributeMapping) {
    cdkBuilder.attributeMapping(attributeMapping)
  }

  public fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod) {
    cdkBuilder.attributeRequestMethod(attributeRequestMethod)
  }

  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  public fun endpoints(block: OidcEndpointsDsl.() -> Unit = {}) {
    val builder = OidcEndpointsDsl()
    builder.apply(block)
    cdkBuilder.endpoints(builder.build())
  }

  public fun endpoints(endpoints: OidcEndpoints) {
    cdkBuilder.endpoints(endpoints)
  }

  public fun identifiers(vararg identifiers: String) {
    _identifiers.addAll(listOf(*identifiers))
  }

  public fun identifiers(identifiers: Collection<String>) {
    _identifiers.addAll(identifiers)
  }

  public fun issuerUrl(issuerUrl: String) {
    cdkBuilder.issuerUrl(issuerUrl)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
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

  public fun build(): UserPoolIdentityProviderOidc {
    if(_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
