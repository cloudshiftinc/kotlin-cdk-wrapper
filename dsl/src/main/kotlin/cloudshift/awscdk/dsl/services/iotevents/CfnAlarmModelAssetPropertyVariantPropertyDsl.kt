@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

@CdkDslMarker
public class CfnAlarmModelAssetPropertyVariantPropertyDsl {
  private val cdkBuilder: CfnAlarmModel.AssetPropertyVariantProperty.Builder =
      CfnAlarmModel.AssetPropertyVariantProperty.builder()

  public fun booleanValue(booleanValue: String) {
    cdkBuilder.booleanValue(booleanValue)
  }

  public fun doubleValue(doubleValue: String) {
    cdkBuilder.doubleValue(doubleValue)
  }

  public fun integerValue(integerValue: String) {
    cdkBuilder.integerValue(integerValue)
  }

  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnAlarmModel.AssetPropertyVariantProperty = cdkBuilder.build()
}
