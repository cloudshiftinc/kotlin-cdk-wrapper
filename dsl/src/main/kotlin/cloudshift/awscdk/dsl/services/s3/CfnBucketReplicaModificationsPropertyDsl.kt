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
import kotlin.String

@CdkDslMarker
public class CfnBucketReplicaModificationsPropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicaModificationsProperty.Builder =
        CfnBucket.ReplicaModificationsProperty.builder()

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.ReplicaModificationsProperty = cdkBuilder.build()
}
