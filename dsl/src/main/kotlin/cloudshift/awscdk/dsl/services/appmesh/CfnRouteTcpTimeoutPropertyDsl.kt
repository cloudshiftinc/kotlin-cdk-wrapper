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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute

@CdkDslMarker
public class CfnRouteTcpTimeoutPropertyDsl {
    private val cdkBuilder: CfnRoute.TcpTimeoutProperty.Builder =
        CfnRoute.TcpTimeoutProperty.builder()

    public fun idle(idle: IResolvable) {
        cdkBuilder.idle(idle)
    }

    public fun idle(idle: CfnRoute.DurationProperty) {
        cdkBuilder.idle(idle)
    }

    public fun build(): CfnRoute.TcpTimeoutProperty = cdkBuilder.build()
}
