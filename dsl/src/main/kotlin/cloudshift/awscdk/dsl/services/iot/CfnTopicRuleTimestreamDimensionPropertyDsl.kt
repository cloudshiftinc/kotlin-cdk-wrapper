@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleTimestreamDimensionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.TimestreamDimensionProperty.Builder =
      CfnTopicRule.TimestreamDimensionProperty.builder()

  /**
   * @param name The metadata dimension name. 
   * This is the name of the column in the Amazon Timestream database table record.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value to write in this column of the database record. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTopicRule.TimestreamDimensionProperty = cdkBuilder.build()
}
