@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileConnectorProfileConfigPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder =
      CfnConnectorProfile.ConnectorProfileConfigProperty.builder()

  public fun connectorProfileCredentials(connectorProfileCredentials: IResolvable) {
    cdkBuilder.connectorProfileCredentials(connectorProfileCredentials)
  }

  public
      fun connectorProfileCredentials(connectorProfileCredentials: CfnConnectorProfile.ConnectorProfileCredentialsProperty) {
    cdkBuilder.connectorProfileCredentials(connectorProfileCredentials)
  }

  public fun connectorProfileProperties(connectorProfileProperties: IResolvable) {
    cdkBuilder.connectorProfileProperties(connectorProfileProperties)
  }

  public
      fun connectorProfileProperties(connectorProfileProperties: CfnConnectorProfile.ConnectorProfilePropertiesProperty) {
    cdkBuilder.connectorProfileProperties(connectorProfileProperties)
  }

  public fun build(): CfnConnectorProfile.ConnectorProfileConfigProperty = cdkBuilder.build()
}
