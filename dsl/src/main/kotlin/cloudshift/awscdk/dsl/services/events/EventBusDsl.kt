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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.EventBus
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class EventBusDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: EventBus.Builder = EventBus.Builder.create(scope, id)

    public fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
    }

    public fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): EventBus = cdkBuilder.build()
}
