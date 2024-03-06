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
 * Private key flags for v4 templates specify the client compatibility, if the private key can be
 * exported, if user input is required when using a private key, if an alternate signature algorithm
 * should be used, and if certificates are renewed using the same private key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * PrivateKeyFlagsV4Property privateKeyFlagsV4Property = PrivateKeyFlagsV4Property.builder()
 * .clientVersion("clientVersion")
 * // the properties below are optional
 * .exportableKey(false)
 * .requireAlternateSignatureAlgorithm(false)
 * .requireSameKeyRenewal(false)
 * .strongKeyProtectionRequired(false)
 * .useLegacyProvider(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-privatekeyflagsv4.html)
 */
@CdkDslMarker
public class CfnTemplatePrivateKeyFlagsV4PropertyDsl {
    private val cdkBuilder: CfnTemplate.PrivateKeyFlagsV4Property.Builder =
        CfnTemplate.PrivateKeyFlagsV4Property.builder()

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
     * @param requireAlternateSignatureAlgorithm Requires the PKCS #1 v2.1 signature format for
     *   certificates. You should verify that your CA, objects, and applications can accept this
     *   signature format.
     */
    public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: Boolean) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
    }

    /**
     * @param requireAlternateSignatureAlgorithm Requires the PKCS #1 v2.1 signature format for
     *   certificates. You should verify that your CA, objects, and applications can accept this
     *   signature format.
     */
    public fun requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm: IResolvable) {
        cdkBuilder.requireAlternateSignatureAlgorithm(requireAlternateSignatureAlgorithm)
    }

    /** @param requireSameKeyRenewal Renew certificate using the same private key. */
    public fun requireSameKeyRenewal(requireSameKeyRenewal: Boolean) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal)
    }

    /** @param requireSameKeyRenewal Renew certificate using the same private key. */
    public fun requireSameKeyRenewal(requireSameKeyRenewal: IResolvable) {
        cdkBuilder.requireSameKeyRenewal(requireSameKeyRenewal)
    }

    /**
     * @param strongKeyProtectionRequired Require user input when using the private key for
     *   enrollment.
     */
    public fun strongKeyProtectionRequired(strongKeyProtectionRequired: Boolean) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
    }

    /**
     * @param strongKeyProtectionRequired Require user input when using the private key for
     *   enrollment.
     */
    public fun strongKeyProtectionRequired(strongKeyProtectionRequired: IResolvable) {
        cdkBuilder.strongKeyProtectionRequired(strongKeyProtectionRequired)
    }

    /**
     * @param useLegacyProvider Specifies the cryptographic service provider category used to
     *   generate private keys. Set to TRUE to use Legacy Cryptographic Service Providers and FALSE
     *   to use Key Storage Providers.
     */
    public fun useLegacyProvider(useLegacyProvider: Boolean) {
        cdkBuilder.useLegacyProvider(useLegacyProvider)
    }

    /**
     * @param useLegacyProvider Specifies the cryptographic service provider category used to
     *   generate private keys. Set to TRUE to use Legacy Cryptographic Service Providers and FALSE
     *   to use Key Storage Providers.
     */
    public fun useLegacyProvider(useLegacyProvider: IResolvable) {
        cdkBuilder.useLegacyProvider(useLegacyProvider)
    }

    public fun build(): CfnTemplate.PrivateKeyFlagsV4Property = cdkBuilder.build()
}
