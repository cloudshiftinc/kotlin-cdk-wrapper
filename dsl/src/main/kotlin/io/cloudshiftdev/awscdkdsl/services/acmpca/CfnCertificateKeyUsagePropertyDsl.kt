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

package io.cloudshiftdev.awscdkdsl.services.acmpca

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificate

/**
 * Defines one or more purposes for which the key contained in the certificate can be used.
 *
 * Default value for each option is false.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.acmpca.*;
 * KeyUsageProperty keyUsageProperty = KeyUsageProperty.builder()
 * .crlSign(false)
 * .dataEncipherment(false)
 * .decipherOnly(false)
 * .digitalSignature(false)
 * .encipherOnly(false)
 * .keyAgreement(false)
 * .keyCertSign(false)
 * .keyEncipherment(false)
 * .nonRepudiation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-acmpca-certificate-keyusage.html)
 */
@CdkDslMarker
public class CfnCertificateKeyUsagePropertyDsl {
    private val cdkBuilder: CfnCertificate.KeyUsageProperty.Builder =
        CfnCertificate.KeyUsageProperty.builder()

    /** @param crlSign Key can be used to sign CRLs. */
    public fun crlSign(crlSign: Boolean) {
        cdkBuilder.crlSign(crlSign)
    }

    /** @param crlSign Key can be used to sign CRLs. */
    public fun crlSign(crlSign: IResolvable) {
        cdkBuilder.crlSign(crlSign)
    }

    /** @param dataEncipherment Key can be used to decipher data. */
    public fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
    }

    /** @param dataEncipherment Key can be used to decipher data. */
    public fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment)
    }

    /** @param decipherOnly Key can be used only to decipher data. */
    public fun decipherOnly(decipherOnly: Boolean) {
        cdkBuilder.decipherOnly(decipherOnly)
    }

    /** @param decipherOnly Key can be used only to decipher data. */
    public fun decipherOnly(decipherOnly: IResolvable) {
        cdkBuilder.decipherOnly(decipherOnly)
    }

    /** @param digitalSignature Key can be used for digital signing. */
    public fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
    }

    /** @param digitalSignature Key can be used for digital signing. */
    public fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature)
    }

    /** @param encipherOnly Key can be used only to encipher data. */
    public fun encipherOnly(encipherOnly: Boolean) {
        cdkBuilder.encipherOnly(encipherOnly)
    }

    /** @param encipherOnly Key can be used only to encipher data. */
    public fun encipherOnly(encipherOnly: IResolvable) {
        cdkBuilder.encipherOnly(encipherOnly)
    }

    /** @param keyAgreement Key can be used in a key-agreement protocol. */
    public fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    /** @param keyAgreement Key can be used in a key-agreement protocol. */
    public fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    /** @param keyCertSign Key can be used to sign certificates. */
    public fun keyCertSign(keyCertSign: Boolean) {
        cdkBuilder.keyCertSign(keyCertSign)
    }

    /** @param keyCertSign Key can be used to sign certificates. */
    public fun keyCertSign(keyCertSign: IResolvable) {
        cdkBuilder.keyCertSign(keyCertSign)
    }

    /** @param keyEncipherment Key can be used to encipher data. */
    public fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
    }

    /** @param keyEncipherment Key can be used to encipher data. */
    public fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment)
    }

    /** @param nonRepudiation Key can be used for non-repudiation. */
    public fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
    }

    /** @param nonRepudiation Key can be used for non-repudiation. */
    public fun nonRepudiation(nonRepudiation: IResolvable) {
        cdkBuilder.nonRepudiation(nonRepudiation)
    }

    public fun build(): CfnCertificate.KeyUsageProperty = cdkBuilder.build()
}
