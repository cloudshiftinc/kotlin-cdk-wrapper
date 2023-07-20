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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class EbsDeviceSnapshotOptionsDsl {
    private val cdkBuilder: EbsDeviceSnapshotOptions.Builder = EbsDeviceSnapshotOptions.builder()

    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsDeviceSnapshotOptions = cdkBuilder.build()
}
