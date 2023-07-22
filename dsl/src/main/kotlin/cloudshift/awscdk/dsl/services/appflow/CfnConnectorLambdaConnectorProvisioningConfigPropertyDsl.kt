@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnConnector

@CdkDslMarker
public class CfnConnectorLambdaConnectorProvisioningConfigPropertyDsl {
  private val cdkBuilder: CfnConnector.LambdaConnectorProvisioningConfigProperty.Builder =
      CfnConnector.LambdaConnectorProvisioningConfigProperty.builder()

  /**
   * @param lambdaArn Lambda ARN of the connector being registered. 
   */
  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  public fun build(): CfnConnector.LambdaConnectorProvisioningConfigProperty = cdkBuilder.build()
}
