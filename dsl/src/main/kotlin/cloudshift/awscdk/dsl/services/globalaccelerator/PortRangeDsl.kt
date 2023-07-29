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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.globalaccelerator.PortRange

/**
 * The list of port ranges for the connections from clients to the accelerator.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * PortRange portRange = PortRange.builder()
 * .fromPort(123)
 * // the properties below are optional
 * .toPort(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class PortRangeDsl {
    private val cdkBuilder: PortRange.Builder = PortRange.builder()

    /** @param fromPort The first port in the range of ports, inclusive. */
    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    /** @param toPort The last port in the range of ports, inclusive. */
    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): PortRange = cdkBuilder.build()
}
