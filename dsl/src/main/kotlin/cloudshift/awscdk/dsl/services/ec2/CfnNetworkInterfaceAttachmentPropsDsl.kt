@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachmentProps

/**
 * Properties for defining a `CfnNetworkInterfaceAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInterfaceAttachmentProps cfnNetworkInterfaceAttachmentProps =
 * CfnNetworkInterfaceAttachmentProps.builder()
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
public class CfnNetworkInterfaceAttachmentPropsDsl {
  private val cdkBuilder: CfnNetworkInterfaceAttachmentProps.Builder =
      CfnNetworkInterfaceAttachmentProps.builder()

  /**
   * @param deleteOnTermination Whether to delete the network interface when the instance
   * terminates.
   * By default, this value is set to `true` .
   */
  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * @param deleteOnTermination Whether to delete the network interface when the instance
   * terminates.
   * By default, this value is set to `true` .
   */
  public fun deleteOnTermination(deleteOnTermination: IResolvable) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * @param deviceIndex The network interface's position in the attachment order. 
   * For example, the first attached network interface has a `DeviceIndex` of 0.
   */
  public fun deviceIndex(deviceIndex: String) {
    cdkBuilder.deviceIndex(deviceIndex)
  }

  /**
   * @param instanceId The ID of the instance to which you will attach the ENI. 
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * @param networkInterfaceId The ID of the ENI that you want to attach. 
   */
  public fun networkInterfaceId(networkInterfaceId: String) {
    cdkBuilder.networkInterfaceId(networkInterfaceId)
  }

  public fun build(): CfnNetworkInterfaceAttachmentProps = cdkBuilder.build()
}
