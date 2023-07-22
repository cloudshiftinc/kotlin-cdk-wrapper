@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider

@CdkDslMarker
public class CfnVerifiedAccessTrustProviderOidcOptionsPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessTrustProvider.OidcOptionsProperty.Builder =
      CfnVerifiedAccessTrustProvider.OidcOptionsProperty.builder()

  /**
   * @param authorizationEndpoint The OIDC authorization endpoint.
   */
  public fun authorizationEndpoint(authorizationEndpoint: String) {
    cdkBuilder.authorizationEndpoint(authorizationEndpoint)
  }

  /**
   * @param clientId The client identifier.
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
   * @param issuer The OIDC issuer.
   */
  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  /**
   * @param scope The OpenID Connect (OIDC) scope specified.
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param tokenEndpoint The OIDC token endpoint.
   */
  public fun tokenEndpoint(tokenEndpoint: String) {
    cdkBuilder.tokenEndpoint(tokenEndpoint)
  }

  /**
   * @param userInfoEndpoint The OIDC user info endpoint.
   */
  public fun userInfoEndpoint(userInfoEndpoint: String) {
    cdkBuilder.userInfoEndpoint(userInfoEndpoint)
  }

  public fun build(): CfnVerifiedAccessTrustProvider.OidcOptionsProperty = cdkBuilder.build()
}
