@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class EventBridgeDataSourcePropsDsl {
  private val cdkBuilder: EventBridgeDataSourceProps.Builder = EventBridgeDataSourceProps.builder()

  /**
   * @param api The API to attach this data source to. 
   */
  public fun api(api: IGraphqlApi) {
    cdkBuilder.api(api)
  }

  /**
   * @param description the description of the data source.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param eventBus The EventBridge EventBus. 
   */
  public fun eventBus(eventBus: IEventBus) {
    cdkBuilder.eventBus(eventBus)
  }

  /**
   * @param name The name of the data source.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
   * source.
   */
  public fun serviceRole(serviceRole: IRole) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun build(): EventBridgeDataSourceProps = cdkBuilder.build()
}
