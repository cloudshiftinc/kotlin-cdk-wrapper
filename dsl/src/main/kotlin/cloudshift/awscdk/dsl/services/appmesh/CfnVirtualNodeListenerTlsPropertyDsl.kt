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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the Transport Layer Security (TLS) properties for a listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ListenerTlsProperty listenerTlsProperty = ListenerTlsProperty.builder()
 * .certificate(ListenerTlsCertificateProperty.builder()
 * .acm(ListenerTlsAcmCertificateProperty.builder()
 * .certificateArn("certificateArn")
 * .build())
 * .file(ListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(ListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .mode("mode")
 * // the properties below are optional
 * .validation(ListenerTlsValidationContextProperty.builder()
 * .trust(ListenerTlsValidationContextTrustProperty.builder()
 * .file(TlsValidationContextFileTrustProperty.builder()
 * .certificateChain("certificateChain")
 * .build())
 * .sds(TlsValidationContextSdsTrustProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-listenertls.html)
 */
@CdkDslMarker
public class CfnVirtualNodeListenerTlsPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.ListenerTlsProperty.Builder =
        CfnVirtualNode.ListenerTlsProperty.builder()

    /**
     * @param certificate A reference to an object that represents a listener's Transport Layer
     *   Security (TLS) certificate.
     */
    public fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param certificate A reference to an object that represents a listener's Transport Layer
     *   Security (TLS) certificate.
     */
    public fun certificate(certificate: CfnVirtualNode.ListenerTlsCertificateProperty) {
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
     * @param validation A reference to an object that represents a listener's Transport Layer
     *   Security (TLS) validation context.
     */
    public fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation)
    }

    /**
     * @param validation A reference to an object that represents a listener's Transport Layer
     *   Security (TLS) validation context.
     */
    public fun validation(validation: CfnVirtualNode.ListenerTlsValidationContextProperty) {
        cdkBuilder.validation(validation)
    }

    public fun build(): CfnVirtualNode.ListenerTlsProperty = cdkBuilder.build()
}
