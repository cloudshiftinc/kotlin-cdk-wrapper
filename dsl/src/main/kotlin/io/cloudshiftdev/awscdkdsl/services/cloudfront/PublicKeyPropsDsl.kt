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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.PublicKeyProps

/**
 * Properties for creating a Public Key.
 *
 * Example:
 * ```
 * // Validating signed URLs or signed cookies with Trusted Key Groups
 * // public key in PEM format
 * String publicKey;
 * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
 * .encodedKey(publicKey)
 * .build();
 * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
 * .items(List.of(pubKey))
 * .build();
 * Distribution.Builder.create(this, "Dist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("www.example.com"))
 * .trustedKeyGroups(List.of(keyGroup))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class PublicKeyPropsDsl {
    private val cdkBuilder: PublicKeyProps.Builder = PublicKeyProps.builder()

    /** @param comment A comment to describe the public key. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param encodedKey The public key that you can use with signed URLs and signed cookies, or
     *   with field-level encryption. The `encodedKey` parameter must include `-----BEGIN PUBLIC
     *   KEY-----` and `-----END PUBLIC KEY-----` lines.
     */
    public fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
    }

    /** @param publicKeyName A name to identify the public key. */
    public fun publicKeyName(publicKeyName: String) {
        cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): PublicKeyProps = cdkBuilder.build()
}
