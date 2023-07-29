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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Specifies additional purposes for which the certified public key may be used other than basic
 * purposes indicated in the `KeyUsage` extension.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * ExtendedKeyUsageProperty extendedKeyUsageProperty = ExtendedKeyUsageProperty.builder()
 * .extendedKeyUsageObjectIdentifier("extendedKeyUsageObjectIdentifier")
 * .extendedKeyUsageType("extendedKeyUsageType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-extendedkeyusage.html)
 */
@CdkDslMarker
public class CfnCertificateExtendedKeyUsagePropertyDsl {
    private val cdkBuilder: CfnCertificate.ExtendedKeyUsageProperty.Builder =
        CfnCertificate.ExtendedKeyUsageProperty.builder()

    /**
     * @param extendedKeyUsageObjectIdentifier Specifies a custom `ExtendedKeyUsage` with an object
     *   identifier (OID).
     */
    public fun extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier: String) {
        cdkBuilder.extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier)
    }

    /**
     * @param extendedKeyUsageType Specifies a standard `ExtendedKeyUsage` as defined as in
     *   [RFC 5280](https://docs.aws.amazon.com/https://datatracker.ietf.org/doc/html/rfc5280#section-4.2.1.12)
     *   .
     */
    public fun extendedKeyUsageType(extendedKeyUsageType: String) {
        cdkBuilder.extendedKeyUsageType(extendedKeyUsageType)
    }

    public fun build(): CfnCertificate.ExtendedKeyUsageProperty = cdkBuilder.build()
}
