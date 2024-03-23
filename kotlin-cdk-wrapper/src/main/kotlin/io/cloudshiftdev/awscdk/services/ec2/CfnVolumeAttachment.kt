@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Attaches an Amazon EBS volume to a running instance and exposes it to the instance with the
 * specified device name.
 *
 * Before this resource can be deleted (and therefore the volume detached), you must first unmount
 * the volume in the instance. Failure to do so results in the volume being stuck in the busy state
 * while it is trying to detach, which could possibly damage the file system or the data it contains.
 *
 * If an Amazon EBS volume is the root device of an instance, it cannot be detached while the
 * instance is in the "running" state. To detach the root volume, stop the instance first.
 *
 * If the root volume is detached from an instance with an AWS Marketplace product code, then the
 * product codes from that volume are no longer associated with the instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVolumeAttachment cfnVolumeAttachment = CfnVolumeAttachment.Builder.create(this,
 * "MyCfnVolumeAttachment")
 * .instanceId("instanceId")
 * .volumeId("volumeId")
 * // the properties below are optional
 * .device("device")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html)
 */
public open class CfnVolumeAttachment(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVolumeAttachment,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVolumeAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVolumeAttachment(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVolumeAttachmentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVolumeAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVolumeAttachmentProps(props)
  )

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVolumeAttachment
  }
}
