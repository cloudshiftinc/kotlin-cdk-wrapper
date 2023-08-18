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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnVolume
import software.constructs.Construct

/**
 * Describes an instance's Amazon EBS volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * CfnVolume cfnVolume = CfnVolume.Builder.create(this, "MyCfnVolume")
 * .ec2VolumeId("ec2VolumeId")
 * .stackId("stackId")
 * // the properties below are optional
 * .mountPoint("mountPoint")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html)
 */
@CdkDslMarker
public class CfnVolumeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVolume.Builder = CfnVolume.Builder.create(scope, id)

    /**
     * The Amazon EC2 volume ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-ec2volumeid)
     *
     * @param ec2VolumeId The Amazon EC2 volume ID.
     */
    public fun ec2VolumeId(ec2VolumeId: String) {
        cdkBuilder.ec2VolumeId(ec2VolumeId)
    }

    /**
     * The volume mount point.
     *
     * For example, "/mnt/disk1".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-mountpoint)
     *
     * @param mountPoint The volume mount point.
     */
    public fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
    }

    /**
     * The volume name.
     *
     * Volume names are a maximum of 128 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-name)
     *
     * @param name The volume name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The stack ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-volume.html#cfn-opsworks-volume-stackid)
     *
     * @param stackId The stack ID.
     */
    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    public fun build(): CfnVolume = cdkBuilder.build()
}
