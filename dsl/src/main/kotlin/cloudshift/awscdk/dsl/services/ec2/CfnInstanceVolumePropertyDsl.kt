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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies a volume to attach to an instance.
 *
 * `Volume` is an embedded property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * VolumeProperty volumeProperty = VolumeProperty.builder()
 * .device("device")
 * .volumeId("volumeId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-volume.html)
 */
@CdkDslMarker
public class CfnInstanceVolumePropertyDsl {
    private val cdkBuilder: CfnInstance.VolumeProperty.Builder =
        CfnInstance.VolumeProperty.builder()

    /** @param device The device name (for example, `/dev/sdh` or `xvdh` ). */
    public fun device(device: String) {
        cdkBuilder.device(device)
    }

    /**
     * @param volumeId The ID of the EBS volume. The volume and instance must be within the same
     *   Availability Zone.
     */
    public fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
    }

    public fun build(): CfnInstance.VolumeProperty = cdkBuilder.build()
}
