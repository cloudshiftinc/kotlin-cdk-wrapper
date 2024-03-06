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
 * Any AWS Certificate Manager (ACM) Secure Sockets Layer/Transport Layer Security (SSL/TLS) server
 * certificate that's associated with a
 * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html)
 * . Used in a
 * [TLSInspectionConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html)
 * for inspection of inbound traffic to your firewall. You must request or import a SSL/TLS
 * certificate into ACM for each domain Network Firewall needs to decrypt and inspect. AWS Network
 * Firewall uses the SSL/TLS certificates to decrypt specified inbound SSL/TLS traffic going to your
 * firewall. For information about working with certificates in AWS Certificate Manager , see
 * [Request a public certificate](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html)
 * or
 * [Importing certificates](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html)
 * in the *AWS Certificate Manager User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * ServerCertificateProperty serverCertificateProperty = ServerCertificateProperty.builder()
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificate.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationServerCertificatePropertyDsl {
    private val cdkBuilder: CfnTLSInspectionConfiguration.ServerCertificateProperty.Builder =
        CfnTLSInspectionConfiguration.ServerCertificateProperty.builder()

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the AWS Certificate Manager SSL/TLS
     *   server certificate that's used for inbound SSL/TLS inspection.
     */
    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnTLSInspectionConfiguration.ServerCertificateProperty = cdkBuilder.build()
}
