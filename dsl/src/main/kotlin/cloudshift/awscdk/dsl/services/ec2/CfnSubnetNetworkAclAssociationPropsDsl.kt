@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps

@CdkDslMarker
public class CfnSubnetNetworkAclAssociationPropsDsl {
  private val cdkBuilder: CfnSubnetNetworkAclAssociationProps.Builder =
      CfnSubnetNetworkAclAssociationProps.builder()

  public fun networkAclId(networkAclId: String) {
    cdkBuilder.networkAclId(networkAclId)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetNetworkAclAssociationProps = cdkBuilder.build()
}
