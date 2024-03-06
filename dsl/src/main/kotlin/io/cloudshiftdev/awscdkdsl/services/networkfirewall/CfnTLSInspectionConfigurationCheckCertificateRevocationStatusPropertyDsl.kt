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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration

/**
 * When enabled, Network Firewall checks if the server certificate presented by the server in the
 * SSL/TLS connection has a revoked or unkown status.
 *
 * If the certificate has an unknown or revoked status, you must specify the actions that Network
 * Firewall takes on outbound traffic. To check the certificate revocation status, you must also
 * specify a `CertificateAuthorityArn` in
 * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CheckCertificateRevocationStatusProperty checkCertificateRevocationStatusProperty =
 * CheckCertificateRevocationStatusProperty.builder()
 * .revokedStatusAction("revokedStatusAction")
 * .unknownStatusAction("unknownStatusAction")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationCheckCertificateRevocationStatusPropertyDsl {
    private val cdkBuilder:
        CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty.Builder =
        CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty.builder()

    /**
     * @param revokedStatusAction Configures how Network Firewall processes traffic when it
     *   determines that the certificate presented by the server in the SSL/TLS connection has a
     *   revoked status.
     * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
     *   engine for inspection.
     * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
     *   connection.
     * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
     *   closes the connection and drops subsequent packets for that connection. `REJECT` is
     *   available only for TCP traffic.
     */
    public fun revokedStatusAction(revokedStatusAction: String) {
        cdkBuilder.revokedStatusAction(revokedStatusAction)
    }

    /**
     * @param unknownStatusAction Configures how Network Firewall processes traffic when it
     *   determines that the certificate presented by the server in the SSL/TLS connection has an
     *   unknown status, or a status that cannot be determined for any other reason, including when
     *   the service is unable to connect to the OCSP and CRL endpoints for the certificate.
     * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
     *   engine for inspection.
     * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
     *   connection.
     * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
     *   closes the connection and drops subsequent packets for that connection. `REJECT` is
     *   available only for TCP traffic.
     */
    public fun unknownStatusAction(unknownStatusAction: String) {
        cdkBuilder.unknownStatusAction(unknownStatusAction)
    }

    public fun build(): CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty =
        cdkBuilder.build()
}
