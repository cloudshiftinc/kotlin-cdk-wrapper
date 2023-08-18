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
import software.amazon.awscdk.services.ec2.CfnVolumeAttachmentProps

/**
 * Properties for defining a `CfnVolumeAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnVolumeAttachmentPropsDsl {
    private val cdkBuilder: CfnVolumeAttachmentProps.Builder = CfnVolumeAttachmentProps.builder()

    /** @param device The device name (for example, `/dev/sdh` or `xvdh` ). */
    public fun device(device: String) {
        cdkBuilder.device(device)
    }

    /**
     * @param instanceId The ID of the instance to which the volume attaches. This value can be a
     *   reference to an
     *   [`AWS::EC2::Instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
     *   resource, or it can be the physical ID of an existing EC2 instance.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param volumeId The ID of the Amazon EBS volume. The volume and instance must be within the
     *   same Availability Zone. This value can be a reference to an
     *   [`AWS::EC2::Volume`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ebs-volume.html)
     *   resource, or it can be the volume ID of an existing Amazon EBS volume.
     */
    public fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
    }

    public fun build(): CfnVolumeAttachmentProps = cdkBuilder.build()
}
