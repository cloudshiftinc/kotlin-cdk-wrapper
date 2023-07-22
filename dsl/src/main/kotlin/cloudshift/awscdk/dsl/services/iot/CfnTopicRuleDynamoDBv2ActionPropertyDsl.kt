@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleDynamoDBv2ActionPropertyDsl {
  private val cdkBuilder: CfnTopicRule.DynamoDBv2ActionProperty.Builder =
      CfnTopicRule.DynamoDBv2ActionProperty.builder()

  /**
   * @param putItem Specifies the DynamoDB table to which the message data will be written. For
   * example:.
   * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" }
   * } }`
   *
   * Each attribute in the message payload will be written to a separate column in the DynamoDB
   * database.
   */
  public fun putItem(putItem: IResolvable) {
    cdkBuilder.putItem(putItem)
  }

  /**
   * @param putItem Specifies the DynamoDB table to which the message data will be written. For
   * example:.
   * `{ "dynamoDBv2": { "roleArn": "aws:iam:12341251:my-role" "putItem": { "tableName": "my-table" }
   * } }`
   *
   * Each attribute in the message payload will be written to a separate column in the DynamoDB
   * database.
   */
  public fun putItem(putItem: CfnTopicRule.PutItemInputProperty) {
    cdkBuilder.putItem(putItem)
  }

  /**
   * @param roleArn The ARN of the IAM role that grants access to the DynamoDB table.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnTopicRule.DynamoDBv2ActionProperty = cdkBuilder.build()
}
