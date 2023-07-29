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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.opsworks.CfnVolumeProps

/**
 * Properties for defining a `CfnVolume`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * CfnVolumeProps cfnVolumeProps = CfnVolumeProps.builder()
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
public class CfnVolumePropsDsl {
    private val cdkBuilder: CfnVolumeProps.Builder = CfnVolumeProps.builder()

    /** @param ec2VolumeId The Amazon EC2 volume ID. */
    public fun ec2VolumeId(ec2VolumeId: String) {
        cdkBuilder.ec2VolumeId(ec2VolumeId)
    }

    /** @param mountPoint The volume mount point. For example, "/mnt/disk1". */
    public fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
    }

    /** @param name The volume name. Volume names are a maximum of 128 characters. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param stackId The stack ID. */
    public fun stackId(stackId: String) {
        cdkBuilder.stackId(stackId)
    }

    public fun build(): CfnVolumeProps = cdkBuilder.build()
}
