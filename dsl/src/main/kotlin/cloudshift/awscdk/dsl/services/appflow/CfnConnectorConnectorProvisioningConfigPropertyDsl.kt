@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnector

@CdkDslMarker
public class CfnConnectorConnectorProvisioningConfigPropertyDsl {
  private val cdkBuilder: CfnConnector.ConnectorProvisioningConfigProperty.Builder =
      CfnConnector.ConnectorProvisioningConfigProperty.builder()

  /**
   * @param lambda Contains information about the configuration of the lambda which is being
   * registered as the connector.
   */
  public fun lambda(lambda: IResolvable) {
    cdkBuilder.lambda(lambda)
  }

  /**
   * @param lambda Contains information about the configuration of the lambda which is being
   * registered as the connector.
   */
  public fun lambda(lambda: CfnConnector.LambdaConnectorProvisioningConfigProperty) {
    cdkBuilder.lambda(lambda)
  }

  public fun build(): CfnConnector.ConnectorProvisioningConfigProperty = cdkBuilder.build()
}
