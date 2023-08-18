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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents the Transport Layer Security (TLS) properties for a listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayListenerTlsProperty virtualGatewayListenerTlsProperty =
 * VirtualGatewayListenerTlsProperty.builder()
 * .certificate(VirtualGatewayListenerTlsCertificateProperty.builder()
 * .acm(VirtualGatewayListenerTlsAcmCertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build())
 * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .mode("mode")
 * // the properties below are optional
 * .validation(VirtualGatewayListenerTlsValidationContextProperty.builder()
 * .trust(VirtualGatewayListenerTlsValidationContextTrustProperty.builder()
 * .file(VirtualGatewayTlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(VirtualGatewayTlsValidationContextSdsTrustProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * // the properties below are optional
 * .subjectAlternativeNames(SubjectAlternativeNamesProperty.builder()
 * .match(SubjectAlternativeNameMatchersProperty.builder()
 * .exact(List.of("exact"))
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewaylistenertls.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayListenerTlsPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayListenerTlsProperty.Builder =
        CfnVirtualGateway.VirtualGatewayListenerTlsProperty.builder()

    /**
     * @param certificate An object that represents a Transport Layer Security (TLS) certificate.
     */
    public fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param certificate An object that represents a Transport Layer Security (TLS) certificate.
     */
    public fun certificate(
        certificate: CfnVirtualGateway.VirtualGatewayListenerTlsCertificateProperty
    ) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param mode Specify one of the following modes.
     * * ** STRICT – Listener only accepts connections with TLS enabled.
     * * ** PERMISSIVE – Listener accepts connections with or without TLS enabled.
     * * ** DISABLED – Listener only accepts connections without TLS.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param validation A reference to an object that represents a virtual gateway's listener's
     *   Transport Layer Security (TLS) validation context.
     */
    public fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation)
    }

    /**
     * @param validation A reference to an object that represents a virtual gateway's listener's
     *   Transport Layer Security (TLS) validation context.
     */
    public fun validation(
        validation: CfnVirtualGateway.VirtualGatewayListenerTlsValidationContextProperty
    ) {
        cdkBuilder.validation(validation)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayListenerTlsProperty = cdkBuilder.build()
}
