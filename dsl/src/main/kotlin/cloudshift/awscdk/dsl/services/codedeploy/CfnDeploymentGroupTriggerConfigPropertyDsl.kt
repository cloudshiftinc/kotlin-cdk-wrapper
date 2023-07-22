@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup

@CdkDslMarker
public class CfnDeploymentGroupTriggerConfigPropertyDsl {
  private val cdkBuilder: CfnDeploymentGroup.TriggerConfigProperty.Builder =
      CfnDeploymentGroup.TriggerConfigProperty.builder()

  private val _triggerEvents: MutableList<String> = mutableListOf()

  /**
   * @param triggerEvents The event type or types that trigger notifications.
   */
  public fun triggerEvents(vararg triggerEvents: String) {
    _triggerEvents.addAll(listOf(*triggerEvents))
  }

  /**
   * @param triggerEvents The event type or types that trigger notifications.
   */
  public fun triggerEvents(triggerEvents: Collection<String>) {
    _triggerEvents.addAll(triggerEvents)
  }

  /**
   * @param triggerName The name of the notification trigger.
   */
  public fun triggerName(triggerName: String) {
    cdkBuilder.triggerName(triggerName)
  }

  /**
   * @param triggerTargetArn The Amazon Resource Name (ARN) of the Amazon Simple Notification
   * Service topic through which notifications about deployment or instance events are sent.
   */
  public fun triggerTargetArn(triggerTargetArn: String) {
    cdkBuilder.triggerTargetArn(triggerTargetArn)
  }

  public fun build(): CfnDeploymentGroup.TriggerConfigProperty {
    if(_triggerEvents.isNotEmpty()) cdkBuilder.triggerEvents(_triggerEvents)
    return cdkBuilder.build()
  }
}
