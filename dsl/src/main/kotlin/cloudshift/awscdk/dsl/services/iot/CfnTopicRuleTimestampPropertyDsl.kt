@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleTimestampPropertyDsl {
  private val cdkBuilder: CfnTopicRule.TimestampProperty.Builder =
      CfnTopicRule.TimestampProperty.builder()

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTopicRule.TimestampProperty = cdkBuilder.build()
}
