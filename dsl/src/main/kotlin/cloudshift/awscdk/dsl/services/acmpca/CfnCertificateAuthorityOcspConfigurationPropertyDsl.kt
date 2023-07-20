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
import kotlin.String

@CdkDslMarker
public class CfnCertificateAuthorityOcspConfigurationPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.OcspConfigurationProperty.Builder =
        CfnCertificateAuthority.OcspConfigurationProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun ocspCustomCname(ocspCustomCname: String) {
        cdkBuilder.ocspCustomCname(ocspCustomCname)
    }

    public fun build(): CfnCertificateAuthority.OcspConfigurationProperty = cdkBuilder.build()
}
