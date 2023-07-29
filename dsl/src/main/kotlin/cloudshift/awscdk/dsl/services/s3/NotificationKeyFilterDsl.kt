@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.NotificationKeyFilter

/**
 * Example:
 * ```
 * Queue myQueue;
 * Bucket bucket = new Bucket(this, "MyBucket");
 * bucket.addEventNotification(EventType.OBJECT_REMOVED, new SqsDestination(myQueue),
 * NotificationKeyFilter.builder()
 * .prefix("foo/")
 * .suffix(".jpg")
 * .build());
 * ```
 */
@CdkDslMarker
public class NotificationKeyFilterDsl {
    private val cdkBuilder: NotificationKeyFilter.Builder = NotificationKeyFilter.builder()

    /** @param prefix S3 keys must have the specified prefix. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /** @param suffix S3 keys must have the specified suffix. */
    public fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
    }

    public fun build(): NotificationKeyFilter = cdkBuilder.build()
}
