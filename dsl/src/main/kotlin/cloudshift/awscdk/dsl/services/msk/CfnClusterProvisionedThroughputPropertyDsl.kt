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

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnClusterProvisionedThroughputPropertyDsl {
    private val cdkBuilder: CfnCluster.ProvisionedThroughputProperty.Builder =
        CfnCluster.ProvisionedThroughputProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun volumeThroughput(volumeThroughput: Number) {
        cdkBuilder.volumeThroughput(volumeThroughput)
    }

    public fun build(): CfnCluster.ProvisionedThroughputProperty = cdkBuilder.build()
}
