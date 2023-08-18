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
import software.amazon.awscdk.services.ecs.Protocol
import software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps

/**
 * Properties to define an application target group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.ecs.patterns.*;
 * ApplicationTargetProps applicationTargetProps = ApplicationTargetProps.builder()
 * .containerPort(123)
 * // the properties below are optional
 * .hostHeader("hostHeader")
 * .listener("listener")
 * .pathPattern("pathPattern")
 * .priority(123)
 * .protocol(Protocol.TCP)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationTargetPropsDsl {
    private val cdkBuilder: ApplicationTargetProps.Builder = ApplicationTargetProps.builder()

    /**
     * @param containerPort The port number of the container. Only applicable when using
     *   application/network load balancers.
     */
    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    /**
     * @param hostHeader Rule applies if the requested host matches the indicated host. May contain
     *   up to three '*' wildcards.
     *
     * Requires that priority is set.
     */
    public fun hostHeader(hostHeader: String) {
        cdkBuilder.hostHeader(hostHeader)
    }

    /** @param listener Name of the listener the target group attached to. */
    public fun listener(listener: String) {
        cdkBuilder.listener(listener)
    }

    /**
     * @param pathPattern Rule applies if the requested path matches the given path pattern. May
     *   contain up to three '*' wildcards.
     *
     * Requires that priority is set.
     */
    public fun pathPattern(pathPattern: String) {
        cdkBuilder.pathPattern(pathPattern)
    }

    /**
     * @param priority Priority of this target group. The rule with the lowest priority will be used
     *   for every request. If priority is not given, these target groups will be added as defaults,
     *   and must not have conditions.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * @param protocol The protocol used for the port mapping. Only applicable when using
     *   application load balancers.
     */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): ApplicationTargetProps = cdkBuilder.build()
}
