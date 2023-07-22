@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnDataSource

@CdkDslMarker
public class CfnDataSourceEventBridgeConfigPropertyDsl {
  private val cdkBuilder: CfnDataSource.EventBridgeConfigProperty.Builder =
      CfnDataSource.EventBridgeConfigProperty.builder()

  /**
   * @param eventBusArn The event bus pipeline's ARN. 
   * For more information about event buses, see [EventBridge event
   * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-event-bus.html) .
   */
  public fun eventBusArn(eventBusArn: String) {
    cdkBuilder.eventBusArn(eventBusArn)
  }

  public fun build(): CfnDataSource.EventBridgeConfigProperty = cdkBuilder.build()
}
