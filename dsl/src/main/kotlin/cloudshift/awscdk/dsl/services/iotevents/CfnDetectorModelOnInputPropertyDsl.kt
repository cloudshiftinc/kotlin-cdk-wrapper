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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Specifies the actions performed when the `condition` evaluates to TRUE.
 *
 * Example:
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
@CdkDslMarker
public class CfnDetectorModelOnInputPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.OnInputProperty.Builder =
        CfnDetectorModel.OnInputProperty.builder()

    private val _events: MutableList<Any> = mutableListOf()

    private val _transitionEvents: MutableList<Any> = mutableListOf()

    /** @param events Specifies the actions performed when the `condition` evaluates to TRUE. */
    public fun events(vararg events: Any) {
        _events.addAll(listOf(*events))
    }

    /** @param events Specifies the actions performed when the `condition` evaluates to TRUE. */
    public fun events(events: Collection<Any>) {
        _events.addAll(events)
    }

    /** @param events Specifies the actions performed when the `condition` evaluates to TRUE. */
    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    /**
     * @param transitionEvents Specifies the actions performed, and the next state entered, when a
     *   `condition` evaluates to TRUE.
     */
    public fun transitionEvents(vararg transitionEvents: Any) {
        _transitionEvents.addAll(listOf(*transitionEvents))
    }

    /**
     * @param transitionEvents Specifies the actions performed, and the next state entered, when a
     *   `condition` evaluates to TRUE.
     */
    public fun transitionEvents(transitionEvents: Collection<Any>) {
        _transitionEvents.addAll(transitionEvents)
    }

    /**
     * @param transitionEvents Specifies the actions performed, and the next state entered, when a
     *   `condition` evaluates to TRUE.
     */
    public fun transitionEvents(transitionEvents: IResolvable) {
        cdkBuilder.transitionEvents(transitionEvents)
    }

    public fun build(): CfnDetectorModel.OnInputProperty {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        if (_transitionEvents.isNotEmpty()) cdkBuilder.transitionEvents(_transitionEvents)
        return cdkBuilder.build()
    }
}
