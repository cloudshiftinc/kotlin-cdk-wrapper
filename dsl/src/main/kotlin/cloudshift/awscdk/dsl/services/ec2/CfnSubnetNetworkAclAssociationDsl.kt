@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
import software.constructs.Construct

@CdkDslMarker
public class CfnSubnetNetworkAclAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSubnetNetworkAclAssociation.Builder =
      CfnSubnetNetworkAclAssociation.Builder.create(scope, id)

  public fun networkAclId(networkAclId: String) {
    cdkBuilder.networkAclId(networkAclId)
  }

  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetNetworkAclAssociation = cdkBuilder.build()
}
