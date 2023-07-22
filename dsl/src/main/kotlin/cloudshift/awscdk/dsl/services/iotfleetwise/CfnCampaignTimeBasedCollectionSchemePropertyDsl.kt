@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignTimeBasedCollectionSchemePropertyDsl {
  private val cdkBuilder: CfnCampaign.TimeBasedCollectionSchemeProperty.Builder =
      CfnCampaign.TimeBasedCollectionSchemeProperty.builder()

  /**
   * @param periodMs The time period (in milliseconds) to decide how often to collect data. 
   * For example, if the time period is `60000` , the Edge Agent software collects data once every
   * minute.
   */
  public fun periodMs(periodMs: Number) {
    cdkBuilder.periodMs(periodMs)
  }

  public fun build(): CfnCampaign.TimeBasedCollectionSchemeProperty = cdkBuilder.build()
}
