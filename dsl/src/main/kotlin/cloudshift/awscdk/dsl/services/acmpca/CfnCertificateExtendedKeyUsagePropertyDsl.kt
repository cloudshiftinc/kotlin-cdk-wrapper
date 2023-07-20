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
import software.amazon.awscdk.services.acmpca.CfnCertificate
import kotlin.String

@CdkDslMarker
public class CfnCertificateExtendedKeyUsagePropertyDsl {
    private val cdkBuilder: CfnCertificate.ExtendedKeyUsageProperty.Builder =
        CfnCertificate.ExtendedKeyUsageProperty.builder()

    public fun extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier: String) {
        cdkBuilder.extendedKeyUsageObjectIdentifier(extendedKeyUsageObjectIdentifier)
    }

    public fun extendedKeyUsageType(extendedKeyUsageType: String) {
        cdkBuilder.extendedKeyUsageType(extendedKeyUsageType)
    }

    public fun build(): CfnCertificate.ExtendedKeyUsageProperty = cdkBuilder.build()
}
