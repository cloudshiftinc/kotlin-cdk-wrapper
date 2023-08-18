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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appmesh.AccessLog
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualGatewayListener
import software.amazon.awscdk.services.appmesh.VirtualGatewayProps

/**
 * Properties used when creating a new VirtualGateway.
 *
 * Example:
 * ```
 * Mesh mesh;
 * String certificateAuthorityArn =
 * "arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012";
 * VirtualGateway gateway = VirtualGateway.Builder.create(this, "gateway")
 * .mesh(mesh)
 * .listeners(List.of(VirtualGatewayListener.http(HttpGatewayListenerOptions.builder()
 * .port(443)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .interval(Duration.seconds(10))
 * .build()))
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .ports(List.of(8080, 8081))
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.acm(List.of(CertificateAuthority.fromCertificateAuthorityArn(this,
 * "certificate", certificateAuthorityArn))))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .virtualGatewayName("virtualGateway")
 * .build();
 * ```
 */
@CdkDslMarker
public class VirtualGatewayPropsDsl {
    private val cdkBuilder: VirtualGatewayProps.Builder = VirtualGatewayProps.builder()

    private val _listeners: MutableList<VirtualGatewayListener> = mutableListOf()

    /** @param accessLog Access Logging Configuration for the VirtualGateway. */
    public fun accessLog(accessLog: AccessLog) {
        cdkBuilder.accessLog(accessLog)
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     *   Service.
     */
    public fun backendDefaults(backendDefaults: BackendDefaultsDsl.() -> Unit = {}) {
        val builder = BackendDefaultsDsl()
        builder.apply(backendDefaults)
        cdkBuilder.backendDefaults(builder.build())
    }

    /**
     * @param backendDefaults Default Configuration Virtual Node uses to communicate with Virtual
     *   Service.
     */
    public fun backendDefaults(backendDefaults: BackendDefaults) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    /** @param listeners Listeners for the VirtualGateway. Only one is supported. */
    public fun listeners(vararg listeners: VirtualGatewayListener) {
        _listeners.addAll(listOf(*listeners))
    }

    /** @param listeners Listeners for the VirtualGateway. Only one is supported. */
    public fun listeners(listeners: Collection<VirtualGatewayListener>) {
        _listeners.addAll(listeners)
    }

    /** @param mesh The Mesh which the VirtualGateway belongs to. */
    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    /** @param virtualGatewayName Name of the VirtualGateway. */
    public fun virtualGatewayName(virtualGatewayName: String) {
        cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): VirtualGatewayProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
