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
import software.amazon.awscdk.services.ec2.PortProps
import software.amazon.awscdk.services.ec2.Protocol

/**
 * Properties to create a port range.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PortProps portProps = PortProps.builder()
 * .protocol(Protocol.ALL)
 * .stringRepresentation("stringRepresentation")
 * // the properties below are optional
 * .fromPort(123)
 * .toPort(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class PortPropsDsl {
    private val cdkBuilder: PortProps.Builder = PortProps.builder()

    /** @param fromPort The starting port for the range. */
    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    /** @param protocol The protocol for the range. */
    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    /** @param stringRepresentation String representation for this object. */
    public fun stringRepresentation(stringRepresentation: String) {
        cdkBuilder.stringRepresentation(stringRepresentation)
    }

    /** @param toPort The ending port for the range. */
    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): PortProps = cdkBuilder.build()
}
