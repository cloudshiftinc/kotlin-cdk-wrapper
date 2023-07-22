@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook
import software.constructs.Construct

@CdkDslMarker
public class UserPoolIdentityProviderFacebookDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: UserPoolIdentityProviderFacebook.Builder =
      UserPoolIdentityProviderFacebook.Builder.create(scope, id)

  private val _scopes: MutableList<String> = mutableListOf()

  /**
   * The Facebook API version to use.
   *
   * Default: - to the oldest version supported by Facebook
   *
   * @param apiVersion The Facebook API version to use. 
   */
  public fun apiVersion(apiVersion: String) {
    cdkBuilder.apiVersion(apiVersion)
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
   * The client id recognized by Facebook APIs.
   *
   * @param clientId The client id recognized by Facebook APIs. 
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * The client secret to be accompanied with clientUd for Facebook to authenticate the client.
   *
   * [Documentation](https://developers.facebook.com/docs/facebook-login/security#appsecret)
   * @param clientSecret The client secret to be accompanied with clientUd for Facebook to
   * authenticate the client. 
   */
  public fun clientSecret(clientSecret: String) {
    cdkBuilder.clientSecret(clientSecret)
  }

  /**
   * The list of facebook permissions to obtain for getting access to the Facebook profile.
   *
   * Default: [ public_profile ]
   *
   * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
   * @param scopes The list of facebook permissions to obtain for getting access to the Facebook
   * profile. 
   */
  public fun scopes(vararg scopes: String) {
    _scopes.addAll(listOf(*scopes))
  }

  /**
   * The list of facebook permissions to obtain for getting access to the Facebook profile.
   *
   * Default: [ public_profile ]
   *
   * [Documentation](https://developers.facebook.com/docs/facebook-login/permissions)
   * @param scopes The list of facebook permissions to obtain for getting access to the Facebook
   * profile. 
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

  public fun build(): UserPoolIdentityProviderFacebook {
    if(_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
    return cdkBuilder.build()
  }
}
