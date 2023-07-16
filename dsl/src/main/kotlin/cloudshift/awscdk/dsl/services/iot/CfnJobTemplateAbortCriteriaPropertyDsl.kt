@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iot.CfnJobTemplate

@CdkDslMarker
public class CfnJobTemplateAbortCriteriaPropertyDsl {
  private val cdkBuilder: CfnJobTemplate.AbortCriteriaProperty.Builder =
      CfnJobTemplate.AbortCriteriaProperty.builder()

  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun failureType(failureType: String) {
    cdkBuilder.failureType(failureType)
  }

  public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
    cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
  }

  public fun thresholdPercentage(thresholdPercentage: Number) {
    cdkBuilder.thresholdPercentage(thresholdPercentage)
  }

  public fun build(): CfnJobTemplate.AbortCriteriaProperty = cdkBuilder.build()
}
