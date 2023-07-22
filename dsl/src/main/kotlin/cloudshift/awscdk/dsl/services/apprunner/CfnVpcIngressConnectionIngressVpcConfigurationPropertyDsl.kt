@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection

@CdkDslMarker
public class CfnVpcIngressConnectionIngressVpcConfigurationPropertyDsl {
  private val cdkBuilder: CfnVpcIngressConnection.IngressVpcConfigurationProperty.Builder =
      CfnVpcIngressConnection.IngressVpcConfigurationProperty.builder()

  /**
   * @param vpcEndpointId The ID of the VPC endpoint that your App Runner service connects to. 
   */
  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  /**
   * @param vpcId The ID of the VPC that is used for the VPC endpoint. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVpcIngressConnection.IngressVpcConfigurationProperty = cdkBuilder.build()
}
