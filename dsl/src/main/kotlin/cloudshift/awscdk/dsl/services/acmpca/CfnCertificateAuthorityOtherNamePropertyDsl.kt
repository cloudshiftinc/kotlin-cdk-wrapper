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
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority
import kotlin.String

@CdkDslMarker
public class CfnCertificateAuthorityOtherNamePropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.OtherNameProperty.Builder =
        CfnCertificateAuthority.OtherNameProperty.builder()

    public fun typeId(typeId: String) {
        cdkBuilder.typeId(typeId)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCertificateAuthority.OtherNameProperty = cdkBuilder.build()
}
