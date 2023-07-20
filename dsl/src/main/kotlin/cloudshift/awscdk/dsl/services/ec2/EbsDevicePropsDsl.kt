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
import software.amazon.awscdk.services.ec2.EbsDeviceProps
import software.amazon.awscdk.services.ec2.EbsDeviceVolumeType
import software.amazon.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class EbsDevicePropsDsl {
    private val cdkBuilder: EbsDeviceProps.Builder = EbsDeviceProps.builder()

    public fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    public fun iops(iops: Number) {
        cdkBuilder.iops(iops)
    }

    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
    }

    public fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
    }

    public fun volumeType(volumeType: EbsDeviceVolumeType) {
        cdkBuilder.volumeType(volumeType)
    }

    public fun build(): EbsDeviceProps = cdkBuilder.build()
}
