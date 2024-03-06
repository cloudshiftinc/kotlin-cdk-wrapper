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
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.DomainName
import software.amazon.awscdk.services.apigatewayv2.EndpointType
import software.amazon.awscdk.services.apigatewayv2.MTLSConfig
import software.amazon.awscdk.services.apigatewayv2.SecurityPolicy
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.constructs.Construct

/**
 * Custom domain resource for the API.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
 * Function handler;
 * String certArn = "arn:aws:acm:us-east-1:111111111111:certificate";
 * String domainName = "example.com";
 * DomainName dn = DomainName.Builder.create(this, "DN")
 * .domainName(domainName)
 * .certificate(Certificate.fromCertificateArn(this, "cert", certArn))
 * .build();
 * HttpApi api = HttpApi.Builder.create(this, "HttpProxyProdApi")
 * .defaultIntegration(new HttpLambdaIntegration("DefaultIntegration", handler))
 * // https://${dn.domainName}/foo goes to prodApi $default stage
 * .defaultDomainMapping(DomainMappingOptions.builder()
 * .domainName(dn)
 * .mappingKey("foo")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DomainNameDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DomainName.Builder = DomainName.Builder.create(scope, id)

    /**
     * The ACM certificate for this domain name.
     *
     * Certificate can be both ACM issued or imported.
     *
     * @param certificate The ACM certificate for this domain name.
     */
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * The user-friendly name of the certificate that will be used by the endpoint for this domain
     * name.
     *
     * Default: - No friendly certificate name
     *
     * @param certificateName The user-friendly name of the certificate that will be used by the
     *   endpoint for this domain name.
     */
    public fun certificateName(certificateName: String) {
        cdkBuilder.certificateName(certificateName)
    }

    /**
     * The custom domain name.
     *
     * @param domainName The custom domain name.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The type of endpoint for this DomainName.
     *
     * Default: EndpointType.REGIONAL
     *
     * @param endpointType The type of endpoint for this DomainName.
     */
    public fun endpointType(endpointType: EndpointType) {
        cdkBuilder.endpointType(endpointType)
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    public fun mtls(mtls: MTLSConfigDsl.() -> Unit = {}) {
        val builder = MTLSConfigDsl()
        builder.apply(mtls)
        cdkBuilder.mtls(builder.build())
    }

    /**
     * The mutual TLS authentication configuration for a custom domain name.
     *
     * Default: - mTLS is not configured.
     *
     * @param mtls The mutual TLS authentication configuration for a custom domain name.
     */
    public fun mtls(mtls: MTLSConfig) {
        cdkBuilder.mtls(mtls)
    }

    /**
     * A public certificate issued by ACM to validate that you own a custom domain.
     *
     * This parameter is required only when you configure mutual TLS authentication and you specify
     * an ACM imported or private CA certificate for `certificate`. The ownership certificate
     * validates that you have permissions to use the domain name.
     *
     * Default: - only required when configuring mTLS
     *
     * @param ownershipCertificate A public certificate issued by ACM to validate that you own a
     *   custom domain.
     */
    public fun ownershipCertificate(ownershipCertificate: ICertificate) {
        cdkBuilder.ownershipCertificate(ownershipCertificate)
    }

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this domain name.
     *
     * Default: SecurityPolicy.TLS_1_2
     *
     * @param securityPolicy The Transport Layer Security (TLS) version + cipher suite for this
     *   domain name.
     */
    public fun securityPolicy(securityPolicy: SecurityPolicy) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun build(): DomainName = cdkBuilder.build()
}
