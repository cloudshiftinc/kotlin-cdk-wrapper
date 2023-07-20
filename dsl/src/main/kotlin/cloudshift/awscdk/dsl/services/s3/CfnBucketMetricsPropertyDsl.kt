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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.String

@CdkDslMarker
public class CfnBucketMetricsPropertyDsl {
    private val cdkBuilder: CfnBucket.MetricsProperty.Builder = CfnBucket.MetricsProperty.builder()

    public fun eventThreshold(eventThreshold: IResolvable) {
        cdkBuilder.eventThreshold(eventThreshold)
    }

    public fun eventThreshold(eventThreshold: CfnBucket.ReplicationTimeValueProperty) {
        cdkBuilder.eventThreshold(eventThreshold)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.MetricsProperty = cdkBuilder.build()
}
