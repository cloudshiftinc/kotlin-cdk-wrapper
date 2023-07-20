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
public class CfnCertificateAuthorityAccessDescriptionPropertyDsl {
    private val cdkBuilder: CfnCertificateAuthority.AccessDescriptionProperty.Builder =
        CfnCertificateAuthority.AccessDescriptionProperty.builder()

    public fun accessLocation(accessLocation: IResolvable) {
        cdkBuilder.accessLocation(accessLocation)
    }

    public fun accessLocation(accessLocation: CfnCertificateAuthority.GeneralNameProperty) {
        cdkBuilder.accessLocation(accessLocation)
    }

    public fun accessMethod(accessMethod: IResolvable) {
        cdkBuilder.accessMethod(accessMethod)
    }

    public fun accessMethod(accessMethod: CfnCertificateAuthority.AccessMethodProperty) {
        cdkBuilder.accessMethod(accessMethod)
    }

    public fun build(): CfnCertificateAuthority.AccessDescriptionProperty = cdkBuilder.build()
}
