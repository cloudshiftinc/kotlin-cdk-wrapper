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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.connect.CfnApprovedOriginProps
import kotlin.String

@CdkDslMarker
public class CfnApprovedOriginPropsDsl {
    private val cdkBuilder: CfnApprovedOriginProps.Builder = CfnApprovedOriginProps.builder()

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun origin(origin: String) {
        cdkBuilder.origin(origin)
    }

    public fun build(): CfnApprovedOriginProps = cdkBuilder.build()
}
