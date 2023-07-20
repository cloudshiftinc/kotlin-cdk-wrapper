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
import kotlin.String

@CdkDslMarker
public class CfnClusterFirehosePropertyDsl {
    private val cdkBuilder: CfnCluster.FirehoseProperty.Builder =
        CfnCluster.FirehoseProperty.builder()

    public fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnCluster.FirehoseProperty = cdkBuilder.build()
}
