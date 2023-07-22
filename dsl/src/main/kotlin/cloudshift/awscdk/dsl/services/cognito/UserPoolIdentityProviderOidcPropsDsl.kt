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
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps

@CdkDslMarker
public class UserPoolIdentityProviderOidcPropsDsl {
  private val cdkBuilder: UserPoolIdentityProviderOidcProps.Builder =
      UserPoolIdentityProviderOidcProps.builder()

  private val _identifiers: MutableList<String> = mutableListOf()

  private val _scopes: MutableList<String> = mutableListOf()

  /**
   * @param attributeMapping Mapping attributes from the identity provider to standard and custom
   * attributes of the user pool.
   */
  public fun attributeMapping(attributeMapping: AttributeMappingDsl.() -> Unit = {}) {
    val builder = AttributeMappingDsl()
    builder.apply(attributeMapping)
    cdkBuilder.attributeMapping(builder.build())
  }

  /**
   * @param attributeMapping Mapping attributes from the identity provider to standard and custom
   * attributes of the user pool.
   */
  public fun attributeMapping(attributeMapping: AttributeMapping) {
    cdkBuilder.attributeMapping(attributeMapping)
  }

  /**
   * @param attributeRequestMethod The method to use to request attributes.
   */
  public fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod) {
    cdkBuilder.attributeRequestMethod(attributeRequestMethod)
  }

  /**
   * @param clientId The client id. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param clientSecret The client secret. 
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * @param endpoints OpenID connect endpoints.
   */
  public fun endpoints(endpoints: OidcEndpointsDsl.() -> Unit = {}) {
    val builder = OidcEndpointsDsl()
    builder.apply(endpoints)
    cdkBuilder.endpoints(builder.build())
  }

  /**
   * @param endpoints OpenID connect endpoints.
   */
  public fun endpoints(endpoints: OidcEndpoints) {
    cdkBuilder.endpoints(endpoints)
  }

  /**
   * @param identifiers Identifiers.
   * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
   */
  public fun identifiers(vararg identifiers: String) {
    _identifiers.addAll(listOf(*identifiers))
  }

  /**
   * @param identifiers Identifiers.
   * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
   */
  public fun identifiers(identifiers: Collection<String>) {
    _identifiers.addAll(identifiers)
  }

  /**
   * @param issuerUrl Issuer URL. 
   */
  public fun issuerUrl(issuerUrl: String) {
    cdkBuilder.issuerUrl(issuerUrl)
  }

  /**
   * @param name The name of the provider.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups
   * of OpenID Connect user attributes to exchange with your app.
   */
  public fun scopes(vararg scopes: String) {
    _scopes.addAll(listOf(*scopes))
  }

  /**
   * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups
   * of OpenID Connect user attributes to exchange with your app.
   */
  public fun scopes(scopes: Collection<String>) {
    _scopes.addAll(scopes)
  }

  /**
   * @param userPool The user pool to which this construct provides identities. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolIdentityProviderOidcProps {
    if(_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
