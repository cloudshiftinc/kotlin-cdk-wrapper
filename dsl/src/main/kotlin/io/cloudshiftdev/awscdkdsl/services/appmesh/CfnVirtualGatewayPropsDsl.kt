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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps

/**
 * Properties for defining a `CfnVirtualGateway`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * CfnVirtualGatewayProps cfnVirtualGatewayProps = CfnVirtualGatewayProps.builder()
 * .meshName("meshName")
 * .spec(VirtualGatewaySpecProperty.builder()
 * .listeners(List.of(VirtualGatewayListenerProperty.builder()
 * .portMapping(VirtualGatewayPortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * // the properties below are optional
 * .connectionPool(VirtualGatewayConnectionPoolProperty.builder()
 * .grpc(VirtualGatewayGrpcConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .http(VirtualGatewayHttpConnectionPoolProperty.builder()
 * .maxConnections(123)
 * // the properties below are optional
 * .maxPendingRequests(123)
 * .build())
 * .http2(VirtualGatewayHttp2ConnectionPoolProperty.builder()
 * .maxRequests(123)
 * .build())
 * .build())
 * .healthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
 * .healthyThreshold(123)
 * .intervalMillis(123)
 * .protocol("protocol")
 * .timeoutMillis(123)
 * .unhealthyThreshold(123)
 * // the properties below are optional
 * .path("path")
 * .port(123)
 * .build())
 * .tls(VirtualGatewayListenerTlsProperty.builder()
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
 * .build())
 * .build()))
 * // the properties below are optional
 * .backendDefaults(VirtualGatewayBackendDefaultsProperty.builder()
 * .clientPolicy(VirtualGatewayClientPolicyProperty.builder()
 * .tls(VirtualGatewayClientPolicyTlsProperty.builder()
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
 * .build())
 * .build())
 * .build())
 * .logging(VirtualGatewayLoggingProperty.builder()
 * .accessLog(VirtualGatewayAccessLogProperty.builder()
 * .file(VirtualGatewayFileAccessLogProperty.builder()
 * .path("path")
 * // the properties below are optional
 * .format(LoggingFormatProperty.builder()
 * .json(List.of(JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .text("text")
 * .build())
 * .build())
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .meshOwner("meshOwner")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .virtualGatewayName("virtualGatewayName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appmesh-virtualgateway.html)
 */
@CdkDslMarker
public class CfnVirtualGatewayPropsDsl {
    private val cdkBuilder: CfnVirtualGatewayProps.Builder = CfnVirtualGatewayProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param meshName The name of the service mesh that the virtual gateway resides in. */
    public fun meshName(meshName: String) {
        cdkBuilder.meshName(meshName)
    }

    /**
     * @param meshOwner The AWS IAM account ID of the service mesh owner. If the account ID is not
     *   your own, then it's the ID of the account that shared the mesh with your account. For more
     *   information about mesh sharing, see
     *   [Working with shared meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html)
     *   .
     */
    public fun meshOwner(meshOwner: String) {
        cdkBuilder.meshOwner(meshOwner)
    }

    /** @param spec The specifications of the virtual gateway. */
    public fun spec(spec: IResolvable) {
        cdkBuilder.spec(spec)
    }

    /** @param spec The specifications of the virtual gateway. */
    public fun spec(spec: CfnVirtualGateway.VirtualGatewaySpecProperty) {
        cdkBuilder.spec(spec)
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual gateway to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Optional metadata that you can apply to the virtual gateway to assist with
     *   categorization and organization. Each tag consists of a key and an optional value, both of
     *   which you define. Tag keys can have a maximum character length of 128 characters, and tag
     *   values can have a maximum length of 256 characters.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param virtualGatewayName The name of the virtual gateway. */
    public fun virtualGatewayName(virtualGatewayName: String) {
        cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): CfnVirtualGatewayProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
