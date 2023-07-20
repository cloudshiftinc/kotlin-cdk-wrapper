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
import software.amazon.awscdk.services.connect.CfnApprovedOrigin
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnApprovedOriginDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApprovedOrigin.Builder = CfnApprovedOrigin.Builder.create(scope, id)

    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    public fun origin(origin: String) {
        cdkBuilder.origin(origin)
    }

    public fun build(): CfnApprovedOrigin = cdkBuilder.build()
}
