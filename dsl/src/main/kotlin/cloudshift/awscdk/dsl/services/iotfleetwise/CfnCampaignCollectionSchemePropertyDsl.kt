@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignCollectionSchemePropertyDsl {
  private val cdkBuilder: CfnCampaign.CollectionSchemeProperty.Builder =
      CfnCampaign.CollectionSchemeProperty.builder()

  /**
   * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
   * uses a simple logical expression to recognize what data to collect.
   */
  public fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable) {
    cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme)
  }

  /**
   * @param conditionBasedCollectionScheme (Optional) Information about a collection scheme that
   * uses a simple logical expression to recognize what data to collect.
   */
  public
      fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: CfnCampaign.ConditionBasedCollectionSchemeProperty) {
    cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme)
  }

  /**
   * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses a
   * time period to decide how often to collect data.
   */
  public fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable) {
    cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme)
  }

  /**
   * @param timeBasedCollectionScheme (Optional) Information about a collection scheme that uses a
   * time period to decide how often to collect data.
   */
  public
      fun timeBasedCollectionScheme(timeBasedCollectionScheme: CfnCampaign.TimeBasedCollectionSchemeProperty) {
    cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme)
  }

  public fun build(): CfnCampaign.CollectionSchemeProperty = cdkBuilder.build()
}
