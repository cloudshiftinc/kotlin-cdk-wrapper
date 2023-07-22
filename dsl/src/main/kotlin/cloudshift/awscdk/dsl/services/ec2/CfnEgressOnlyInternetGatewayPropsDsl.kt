@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps

@CdkDslMarker
public class CfnEgressOnlyInternetGatewayPropsDsl {
  private val cdkBuilder: CfnEgressOnlyInternetGatewayProps.Builder =
      CfnEgressOnlyInternetGatewayProps.builder()

  /**
   * @param vpcId The ID of the VPC for which to create the egress-only internet gateway. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnEgressOnlyInternetGatewayProps = cdkBuilder.build()
}
