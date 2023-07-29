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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretValue
import software.amazon.awscdk.services.ses.ByoDkimOptions

/**
 * Options for BYO DKIM.
 *
 * Example:
 * ```
 * IPublicHostedZone myHostedZone;
 * EmailIdentity.Builder.create(this, "Identity")
 * .identity(Identity.publicHostedZone(myHostedZone))
 * .dkimIdentity(DkimIdentity.byoDkim(ByoDkimOptions.builder()
 * .privateKey(SecretValue.secretsManager("dkim-private-key"))
 * .publicKey("...base64-encoded-public-key...")
 * .selector("selector")
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ByoDkimOptionsDsl {
    private val cdkBuilder: ByoDkimOptions.Builder = ByoDkimOptions.builder()

    /** @param privateKey The private key that's used to generate a DKIM signature. */
    public fun privateKey(privateKey: SecretValue) {
        cdkBuilder.privateKey(privateKey)
    }

    /**
     * @param publicKey The public key. If specified, a TXT record with the public key is created.
     */
    public fun publicKey(publicKey: String) {
        cdkBuilder.publicKey(publicKey)
    }

    /**
     * @param selector A string that's used to identify a public key in the DNS configuration for a
     *   domain.
     */
    public fun selector(selector: String) {
        cdkBuilder.selector(selector)
    }

    public fun build(): ByoDkimOptions = cdkBuilder.build()
}
