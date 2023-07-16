@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnector
import software.amazon.awscdk.services.appflow.CfnConnectorProps

@CdkDslMarker
public class CfnConnectorPropsDsl {
  private val cdkBuilder: CfnConnectorProps.Builder = CfnConnectorProps.builder()

  public fun connectorLabel(connectorLabel: String) {
    cdkBuilder.connectorLabel(connectorLabel)
  }

  public fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable) {
    cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig)
  }

  public
      fun connectorProvisioningConfig(connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty) {
    cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig)
  }

  public fun connectorProvisioningType(connectorProvisioningType: String) {
    cdkBuilder.connectorProvisioningType(connectorProvisioningType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun build(): CfnConnectorProps = cdkBuilder.build()
}
