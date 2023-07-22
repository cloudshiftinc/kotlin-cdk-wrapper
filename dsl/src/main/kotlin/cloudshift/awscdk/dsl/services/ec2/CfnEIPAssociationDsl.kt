@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEIPAssociation
import software.constructs.Construct

/**
 * Associates an Elastic IP address with an instance or a network interface.
 *
 * Before you can use an Elastic IP address, you must allocate it to your account. For more
 * information about working with Elastic IP addresses, see [Elastic IP address concepts and
 * rules](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#vpc-eip-overview) .
 *
 * You must specify `AllocationId` and either `InstanceId` , `NetworkInterfaceId` , or
 * `PrivateIpAddress` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnEIPAssociation cfnEIPAssociation = CfnEIPAssociation.Builder.create(this,
 * "MyCfnEIPAssociation")
 * .allocationId("allocationId")
 * .eip("eip")
 * .instanceId("instanceId")
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html)
 */
@CdkDslMarker
public class CfnEIPAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnEIPAssociation.Builder = CfnEIPAssociation.Builder.create(scope, id)

  /**
   * The allocation ID.
   *
   * This is required.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-allocationid)
   * @param allocationId The allocation ID. 
   */
  public fun allocationId(allocationId: String) {
    cdkBuilder.allocationId(allocationId)
  }

  /**
   * Deprecated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-eip)
   * @param eip Deprecated. 
   */
  public fun eip(eip: String) {
    cdkBuilder.eip(eip)
  }

  /**
   * The ID of the instance.
   *
   * The instance must have exactly one attached network interface. You can specify either the
   * instance ID or the network interface ID, but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-instanceid)
   * @param instanceId The ID of the instance. 
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * The ID of the network interface.
   *
   * If the instance has more than one network interface, you must specify a network interface ID.
   *
   * You can specify either the instance ID or the network interface ID, but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-networkinterfaceid)
   * @param networkInterfaceId The ID of the network interface. 
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * The primary or secondary private IP address to associate with the Elastic IP address.
   *
   * If no private IP address is specified, the Elastic IP address is associated with the primary
   * private IP address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-eipassociation.html#cfn-ec2-eipassociation-privateipaddress)
   * @param privateIpAddress The primary or secondary private IP address to associate with the
   * Elastic IP address. 
   */
  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  public fun build(): CfnEIPAssociation = cdkBuilder.build()
}
