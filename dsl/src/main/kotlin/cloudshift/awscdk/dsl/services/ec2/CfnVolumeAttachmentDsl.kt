@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.constructs.Construct

@CdkDslMarker
public class CfnVolumeAttachmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVolumeAttachment.Builder = CfnVolumeAttachment.Builder.create(scope,
      id)

  /**
   * The device name (for example, `/dev/sdh` or `xvdh` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-device)
   * @param device The device name (for example, `/dev/sdh` or `xvdh` ). 
   */
  public fun device(device: String) {
    cdkBuilder.device(device)
  }

  /**
   * The ID of the instance to which the volume attaches.
   *
   * This value can be a reference to an
   * [`AWS::EC2::Instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource, or it can be the physical ID of an existing EC2 instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-instanceid)
   * @param instanceId The ID of the instance to which the volume attaches. 
   */
  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  /**
   * The ID of the Amazon EBS volume.
   *
   * The volume and instance must be within the same Availability Zone. This value can be a
   * reference to an
   * [`AWS::EC2::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
   * resource, or it can be the volume ID of an existing Amazon EBS volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-volumeid)
   * @param volumeId The ID of the Amazon EBS volume. 
   */
  public fun volumeId(volumeId: String) {
    cdkBuilder.volumeId(volumeId)
  }

  public fun build(): CfnVolumeAttachment = cdkBuilder.build()
}
