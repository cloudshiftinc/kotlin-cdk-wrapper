@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

@CdkDslMarker
public class CfnEndpointAccessVpcSecurityGroupPropertyDsl {
  private val cdkBuilder: CfnEndpointAccess.VpcSecurityGroupProperty.Builder =
      CfnEndpointAccess.VpcSecurityGroupProperty.builder()

  /**
   * @param status The status of the endpoint.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param vpcSecurityGroupId The identifier of the VPC security group.
   */
  public fun vpcSecurityGroupId(vpcSecurityGroupId: String) {
    cdkBuilder.vpcSecurityGroupId(vpcSecurityGroupId)
  }

  public fun build(): CfnEndpointAccess.VpcSecurityGroupProperty = cdkBuilder.build()
}
