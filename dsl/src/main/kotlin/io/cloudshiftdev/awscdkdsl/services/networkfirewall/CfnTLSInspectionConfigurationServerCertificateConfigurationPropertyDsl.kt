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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration

/**
 * Configures the AWS Certificate Manager certificates and scope that Network Firewall uses to
 * decrypt and re-encrypt traffic using a
 * [TLSInspectionConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html)
 * . You can configure `ServerCertificates` for inbound SSL/TLS inspection, a
 * `CertificateAuthorityArn` for outbound SSL/TLS inspection, or both. For information about working
 * with certificates for TLS inspection, see
 * [Using SSL/TLS server certficiates with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html)
 * in the *AWS Network Firewall Developer Guide* .
 *
 * If a server certificate that's associated with your
 * [TLSInspectionConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html)
 * is revoked, deleted, or expired it can result in client-side TLS errors.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * ServerCertificateConfigurationProperty serverCertificateConfigurationProperty =
 * ServerCertificateConfigurationProperty.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .checkCertificateRevocationStatus(CheckCertificateRevocationStatusProperty.builder()
 * .revokedStatusAction("revokedStatusAction")
 * .unknownStatusAction("unknownStatusAction")
 * .build())
 * .scopes(List.of(ServerCertificateScopeProperty.builder()
 * .destinationPorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .destinations(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .protocols(List.of(123))
 * .sourcePorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .sources(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .build()))
 * .serverCertificates(List.of(ServerCertificateProperty.builder()
 * .resourceArn("resourceArn")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationServerCertificateConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty.Builder =
        CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty.builder()

    private val _scopes: MutableList<Any> = mutableListOf()

    private val _serverCertificates: MutableList<Any> = mutableListOf()

    /**
     * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the imported certificate
     *   authority (CA) certificate within AWS Certificate Manager (ACM) to use for outbound SSL/TLS
     *   inspection. The following limitations apply:
     * * You can use CA certificates that you imported into ACM, but you can't generate CA
     *   certificates with ACM.
     * * You can't use certificates issued by AWS Private Certificate Authority .
     *
     * For more information about configuring certificates for outbound inspection, see
     * [Using SSL/TLS certificates with certificates with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * For information about working with certificates in ACM, see
     * [Importing certificates](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html)
     * in the *AWS Certificate Manager User Guide* .
     */
    public fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    /**
     * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
     *   certificate presented by the server in the SSL/TLS connection has a revoked or unkown
     *   status. If the certificate has an unknown or revoked status, you must specify the actions
     *   that Network Firewall takes on outbound traffic. To check the certificate revocation
     *   status, you must also specify a `CertificateAuthorityArn` in
     *   [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
     *   .
     */
    public fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: IResolvable) {
        cdkBuilder.checkCertificateRevocationStatus(checkCertificateRevocationStatus)
    }

    /**
     * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
     *   certificate presented by the server in the SSL/TLS connection has a revoked or unkown
     *   status. If the certificate has an unknown or revoked status, you must specify the actions
     *   that Network Firewall takes on outbound traffic. To check the certificate revocation
     *   status, you must also specify a `CertificateAuthorityArn` in
     *   [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
     *   .
     */
    public fun checkCertificateRevocationStatus(
        checkCertificateRevocationStatus:
            CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty
    ) {
        cdkBuilder.checkCertificateRevocationStatus(checkCertificateRevocationStatus)
    }

    /** @param scopes A list of scopes. */
    public fun scopes(vararg scopes: Any) {
        _scopes.addAll(listOf(*scopes))
    }

    /** @param scopes A list of scopes. */
    public fun scopes(scopes: Collection<Any>) {
        _scopes.addAll(scopes)
    }

    /** @param scopes A list of scopes. */
    public fun scopes(scopes: IResolvable) {
        cdkBuilder.scopes(scopes)
    }

    /**
     * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
     *   inspection.
     */
    public fun serverCertificates(vararg serverCertificates: Any) {
        _serverCertificates.addAll(listOf(*serverCertificates))
    }

    /**
     * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
     *   inspection.
     */
    public fun serverCertificates(serverCertificates: Collection<Any>) {
        _serverCertificates.addAll(serverCertificates)
    }

    /**
     * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
     *   inspection.
     */
    public fun serverCertificates(serverCertificates: IResolvable) {
        cdkBuilder.serverCertificates(serverCertificates)
    }

    public fun build(): CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty {
        if (_scopes.isNotEmpty()) cdkBuilder.scopes(_scopes)
        if (_serverCertificates.isNotEmpty()) cdkBuilder.serverCertificates(_serverCertificates)
        return cdkBuilder.build()
    }
}
