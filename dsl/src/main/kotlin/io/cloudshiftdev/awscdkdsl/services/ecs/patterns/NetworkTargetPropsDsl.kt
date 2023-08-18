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

package io.cloudshiftdev.awscdkdsl.services.ecs.patterns

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps

/**
 * Properties to define a network load balancer target group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * NetworkTargetProps networkTargetProps = NetworkTargetProps.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .listener("listener")
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkTargetPropsDsl {
    private val cdkBuilder: NetworkTargetProps.Builder = NetworkTargetProps.builder()

    /**
     * @param containerPort The port number of the container. Only applicable when using
     *   application/network load balancers.
     */
    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    /** @param listener Name of the listener the target group attached to. */
    public fun listener(listener: String) {
        cdkBuilder.listener(listener)
    }

    public fun build(): NetworkTargetProps = cdkBuilder.build()
}
