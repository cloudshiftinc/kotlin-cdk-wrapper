@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileCustomConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.CustomConnectorProfilePropertiesProperty.builder()

  /**
   * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
   */
  public fun oAuth2Properties(oAuth2Properties: IResolvable) {
    cdkBuilder.oAuth2Properties(oAuth2Properties)
  }

  /**
   * @param oAuth2Properties The OAuth 2.0 properties required for OAuth 2.0 authentication.
   */
  public fun oAuth2Properties(oAuth2Properties: CfnConnectorProfile.OAuth2PropertiesProperty) {
    cdkBuilder.oAuth2Properties(oAuth2Properties)
  }

  /**
   * @param profileProperties A map of properties that are required to create a profile for the
   * custom connector.
   */
  public fun profileProperties(profileProperties: Map<String, String>) {
    cdkBuilder.profileProperties(profileProperties)
  }

  /**
   * @param profileProperties A map of properties that are required to create a profile for the
   * custom connector.
   */
  public fun profileProperties(profileProperties: IResolvable) {
    cdkBuilder.profileProperties(profileProperties)
  }

  public fun build(): CfnConnectorProfile.CustomConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
