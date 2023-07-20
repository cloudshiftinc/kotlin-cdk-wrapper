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

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.certificatemanager.CfnCertificate
import kotlin.String

@CdkDslMarker
public class CfnCertificateDomainValidationOptionPropertyDsl {
    private val cdkBuilder: CfnCertificate.DomainValidationOptionProperty.Builder =
        CfnCertificate.DomainValidationOptionProperty.builder()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun validationDomain(validationDomain: String) {
        cdkBuilder.validationDomain(validationDomain)
    }

    public fun build(): CfnCertificate.DomainValidationOptionProperty = cdkBuilder.build()
}
