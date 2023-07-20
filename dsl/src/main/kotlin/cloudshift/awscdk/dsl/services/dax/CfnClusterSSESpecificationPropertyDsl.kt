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

package cloudshift.awscdk.dsl.services.dax

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dax.CfnCluster
import kotlin.Boolean

@CdkDslMarker
public class CfnClusterSSESpecificationPropertyDsl {
    private val cdkBuilder: CfnCluster.SSESpecificationProperty.Builder =
        CfnCluster.SSESpecificationProperty.builder()

    public fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    public fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    public fun build(): CfnCluster.SSESpecificationProperty = cdkBuilder.build()
}
