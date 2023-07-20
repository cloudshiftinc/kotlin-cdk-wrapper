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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import kotlin.String

@CdkDslMarker
public class CfnBridgeSourcePriorityPropertyDsl {
    private val cdkBuilder: CfnBridge.SourcePriorityProperty.Builder =
        CfnBridge.SourcePriorityProperty.builder()

    public fun primarySource(primarySource: String) {
        cdkBuilder.primarySource(primarySource)
    }

    public fun build(): CfnBridge.SourcePriorityProperty = cdkBuilder.build()
}
