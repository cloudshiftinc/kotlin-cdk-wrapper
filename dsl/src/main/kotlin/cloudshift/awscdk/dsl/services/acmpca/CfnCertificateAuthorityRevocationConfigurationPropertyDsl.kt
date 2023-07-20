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

@CdkDslMarker
public class CfnCertificateAuthorityRevocationConfigurationPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.RevocationConfigurationProperty.Builder =
        CfnCertificateAuthority.RevocationConfigurationProperty.builder()

    public fun crlConfiguration(crlConfiguration: IResolvable) {
        cdkBuilder.crlConfiguration(crlConfiguration)
    }

    public fun crlConfiguration(crlConfiguration: CfnCertificateAuthority.CrlConfigurationProperty) {
        cdkBuilder.crlConfiguration(crlConfiguration)
    }

    public fun ocspConfiguration(ocspConfiguration: IResolvable) {
        cdkBuilder.ocspConfiguration(ocspConfiguration)
    }

    public fun ocspConfiguration(ocspConfiguration: CfnCertificateAuthority.OcspConfigurationProperty) {
        cdkBuilder.ocspConfiguration(ocspConfiguration)
    }

    public fun build(): CfnCertificateAuthority.RevocationConfigurationProperty = cdkBuilder.build()
}
