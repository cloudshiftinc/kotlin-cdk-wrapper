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
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

/**
 * An object that represents a Transport Layer Security (TLS) client policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * VirtualGatewayClientPolicyTlsProperty virtualGatewayClientPolicyTlsProperty =
 * VirtualGatewayClientPolicyTlsProperty.builder()
 * .validation(VirtualGatewayTlsValidationContextProperty.builder()
 * .trust(VirtualGatewayTlsValidationContextTrustProperty.builder()
 * .acm(VirtualGatewayTlsValidationContextAcmTrustProperty.builder()
 * .certificateAuthorityArns(List.of("certificateAuthorityArns"))
 * .build())
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
 * // the properties below are optional
 * .certificate(VirtualGatewayClientTlsCertificateProperty.builder()
 * .file(VirtualGatewayListenerTlsFileCertificateProperty.builder()
 * .certificateChain("certificateChain")
 * .privateKey("privateKey")
 * .build())
 * .sds(VirtualGatewayListenerTlsSdsCertificateProperty.builder()
 * .secretName("secretName")
 * .build())
 * .build())
 * .enforce(false)
 * .ports(List.of(123))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualgateway-virtualgatewayclientpolicytls.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayClientPolicyTlsPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.Builder =
        CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty.builder()

    private val _ports: MutableList<Number> = mutableListOf()

    /**
     * @param certificate A reference to an object that represents a virtual gateway's client's
     *   Transport Layer Security (TLS) certificate.
     */
    public fun certificate(certificate: IResolvable) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param certificate A reference to an object that represents a virtual gateway's client's
     *   Transport Layer Security (TLS) certificate.
     */
    public fun certificate(
        certificate: CfnVirtualGateway.VirtualGatewayClientTlsCertificateProperty
    ) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param enforce Whether the policy is enforced. The default is `True` , if a value isn't
     *   specified.
     */
    public fun enforce(enforce: Boolean) {
        cdkBuilder.enforce(enforce)
    }

    /**
     * @param enforce Whether the policy is enforced. The default is `True` , if a value isn't
     *   specified.
     */
    public fun enforce(enforce: IResolvable) {
        cdkBuilder.enforce(enforce)
    }

    /** @param ports One or more ports that the policy is enforced for. */
    public fun ports(vararg ports: Number) {
        _ports.addAll(listOf(*ports))
    }

    /** @param ports One or more ports that the policy is enforced for. */
    public fun ports(ports: Collection<Number>) {
        _ports.addAll(ports)
    }

    /** @param ports One or more ports that the policy is enforced for. */
    public fun ports(ports: IResolvable) {
        cdkBuilder.ports(ports)
    }

    /**
     * @param validation A reference to an object that represents a Transport Layer Security (TLS)
     *   validation context.
     */
    public fun validation(validation: IResolvable) {
        cdkBuilder.validation(validation)
    }

    /**
     * @param validation A reference to an object that represents a Transport Layer Security (TLS)
     *   validation context.
     */
    public fun validation(
        validation: CfnVirtualGateway.VirtualGatewayTlsValidationContextProperty
    ) {
        cdkBuilder.validation(validation)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayClientPolicyTlsProperty {
        if (_ports.isNotEmpty()) cdkBuilder.ports(_ports)
        return cdkBuilder.build()
    }
}
