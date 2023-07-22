@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * The input for the DynamoActionVS action that specifies the DynamoDB table to which the message
 * data will be written.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * PutItemInputProperty putItemInputProperty = PutItemInputProperty.builder()
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-putiteminput.html)
 */
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
