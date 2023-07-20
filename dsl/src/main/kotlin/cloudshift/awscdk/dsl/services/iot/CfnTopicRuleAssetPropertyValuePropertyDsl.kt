@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleAssetPropertyValuePropertyDsl {
  private val cdkBuilder: CfnTopicRule.AssetPropertyValueProperty.Builder =
      CfnTopicRule.AssetPropertyValueProperty.builder()

  public fun quality(quality: String) {
    cdkBuilder.quality(quality)
  }

  public fun timestamp(timestamp: IResolvable) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun timestamp(timestamp: CfnTopicRule.AssetPropertyTimestampProperty) {
    cdkBuilder.timestamp(timestamp)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnTopicRule.AssetPropertyVariantProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTopicRule.AssetPropertyValueProperty = cdkBuilder.build()
}
