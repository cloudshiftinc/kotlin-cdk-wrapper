@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVolumeAttachment
import software.constructs.Construct

/**
 * Attaches an Amazon EBS volume to a running instance and exposes it to the instance with the
 * specified device name.
 *
 * Before this resource can be deleted (and therefore the volume detached), you must first unmount
 * the volume in the instance. Failure to do so results in the volume being stuck in the busy state
 * while it is trying to detach, which could possibly damage the file system or the data it
 * contains.
 *
 * If an Amazon EBS volume is the root device of an instance, it cannot be detached while the
 * instance is in the "running" state. To detach the root volume, stop the instance first.
 *
 * If the root volume is detached from an instance with an AWS Marketplace product code, then the
 * product codes from that volume are no longer associated with the instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnVolumeAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVolumeAttachment.Builder =
        CfnVolumeAttachment.Builder.create(scope, id)

    /**
     * The device name (for example, `/dev/sdh` or `xvdh` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-volumeattachment.html#cfn-ec2-volumeattachment-device)
     *
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
     *
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
     *
     * @param volumeId The ID of the Amazon EBS volume.
     */
    public fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
    }

    public fun build(): CfnVolumeAttachment = cdkBuilder.build()
}
