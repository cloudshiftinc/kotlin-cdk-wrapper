@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileOAuth2PropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.OAuth2PropertiesProperty.Builder =
      CfnConnectorProfile.OAuth2PropertiesProperty.builder()

  /**
   * @param oAuth2GrantType The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
   */
  public fun oAuth2GrantType(oAuth2GrantType: String) {
    cdkBuilder.oAuth2GrantType(oAuth2GrantType)
  }

  /**
   * @param tokenUrl The token URL required for OAuth 2.0 authentication.
   */
  public fun tokenUrl(tokenUrl: String) {
    cdkBuilder.tokenUrl(tokenUrl)
  }

  /**
   * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
   * define.
   * Use this parameter to provide any additional details that the connector requires to
   * authenticate your request.
   */
  public fun tokenUrlCustomProperties(tokenUrlCustomProperties: Map<String, String>) {
    cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
  }

  /**
   * @param tokenUrlCustomProperties Associates your token URL with a map of properties that you
   * define.
   * Use this parameter to provide any additional details that the connector requires to
   * authenticate your request.
   */
  public fun tokenUrlCustomProperties(tokenUrlCustomProperties: IResolvable) {
    cdkBuilder.tokenUrlCustomProperties(tokenUrlCustomProperties)
  }

  public fun build(): CfnConnectorProfile.OAuth2PropertiesProperty = cdkBuilder.build()
}
