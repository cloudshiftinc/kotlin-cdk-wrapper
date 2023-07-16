@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleAssetPropertyVariantPropertyDsl {
  private val cdkBuilder: CfnTopicRule.AssetPropertyVariantProperty.Builder =
      CfnTopicRule.AssetPropertyVariantProperty.builder()

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

  public fun build(): CfnTopicRule.AssetPropertyVariantProperty = cdkBuilder.build()
}
