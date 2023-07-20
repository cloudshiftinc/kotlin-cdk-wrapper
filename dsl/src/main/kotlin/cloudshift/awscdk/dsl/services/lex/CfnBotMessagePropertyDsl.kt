@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

@CdkDslMarker
public class CfnBotMessagePropertyDsl {
    private val cdkBuilder: CfnBot.MessageProperty.Builder = CfnBot.MessageProperty.builder()

    public fun customPayload(customPayload: IResolvable) {
        cdkBuilder.customPayload(customPayload)
    }

    public fun customPayload(customPayload: CfnBot.CustomPayloadProperty) {
        cdkBuilder.customPayload(customPayload)
    }

    public fun imageResponseCard(imageResponseCard: IResolvable) {
        cdkBuilder.imageResponseCard(imageResponseCard)
    }

    public fun imageResponseCard(imageResponseCard: CfnBot.ImageResponseCardProperty) {
        cdkBuilder.imageResponseCard(imageResponseCard)
    }

    public fun plainTextMessage(plainTextMessage: IResolvable) {
        cdkBuilder.plainTextMessage(plainTextMessage)
    }

    public fun plainTextMessage(plainTextMessage: CfnBot.PlainTextMessageProperty) {
        cdkBuilder.plainTextMessage(plainTextMessage)
    }

    public fun ssmlMessage(ssmlMessage: IResolvable) {
        cdkBuilder.ssmlMessage(ssmlMessage)
    }

    public fun ssmlMessage(ssmlMessage: CfnBot.SSMLMessageProperty) {
        cdkBuilder.ssmlMessage(ssmlMessage)
    }

    public fun build(): CfnBot.MessageProperty = cdkBuilder.build()
}
