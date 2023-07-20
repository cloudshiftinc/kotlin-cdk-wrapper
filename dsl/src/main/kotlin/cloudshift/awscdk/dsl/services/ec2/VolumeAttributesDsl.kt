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
import software.amazon.awscdk.services.ec2.VolumeAttributes
import software.amazon.awscdk.services.kms.IKey
import kotlin.String

@CdkDslMarker
public class VolumeAttributesDsl {
    private val cdkBuilder: VolumeAttributes.Builder = VolumeAttributes.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
    }

    public fun build(): VolumeAttributes = cdkBuilder.build()
}
