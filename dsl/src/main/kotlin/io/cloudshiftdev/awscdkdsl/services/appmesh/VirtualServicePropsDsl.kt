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
import software.amazon.awscdk.services.appmesh.VirtualServiceProps
import software.amazon.awscdk.services.appmesh.VirtualServiceProvider

/**
 * The properties applied to the VirtualService being defined.
 *
 * Example:
 * ```
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node"))
 * .build();
 * VirtualService virtualService = VirtualService.Builder.create(this, "service-1")
 * .virtualServiceProvider(VirtualServiceProvider.virtualNode(node))
 * .virtualServiceName("service1.domain.local")
 * .build();
 * node.addBackend(Backend.virtualService(virtualService));
 * ```
 */
@CdkDslMarker
public class VirtualServicePropsDsl {
    private val cdkBuilder: VirtualServiceProps.Builder = VirtualServiceProps.builder()

    /**
     * @param virtualServiceName The name of the VirtualService. It is recommended this follows the
     *   fully-qualified domain name format, such as "my-service.default.svc.cluster.local".
     *
     * Example value: `service.domain.local`
     */
    public fun virtualServiceName(virtualServiceName: String) {
        cdkBuilder.virtualServiceName(virtualServiceName)
    }

    /**
     * @param virtualServiceProvider The VirtualNode or VirtualRouter which the VirtualService uses
     *   as its provider.
     */
    public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
        cdkBuilder.virtualServiceProvider(virtualServiceProvider)
    }

    public fun build(): VirtualServiceProps = cdkBuilder.build()
}
