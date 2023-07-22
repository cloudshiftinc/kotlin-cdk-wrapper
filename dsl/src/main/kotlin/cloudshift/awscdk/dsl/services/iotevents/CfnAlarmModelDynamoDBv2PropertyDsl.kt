@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Defines an action to write to the Amazon DynamoDB table that you created.
 *
 * The default action payload contains all the information about the detector model instance and the
 * event that triggered the action. You can customize the
 * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A separate
 * column of the DynamoDB table receives one attribute-value pair in the payload that you specify.
 *
 * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
 * literals, operators, functions, references, and substitution templates.
 *
 * **Examples** - For literal values, the expressions must contain single quotes. For example, the
 * value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
 *
 * * For references, you must specify either variables or input values. For example, the value for
 * the `tableName` parameter can be `$variable.ddbtableName` .
 * * For a substitution template, you must use `${}` , and the template must be in single quotes. A
 * substitution template can also contain a combination of literals, operators, functions, references,
 * and substitution templates.
 *
 * In the following example, the value for the `contentExpression` parameter in `Payload` uses a
 * substitution template.
 *
 * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
 * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
 *
 * * For a string concatenation, you must use `+` . A string concatenation can also contain a
 * combination of literals, operators, functions, references, and substitution templates.
 *
 * In the following example, the value for the `tableName` parameter uses a string concatenation.
 *
 * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
 *
 * For more information, see
 * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
 * in the *AWS IoT Events Developer Guide* .
 *
 * The value for the `type` parameter in `Payload` must be `JSON` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * DynamoDBv2Property dynamoDBv2Property = DynamoDBv2Property.builder()
 * .tableName("tableName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodbv2.html)
 */
@CdkDslMarker
public class CfnAlarmModelDynamoDBv2PropertyDsl {
  private val cdkBuilder: CfnAlarmModel.DynamoDBv2Property.Builder =
      CfnAlarmModel.DynamoDBv2Property.builder()

  /**
   * @param payload Information needed to configure the payload.
   * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
   * payload contains all attribute-value pairs that have the information about the detector model
   * instance and the event triggered the action. To configure the action payload, you can use
   * `contentExpression` .
   */
  public fun payload(payload: IResolvable) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param payload Information needed to configure the payload.
   * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
   * payload contains all attribute-value pairs that have the information about the detector model
   * instance and the event triggered the action. To configure the action payload, you can use
   * `contentExpression` .
   */
  public fun payload(payload: CfnAlarmModel.PayloadProperty) {
    cdkBuilder.payload(payload)
  }

  /**
   * @param tableName The name of the DynamoDB table. 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnAlarmModel.DynamoDBv2Property = cdkBuilder.build()
}
