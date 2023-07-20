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
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import kotlin.String

@CdkDslMarker
public class CfnReplicationGroupCloudWatchLogsDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder =
        CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder()

    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty =
        cdkBuilder.build()
}
