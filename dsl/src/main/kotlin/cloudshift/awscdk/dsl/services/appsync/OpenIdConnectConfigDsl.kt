@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appsync.OpenIdConnectConfig

/**
 * Configuration for OpenID Connect authorization in AppSync.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * OpenIdConnectConfig openIdConnectConfig = OpenIdConnectConfig.builder()
 * .oidcProvider("oidcProvider")
 * // the properties below are optional
 * .clientId("clientId")
 * .tokenExpiryFromAuth(123)
 * .tokenExpiryFromIssue(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class OpenIdConnectConfigDsl {
  private val cdkBuilder: OpenIdConnectConfig.Builder = OpenIdConnectConfig.builder()

  /**
   * @param clientId The client identifier of the Relying party at the OpenID identity provider.
   * A regular expression can be specified so AppSync can validate against multiple client
   * identifiers at a time.
   */
  public fun clientId(clientId: String) {
    cdkBuilder.clientId(clientId)
  }

  /**
   * @param oidcProvider The issuer for the OIDC configuration. 
   * The issuer returned by discovery must exactly match the value of `iss` in the OIDC token.
   */
  public fun oidcProvider(oidcProvider: String) {
    cdkBuilder.oidcProvider(oidcProvider)
  }

  /**
   * @param tokenExpiryFromAuth The number of milliseconds an OIDC token is valid after being
   * authenticated by OIDC provider.
   * `auth_time` claim in OIDC token is required for this validation to work.
   */
  public fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number) {
    cdkBuilder.tokenExpiryFromAuth(tokenExpiryFromAuth)
  }

  /**
   * @param tokenExpiryFromIssue The number of milliseconds an OIDC token is valid after being
   * issued to a user.
   * This validation uses `iat` claim of OIDC token.
   */
  public fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number) {
    cdkBuilder.tokenExpiryFromIssue(tokenExpiryFromIssue)
  }

  public fun build(): OpenIdConnectConfig = cdkBuilder.build()
}
