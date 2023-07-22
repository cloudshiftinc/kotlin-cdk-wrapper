@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileOAuthPropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.OAuthPropertiesProperty.Builder =
      CfnConnectorProfile.OAuthPropertiesProperty.builder()

  private val _oAuthScopes: MutableList<String> = mutableListOf()

  /**
   * @param authCodeUrl The authorization code url required to redirect to SAP Login Page to fetch
   * authorization code for OAuth type authentication.
   */
  public fun authCodeUrl(authCodeUrl: String) {
    cdkBuilder.authCodeUrl(authCodeUrl)
  }

  /**
   * @param oAuthScopes The OAuth scopes required for OAuth type authentication.
   */
  public fun oAuthScopes(vararg oAuthScopes: String) {
    _oAuthScopes.addAll(listOf(*oAuthScopes))
  }

  /**
   * @param oAuthScopes The OAuth scopes required for OAuth type authentication.
   */
  public fun oAuthScopes(oAuthScopes: Collection<String>) {
    _oAuthScopes.addAll(oAuthScopes)
  }

  /**
   * @param tokenUrl The token url required to fetch access/refresh tokens using authorization code
   * and also to refresh expired access token using refresh token.
   */
  public fun tokenUrl(tokenUrl: String) {
    cdkBuilder.tokenUrl(tokenUrl)
  }

  public fun build(): CfnConnectorProfile.OAuthPropertiesProperty {
    if(_oAuthScopes.isNotEmpty()) cdkBuilder.oAuthScopes(_oAuthScopes)
    return cdkBuilder.build()
  }
}
