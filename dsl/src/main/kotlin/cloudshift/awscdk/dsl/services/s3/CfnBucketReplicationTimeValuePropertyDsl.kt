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
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Number

@CdkDslMarker
public class CfnBucketReplicationTimeValuePropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicationTimeValueProperty.Builder =
        CfnBucket.ReplicationTimeValueProperty.builder()

    public fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
    }

    public fun build(): CfnBucket.ReplicationTimeValueProperty = cdkBuilder.build()
}
