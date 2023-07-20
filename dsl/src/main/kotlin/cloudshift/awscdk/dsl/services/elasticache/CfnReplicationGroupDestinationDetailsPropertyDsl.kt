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
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

@CdkDslMarker
public class CfnReplicationGroupDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnReplicationGroup.DestinationDetailsProperty.Builder =
        CfnReplicationGroup.DestinationDetailsProperty.builder()

    public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails)
    }

    public fun cloudWatchLogsDetails(cloudWatchLogsDetails: CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails)
    }

    public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails)
    }

    public fun kinesisFirehoseDetails(kinesisFirehoseDetails: CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails)
    }

    public fun build(): CfnReplicationGroup.DestinationDetailsProperty = cdkBuilder.build()
}
