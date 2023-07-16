@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileSAPODataConnectorProfilePropertiesPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.Builder =
      CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.builder()

  public fun applicationHostUrl(applicationHostUrl: String) {
    cdkBuilder.applicationHostUrl(applicationHostUrl)
  }

  public fun applicationServicePath(applicationServicePath: String) {
    cdkBuilder.applicationServicePath(applicationServicePath)
  }

  public fun clientNumber(clientNumber: String) {
    cdkBuilder.clientNumber(clientNumber)
  }

  public fun logonLanguage(logonLanguage: String) {
    cdkBuilder.logonLanguage(logonLanguage)
  }

  public fun oAuthProperties(oAuthProperties: IResolvable) {
    cdkBuilder.oAuthProperties(oAuthProperties)
  }

  public fun oAuthProperties(oAuthProperties: CfnConnectorProfile.OAuthPropertiesProperty) {
    cdkBuilder.oAuthProperties(oAuthProperties)
  }

  public fun portNumber(portNumber: Number) {
    cdkBuilder.portNumber(portNumber)
  }

  public fun privateLinkServiceName(privateLinkServiceName: String) {
    cdkBuilder.privateLinkServiceName(privateLinkServiceName)
  }

  public fun build(): CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty =
      cdkBuilder.build()
}
