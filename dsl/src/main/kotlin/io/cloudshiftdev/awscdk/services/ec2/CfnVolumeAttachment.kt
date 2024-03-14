package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVolumeAttachment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachment,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The device name (for example, `/dev/sdh` or `xvdh` ).
   */
  public open fun device(): String? = unwrap(this).getDevice()

  /**
   * The device name (for example, `/dev/sdh` or `xvdh` ).
   */
  public open fun device(`value`: String) {
    unwrap(this).setDevice(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the instance to which the volume attaches.
   */
  public open fun instanceId(): String = unwrap(this).getInstanceId()

  /**
   * The ID of the instance to which the volume attaches.
   */
  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  /**
   * The ID of the Amazon EBS volume.
   */
  public open fun volumeId(): String = unwrap(this).getVolumeId()

  /**
   * The ID of the Amazon EBS volume.
   */
  public open fun volumeId(`value`: String) {
    unwrap(this).setVolumeId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVolumeAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-device)
     * @param device The device name (for example, `/dev/sdh` or `xvdh` ). 
     */
    public fun device(device: String)

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
    public fun instanceId(instanceId: String)

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
    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVolumeAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment.Builder.create(scope, id)

    /**
     * The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-device)
     * @param device The device name (for example, `/dev/sdh` or `xvdh` ). 
     */
    override fun device(device: String) {
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
    override fun instanceId(instanceId: String) {
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
    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVolumeAttachment = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVolumeAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVolumeAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachment):
        CfnVolumeAttachment = CfnVolumeAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnVolumeAttachment):
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment = wrapped.cdkObject
  }
}
