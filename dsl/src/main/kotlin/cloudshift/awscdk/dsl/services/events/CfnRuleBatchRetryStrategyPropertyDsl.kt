@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.events.CfnRule

@CdkDslMarker
public class CfnRuleBatchRetryStrategyPropertyDsl {
  private val cdkBuilder: CfnRule.BatchRetryStrategyProperty.Builder =
      CfnRule.BatchRetryStrategyProperty.builder()

  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  public fun build(): CfnRule.BatchRetryStrategyProperty = cdkBuilder.build()
}
