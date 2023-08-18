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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.Port
import software.amazon.awscdk.services.ec2.Protocol

/**
 * Interface for classes that provide the connection-specification parts of a security group rule.
 *
 * Example:
 * ```
 * InstanceType instanceType;
 * NatInstanceProvider provider = NatProvider.instance(NatInstanceProps.builder()
 * .instanceType(instanceType)
 * .defaultAllowedTraffic(NatTrafficDirection.OUTBOUND_ONLY)
 * .build());
 * Vpc.Builder.create(this, "TheVPC")
 * .natGatewayProvider(provider)
 * .build();
 * provider.connections.allowFrom(Peer.ipv4("1.2.3.4/8"), Port.tcp(80));
 * ```
 */
@CdkDslMarker
public class PortDsl {
    private val cdkBuilder: Port.Builder = Port.Builder.create()

    /**
     * The starting port for the range.
     *
     * Default: - Not included in the rule
     *
     * @param fromPort The starting port for the range.
     */
    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    /**
     * The protocol for the range.
     *
     * @param protocol The protocol for the range.
     */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * String representation for this object.
     *
     * @param stringRepresentation String representation for this object.
     */
    public fun stringRepresentation(stringRepresentation: String) {
        cdkBuilder.stringRepresentation(stringRepresentation)
    }

    /**
     * The ending port for the range.
     *
     * Default: - Not included in the rule
     *
     * @param toPort The ending port for the range.
     */
    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): Port = cdkBuilder.build()
}
