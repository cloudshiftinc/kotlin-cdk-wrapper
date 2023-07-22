@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan

@CdkDslMarker
public class CfnResponsePlanChatChannelPropertyDsl {
  private val cdkBuilder: CfnResponsePlan.ChatChannelProperty.Builder =
      CfnResponsePlan.ChatChannelProperty.builder()

  private val _chatbotSns: MutableList<String> = mutableListOf()

  /**
   * @param chatbotSns The SNS targets that AWS Chatbot uses to notify the chat channel of updates
   * to an incident.
   * You can also make updates to the incident through the chat channel by using the SNS topics
   */
  public fun chatbotSns(vararg chatbotSns: String) {
    _chatbotSns.addAll(listOf(*chatbotSns))
  }

  /**
   * @param chatbotSns The SNS targets that AWS Chatbot uses to notify the chat channel of updates
   * to an incident.
   * You can also make updates to the incident through the chat channel by using the SNS topics
   */
  public fun chatbotSns(chatbotSns: Collection<String>) {
    _chatbotSns.addAll(chatbotSns)
  }

  public fun build(): CfnResponsePlan.ChatChannelProperty {
    if(_chatbotSns.isNotEmpty()) cdkBuilder.chatbotSns(_chatbotSns)
    return cdkBuilder.build()
  }
}
