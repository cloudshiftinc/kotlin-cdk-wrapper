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

package cloudshift.awscdk.dsl.services.acmpca

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import kotlin.Boolean

@CdkDslMarker
public class CfnCertificateAuthorityKeyUsagePropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.KeyUsageProperty.Builder =
        CfnCertificateAuthority.KeyUsageProperty.builder()

    public fun crlSign(crlSign: Boolean) {
        cdkBuilder.crlSign(crlSign)
    }

    public fun crlSign(crlSign: IResolvable) {
        cdkBuilder.crlSign(crlSign)
    }

    public fun dataEncipherment(dataEncipherment: Boolean) {
        cdkBuilder.dataEncipherment(dataEncipherment)
    }

    public fun dataEncipherment(dataEncipherment: IResolvable) {
        cdkBuilder.dataEncipherment(dataEncipherment)
    }

    public fun decipherOnly(decipherOnly: Boolean) {
        cdkBuilder.decipherOnly(decipherOnly)
    }

    public fun decipherOnly(decipherOnly: IResolvable) {
        cdkBuilder.decipherOnly(decipherOnly)
    }

    public fun digitalSignature(digitalSignature: Boolean) {
        cdkBuilder.digitalSignature(digitalSignature)
    }

    public fun digitalSignature(digitalSignature: IResolvable) {
        cdkBuilder.digitalSignature(digitalSignature)
    }

    public fun encipherOnly(encipherOnly: Boolean) {
        cdkBuilder.encipherOnly(encipherOnly)
    }

    public fun encipherOnly(encipherOnly: IResolvable) {
        cdkBuilder.encipherOnly(encipherOnly)
    }

    public fun keyAgreement(keyAgreement: Boolean) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    public fun keyAgreement(keyAgreement: IResolvable) {
        cdkBuilder.keyAgreement(keyAgreement)
    }

    public fun keyCertSign(keyCertSign: Boolean) {
        cdkBuilder.keyCertSign(keyCertSign)
    }

    public fun keyCertSign(keyCertSign: IResolvable) {
        cdkBuilder.keyCertSign(keyCertSign)
    }

    public fun keyEncipherment(keyEncipherment: Boolean) {
        cdkBuilder.keyEncipherment(keyEncipherment)
    }

    public fun keyEncipherment(keyEncipherment: IResolvable) {
        cdkBuilder.keyEncipherment(keyEncipherment)
    }

    public fun nonRepudiation(nonRepudiation: Boolean) {
        cdkBuilder.nonRepudiation(nonRepudiation)
    }

    public fun nonRepudiation(nonRepudiation: IResolvable) {
        cdkBuilder.nonRepudiation(nonRepudiation)
    }

    public fun build(): CfnCertificateAuthority.KeyUsageProperty = cdkBuilder.build()
}
