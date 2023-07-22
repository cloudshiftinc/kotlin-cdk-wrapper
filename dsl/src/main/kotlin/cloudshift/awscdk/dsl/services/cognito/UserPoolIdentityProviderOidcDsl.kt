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

  /**
   * Mapping attributes from the identity provider to standard and custom attributes of the user
   * pool.
   *
   * Default: - no attribute mapping
   *
   * @param attributeMapping Mapping attributes from the identity provider to standard and custom
   * attributes of the user pool. 
   */
  public fun attributeMapping(attributeMapping: AttributeMappingDsl.() -> Unit = {}) {
    val builder = AttributeMappingDsl()
    builder.apply(attributeMapping)
    cdkBuilder.attributeMapping(builder.build())
  }

  /**
   * Mapping attributes from the identity provider to standard and custom attributes of the user
   * pool.
   *
   * Default: - no attribute mapping
   *
   * @param attributeMapping Mapping attributes from the identity provider to standard and custom
   * attributes of the user pool. 
   */
  public fun attributeMapping(attributeMapping: AttributeMapping) {
    cdkBuilder.attributeMapping(attributeMapping)
  }

  /**
   * The method to use to request attributes.
   *
   * Default: OidcAttributeRequestMethod.GET
   *
   * @param attributeRequestMethod The method to use to request attributes. 
   */
  public fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod) {
    cdkBuilder.attributeRequestMethod(attributeRequestMethod)
  }

  /**
   * The client id.
   *
   * @param clientId The client id. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * The client secret.
   *
   * @param clientSecret The client secret. 
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * OpenID connect endpoints.
   *
   * Default: - auto discovered with issuer URL
   *
   * @param endpoints OpenID connect endpoints. 
   */
  public fun endpoints(endpoints: OidcEndpointsDsl.() -> Unit = {}) {
    val builder = OidcEndpointsDsl()
    builder.apply(endpoints)
    cdkBuilder.endpoints(builder.build())
  }

  /**
   * OpenID connect endpoints.
   *
   * Default: - auto discovered with issuer URL
   *
   * @param endpoints OpenID connect endpoints. 
   */
  public fun endpoints(endpoints: OidcEndpoints) {
    cdkBuilder.endpoints(endpoints)
  }

  /**
   * Identifiers.
   *
   * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
   *
   * Default: - no identifiers used
   *
   * @param identifiers Identifiers. 
   */
  public fun identifiers(vararg identifiers: String) {
    _identifiers.addAll(listOf(*identifiers))
  }

  /**
   * Identifiers.
   *
   * Identifiers can be used to redirect users to the correct IdP in multitenant apps.
   *
   * Default: - no identifiers used
   *
   * @param identifiers Identifiers. 
   */
  public fun identifiers(identifiers: Collection<String>) {
    _identifiers.addAll(identifiers)
  }

  /**
   * Issuer URL.
   *
   * @param issuerUrl Issuer URL. 
   */
  public fun issuerUrl(issuerUrl: String) {
    cdkBuilder.issuerUrl(issuerUrl)
  }

  /**
   * The name of the provider.
   *
   * Default: - the unique ID of the construct
   *
   * @param name The name of the provider. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
   * Connect user attributes to exchange with your app.
   *
   * Default: ['openid']
   *
   * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups
   * of OpenID Connect user attributes to exchange with your app. 
   */
  public fun scopes(vararg scopes: String) {
    _scopes.addAll(listOf(*scopes))
  }

  /**
   * The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups of OpenID
   * Connect user attributes to exchange with your app.
   *
   * Default: ['openid']
   *
   * @param scopes The OAuth 2.0 scopes that you will request from OpenID Connect. Scopes are groups
   * of OpenID Connect user attributes to exchange with your app. 
   */
  public fun scopes(scopes: Collection<String>) {
    _scopes.addAll(scopes)
  }

  /**
   * The user pool to which this construct provides identities.
   *
   * @param userPool The user pool to which this construct provides identities. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): UserPoolIdentityProviderOidc {
    if(_identifiers.isNotEmpty()) cdkBuilder.identifiers(_identifiers)
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
