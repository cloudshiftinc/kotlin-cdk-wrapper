@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

@CdkDslMarker
public class CfnEndpointAccessVpcSecurityGroupPropertyDsl {
  private val cdkBuilder: CfnEndpointAccess.VpcSecurityGroupProperty.Builder =
      CfnEndpointAccess.VpcSecurityGroupProperty.builder()

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun vpcSecurityGroupId(vpcSecurityGroupId: String) {
    cdkBuilder.vpcSecurityGroupId(vpcSecurityGroupId)
  }

  public fun build(): CfnEndpointAccess.VpcSecurityGroupProperty = cdkBuilder.build()
}
