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
import software.amazon.awscdk.services.autoscaling.EbsDeviceOptionsBase
import software.amazon.awscdk.services.autoscaling.EbsDeviceVolumeType
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class EbsDeviceOptionsBaseDsl {
    private val cdkBuilder: EbsDeviceOptionsBase.Builder = EbsDeviceOptionsBase.builder()

    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsDeviceOptionsBase = cdkBuilder.build()
}
