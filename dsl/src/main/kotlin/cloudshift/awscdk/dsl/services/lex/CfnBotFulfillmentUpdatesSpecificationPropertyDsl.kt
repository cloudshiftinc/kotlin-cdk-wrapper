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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides information for updating the user on the progress of fulfilling an intent.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * FulfillmentUpdatesSpecificationProperty fulfillmentUpdatesSpecificationProperty =
 * FulfillmentUpdatesSpecificationProperty.builder()
 * .active(false)
 * // the properties below are optional
 * .startResponse(FulfillmentStartResponseSpecificationProperty.builder()
 * .delayInSeconds(123)
 * .messageGroups(List.of(MessageGroupProperty.builder()
 * .message(MessageProperty.builder()
 * .customPayload(CustomPayloadProperty.builder()
 * .value("value")
 * .build())
 * .imageResponseCard(ImageResponseCardProperty.builder()
 * .title("title")
 * // the properties below are optional
 * .buttons(List.of(ButtonProperty.builder()
 * .text("text")
 * .value("value")
 * .build()))
 * .imageUrl("imageUrl")
 * .subtitle("subtitle")
 * .build())
 * .plainTextMessage(PlainTextMessageProperty.builder()
 * .value("value")
 * .build())
 * .ssmlMessage(SSMLMessageProperty.builder()
 * .value("value")
 * .build())
 * .build())
 * // the properties below are optional
 * .variations(List.of(MessageProperty.builder()
 * .customPayload(CustomPayloadProperty.builder()
 * .value("value")
 * .build())
 * .imageResponseCard(ImageResponseCardProperty.builder()
 * .title("title")
 * // the properties below are optional
 * .buttons(List.of(ButtonProperty.builder()
 * .text("text")
 * .value("value")
 * .build()))
 * .imageUrl("imageUrl")
 * .subtitle("subtitle")
 * .build())
 * .plainTextMessage(PlainTextMessageProperty.builder()
 * .value("value")
 * .build())
 * .ssmlMessage(SSMLMessageProperty.builder()
 * .value("value")
 * .build())
 * .build()))
 * .build()))
 * // the properties below are optional
 * .allowInterrupt(false)
 * .build())
 * .timeoutInSeconds(123)
 * .updateResponse(FulfillmentUpdateResponseSpecificationProperty.builder()
 * .frequencyInSeconds(123)
 * .messageGroups(List.of(MessageGroupProperty.builder()
 * .message(MessageProperty.builder()
 * .customPayload(CustomPayloadProperty.builder()
 * .value("value")
 * .build())
 * .imageResponseCard(ImageResponseCardProperty.builder()
 * .title("title")
 * // the properties below are optional
 * .buttons(List.of(ButtonProperty.builder()
 * .text("text")
 * .value("value")
 * .build()))
 * .imageUrl("imageUrl")
 * .subtitle("subtitle")
 * .build())
 * .plainTextMessage(PlainTextMessageProperty.builder()
 * .value("value")
 * .build())
 * .ssmlMessage(SSMLMessageProperty.builder()
 * .value("value")
 * .build())
 * .build())
 * // the properties below are optional
 * .variations(List.of(MessageProperty.builder()
 * .customPayload(CustomPayloadProperty.builder()
 * .value("value")
 * .build())
 * .imageResponseCard(ImageResponseCardProperty.builder()
 * .title("title")
 * // the properties below are optional
 * .buttons(List.of(ButtonProperty.builder()
 * .text("text")
 * .value("value")
 * .build()))
 * .imageUrl("imageUrl")
 * .subtitle("subtitle")
 * .build())
 * .plainTextMessage(PlainTextMessageProperty.builder()
 * .value("value")
 * .build())
 * .ssmlMessage(SSMLMessageProperty.builder()
 * .value("value")
 * .build())
 * .build()))
 * .build()))
 * // the properties below are optional
 * .allowInterrupt(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-fulfillmentupdatesspecification.html)
 */
@CdkDslMarker
public class CfnBotFulfillmentUpdatesSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.FulfillmentUpdatesSpecificationProperty.Builder =
        CfnBot.FulfillmentUpdatesSpecificationProperty.builder()

    /**
     * @param active Determines whether fulfillment updates are sent to the user. When this field is
     *   true, updates are sent. If the `active` field is set to true, the `startResponse` ,
     *   `updateResponse` , and `timeoutInSeconds` fields are required.
     */
    public fun active(active: Boolean) {
        cdkBuilder.active(active)
    }

    /**
     * @param active Determines whether fulfillment updates are sent to the user. When this field is
     *   true, updates are sent. If the `active` field is set to true, the `startResponse` ,
     *   `updateResponse` , and `timeoutInSeconds` fields are required.
     */
    public fun active(active: IResolvable) {
        cdkBuilder.active(active)
    }

    /**
     * @param startResponse Provides configuration information for the message sent to users when
     *   the fulfillment Lambda functions starts running.
     */
    public fun startResponse(startResponse: IResolvable) {
        cdkBuilder.startResponse(startResponse)
    }

    /**
     * @param startResponse Provides configuration information for the message sent to users when
     *   the fulfillment Lambda functions starts running.
     */
    public fun startResponse(startResponse: CfnBot.FulfillmentStartResponseSpecificationProperty) {
        cdkBuilder.startResponse(startResponse)
    }

    /**
     * @param timeoutInSeconds The length of time that the fulfillment Lambda function should run
     *   before it times out.
     */
    public fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
    }

    /**
     * @param updateResponse Provides configuration information for messages sent periodically to
     *   the user while the fulfillment Lambda function is running.
     */
    public fun updateResponse(updateResponse: IResolvable) {
        cdkBuilder.updateResponse(updateResponse)
    }

    /**
     * @param updateResponse Provides configuration information for messages sent periodically to
     *   the user while the fulfillment Lambda function is running.
     */
    public fun updateResponse(
        updateResponse: CfnBot.FulfillmentUpdateResponseSpecificationProperty
    ) {
        cdkBuilder.updateResponse(updateResponse)
    }

    public fun build(): CfnBot.FulfillmentUpdatesSpecificationProperty = cdkBuilder.build()
}
