@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotevents

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Specifies one of the following actions to receive notifications when the alarm state changes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * AlarmActionProperty alarmActionProperty = AlarmActionProperty.builder()
 * .dynamoDb(DynamoDBProperty.builder()
 * .hashKeyField("hashKeyField")
 * .hashKeyValue("hashKeyValue")
 * .tableName("tableName")
 * // the properties below are optional
 * .hashKeyType("hashKeyType")
 * .operation("operation")
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .payloadField("payloadField")
 * .rangeKeyField("rangeKeyField")
 * .rangeKeyType("rangeKeyType")
 * .rangeKeyValue("rangeKeyValue")
 * .build())
 * .dynamoDBv2(DynamoDBv2Property.builder()
 * .tableName("tableName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .firehose(FirehoseProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .separator("separator")
 * .build())
 * .iotEvents(IotEventsProperty.builder()
 * .inputName("inputName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .iotSiteWise(IotSiteWiseProperty.builder()
 * .assetId("assetId")
 * .entryId("entryId")
 * .propertyAlias("propertyAlias")
 * .propertyId("propertyId")
 * .propertyValue(AssetPropertyValueProperty.builder()
 * .value(AssetPropertyVariantProperty.builder()
 * .booleanValue("booleanValue")
 * .doubleValue("doubleValue")
 * .integerValue("integerValue")
 * .stringValue("stringValue")
 * .build())
 * // the properties below are optional
 * .quality("quality")
 * .timestamp(AssetPropertyTimestampProperty.builder()
 * .timeInSeconds("timeInSeconds")
 * // the properties below are optional
 * .offsetInNanos("offsetInNanos")
 * .build())
 * .build())
 * .build())
 * .iotTopicPublish(IotTopicPublishProperty.builder()
 * .mqttTopic("mqttTopic")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .lambda(LambdaProperty.builder()
 * .functionArn("functionArn")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .sns(SnsProperty.builder()
 * .targetArn("targetArn")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build())
 * .sqs(SqsProperty.builder()
 * .queueUrl("queueUrl")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .useBase64(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmaction.html)
 */
@CdkDslMarker
public class CfnAlarmModelAlarmActionPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.AlarmActionProperty.Builder =
        CfnAlarmModel.AlarmActionProperty.builder()

    /**
     * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
     *   The default action payload contains all the information about the detector model instance
     *   and the event that triggered the action. You can customize the
     *   [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
     *   separate column of the DynamoDB table receives one attribute-value pair in the payload that
     *   you specify.
     *
     * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
     * literals, operators, functions, references, and substitution templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
     * * For references, you must specify either variables or input values. For example, the value
     *   for the `tableName` parameter can be `$variable.ddbtableName` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     *   quotes. A substitution template can also contain a combination of literals, operators,
     *   functions, references, and substitution templates.
     *
     * In the following example, the value for the `contentExpression` parameter in `Payload` uses a
     * substitution template.
     *
     * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
     * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
     * * For a string concatenation, you must use `+` . A string concatenation can also contain a
     *   combination of literals, operators, functions, references, and substitution templates.
     *
     * In the following example, the value for the `tableName` parameter uses a string
     * concatenation.
     *
     * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * The value for the `type` parameter in `Payload` must be `JSON` .
     */
    public fun dynamoDBv2(dynamoDBv2: IResolvable) {
        cdkBuilder.dynamoDBv2(dynamoDBv2)
    }

    /**
     * @param dynamoDBv2 Defines an action to write to the Amazon DynamoDB table that you created.
     *   The default action payload contains all the information about the detector model instance
     *   and the event that triggered the action. You can customize the
     *   [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . A
     *   separate column of the DynamoDB table receives one attribute-value pair in the payload that
     *   you specify.
     *
     * You must use expressions for all parameters in `DynamoDBv2Action` . The expressions accept
     * literals, operators, functions, references, and substitution templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `tableName` parameter can be `'GreenhouseTemperatureTable'` .
     * * For references, you must specify either variables or input values. For example, the value
     *   for the `tableName` parameter can be `$variable.ddbtableName` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     *   quotes. A substitution template can also contain a combination of literals, operators,
     *   functions, references, and substitution templates.
     *
     * In the following example, the value for the `contentExpression` parameter in `Payload` uses a
     * substitution template.
     *
     * `'{\"sensorID\": \"${$input.GreenhouseInput.sensor_id}\", \"temperature\":
     * \"${$input.GreenhouseInput.temperature * 9 / 5 + 32}\"}'`
     * * For a string concatenation, you must use `+` . A string concatenation can also contain a
     *   combination of literals, operators, functions, references, and substitution templates.
     *
     * In the following example, the value for the `tableName` parameter uses a string
     * concatenation.
     *
     * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * The value for the `type` parameter in `Payload` must be `JSON` .
     */
    public fun dynamoDBv2(dynamoDBv2: CfnAlarmModel.DynamoDBv2Property) {
        cdkBuilder.dynamoDBv2(dynamoDBv2)
    }

    /**
     * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created. The
     *   standard action payload contains all the information about the detector model instance and
     *   the event that triggered the action. You can customize the
     *   [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
     *   column of the DynamoDB table receives all attribute-value pairs in the payload that you
     *   specify.
     *
     * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
     * literals, operators, functions, references, and substitution templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `hashKeyType` parameter can be `'STRING'` .
     * * For references, you must specify either variables or input values. For example, the value
     *   for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     *   quotes. A substitution template can also contain a combination of literals, operators,
     *   functions, references, and substitution templates.
     *
     * In the following example, the value for the `hashKeyValue` parameter uses a substitution
     * template.
     *
     * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
     * * For a string concatenation, you must use `+` . A string concatenation can also contain a
     *   combination of literals, operators, functions, references, and substitution templates.
     *
     * In the following example, the value for the `tableName` parameter uses a string
     * concatenation.
     *
     * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
     * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
     * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
     */
    public fun dynamoDb(dynamoDb: IResolvable) {
        cdkBuilder.dynamoDb(dynamoDb)
    }

    /**
     * @param dynamoDb Defines an action to write to the Amazon DynamoDB table that you created. The
     *   standard action payload contains all the information about the detector model instance and
     *   the event that triggered the action. You can customize the
     *   [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One
     *   column of the DynamoDB table receives all attribute-value pairs in the payload that you
     *   specify.
     *
     * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
     * literals, operators, functions, references, and substitution templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `hashKeyType` parameter can be `'STRING'` .
     * * For references, you must specify either variables or input values. For example, the value
     *   for the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     *   quotes. A substitution template can also contain a combination of literals, operators,
     *   functions, references, and substitution templates.
     *
     * In the following example, the value for the `hashKeyValue` parameter uses a substitution
     * template.
     *
     * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
     * * For a string concatenation, you must use `+` . A string concatenation can also contain a
     *   combination of literals, operators, functions, references, and substitution templates.
     *
     * In the following example, the value for the `tableName` parameter uses a string
     * concatenation.
     *
     * `'GreenhouseTemperatureTable ' + $input.GreenhouseInput.date`
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     *
     * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the
     * DynamoDB table as binary data. The DynamoDB console displays the data as Base64-encoded text.
     * The value for the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
     */
    public fun dynamoDb(dynamoDb: CfnAlarmModel.DynamoDBProperty) {
        cdkBuilder.dynamoDb(dynamoDb)
    }

    /**
     * @param firehose Sends information about the detector model instance and the event that
     *   triggered the action to an Amazon Kinesis Data Firehose delivery stream.
     */
    public fun firehose(firehose: IResolvable) {
        cdkBuilder.firehose(firehose)
    }

    /**
     * @param firehose Sends information about the detector model instance and the event that
     *   triggered the action to an Amazon Kinesis Data Firehose delivery stream.
     */
    public fun firehose(firehose: CfnAlarmModel.FirehoseProperty) {
        cdkBuilder.firehose(firehose)
    }

    /**
     * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
     *   model instance and the event that triggered the action.
     */
    public fun iotEvents(iotEvents: IResolvable) {
        cdkBuilder.iotEvents(iotEvents)
    }

    /**
     * @param iotEvents Sends an AWS IoT Events input, passing in information about the detector
     *   model instance and the event that triggered the action.
     */
    public fun iotEvents(iotEvents: CfnAlarmModel.IotEventsProperty) {
        cdkBuilder.iotEvents(iotEvents)
    }

    /**
     * @param iotSiteWise Sends information about the detector model instance and the event that
     *   triggered the action to a specified asset property in AWS IoT SiteWise . You must use
     *   expressions for all parameters in `IotSiteWiseAction` . The expressions accept literals,
     *   operators, functions, references, and substitutions templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `propertyAlias` parameter can be
     * `'/company/windfarm/3/turbine/7/temperature'` .
     * * For references, you must specify either variables or input values. For example, the value
     *   for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     *   quotes. A substitution template can also contain a combination of literals, operators,
     *   functions, references, and substitution templates.
     *
     * In the following example, the value for the `propertyAlias` parameter uses a substitution
     * template.
     *
     * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
     * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
     *
     * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
     * target asset property in AWS IoT SiteWise .
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     */
    public fun iotSiteWise(iotSiteWise: IResolvable) {
        cdkBuilder.iotSiteWise(iotSiteWise)
    }

    /**
     * @param iotSiteWise Sends information about the detector model instance and the event that
     *   triggered the action to a specified asset property in AWS IoT SiteWise . You must use
     *   expressions for all parameters in `IotSiteWiseAction` . The expressions accept literals,
     *   operators, functions, references, and substitutions templates.
     *
     * **Examples** - For literal values, the expressions must contain single quotes. For example,
     * the value for the `propertyAlias` parameter can be
     * `'/company/windfarm/3/turbine/7/temperature'` .
     * * For references, you must specify either variables or input values. For example, the value
     *   for the `assetId` parameter can be `$input.TurbineInput.assetId1` .
     * * For a substitution template, you must use `${}` , and the template must be in single
     *   quotes. A substitution template can also contain a combination of literals, operators,
     *   functions, references, and substitution templates.
     *
     * In the following example, the value for the `propertyAlias` parameter uses a substitution
     * template.
     *
     * `'company/windfarm/${$input.TemperatureInput.sensorData.windfarmID}/turbine/
     * ${$input.TemperatureInput.sensorData.turbineID}/temperature'`
     *
     * You must specify either `propertyAlias` or both `assetId` and `propertyId` to identify the
     * target asset property in AWS IoT SiteWise .
     *
     * For more information, see
     * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
     * in the *AWS IoT Events Developer Guide* .
     */
    public fun iotSiteWise(iotSiteWise: CfnAlarmModel.IotSiteWiseProperty) {
        cdkBuilder.iotSiteWise(iotSiteWise)
    }

    /**
     * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
     *   message broker.
     */
    public fun iotTopicPublish(iotTopicPublish: IResolvable) {
        cdkBuilder.iotTopicPublish(iotTopicPublish)
    }

    /**
     * @param iotTopicPublish Information required to publish the MQTT message through the AWS IoT
     *   message broker.
     */
    public fun iotTopicPublish(iotTopicPublish: CfnAlarmModel.IotTopicPublishProperty) {
        cdkBuilder.iotTopicPublish(iotTopicPublish)
    }

    /**
     * @param lambda Calls a Lambda function, passing in information about the detector model
     *   instance and the event that triggered the action.
     */
    public fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda)
    }

    /**
     * @param lambda Calls a Lambda function, passing in information about the detector model
     *   instance and the event that triggered the action.
     */
    public fun lambda(lambda: CfnAlarmModel.LambdaProperty) {
        cdkBuilder.lambda(lambda)
    }

    /** @param sns Information required to publish the Amazon SNS message. */
    public fun sns(sns: IResolvable) {
        cdkBuilder.sns(sns)
    }

    /** @param sns Information required to publish the Amazon SNS message. */
    public fun sns(sns: CfnAlarmModel.SnsProperty) {
        cdkBuilder.sns(sns)
    }

    /**
     * @param sqs Sends information about the detector model instance and the event that triggered
     *   the action to an Amazon SQS queue.
     */
    public fun sqs(sqs: IResolvable) {
        cdkBuilder.sqs(sqs)
    }

    /**
     * @param sqs Sends information about the detector model instance and the event that triggered
     *   the action to an Amazon SQS queue.
     */
    public fun sqs(sqs: CfnAlarmModel.SqsProperty) {
        cdkBuilder.sqs(sqs)
    }

    public fun build(): CfnAlarmModel.AlarmActionProperty = cdkBuilder.build()
}
