@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnDomainConfiguration

/**
 * An object that contains information about a server certificate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * ServerCertificateSummaryProperty serverCertificateSummaryProperty =
 * ServerCertificateSummaryProperty.builder()
 * .serverCertificateArn("serverCertificateArn")
 * .serverCertificateStatus("serverCertificateStatus")
 * .serverCertificateStatusDetail("serverCertificateStatusDetail")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-domainconfiguration-servercertificatesummary.html)
 */
@CdkDslMarker
public class CfnDomainConfigurationServerCertificateSummaryPropertyDsl {
    private val cdkBuilder: CfnDomainConfiguration.ServerCertificateSummaryProperty.Builder =
        CfnDomainConfiguration.ServerCertificateSummaryProperty.builder()

    /** @param serverCertificateArn The ARN of the server certificate. */
    public fun serverCertificateArn(serverCertificateArn: String) {
        cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    /** @param serverCertificateStatus The status of the server certificate. */
    public fun serverCertificateStatus(serverCertificateStatus: String) {
        cdkBuilder.serverCertificateStatus(serverCertificateStatus)
    }

    /**
     * @param serverCertificateStatusDetail Details that explain the status of the server
     *   certificate.
     */
    public fun serverCertificateStatusDetail(serverCertificateStatusDetail: String) {
        cdkBuilder.serverCertificateStatusDetail(serverCertificateStatusDetail)
    }

    public fun build(): CfnDomainConfiguration.ServerCertificateSummaryProperty = cdkBuilder.build()
}
