@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnService

@CdkDslMarker
public class CfnServiceEgressConfigurationPropertyDsl {
  private val cdkBuilder: CfnService.EgressConfigurationProperty.Builder =
      CfnService.EgressConfigurationProperty.builder()

  /**
   * @param egressType The type of egress configuration. 
   * Set to `DEFAULT` for access to resources hosted on public networks.
   *
   * Set to `VPC` to associate your service to a custom VPC specified by `VpcConnectorArn` .
   */
  public fun egressType(egressType: String) {
    cdkBuilder.egressType(egressType)
  }

  /**
   * @param vpcConnectorArn The Amazon Resource Name (ARN) of the App Runner VPC connector that you
   * want to associate with your App Runner service.
   * Only valid when `EgressType = VPC` .
   */
  public fun vpcConnectorArn(vpcConnectorArn: String) {
    cdkBuilder.vpcConnectorArn(vpcConnectorArn)
  }

  public fun build(): CfnService.EgressConfigurationProperty = cdkBuilder.build()
}
