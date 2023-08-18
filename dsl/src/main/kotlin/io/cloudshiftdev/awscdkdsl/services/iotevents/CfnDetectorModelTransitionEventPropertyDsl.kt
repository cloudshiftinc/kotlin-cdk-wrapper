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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Specifies the actions performed and the next state entered when a `condition` evaluates to TRUE.
 *
 * Example:
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
@CdkDslMarker
public class CfnDetectorModelTransitionEventPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.TransitionEventProperty.Builder =
        CfnDetectorModel.TransitionEventProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    /** @param actions The actions to be performed. */
    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    /** @param actions The actions to be performed. */
    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    /** @param actions The actions to be performed. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /**
     * @param condition Required. A Boolean expression that when TRUE causes the actions to be
     *   performed and the `nextState` to be entered.
     */
    public fun condition(condition: String) {
        cdkBuilder.condition(condition)
    }

    /** @param eventName The name of the transition event. */
    public fun eventName(eventName: String) {
        cdkBuilder.eventName(eventName)
    }

    /** @param nextState The next state to enter. */
    public fun nextState(nextState: String) {
        cdkBuilder.nextState(nextState)
    }

    public fun build(): CfnDetectorModel.TransitionEventProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
