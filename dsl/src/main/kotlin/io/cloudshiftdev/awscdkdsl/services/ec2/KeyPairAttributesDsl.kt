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
import software.amazon.awscdk.services.ec2.KeyPairAttributes
import software.amazon.awscdk.services.ec2.KeyPairType

/**
 * Attributes of a Key Pair.
 *
 * Example:
 * ```
 * IKeyPair keyPair = KeyPair.fromKeyPairAttributes(this, "KeyPair", KeyPairAttributes.builder()
 * .keyPairName("the-keypair-name")
 * .type(KeyPairType.RSA)
 * .build());
 * ```
 */
@CdkDslMarker
public class KeyPairAttributesDsl {
    private val cdkBuilder: KeyPairAttributes.Builder = KeyPairAttributes.builder()

    /** @param keyPairName The unique name of the key pair. */
    public fun keyPairName(keyPairName: String) {
        cdkBuilder.keyPairName(keyPairName)
    }

    /** @param type The type of the key pair. */
    public fun type(type: KeyPairType) {
        cdkBuilder.type(type)
    }

    public fun build(): KeyPairAttributes = cdkBuilder.build()
}
