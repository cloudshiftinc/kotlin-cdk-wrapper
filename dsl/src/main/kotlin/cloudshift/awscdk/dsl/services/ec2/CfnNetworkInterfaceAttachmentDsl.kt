@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment
import software.constructs.Construct

/**
 * Attaches an elastic network interface (ENI) to an Amazon EC2 instance.
 *
 * You can use this resource type to attach additional network interfaces to an instance without
 * interruption.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInterfaceAttachment cfnNetworkInterfaceAttachment =
 * CfnNetworkInterfaceAttachment.Builder.create(this, "MyCfnNetworkInterfaceAttachment")
 * .deviceIndex("deviceIndex")
 * .instanceId("instanceId")
 * .networkInterfaceId("networkInterfaceId")
 * // the properties below are optional
 * .deleteOnTermination(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html)
 */
@CdkDslMarker
public class CfnNetworkInterfaceAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNetworkInterfaceAttachment.Builder =
      CfnNetworkInterfaceAttachment.Builder.create(scope, id)

  /**
   * Whether to delete the network interface when the instance terminates.
   *
   * By default, this value is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
   * @param deleteOnTermination Whether to delete the network interface when the instance
   * terminates. 
   */
  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * Whether to delete the network interface when the instance terminates.
   *
   * By default, this value is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deleteontermination)
   * @param deleteOnTermination Whether to delete the network interface when the instance
   * terminates. 
   */
  public fun deleteOnTermination(deleteOnTermination: IResolvable) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * The network interface's position in the attachment order.
   *
   * For example, the first attached network interface has a `DeviceIndex` of 0.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-deviceindex)
   * @param deviceIndex The network interface's position in the attachment order. 
   */
  public fun deviceIndex(deviceIndex: String) {
    cdkBuilder.deviceIndex(deviceIndex)
  }

  /**
   * The ID of the instance to which you will attach the ENI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-instanceid)
   * @param instanceId The ID of the instance to which you will attach the ENI. 
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * The ID of the ENI that you want to attach.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterfaceattachment.html#cfn-ec2-networkinterfaceattachment-networkinterfaceid)
   * @param networkInterfaceId The ID of the ENI that you want to attach. 
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun build(): CfnNetworkInterfaceAttachment = cdkBuilder.build()
}
