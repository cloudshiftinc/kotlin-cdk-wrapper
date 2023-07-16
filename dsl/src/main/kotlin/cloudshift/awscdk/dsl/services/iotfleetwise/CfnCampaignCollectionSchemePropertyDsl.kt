@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignCollectionSchemePropertyDsl {
  private val cdkBuilder: CfnCampaign.CollectionSchemeProperty.Builder =
      CfnCampaign.CollectionSchemeProperty.builder()

  public fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: IResolvable) {
    cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme)
  }

  public
      fun conditionBasedCollectionScheme(conditionBasedCollectionScheme: CfnCampaign.ConditionBasedCollectionSchemeProperty) {
    cdkBuilder.conditionBasedCollectionScheme(conditionBasedCollectionScheme)
  }

  public fun timeBasedCollectionScheme(timeBasedCollectionScheme: IResolvable) {
    cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme)
  }

  public
      fun timeBasedCollectionScheme(timeBasedCollectionScheme: CfnCampaign.TimeBasedCollectionSchemeProperty) {
    cdkBuilder.timeBasedCollectionScheme(timeBasedCollectionScheme)
  }

  public fun build(): CfnCampaign.CollectionSchemeProperty = cdkBuilder.build()
}
