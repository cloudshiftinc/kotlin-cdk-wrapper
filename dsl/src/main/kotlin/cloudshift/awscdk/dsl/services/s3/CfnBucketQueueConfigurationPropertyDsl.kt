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
public class CfnBucketQueueConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.QueueConfigurationProperty.Builder =
        CfnBucket.QueueConfigurationProperty.builder()

    public fun event(event: String) {
        cdkBuilder.event(event)
    }

    public fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter)
    }

    public fun filter(filter: CfnBucket.NotificationFilterProperty) {
        cdkBuilder.filter(filter)
    }

    public fun queue(queue: String) {
        cdkBuilder.queue(queue)
    }

    public fun build(): CfnBucket.QueueConfigurationProperty = cdkBuilder.build()
}
