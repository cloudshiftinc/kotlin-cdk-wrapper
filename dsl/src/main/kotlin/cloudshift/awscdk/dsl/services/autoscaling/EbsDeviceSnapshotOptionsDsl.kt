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
import software.amazon.awscdk.services.autoscaling.EbsDeviceSnapshotOptions
import software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType
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

    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsDeviceSnapshotOptions = cdkBuilder.build()
}
