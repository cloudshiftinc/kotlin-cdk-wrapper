@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleTimestreamTimestampPropertyDsl {
  private val cdkBuilder: CfnTopicRule.TimestreamTimestampProperty.Builder =
      CfnTopicRule.TimestreamTimestampProperty.builder()

  /**
   * @param unit The precision of the timestamp value that results from the expression described in
   * `value` . 
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  /**
   * @param value An expression that returns a long epoch time value. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTopicRule.TimestreamTimestampProperty = cdkBuilder.build()
}
