@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleDynamoDBActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.DynamoDBActionProperty.Builder =
      CfnTopicRule.DynamoDBActionProperty.builder()

  /**
   * @param hashKeyField The hash key name. 
   */
  public fun hashKeyField(hashKeyField: String) {
    cdkBuilder.hashKeyField(hashKeyField)
  }

  /**
   * @param hashKeyType The hash key type.
   * Valid values are "STRING" or "NUMBER"
   */
  public fun hashKeyType(hashKeyType: String) {
    cdkBuilder.hashKeyType(hashKeyType)
  }

  /**
   * @param hashKeyValue The hash key value. 
   */
  public fun hashKeyValue(hashKeyValue: String) {
    cdkBuilder.hashKeyValue(hashKeyValue)
  }

  /**
   * @param payloadField The action payload.
   * This name can be customized.
   */
  public fun payloadField(payloadField: String) {
    cdkBuilder.payloadField(payloadField)
  }

  /**
   * @param rangeKeyField The range key name.
   */
  public fun rangeKeyField(rangeKeyField: String) {
    cdkBuilder.rangeKeyField(rangeKeyField)
  }

  /**
   * @param rangeKeyType The range key type.
   * Valid values are "STRING" or "NUMBER"
   */
  public fun rangeKeyType(rangeKeyType: String) {
    cdkBuilder.rangeKeyType(rangeKeyType)
  }

  /**
   * @param rangeKeyValue The range key value.
   */
  public fun rangeKeyValue(rangeKeyValue: String) {
    cdkBuilder.rangeKeyValue(rangeKeyValue)
  }

  /**
   * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param tableName The name of the DynamoDB table. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnTopicRule.DynamoDBActionProperty = cdkBuilder.build()
}
