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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnCacheCluster

@CdkDslMarker
public class CfnCacheClusterDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnCacheCluster.DestinationDetailsProperty.Builder =
        CfnCacheCluster.DestinationDetailsProperty.builder()

    public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails)
    }

    public fun cloudWatchLogsDetails(cloudWatchLogsDetails: CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails)
    }

    public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails)
    }

    public fun kinesisFirehoseDetails(kinesisFirehoseDetails: CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails)
    }

    public fun build(): CfnCacheCluster.DestinationDetailsProperty = cdkBuilder.build()
}
