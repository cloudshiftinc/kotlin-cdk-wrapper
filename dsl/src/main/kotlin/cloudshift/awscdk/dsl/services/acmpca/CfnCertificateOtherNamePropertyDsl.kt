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
public class CfnCertificateOtherNamePropertyDsl {
    private val cdkBuilder: CfnCertificate.OtherNameProperty.Builder =
        CfnCertificate.OtherNameProperty.builder()

    public fun typeId(typeId: String) {
        cdkBuilder.typeId(typeId)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnCertificate.OtherNameProperty = cdkBuilder.build()
}
