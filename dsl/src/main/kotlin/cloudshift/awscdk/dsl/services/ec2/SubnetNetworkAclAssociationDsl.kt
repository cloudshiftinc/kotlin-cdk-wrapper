@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
import software.constructs.Construct

@CdkDslMarker
public class SubnetNetworkAclAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SubnetNetworkAclAssociation.Builder =
      SubnetNetworkAclAssociation.Builder.create(scope, id)

  public fun networkAcl(networkAcl: INetworkAcl) {
    cdkBuilder.networkAcl(networkAcl)
  }

  public fun subnet(subnet: ISubnet) {
    cdkBuilder.subnet(subnet)
  }

  public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
    cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
  }

  public fun build(): SubnetNetworkAclAssociation = cdkBuilder.build()
}
