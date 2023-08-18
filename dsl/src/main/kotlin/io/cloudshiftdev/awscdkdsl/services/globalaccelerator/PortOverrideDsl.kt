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

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.PortOverride

/**
 * Override specific listener ports used to route traffic to endpoints that are part of an endpoint
 * group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * PortOverride portOverride = PortOverride.builder()
 * .endpointPort(123)
 * .listenerPort(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class PortOverrideDsl {
    private val cdkBuilder: PortOverride.Builder = PortOverride.builder()

    /**
     * @param endpointPort The endpoint port that you want a listener port to be mapped to. This is
     *   the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     */
    public fun endpointPort(endpointPort: Number) {
        cdkBuilder.endpointPort(endpointPort)
    }

    /**
     * @param listenerPort The listener port that you want to map to a specific endpoint port. This
     *   is the port that user traffic arrives to the Global Accelerator on.
     */
    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    public fun build(): PortOverride = cdkBuilder.build()
}
