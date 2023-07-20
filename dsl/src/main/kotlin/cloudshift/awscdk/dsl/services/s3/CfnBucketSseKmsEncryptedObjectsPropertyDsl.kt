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
public class CfnBucketSseKmsEncryptedObjectsPropertyDsl {
    private val cdkBuilder: CfnBucket.SseKmsEncryptedObjectsProperty.Builder =
        CfnBucket.SseKmsEncryptedObjectsProperty.builder()

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnBucket.SseKmsEncryptedObjectsProperty = cdkBuilder.build()
}
