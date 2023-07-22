@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEIPAssociationProps

/**
 * Properties for defining a `CfnEIPAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnEIPAssociationProps cfnEIPAssociationProps = CfnEIPAssociationProps.builder()
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
public class CfnEIPAssociationPropsDsl {
  private val cdkBuilder: CfnEIPAssociationProps.Builder = CfnEIPAssociationProps.builder()

  /**
   * @param allocationId The allocation ID.
   * This is required.
   */
  public fun allocationId(allocationId: String) {
    cdkBuilder.allocationId(allocationId)
  }

  /**
   * @param eip Deprecated.
   */
  public fun eip(eip: String) {
    cdkBuilder.eip(eip)
  }

  /**
   * @param instanceId The ID of the instance.
   * The instance must have exactly one attached network interface. You can specify either the
   * instance ID or the network interface ID, but not both.
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * @param networkInterfaceId The ID of the network interface.
   * If the instance has more than one network interface, you must specify a network interface ID.
   *
   * You can specify either the instance ID or the network interface ID, but not both.
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  /**
   * @param privateIpAddress The primary or secondary private IP address to associate with the
   * Elastic IP address.
   * If no private IP address is specified, the Elastic IP address is associated with the primary
   * private IP address.
   */
  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  public fun build(): CfnEIPAssociationProps = cdkBuilder.build()
}
