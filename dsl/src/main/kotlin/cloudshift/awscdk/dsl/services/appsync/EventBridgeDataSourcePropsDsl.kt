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

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.iam.IRole
import kotlin.String

@CdkDslMarker
public class EventBridgeDataSourcePropsDsl {
    private val cdkBuilder: EventBridgeDataSourceProps.Builder = EventBridgeDataSourceProps.builder()

    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun eventBus(eventBus: IEventBus) {
        cdkBuilder.eventBus(eventBus)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): EventBridgeDataSourceProps = cdkBuilder.build()
}
