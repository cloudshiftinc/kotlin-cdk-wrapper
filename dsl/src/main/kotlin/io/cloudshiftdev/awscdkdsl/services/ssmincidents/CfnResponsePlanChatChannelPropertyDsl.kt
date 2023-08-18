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

package io.cloudshiftdev.awscdkdsl.services.ssmincidents

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

/**
 * The AWS Chatbot chat channel used for collaboration during an incident.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmincidents.*;
 * ChatChannelProperty chatChannelProperty = ChatChannelProperty.builder()
 * .chatbotSns(List.of("chatbotSns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmincidents-responseplan-chatchannel.html)
 */
@CdkDslMarker
public class CfnResponsePlanChatChannelPropertyDsl {
    private val cdkBuilder: CfnResponsePlan.ChatChannelProperty.Builder =
        CfnResponsePlan.ChatChannelProperty.builder()

    private val _chatbotSns: MutableList<String> = mutableListOf()

    /**
     * @param chatbotSns The SNS targets that AWS Chatbot uses to notify the chat channel of updates
     *   to an incident. You can also make updates to the incident through the chat channel by using
     *   the SNS topics
     */
    public fun chatbotSns(vararg chatbotSns: String) {
        _chatbotSns.addAll(listOf(*chatbotSns))
    }

    /**
     * @param chatbotSns The SNS targets that AWS Chatbot uses to notify the chat channel of updates
     *   to an incident. You can also make updates to the incident through the chat channel by using
     *   the SNS topics
     */
    public fun chatbotSns(chatbotSns: Collection<String>) {
        _chatbotSns.addAll(chatbotSns)
    }

    public fun build(): CfnResponsePlan.ChatChannelProperty {
        if (_chatbotSns.isNotEmpty()) cdkBuilder.chatbotSns(_chatbotSns)
        return cdkBuilder.build()
    }
}
