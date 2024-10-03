@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnVolumeAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVolumeAttachmentProps cfnVolumeAttachmentProps = CfnVolumeAttachmentProps.builder()
 * .instanceId("instanceId")
 * .volumeId("volumeId")
 * // the properties below are optional
 * .device("device")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html)
 */
public interface CfnVolumeAttachmentProps {
  /**
   * The device name (for example, `/dev/sdh` or `xvdh` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-device)
   */
  public fun device(): String? = unwrap(this).getDevice()

  /**
   * The ID of the instance to which the volume attaches.
   *
   * This value can be a reference to an
   * [`AWS::EC2::Instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
   * resource, or it can be the physical ID of an existing EC2 instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-instanceid)
   */
  public fun instanceId(): String

  /**
   * The ID of the Amazon EBS volume.
   *
   * The volume and instance must be within the same Availability Zone. This value can be a
   * reference to an
   * [`AWS::EC2::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
   * resource, or it can be the volume ID of an existing Amazon EBS volume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-volumeid)
   */
  public fun volumeId(): String

  /**
   * A builder for [CfnVolumeAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param device The device name (for example, `/dev/sdh` or `xvdh` ).
     */
    public fun device(device: String)

    /**
     * @param instanceId The ID of the instance to which the volume attaches. 
     * This value can be a reference to an
     * [`AWS::EC2::Instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource, or it can be the physical ID of an existing EC2 instance.
     */
    public fun instanceId(instanceId: String)

    /**
     * @param volumeId The ID of the Amazon EBS volume. 
     * The volume and instance must be within the same Availability Zone. This value can be a
     * reference to an
     * [`AWS::EC2::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
     * resource, or it can be the volume ID of an existing Amazon EBS volume.
     */
    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps.builder()

    /**
     * @param device The device name (for example, `/dev/sdh` or `xvdh` ).
     */
    override fun device(device: String) {
      cdkBuilder.device(device)
    }

    /**
     * @param instanceId The ID of the instance to which the volume attaches. 
     * This value can be a reference to an
     * [`AWS::EC2::Instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource, or it can be the physical ID of an existing EC2 instance.
     */
    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param volumeId The ID of the Amazon EBS volume. 
     * The volume and instance must be within the same Availability Zone. This value can be a
     * reference to an
     * [`AWS::EC2::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
     * resource, or it can be the volume ID of an existing Amazon EBS volume.
     */
    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnVolumeAttachmentProps {
    /**
     * The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-device)
     */
    override fun device(): String? = unwrap(this).getDevice()

    /**
     * The ID of the instance to which the volume attaches.
     *
     * This value can be a reference to an
     * [`AWS::EC2::Instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     * resource, or it can be the physical ID of an existing EC2 instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-instanceid)
     */
    override fun instanceId(): String = unwrap(this).getInstanceId()

    /**
     * The ID of the Amazon EBS volume.
     *
     * The volume and instance must be within the same Availability Zone. This value can be a
     * reference to an
     * [`AWS::EC2::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
     * resource, or it can be the volume ID of an existing Amazon EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-volumeid)
     */
    override fun volumeId(): String = unwrap(this).getVolumeId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVolumeAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps):
        CfnVolumeAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVolumeAttachmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps
  }
}
