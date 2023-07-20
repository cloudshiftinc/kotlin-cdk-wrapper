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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.Number

@CdkDslMarker
public class EmrCreateClusterVolumeSpecificationPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.VolumeSpecificationProperty.Builder =
        EmrCreateCluster.VolumeSpecificationProperty.builder()

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun volumeSize(volumeSize: Size) {
        cdkBuilder.volumeSize(volumeSize)
    }

    public fun volumeType(volumeType: EmrCreateCluster.EbsBlockDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EmrCreateCluster.VolumeSpecificationProperty = cdkBuilder.build()
}
