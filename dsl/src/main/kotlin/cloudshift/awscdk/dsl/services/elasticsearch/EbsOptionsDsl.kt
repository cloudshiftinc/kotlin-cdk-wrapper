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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.elasticsearch.EbsOptions
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class EbsOptionsDsl {
    private val cdkBuilder: EbsOptions.Builder = EbsOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsOptions = cdkBuilder.build()
}
