@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRulePutItemInputPropertyDsl {
  private val cdkBuilder: CfnTopicRule.PutItemInputProperty.Builder =
      CfnTopicRule.PutItemInputProperty.builder()

  /**
   * @param tableName The table where the message data will be written. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnTopicRule.PutItemInputProperty = cdkBuilder.build()
}
