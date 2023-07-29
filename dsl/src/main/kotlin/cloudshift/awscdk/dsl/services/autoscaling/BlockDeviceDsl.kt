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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.BlockDevice
import software.amazon.awscdk.services.autoscaling.BlockDeviceVolume

/**
 * Block device.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * BlockDeviceVolume blockDeviceVolume;
 * BlockDevice blockDevice = BlockDevice.builder()
 * .deviceName("deviceName")
 * .volume(blockDeviceVolume)
 * .build();
 * ```
 */
@CdkDslMarker
public class BlockDeviceDsl {
    private val cdkBuilder: BlockDevice.Builder = BlockDevice.builder()

    /**
     * @param deviceName The device name exposed to the EC2 instance. Supply a value like
     *   `/dev/sdh`, `xvdh`.
     */
    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param volume Defines the block device volume, to be either an Amazon EBS volume or an
     *   ephemeral instance store volume. Supply a value like `BlockDeviceVolume.ebs(15)`,
     *   `BlockDeviceVolume.ephemeral(0)`.
     */
    public fun volume(volume: BlockDeviceVolume) {
        cdkBuilder.volume(volume)
    }

    public fun build(): BlockDevice = cdkBuilder.build()
}
