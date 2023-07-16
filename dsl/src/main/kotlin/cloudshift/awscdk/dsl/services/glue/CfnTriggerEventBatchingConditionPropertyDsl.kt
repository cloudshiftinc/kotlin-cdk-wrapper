@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnTrigger

@CdkDslMarker
public class CfnTriggerEventBatchingConditionPropertyDsl {
  private val cdkBuilder: CfnTrigger.EventBatchingConditionProperty.Builder =
      CfnTrigger.EventBatchingConditionProperty.builder()

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun batchWindow(batchWindow: Number) {
    cdkBuilder.batchWindow(batchWindow)
  }

  public fun build(): CfnTrigger.EventBatchingConditionProperty = cdkBuilder.build()
}
