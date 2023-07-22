@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps

/**
 * Properties for defining a `CfnSubnetNetworkAclAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnSubnetNetworkAclAssociationProps cfnSubnetNetworkAclAssociationProps =
 * CfnSubnetNetworkAclAssociationProps.builder()
 * .networkAclId("networkAclId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnetnetworkaclassociation.html)
 */
@CdkDslMarker
public class CfnSubnetNetworkAclAssociationPropsDsl {
  private val cdkBuilder: CfnSubnetNetworkAclAssociationProps.Builder =
      CfnSubnetNetworkAclAssociationProps.builder()

  /**
   * @param networkAclId The ID of the network ACL. 
   */
  public fun networkAclId(networkAclId: String) {
    cdkBuilder.networkAclId(networkAclId)
  }

  /**
   * @param subnetId The ID of the subnet. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  public fun build(): CfnSubnetNetworkAclAssociationProps = cdkBuilder.build()
}
