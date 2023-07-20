@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps

@CdkDslMarker
public class SubnetNetworkAclAssociationPropsDsl {
  private val cdkBuilder: SubnetNetworkAclAssociationProps.Builder =
      SubnetNetworkAclAssociationProps.builder()

  public fun networkAcl(networkAcl: INetworkAcl) {
    cdkBuilder.networkAcl(networkAcl)
  }

  public fun subnet(subnet: ISubnet) {
    cdkBuilder.subnet(subnet)
  }

  public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
    cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
  }

  public fun build(): SubnetNetworkAclAssociationProps = cdkBuilder.build()
}
