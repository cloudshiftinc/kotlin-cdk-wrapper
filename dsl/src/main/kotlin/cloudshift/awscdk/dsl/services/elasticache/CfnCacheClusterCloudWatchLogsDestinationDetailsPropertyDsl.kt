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
public class CfnCacheClusterCloudWatchLogsDestinationDetailsPropertyDsl {
    private val cdkBuilder: CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.Builder =
        CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.builder()

    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty = cdkBuilder.build()
}
