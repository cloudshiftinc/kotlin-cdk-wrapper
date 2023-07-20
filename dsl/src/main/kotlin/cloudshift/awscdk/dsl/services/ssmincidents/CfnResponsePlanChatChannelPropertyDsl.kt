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

  public fun chatbotSns(vararg chatbotSns: String) {
    _chatbotSns.addAll(listOf(*chatbotSns))
  }

  public fun chatbotSns(chatbotSns: Collection<String>) {
    _chatbotSns.addAll(chatbotSns)
  }

  public fun build(): CfnResponsePlan.ChatChannelProperty {
    if(_chatbotSns.isNotEmpty()) cdkBuilder.chatbotSns(_chatbotSns)
    return cdkBuilder.build()
  }
}
