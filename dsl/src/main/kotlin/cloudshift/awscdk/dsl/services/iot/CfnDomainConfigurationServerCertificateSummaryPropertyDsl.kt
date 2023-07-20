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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnDomainConfiguration
import kotlin.String

@CdkDslMarker
public class CfnDomainConfigurationServerCertificateSummaryPropertyDsl {
    private val cdkBuilder: CfnDomainConfiguration.ServerCertificateSummaryProperty.Builder =
        CfnDomainConfiguration.ServerCertificateSummaryProperty.builder()

    public fun serverCertificateArn(serverCertificateArn: String) {
        cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    public fun serverCertificateStatus(serverCertificateStatus: String) {
        cdkBuilder.serverCertificateStatus(serverCertificateStatus)
    }

    public fun serverCertificateStatusDetail(serverCertificateStatusDetail: String) {
        cdkBuilder.serverCertificateStatusDetail(serverCertificateStatusDetail)
    }

    public fun build(): CfnDomainConfiguration.ServerCertificateSummaryProperty = cdkBuilder.build()
}
