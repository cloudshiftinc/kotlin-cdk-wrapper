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
import software.amazon.awscdk.services.cloudfront.PublicKey
import software.constructs.Construct

/**
 * A Public Key Configuration.
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
public class PublicKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PublicKey.Builder = PublicKey.Builder.create(scope, id)

    /**
     * A comment to describe the public key.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the public key.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * The public key that you can use with signed URLs and signed cookies, or with field-level
     * encryption.
     *
     * The `encodedKey` parameter must include `-----BEGIN PUBLIC KEY-----` and `-----END PUBLIC
     * KEY-----` lines.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     *
     * @param encodedKey The public key that you can use with signed URLs and signed cookies, or
     *   with field-level encryption.
     */
    public fun encodedKey(encodedKey: String) {
        cdkBuilder.encodedKey(encodedKey)
    }

    /**
     * A name to identify the public key.
     *
     * Default: - generated from the `id`
     *
     * @param publicKeyName A name to identify the public key.
     */
    public fun publicKeyName(publicKeyName: String) {
        cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): PublicKey = cdkBuilder.build()
}
