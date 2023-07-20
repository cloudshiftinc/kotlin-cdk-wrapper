@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.EventBridgeDataSource
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

@CdkDslMarker
public class EventBridgeDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: EventBridgeDataSource.Builder =
      EventBridgeDataSource.Builder.create(scope, id)

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

  public fun build(): EventBridgeDataSource = cdkBuilder.build()
}
