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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticache.CfnCacheCluster
import kotlin.String

@CdkDslMarker
public class CfnCacheClusterKinesisFirehoseDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.Builder =
        CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.builder()

    public fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
    }

    public fun build(): CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty = cdkBuilder.build()
}
