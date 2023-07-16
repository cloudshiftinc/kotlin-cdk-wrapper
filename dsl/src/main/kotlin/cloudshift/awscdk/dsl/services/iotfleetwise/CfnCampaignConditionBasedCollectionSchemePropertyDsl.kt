@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignConditionBasedCollectionSchemePropertyDsl {
  private val cdkBuilder: CfnCampaign.ConditionBasedCollectionSchemeProperty.Builder =
      CfnCampaign.ConditionBasedCollectionSchemeProperty.builder()

  public fun conditionLanguageVersion(conditionLanguageVersion: Number) {
    cdkBuilder.conditionLanguageVersion(conditionLanguageVersion)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun minimumTriggerIntervalMs(minimumTriggerIntervalMs: Number) {
    cdkBuilder.minimumTriggerIntervalMs(minimumTriggerIntervalMs)
  }

  public fun triggerMode(triggerMode: String) {
    cdkBuilder.triggerMode(triggerMode)
  }

  public fun build(): CfnCampaign.ConditionBasedCollectionSchemeProperty = cdkBuilder.build()
}
