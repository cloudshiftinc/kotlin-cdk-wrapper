@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnTrigger

@CdkDslMarker
public class CfnTriggerEventBatchingConditionPropertyDsl {
  private val cdkBuilder: CfnTrigger.EventBatchingConditionProperty.Builder =
      CfnTrigger.EventBatchingConditionProperty.builder()

  /**
   * @param batchSize Number of events that must be received from Amazon EventBridge before
   * EventBridge event trigger fires. 
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * @param batchWindow Window of time in seconds after which EventBridge event trigger fires.
   * Window starts when first event is received.
   */
  public fun batchWindow(batchWindow: Number) {
    cdkBuilder.batchWindow(batchWindow)
  }

  public fun build(): CfnTrigger.EventBatchingConditionProperty = cdkBuilder.build()
}
