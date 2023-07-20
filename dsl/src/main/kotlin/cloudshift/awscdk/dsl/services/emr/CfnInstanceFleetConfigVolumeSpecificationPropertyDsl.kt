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
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInstanceFleetConfigVolumeSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder =
        CfnInstanceFleetConfig.VolumeSpecificationProperty.builder()

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
    }

    public fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): CfnInstanceFleetConfig.VolumeSpecificationProperty = cdkBuilder.build()
}
