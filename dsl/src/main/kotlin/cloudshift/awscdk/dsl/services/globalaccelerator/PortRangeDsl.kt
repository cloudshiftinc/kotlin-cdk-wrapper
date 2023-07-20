@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.globalaccelerator.PortRange
import kotlin.Number

@CdkDslMarker
public class PortRangeDsl {
    private val cdkBuilder: PortRange.Builder = PortRange.builder()

    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): PortRange = cdkBuilder.build()
}
