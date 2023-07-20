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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInstanceGroupConfigVolumeSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.VolumeSpecificationProperty.Builder =
        CfnInstanceGroupConfig.VolumeSpecificationProperty.builder()

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
    }

    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnInstanceGroupConfig.VolumeSpecificationProperty = cdkBuilder.build()
}
