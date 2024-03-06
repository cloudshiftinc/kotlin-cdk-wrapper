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

package io.cloudshiftdev.awscdkdsl.services.apigatewayv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.EndpointOptions
import software.amazon.awscdk.services.apigatewayv2.EndpointType
import software.amazon.awscdk.services.apigatewayv2.SecurityPolicy
import software.amazon.awscdk.services.certificatemanager.ICertificate

/**
 * properties for creating a domain name endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * import software.amazon.awscdk.services.certificatemanager.*;
 * Certificate certificate;
 * EndpointOptions endpointOptions = EndpointOptions.builder()
 * .certificate(certificate)
 * // the properties below are optional
 * .certificateName("certificateName")
 * .endpointType(EndpointType.EDGE)
 * .ownershipCertificate(certificate)
 * .securityPolicy(SecurityPolicy.TLS_1_0)
 * .build();
 * ```
 */
@CdkDslMarker
public class EndpointOptionsDsl {
    private val cdkBuilder: EndpointOptions.Builder = EndpointOptions.builder()

    /**
     * @param certificate The ACM certificate for this domain name. Certificate can be both ACM
     *   issued or imported.
     */
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param certificateName The user-friendly name of the certificate that will be used by the
     *   endpoint for this domain name.
     */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /** @param endpointType The type of endpoint for this DomainName. */
    public fun endpointType(endpointType: EndpointType) {
        cdkBuilder.endpointType(endpointType)
    }

    /**
     * @param ownershipCertificate A public certificate issued by ACM to validate that you own a
     *   custom domain. This parameter is required only when you configure mutual TLS authentication
     *   and you specify an ACM imported or private CA certificate for `certificate`. The ownership
     *   certificate validates that you have permissions to use the domain name.
     */
    public fun ownershipCertificate(ownershipCertificate: ICertificate) {
        cdkBuilder.ownershipCertificate(ownershipCertificate)
    }

    /**
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     *   domain name.
     */
    public fun securityPolicy(securityPolicy: SecurityPolicy) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun build(): EndpointOptions = cdkBuilder.build()
}
