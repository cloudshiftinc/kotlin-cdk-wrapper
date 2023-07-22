@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnectorProfile

@CdkDslMarker
public class CfnConnectorProfileConnectorProfileConfigPropertyDsl {
  private val cdkBuilder: CfnConnectorProfile.ConnectorProfileConfigProperty.Builder =
      CfnConnectorProfile.ConnectorProfileConfigProperty.builder()

  /**
   * @param connectorProfileCredentials The connector-specific credentials required by each
   * connector.
   */
  public fun connectorProfileCredentials(connectorProfileCredentials: IResolvable) {
    cdkBuilder.connectorProfileCredentials(connectorProfileCredentials)
  }

  /**
   * @param connectorProfileCredentials The connector-specific credentials required by each
   * connector.
   */
  public
      fun connectorProfileCredentials(connectorProfileCredentials: CfnConnectorProfile.ConnectorProfileCredentialsProperty) {
    cdkBuilder.connectorProfileCredentials(connectorProfileCredentials)
  }

  /**
   * @param connectorProfileProperties The connector-specific properties of the profile
   * configuration.
   */
  public fun connectorProfileProperties(connectorProfileProperties: IResolvable) {
    cdkBuilder.connectorProfileProperties(connectorProfileProperties)
  }

  /**
   * @param connectorProfileProperties The connector-specific properties of the profile
   * configuration.
   */
  public
      fun connectorProfileProperties(connectorProfileProperties: CfnConnectorProfile.ConnectorProfilePropertiesProperty) {
    cdkBuilder.connectorProfileProperties(connectorProfileProperties)
  }

  public fun build(): CfnConnectorProfile.ConnectorProfileConfigProperty = cdkBuilder.build()
}
