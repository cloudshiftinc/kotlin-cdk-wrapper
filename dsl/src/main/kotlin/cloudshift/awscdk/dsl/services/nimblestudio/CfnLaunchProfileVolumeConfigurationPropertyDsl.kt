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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import kotlin.Number

@CdkDslMarker
public class CfnLaunchProfileVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnLaunchProfile.VolumeConfigurationProperty.Builder =
        CfnLaunchProfile.VolumeConfigurationProperty.builder()

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
    }

    public fun build(): CfnLaunchProfile.VolumeConfigurationProperty = cdkBuilder.build()
}
