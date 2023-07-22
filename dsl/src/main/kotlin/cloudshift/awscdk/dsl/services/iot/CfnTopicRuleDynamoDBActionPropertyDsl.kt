@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to write to a DynamoDB table.
 *
 * The `tableName` , `hashKeyField` , and `rangeKeyField` values must match the values used when you
 * created the table.
 *
 * The `hashKeyValue` and `rangeKeyvalue` fields use a substitution template syntax. These templates
 * provide data at runtime. The syntax is as follows: ${ *sql-expression* }.
 *
 * You can specify any valid expression in a WHERE or SELECT clause, including JSON properties,
 * comparisons, calculations, and functions. For example, the following field uses the third level of
 * the topic:
 *
 * `"hashKeyValue": "${topic(3)}"`
 *
 * The following field uses the timestamp:
 *
 * `"rangeKeyValue": "${timestamp()}"`
 *
 * For more information, see [DynamoDBv2
 * Action](https://docs.aws.amazon.com/iot/latest/developerguide/iot-rule-actions.html) in the *AWS IoT
 * Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * DynamoDBActionProperty dynamoDBActionProperty = DynamoDBActionProperty.builder()
 * .hashKeyField("hashKeyField")
 * .hashKeyValue("hashKeyValue")
 * .roleArn("roleArn")
 * .tableName("tableName")
 * // the properties below are optional
 * .hashKeyType("hashKeyType")
 * .payloadField("payloadField")
 * .rangeKeyField("rangeKeyField")
 * .rangeKeyType("rangeKeyType")
 * .rangeKeyValue("rangeKeyValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-dynamodbaction.html)
 */
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
