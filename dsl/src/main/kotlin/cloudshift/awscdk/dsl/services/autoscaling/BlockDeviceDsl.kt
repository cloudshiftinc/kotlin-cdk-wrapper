@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.BlockDevice
import software.amazon.awscdk.services.autoscaling.BlockDeviceVolume
import kotlin.String

@CdkDslMarker
public class BlockDeviceDsl {
    private val cdkBuilder: BlockDevice.Builder = BlockDevice.builder()

    public fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
    }

    public fun volume(volume: BlockDeviceVolume) {
        cdkBuilder.volume(volume)
    }

    public fun build(): BlockDevice = cdkBuilder.build()
}
