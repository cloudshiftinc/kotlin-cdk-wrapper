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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * Private key flags for v3 templates specify the client compatibility, if the private key can be
 * exported, if user input is required when using a private key, and if an alternate signature
 * algorithm should be used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * PrivateKeyFlagsV3Property privateKeyFlagsV3Property = PrivateKeyFlagsV3Property.builder()
 * .clientVersion("clientVersion")
 * // the properties below are optional
 * .exportableKey(false)
 * .requireAlternateSignatureAlgorithm(false)
 * .strongKeyProtectionRequired(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv3.html)
 */
@CdkDslMarker
public class CfnTemplatePrivateKeyFlagsV3PropertyDsl {
    private val cdkBuilder: CfnTemplate.PrivateKeyFlagsV3Property.Builder =
        CfnTemplate.PrivateKeyFlagsV3Property.builder()

    /** @param clientVersion Defines the minimum client compatibility. */
    public fun clientVersion(clientVersion: String) {
        cdkBuilder.clientVersion(clientVersion)
    }

    /** @param exportableKey Allows the private key to be exported. */
    public fun exportableKey(exportableKey: Boolean) {
        cdkBuilder.exportableKey(exportableKey)
    }

    /** @param exportableKey Allows the private key to be exported. */
    public fun exportableKey(exportableKey: IResolvable) {
        cdkBuilder.exportableKey(exportableKey)
    }

    /**
     * @param requireAlternateSignatureAlgorithm Reguires the PKCS #1 v2.1 signature format for
     *   certificates. You should verify that your CA, objects, and applications can accept this
     *   signature format.
     */
    public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
    }

    /**
     * @param requireAlternateSignatureAlgorithm Reguires the PKCS #1 v2.1 signature format for
     *   certificates. You should verify that your CA, objects, and applications can accept this
     *   signature format.
     */
    public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
    }

    /**
     * @param strongKeyProtectionRequired Requirer user input when using the private key for
     *   enrollment.
     */
    public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
    }

    /**
     * @param strongKeyProtectionRequired Requirer user input when using the private key for
     *   enrollment.
     */
    public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
    }

    public fun build(): CfnTemplate.PrivateKeyFlagsV3Property = cdkBuilder.build()
}
