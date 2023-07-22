@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnContactList

@CdkDslMarker
public class CfnContactListTopicPropertyDsl {
  private val cdkBuilder: CfnContactList.TopicProperty.Builder =
      CfnContactList.TopicProperty.builder()

  /**
   * @param defaultSubscriptionStatus The default subscription status to be applied to a contact if
   * the contact has not noted their preference for subscribing to a topic. 
   */
  public fun defaultSubscriptionStatus(defaultSubscriptionStatus: String) {
    cdkBuilder.defaultSubscriptionStatus(defaultSubscriptionStatus)
  }

  /**
   * @param description A description of what the topic is about, which the contact will see.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param displayName The name of the topic the contact will see. 
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  /**
   * @param topicName The name of the topic. 
   */
  public fun topicName(topicName: String) {
    cdkBuilder.topicName(topicName)
  }

  public fun build(): CfnContactList.TopicProperty = cdkBuilder.build()
}
