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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.targets.EventBus
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class EventBusDsl(
    eventBus: IEventBus,
) {
    private val cdkBuilder: EventBus.Builder = EventBus.Builder.create(eventBus)

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun build(): EventBus = cdkBuilder.build()
}
