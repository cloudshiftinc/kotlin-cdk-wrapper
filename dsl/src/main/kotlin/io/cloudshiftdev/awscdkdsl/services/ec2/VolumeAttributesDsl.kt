@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.VolumeAttributes
import software.amazon.awscdk.services.kms.IKey

/**
 * Attributes required to import an existing EBS Volume into the Stack.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.kms.*;
 * Key key;
 * VolumeAttributes volumeAttributes = VolumeAttributes.builder()
 * .availabilityZone("availabilityZone")
 * .volumeId("volumeId")
 * // the properties below are optional
 * .encryptionKey(key)
 * .build();
 * ```
 */
@CdkDslMarker
public class VolumeAttributesDsl {
    private val cdkBuilder: VolumeAttributes.Builder = VolumeAttributes.builder()

    /**
     * @param availabilityZone The availability zone that the EBS Volume is contained within (ex:
     *   us-west-2a).
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param encryptionKey The customer-managed encryption key that is used to encrypt the Volume.
     */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param volumeId The EBS Volume's ID. */
    public fun volumeId(volumeId: String) {
        cdkBuilder.volumeId(volumeId)
    }

    public fun build(): VolumeAttributes = cdkBuilder.build()
}
