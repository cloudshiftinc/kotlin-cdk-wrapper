@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import software.amazon.awscdk.services.iotevents.CfnAlarmModelProps
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import software.amazon.awscdk.services.iotevents.CfnDetectorModelProps
import software.amazon.awscdk.services.iotevents.CfnInput
import software.amazon.awscdk.services.iotevents.CfnInputProps
import software.constructs.Construct

public object iotevents {
  /**
   * Represents an alarm model to monitor an AWS IoT Events input attribute.
   *
   * You can use the alarm to get notified when the value is outside a specified range. For more
   * information, see [Create an alarm
   * model](https://docs.aws.amazon.com/iotevents/latest/developerguide/create-alarms.html) in the *AWS
   * IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * CfnAlarmModel cfnAlarmModel = CfnAlarmModel.Builder.create(this, "MyCfnAlarmModel")
   * .alarmRule(AlarmRuleProperty.builder()
   * .simpleRule(SimpleRuleProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .inputProperty("inputProperty")
   * .threshold("threshold")
   * .build())
   * .build())
   * .roleArn("roleArn")
   * // the properties below are optional
   * .alarmCapabilities(AlarmCapabilitiesProperty.builder()
   * .acknowledgeFlow(AcknowledgeFlowProperty.builder()
   * .enabled(false)
   * .build())
   * .initializationConfiguration(InitializationConfigurationProperty.builder()
   * .disabledOnInitialization(false)
   * .build())
   * .build())
   * .alarmEventActions(AlarmEventActionsProperty.builder()
   * .alarmActions(List.of(AlarmActionProperty.builder()
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
   * .build()))
   * .build())
   * .alarmModelDescription("alarmModelDescription")
   * .alarmModelName("alarmModelName")
   * .key("key")
   * .severity(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html)
   */
  public inline fun cfnAlarmModel(
    scope: Construct,
    id: String,
    block: CfnAlarmModelDsl.() -> Unit = {},
  ): CfnAlarmModel {
    val builder = CfnAlarmModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies whether to get notified for alarm state changes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AcknowledgeFlowProperty acknowledgeFlowProperty = AcknowledgeFlowProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-acknowledgeflow.html)
   */
  public inline
      fun cfnAlarmModelAcknowledgeFlowProperty(block: CfnAlarmModelAcknowledgeFlowPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AcknowledgeFlowProperty {
    val builder = CfnAlarmModelAcknowledgeFlowPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies one of the following actions to receive notifications when the alarm state changes.
   *
   * Example:
   *
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
  public inline
      fun cfnAlarmModelAlarmActionProperty(block: CfnAlarmModelAlarmActionPropertyDsl.() -> Unit =
      {}): CfnAlarmModel.AlarmActionProperty {
    val builder = CfnAlarmModelAlarmActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains the configuration information of alarm state changes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AlarmCapabilitiesProperty alarmCapabilitiesProperty = AlarmCapabilitiesProperty.builder()
   * .acknowledgeFlow(AcknowledgeFlowProperty.builder()
   * .enabled(false)
   * .build())
   * .initializationConfiguration(InitializationConfigurationProperty.builder()
   * .disabledOnInitialization(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmcapabilities.html)
   */
  public inline
      fun cfnAlarmModelAlarmCapabilitiesProperty(block: CfnAlarmModelAlarmCapabilitiesPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AlarmCapabilitiesProperty {
    val builder = CfnAlarmModelAlarmCapabilitiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information about one or more alarm actions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AlarmEventActionsProperty alarmEventActionsProperty = AlarmEventActionsProperty.builder()
   * .alarmActions(List.of(AlarmActionProperty.builder()
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
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmeventactions.html)
   */
  public inline
      fun cfnAlarmModelAlarmEventActionsProperty(block: CfnAlarmModelAlarmEventActionsPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AlarmEventActionsProperty {
    val builder = CfnAlarmModelAlarmEventActionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines when your alarm is invoked.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AlarmRuleProperty alarmRuleProperty = AlarmRuleProperty.builder()
   * .simpleRule(SimpleRuleProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .inputProperty("inputProperty")
   * .threshold("threshold")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-alarmrule.html)
   */
  public inline
      fun cfnAlarmModelAlarmRuleProperty(block: CfnAlarmModelAlarmRulePropertyDsl.() -> Unit = {}):
      CfnAlarmModel.AlarmRuleProperty {
    val builder = CfnAlarmModelAlarmRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A structure that contains timestamp information. For more information, see
   * [TimeInNanos](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyTimestamp` . The expressions
   * accept literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `timeInSeconds` parameter can be `'1586400675'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `offsetInNanos` parameter can be `$variable.time` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `timeInSeconds` parameter uses a substitution
   * template.
   *
   * `'${$input.TemperatureInput.sensorData.timestamp / 1000}'`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AssetPropertyTimestampProperty assetPropertyTimestampProperty =
   * AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertytimestamp.html)
   */
  public inline
      fun cfnAlarmModelAssetPropertyTimestampProperty(block: CfnAlarmModelAssetPropertyTimestampPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AssetPropertyTimestampProperty {
    val builder = CfnAlarmModelAssetPropertyTimestampPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A structure that contains value information. For more information, see
   * [AssetPropertyValue](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetPropertyValue.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyValue` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `quality` parameter can be `'GOOD'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `quality` parameter can be `$input.TemperatureInput.sensorData.quality` .
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AssetPropertyValueProperty assetPropertyValueProperty = AssetPropertyValueProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvalue.html)
   */
  public inline
      fun cfnAlarmModelAssetPropertyValueProperty(block: CfnAlarmModelAssetPropertyValuePropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AssetPropertyValueProperty {
    val builder = CfnAlarmModelAssetPropertyValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A structure that contains an asset property value.
   *
   * For more information, see
   * [Variant](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html) in the
   * *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyVariant` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `integerValue` parameter can be `'100'` .
   *
   * * For references, you must specify either variables or parameters. For example, the value for
   * the `booleanValue` parameter can be `$variable.offline` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `doubleValue` parameter uses a substitution
   * template.
   *
   * `'${$input.TemperatureInput.sensorData.temperature * 6 / 5 + 32}'`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * You must specify one of the following value types, depending on the `dataType` of the specified
   * asset property. For more information, see
   * [AssetProperty](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AssetPropertyVariantProperty assetPropertyVariantProperty =
   * AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-assetpropertyvariant.html)
   */
  public inline
      fun cfnAlarmModelAssetPropertyVariantProperty(block: CfnAlarmModelAssetPropertyVariantPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.AssetPropertyVariantProperty {
    val builder = CfnAlarmModelAssetPropertyVariantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines an action to write to the Amazon DynamoDB table that you created.
   *
   * The standard action payload contains all the information about the detector model instance and
   * the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One column
   * of the DynamoDB table receives all attribute-value pairs in the payload that you specify.
   *
   * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `hashKeyType` parameter can be `'STRING'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `hashKeyValue` parameter uses a substitution
   * template.
   *
   * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
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
   * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the DynamoDB
   * table as binary data. The DynamoDB console displays the data as Base64-encoded text. The value for
   * the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * DynamoDBProperty dynamoDBProperty = DynamoDBProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-dynamodb.html)
   */
  public inline fun cfnAlarmModelDynamoDBProperty(block: CfnAlarmModelDynamoDBPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.DynamoDBProperty {
    val builder = CfnAlarmModelDynamoDBPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines an action to write to the Amazon DynamoDB table that you created.
   *
   * The default action payload contains all the information about the detector model instance and
   * the event that triggered the action. You can customize the
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
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
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
  public inline
      fun cfnAlarmModelDynamoDBv2Property(block: CfnAlarmModelDynamoDBv2PropertyDsl.() -> Unit =
      {}): CfnAlarmModel.DynamoDBv2Property {
    val builder = CfnAlarmModelDynamoDBv2PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * an Amazon Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * FirehoseProperty firehoseProperty = FirehoseProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .separator("separator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html)
   */
  public inline fun cfnAlarmModelFirehoseProperty(block: CfnAlarmModelFirehosePropertyDsl.() -> Unit
      = {}): CfnAlarmModel.FirehoseProperty {
    val builder = CfnAlarmModelFirehosePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the default alarm state.
   *
   * The configuration applies to all alarms that were created based on this alarm model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * InitializationConfigurationProperty initializationConfigurationProperty =
   * InitializationConfigurationProperty.builder()
   * .disabledOnInitialization(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-initializationconfiguration.html)
   */
  public inline
      fun cfnAlarmModelInitializationConfigurationProperty(block: CfnAlarmModelInitializationConfigurationPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.InitializationConfigurationProperty {
    val builder = CfnAlarmModelInitializationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends an AWS IoT Events input, passing in information about the detector model instance and the
   * event that triggered the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * IotEventsProperty iotEventsProperty = IotEventsProperty.builder()
   * .inputName("inputName")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotevents.html)
   */
  public inline
      fun cfnAlarmModelIotEventsProperty(block: CfnAlarmModelIotEventsPropertyDsl.() -> Unit = {}):
      CfnAlarmModel.IotEventsProperty {
    val builder = CfnAlarmModelIotEventsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * a specified asset property in AWS IoT SiteWise .
   *
   * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
   * literals, operators, functions, references, and substitutions templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `propertyAlias` parameter can be `'/company/windfarm/3/turbine/7/temperature'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `assetId` parameter can be `$input.TurbineInput.assetId1` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
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
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * IotSiteWiseProperty iotSiteWiseProperty = IotSiteWiseProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iotsitewise.html)
   */
  public inline
      fun cfnAlarmModelIotSiteWiseProperty(block: CfnAlarmModelIotSiteWisePropertyDsl.() -> Unit =
      {}): CfnAlarmModel.IotSiteWiseProperty {
    val builder = CfnAlarmModelIotSiteWisePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information required to publish the MQTT message through the AWS IoT message broker.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * IotTopicPublishProperty iotTopicPublishProperty = IotTopicPublishProperty.builder()
   * .mqttTopic("mqttTopic")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-iottopicpublish.html)
   */
  public inline
      fun cfnAlarmModelIotTopicPublishProperty(block: CfnAlarmModelIotTopicPublishPropertyDsl.() -> Unit
      = {}): CfnAlarmModel.IotTopicPublishProperty {
    val builder = CfnAlarmModelIotTopicPublishPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Calls a Lambda function, passing in information about the detector model instance and the event
   * that triggered the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * LambdaProperty lambdaProperty = LambdaProperty.builder()
   * .functionArn("functionArn")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-lambda.html)
   */
  public inline fun cfnAlarmModelLambdaProperty(block: CfnAlarmModelLambdaPropertyDsl.() -> Unit =
      {}): CfnAlarmModel.LambdaProperty {
    val builder = CfnAlarmModelLambdaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information needed to configure the payload.
   *
   * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
   * payload contains all attribute-value pairs that have the information about the detector model
   * instance and the event triggered the action. To configure the action payload, you can use
   * `contentExpression` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * PayloadProperty payloadProperty = PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-payload.html)
   */
  public inline fun cfnAlarmModelPayloadProperty(block: CfnAlarmModelPayloadPropertyDsl.() -> Unit =
      {}): CfnAlarmModel.PayloadProperty {
    val builder = CfnAlarmModelPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAlarmModel`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * CfnAlarmModelProps cfnAlarmModelProps = CfnAlarmModelProps.builder()
   * .alarmRule(AlarmRuleProperty.builder()
   * .simpleRule(SimpleRuleProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .inputProperty("inputProperty")
   * .threshold("threshold")
   * .build())
   * .build())
   * .roleArn("roleArn")
   * // the properties below are optional
   * .alarmCapabilities(AlarmCapabilitiesProperty.builder()
   * .acknowledgeFlow(AcknowledgeFlowProperty.builder()
   * .enabled(false)
   * .build())
   * .initializationConfiguration(InitializationConfigurationProperty.builder()
   * .disabledOnInitialization(false)
   * .build())
   * .build())
   * .alarmEventActions(AlarmEventActionsProperty.builder()
   * .alarmActions(List.of(AlarmActionProperty.builder()
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
   * .build()))
   * .build())
   * .alarmModelDescription("alarmModelDescription")
   * .alarmModelName("alarmModelName")
   * .key("key")
   * .severity(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-alarmmodel.html)
   */
  public inline fun cfnAlarmModelProps(block: CfnAlarmModelPropsDsl.() -> Unit = {}):
      CfnAlarmModelProps {
    val builder = CfnAlarmModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A rule that compares an input property value to a threshold value with a comparison operator.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * SimpleRuleProperty simpleRuleProperty = SimpleRuleProperty.builder()
   * .comparisonOperator("comparisonOperator")
   * .inputProperty("inputProperty")
   * .threshold("threshold")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-simplerule.html)
   */
  public inline
      fun cfnAlarmModelSimpleRuleProperty(block: CfnAlarmModelSimpleRulePropertyDsl.() -> Unit =
      {}): CfnAlarmModel.SimpleRuleProperty {
    val builder = CfnAlarmModelSimpleRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information required to publish the Amazon SNS message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * SnsProperty snsProperty = SnsProperty.builder()
   * .targetArn("targetArn")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sns.html)
   */
  public inline fun cfnAlarmModelSnsProperty(block: CfnAlarmModelSnsPropertyDsl.() -> Unit = {}):
      CfnAlarmModel.SnsProperty {
    val builder = CfnAlarmModelSnsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * an Amazon SQS queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * SqsProperty sqsProperty = SqsProperty.builder()
   * .queueUrl("queueUrl")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .useBase64(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-sqs.html)
   */
  public inline fun cfnAlarmModelSqsProperty(block: CfnAlarmModelSqsPropertyDsl.() -> Unit = {}):
      CfnAlarmModel.SqsProperty {
    val builder = CfnAlarmModelSqsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AWS::IoTEvents::DetectorModel resource creates a detector model.
   *
   * You create a *detector model* (a model of your equipment or process) using *states* . For each
   * state, you define conditional (Boolean) logic that evaluates the incoming inputs to detect
   * significant events. When an event is detected, it can change the state or trigger custom-built or
   * predefined actions using other AWS services. You can define additional events that trigger actions
   * when entering or exiting a state and, optionally, when a condition is met. For more information,
   * see [How to Use AWS IoT
   * Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html) in
   * the *AWS IoT Events Developer Guide* .
   *
   *
   * When you successfully update a detector model (using the AWS IoT Events console, AWS IoT Events
   * API or CLI commands, or AWS CloudFormation ) all detector instances created by the model are reset
   * to their initial states. (The detector's `state` , and the values of any variables and timers are
   * reset.)
   *
   * When you successfully update a detector model (using the AWS IoT Events console, AWS IoT Events
   * API or CLI commands, or AWS CloudFormation ) the version number of the detector model is
   * incremented. (A detector model with version number 1 before the update has version number 2 after
   * the update succeeds.)
   *
   * If you attempt to update a detector model using AWS CloudFormation and the update does not
   * succeed, the system may, in some cases, restore the original detector model. When this occurs, the
   * detector model's version is incremented twice (for example, from version 1 to version 3) and the
   * detector instances are reset.
   *
   * Also, be aware that if you attempt to update several detector models at once using AWS
   * CloudFormation , some updates may succeed and others fail. In this case, the effects on each
   * detector model's detector instances and version number depend on whether the update succeeded or
   * failed, with the results as stated.
   *
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html)
   */
  public inline fun cfnDetectorModel(
    scope: Construct,
    id: String,
    block: CfnDetectorModelDsl.() -> Unit = {},
  ): CfnDetectorModel {
    val builder = CfnDetectorModelDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * An action to be performed when the `condition` is TRUE.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .clearTimer(ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build())
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
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
   * .resetTimer(ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build())
   * .setTimer(SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build())
   * .setVariable(SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-action.html)
   */
  public inline
      fun cfnDetectorModelActionProperty(block: CfnDetectorModelActionPropertyDsl.() -> Unit = {}):
      CfnDetectorModel.ActionProperty {
    val builder = CfnDetectorModelActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A structure that contains timestamp information. For more information, see
   * [TimeInNanos](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_TimeInNanos.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyTimestamp` . The expressions
   * accept literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `timeInSeconds` parameter can be `'1586400675'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `offsetInNanos` parameter can be `$variable.time` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `timeInSeconds` parameter uses a substitution
   * template.
   *
   * `'${$input.TemperatureInput.sensorData.timestamp / 1000}'`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AssetPropertyTimestampProperty assetPropertyTimestampProperty =
   * AssetPropertyTimestampProperty.builder()
   * .timeInSeconds("timeInSeconds")
   * // the properties below are optional
   * .offsetInNanos("offsetInNanos")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertytimestamp.html)
   */
  public inline
      fun cfnDetectorModelAssetPropertyTimestampProperty(block: CfnDetectorModelAssetPropertyTimestampPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.AssetPropertyTimestampProperty {
    val builder = CfnDetectorModelAssetPropertyTimestampPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A structure that contains value information. For more information, see
   * [AssetPropertyValue](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetPropertyValue.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyValue` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `quality` parameter can be `'GOOD'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `quality` parameter can be `$input.TemperatureInput.sensorData.quality` .
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AssetPropertyValueProperty assetPropertyValueProperty = AssetPropertyValueProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvalue.html)
   */
  public inline
      fun cfnDetectorModelAssetPropertyValueProperty(block: CfnDetectorModelAssetPropertyValuePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.AssetPropertyValueProperty {
    val builder = CfnDetectorModelAssetPropertyValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A structure that contains an asset property value.
   *
   * For more information, see
   * [Variant](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_Variant.html) in the
   * *AWS IoT SiteWise API Reference* .
   *
   * You must use expressions for all parameters in `AssetPropertyVariant` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `integerValue` parameter can be `'100'` .
   *
   * * For references, you must specify either variables or parameters. For example, the value for
   * the `booleanValue` parameter can be `$variable.offline` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `doubleValue` parameter uses a substitution
   * template.
   *
   * `'${$input.TemperatureInput.sensorData.temperature * 6 / 5 + 32}'`
   *
   * For more information, see
   * [Expressions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-expressions.html)
   * in the *AWS IoT Events Developer Guide* .
   *
   * You must specify one of the following value types, depending on the `dataType` of the specified
   * asset property. For more information, see
   * [AssetProperty](https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_AssetProperty.html)
   * in the *AWS IoT SiteWise API Reference* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AssetPropertyVariantProperty assetPropertyVariantProperty =
   * AssetPropertyVariantProperty.builder()
   * .booleanValue("booleanValue")
   * .doubleValue("doubleValue")
   * .integerValue("integerValue")
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-assetpropertyvariant.html)
   */
  public inline
      fun cfnDetectorModelAssetPropertyVariantProperty(block: CfnDetectorModelAssetPropertyVariantPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.AssetPropertyVariantProperty {
    val builder = CfnDetectorModelAssetPropertyVariantPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information needed to clear the timer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * ClearTimerProperty clearTimerProperty = ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-cleartimer.html)
   */
  public inline
      fun cfnDetectorModelClearTimerProperty(block: CfnDetectorModelClearTimerPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.ClearTimerProperty {
    val builder = CfnDetectorModelClearTimerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information that defines how a detector operates.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-detectormodeldefinition.html)
   */
  public inline
      fun cfnDetectorModelDetectorModelDefinitionProperty(block: CfnDetectorModelDetectorModelDefinitionPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.DetectorModelDefinitionProperty {
    val builder = CfnDetectorModelDetectorModelDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines an action to write to the Amazon DynamoDB table that you created.
   *
   * The standard action payload contains all the information about the detector model instance and
   * the event that triggered the action. You can customize the
   * [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html) . One column
   * of the DynamoDB table receives all attribute-value pairs in the payload that you specify.
   *
   * You must use expressions for all parameters in `DynamoDBAction` . The expressions accept
   * literals, operators, functions, references, and substitution templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `hashKeyType` parameter can be `'STRING'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `hashKeyField` parameter can be `$input.GreenhouseInput.name` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
   *
   * In the following example, the value for the `hashKeyValue` parameter uses a substitution
   * template.
   *
   * `'${$input.GreenhouseInput.temperature * 6 / 5 + 32} in Fahrenheit'`
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
   * If the defined payload type is a string, `DynamoDBAction` writes non-JSON data to the DynamoDB
   * table as binary data. The DynamoDB console displays the data as Base64-encoded text. The value for
   * the `payloadField` parameter is `&lt;payload-field&gt;_raw` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * DynamoDBProperty dynamoDBProperty = DynamoDBProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodb.html)
   */
  public inline
      fun cfnDetectorModelDynamoDBProperty(block: CfnDetectorModelDynamoDBPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.DynamoDBProperty {
    val builder = CfnDetectorModelDynamoDBPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines an action to write to the Amazon DynamoDB table that you created.
   *
   * The default action payload contains all the information about the detector model instance and
   * the event that triggered the action. You can customize the
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
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-dynamodbv2.html)
   */
  public inline
      fun cfnDetectorModelDynamoDBv2Property(block: CfnDetectorModelDynamoDBv2PropertyDsl.() -> Unit
      = {}): CfnDetectorModel.DynamoDBv2Property {
    val builder = CfnDetectorModelDynamoDBv2PropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the `actions` to be performed when the `condition` evaluates to TRUE.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * EventProperty eventProperty = EventProperty.builder()
   * .eventName("eventName")
   * // the properties below are optional
   * .actions(List.of(ActionProperty.builder()
   * .clearTimer(ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build())
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
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
   * .resetTimer(ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build())
   * .setTimer(SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build())
   * .setVariable(SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
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
   * .build()))
   * .condition("condition")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-event.html)
   */
  public inline fun cfnDetectorModelEventProperty(block: CfnDetectorModelEventPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.EventProperty {
    val builder = CfnDetectorModelEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * an Amazon Kinesis Data Firehose delivery stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * FirehoseProperty firehoseProperty = FirehoseProperty.builder()
   * .deliveryStreamName("deliveryStreamName")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .separator("separator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-firehose.html)
   */
  public inline
      fun cfnDetectorModelFirehoseProperty(block: CfnDetectorModelFirehosePropertyDsl.() -> Unit =
      {}): CfnDetectorModel.FirehoseProperty {
    val builder = CfnDetectorModelFirehosePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends an AWS IoT Events input, passing in information about the detector model instance and the
   * event that triggered the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * IotEventsProperty iotEventsProperty = IotEventsProperty.builder()
   * .inputName("inputName")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotevents.html)
   */
  public inline
      fun cfnDetectorModelIotEventsProperty(block: CfnDetectorModelIotEventsPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.IotEventsProperty {
    val builder = CfnDetectorModelIotEventsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * a specified asset property in AWS IoT SiteWise .
   *
   * You must use expressions for all parameters in `IotSiteWiseAction` . The expressions accept
   * literals, operators, functions, references, and substitutions templates.
   *
   * **Examples** - For literal values, the expressions must contain single quotes. For example, the
   * value for the `propertyAlias` parameter can be `'/company/windfarm/3/turbine/7/temperature'` .
   *
   * * For references, you must specify either variables or input values. For example, the value for
   * the `assetId` parameter can be `$input.TurbineInput.assetId1` .
   * * For a substitution template, you must use `${}` , and the template must be in single quotes.
   * A substitution template can also contain a combination of literals, operators, functions,
   * references, and substitution templates.
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
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * IotSiteWiseProperty iotSiteWiseProperty = IotSiteWiseProperty.builder()
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iotsitewise.html)
   */
  public inline
      fun cfnDetectorModelIotSiteWiseProperty(block: CfnDetectorModelIotSiteWisePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.IotSiteWiseProperty {
    val builder = CfnDetectorModelIotSiteWisePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information required to publish the MQTT message through the AWS IoT message broker.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * IotTopicPublishProperty iotTopicPublishProperty = IotTopicPublishProperty.builder()
   * .mqttTopic("mqttTopic")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html)
   */
  public inline
      fun cfnDetectorModelIotTopicPublishProperty(block: CfnDetectorModelIotTopicPublishPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.IotTopicPublishProperty {
    val builder = CfnDetectorModelIotTopicPublishPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Calls a Lambda function, passing in information about the detector model instance and the event
   * that triggered the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * LambdaProperty lambdaProperty = LambdaProperty.builder()
   * .functionArn("functionArn")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-lambda.html)
   */
  public inline
      fun cfnDetectorModelLambdaProperty(block: CfnDetectorModelLambdaPropertyDsl.() -> Unit = {}):
      CfnDetectorModel.LambdaProperty {
    val builder = CfnDetectorModelLambdaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * When entering this state, perform these `actions` if the `condition` is TRUE.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * OnEnterProperty onEnterProperty = OnEnterProperty.builder()
   * .events(List.of(EventProperty.builder()
   * .eventName("eventName")
   * // the properties below are optional
   * .actions(List.of(ActionProperty.builder()
   * .clearTimer(ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build())
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
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
   * .resetTimer(ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build())
   * .setTimer(SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build())
   * .setVariable(SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
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
   * .build()))
   * .condition("condition")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onenter.html)
   */
  public inline
      fun cfnDetectorModelOnEnterProperty(block: CfnDetectorModelOnEnterPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.OnEnterProperty {
    val builder = CfnDetectorModelOnEnterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * When exiting this state, perform these `actions` if the specified `condition` is `TRUE` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * OnExitProperty onExitProperty = OnExitProperty.builder()
   * .events(List.of(EventProperty.builder()
   * .eventName("eventName")
   * // the properties below are optional
   * .actions(List.of(ActionProperty.builder()
   * .clearTimer(ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build())
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
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
   * .resetTimer(ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build())
   * .setTimer(SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build())
   * .setVariable(SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
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
   * .build()))
   * .condition("condition")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-onexit.html)
   */
  public inline
      fun cfnDetectorModelOnExitProperty(block: CfnDetectorModelOnExitPropertyDsl.() -> Unit = {}):
      CfnDetectorModel.OnExitProperty {
    val builder = CfnDetectorModelOnExitPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the actions performed when the `condition` evaluates to TRUE.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * OnInputProperty onInputProperty = OnInputProperty.builder()
   * .events(List.of(EventProperty.builder()
   * .eventName("eventName")
   * // the properties below are optional
   * .actions(List.of(ActionProperty.builder()
   * .clearTimer(ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build())
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
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
   * .resetTimer(ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build())
   * .setTimer(SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build())
   * .setVariable(SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
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
   * .build()))
   * .condition("condition")
   * .build()))
   * .transitionEvents(List.of(TransitionEventProperty.builder()
   * .condition("condition")
   * .eventName("eventName")
   * .nextState("nextState")
   * // the properties below are optional
   * .actions(List.of(ActionProperty.builder()
   * .clearTimer(ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build())
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
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
   * .resetTimer(ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build())
   * .setTimer(SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build())
   * .setVariable(SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
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
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-oninput.html)
   */
  public inline
      fun cfnDetectorModelOnInputProperty(block: CfnDetectorModelOnInputPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.OnInputProperty {
    val builder = CfnDetectorModelOnInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information needed to configure the payload.
   *
   * By default, AWS IoT Events generates a standard payload in JSON for any action. This action
   * payload contains all attribute-value pairs that have the information about the detector model
   * instance and the event triggered the action. To configure the action payload, you can use
   * `contentExpression` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * PayloadProperty payloadProperty = PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-payload.html)
   */
  public inline
      fun cfnDetectorModelPayloadProperty(block: CfnDetectorModelPayloadPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.PayloadProperty {
    val builder = CfnDetectorModelPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDetectorModel`.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-detectormodel.html)
   */
  public inline fun cfnDetectorModelProps(block: CfnDetectorModelPropsDsl.() -> Unit = {}):
      CfnDetectorModelProps {
    val builder = CfnDetectorModelPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information required to reset the timer.
   *
   * The timer is reset to the previously evaluated result of the duration. The duration expression
   * isn't reevaluated when you reset the timer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * ResetTimerProperty resetTimerProperty = ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-resettimer.html)
   */
  public inline
      fun cfnDetectorModelResetTimerProperty(block: CfnDetectorModelResetTimerPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.ResetTimerProperty {
    val builder = CfnDetectorModelResetTimerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information needed to set the timer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * SetTimerProperty setTimerProperty = SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-settimer.html)
   */
  public inline
      fun cfnDetectorModelSetTimerProperty(block: CfnDetectorModelSetTimerPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.SetTimerProperty {
    val builder = CfnDetectorModelSetTimerPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about the variable and its new value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * SetVariableProperty setVariableProperty = SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html)
   */
  public inline
      fun cfnDetectorModelSetVariableProperty(block: CfnDetectorModelSetVariablePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.SetVariableProperty {
    val builder = CfnDetectorModelSetVariablePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information required to publish the Amazon SNS message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * SnsProperty snsProperty = SnsProperty.builder()
   * .targetArn("targetArn")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sns.html)
   */
  public inline fun cfnDetectorModelSnsProperty(block: CfnDetectorModelSnsPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.SnsProperty {
    val builder = CfnDetectorModelSnsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Sends information about the detector model instance and the event that triggered the action to
   * an Amazon SQS queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * SqsProperty sqsProperty = SqsProperty.builder()
   * .queueUrl("queueUrl")
   * // the properties below are optional
   * .payload(PayloadProperty.builder()
   * .contentExpression("contentExpression")
   * .type("type")
   * .build())
   * .useBase64(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html)
   */
  public inline fun cfnDetectorModelSqsProperty(block: CfnDetectorModelSqsPropertyDsl.() -> Unit =
      {}): CfnDetectorModel.SqsProperty {
    val builder = CfnDetectorModelSqsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information that defines a state of a detector.
   *
   * Example:
   *
   * ```
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-state.html)
   */
  public inline fun cfnDetectorModelStateProperty(block: CfnDetectorModelStatePropertyDsl.() -> Unit
      = {}): CfnDetectorModel.StateProperty {
    val builder = CfnDetectorModelStatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Specifies the actions performed and the next state entered when a `condition` evaluates to
   * TRUE.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * TransitionEventProperty transitionEventProperty = TransitionEventProperty.builder()
   * .condition("condition")
   * .eventName("eventName")
   * .nextState("nextState")
   * // the properties below are optional
   * .actions(List.of(ActionProperty.builder()
   * .clearTimer(ClearTimerProperty.builder()
   * .timerName("timerName")
   * .build())
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
   * // the properties below are optional
   * .assetId("assetId")
   * .entryId("entryId")
   * .propertyAlias("propertyAlias")
   * .propertyId("propertyId")
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
   * .resetTimer(ResetTimerProperty.builder()
   * .timerName("timerName")
   * .build())
   * .setTimer(SetTimerProperty.builder()
   * .timerName("timerName")
   * // the properties below are optional
   * .durationExpression("durationExpression")
   * .seconds(123)
   * .build())
   * .setVariable(SetVariableProperty.builder()
   * .value("value")
   * .variableName("variableName")
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
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-transitionevent.html)
   */
  public inline
      fun cfnDetectorModelTransitionEventProperty(block: CfnDetectorModelTransitionEventPropertyDsl.() -> Unit
      = {}): CfnDetectorModel.TransitionEventProperty {
    val builder = CfnDetectorModelTransitionEventPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The AWS::IoTEvents::Input resource creates an input.
   *
   * To monitor your devices and processes, they must have a way to get telemetry data into AWS IoT
   * Events . This is done by sending messages as *inputs* to AWS IoT Events . For more information,
   * see [How to Use AWS IoT
   * Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html) in
   * the *AWS IoT Events Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * CfnInput cfnInput = CfnInput.Builder.create(this, "MyCfnInput")
   * .inputDefinition(InputDefinitionProperty.builder()
   * .attributes(List.of(AttributeProperty.builder()
   * .jsonPath("jsonPath")
   * .build()))
   * .build())
   * // the properties below are optional
   * .inputDescription("inputDescription")
   * .inputName("inputName")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html)
   */
  public inline fun cfnInput(
    scope: Construct,
    id: String,
    block: CfnInputDsl.() -> Unit = {},
  ): CfnInput {
    val builder = CfnInputDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The attributes from the JSON payload that are made available by the input.
   *
   * Inputs are derived from messages sent to the AWS IoT Events system using `BatchPutMessage` .
   * Each such message contains a JSON payload. Those attributes (and their paired values) specified
   * here are available for use in the `condition` expressions used by detectors.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * AttributeProperty attributeProperty = AttributeProperty.builder()
   * .jsonPath("jsonPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-attribute.html)
   */
  public inline fun cfnInputAttributeProperty(block: CfnInputAttributePropertyDsl.() -> Unit = {}):
      CfnInput.AttributeProperty {
    val builder = CfnInputAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The definition of the input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * InputDefinitionProperty inputDefinitionProperty = InputDefinitionProperty.builder()
   * .attributes(List.of(AttributeProperty.builder()
   * .jsonPath("jsonPath")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-input-inputdefinition.html)
   */
  public inline
      fun cfnInputInputDefinitionProperty(block: CfnInputInputDefinitionPropertyDsl.() -> Unit =
      {}): CfnInput.InputDefinitionProperty {
    val builder = CfnInputInputDefinitionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnInput`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.iotevents.*;
   * CfnInputProps cfnInputProps = CfnInputProps.builder()
   * .inputDefinition(InputDefinitionProperty.builder()
   * .attributes(List.of(AttributeProperty.builder()
   * .jsonPath("jsonPath")
   * .build()))
   * .build())
   * // the properties below are optional
   * .inputDescription("inputDescription")
   * .inputName("inputName")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html)
   */
  public inline fun cfnInputProps(block: CfnInputPropsDsl.() -> Unit = {}): CfnInputProps {
    val builder = CfnInputPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
