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
public class CfnCertificateAuthorityCustomAttributePropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.CustomAttributeProperty.Builder =
        CfnCertificateAuthority.CustomAttributeProperty.builder()

    public fun objectIdentifier(objectIdentifier: String) {
        cdkBuilder.objectIdentifier(objectIdentifier)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCertificateAuthority.CustomAttributeProperty = cdkBuilder.build()
}
