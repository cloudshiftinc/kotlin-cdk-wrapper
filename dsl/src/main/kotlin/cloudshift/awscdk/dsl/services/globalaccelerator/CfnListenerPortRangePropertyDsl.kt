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
import software.amazon.awscdk.services.globalaccelerator.CfnListener
import kotlin.Number

@CdkDslMarker
public class CfnListenerPortRangePropertyDsl {
    private val cdkBuilder: CfnListener.PortRangeProperty.Builder =
        CfnListener.PortRangeProperty.builder()

    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnListener.PortRangeProperty = cdkBuilder.build()
}
