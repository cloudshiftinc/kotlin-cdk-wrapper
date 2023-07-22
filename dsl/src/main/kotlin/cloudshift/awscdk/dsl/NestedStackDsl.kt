@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.NestedStack
import software.amazon.awscdk.RemovalPolicy
import software.constructs.Construct

@CdkDslMarker
public class NestedStackDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: NestedStack.Builder = NestedStack.Builder.create(scope, id)

  private val _notificationArns: MutableList<String> = mutableListOf()

  /**
   * A description of the stack.
   *
   * Default: - No description.
   *
   * @param description A description of the stack. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The Simple Notification Service (SNS) topics to publish stack related events.
   *
   * Default: - notifications are not sent for this stack.
   *
   * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
   * events. 
   */
  public fun notificationArns(vararg notificationArns: String) {
    _notificationArns.addAll(listOf(*notificationArns))
  }

  /**
   * The Simple Notification Service (SNS) topics to publish stack related events.
   *
   * Default: - notifications are not sent for this stack.
   *
   * @param notificationArns The Simple Notification Service (SNS) topics to publish stack related
   * events. 
   */
  public fun notificationArns(notificationArns: Collection<String>) {
    _notificationArns.addAll(notificationArns)
  }

  /**
   * The set value pairs that represent the parameters passed to CloudFormation when this nested
   * stack is created.
   *
   * Each parameter has a name corresponding
   * to a parameter defined in the embedded template and a value representing
   * the value that you want to set for the parameter.
   *
   * The nested stack construct will automatically synthesize parameters in order
   * to bind references from the parent stack(s) into the nested stack.
   *
   * Default: - no user-defined parameters are passed to the nested stack
   *
   * @param parameters The set value pairs that represent the parameters passed to CloudFormation
   * when this nested stack is created. 
   */
  public fun parameters(parameters: Map<String, String>) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * Policy to apply when the nested stack is removed.
   *
   * The default is `Destroy`, because all Removal Policies of resources inside the
   * Nested Stack should already have been set correctly. You normally should
   * not need to set this value.
   *
   * Default: RemovalPolicy.DESTROY
   *
   * @param removalPolicy Policy to apply when the nested stack is removed. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * The length of time that CloudFormation waits for the nested stack to reach the CREATE_COMPLETE
   * state.
   *
   * When CloudFormation detects that the nested stack has reached the
   * CREATE_COMPLETE state, it marks the nested stack resource as
   * CREATE_COMPLETE in the parent stack and resumes creating the parent stack.
   * If the timeout period expires before the nested stack reaches
   * CREATE_COMPLETE, CloudFormation marks the nested stack as failed and rolls
   * back both the nested stack and parent stack.
   *
   * Default: - no timeout
   *
   * @param timeout The length of time that CloudFormation waits for the nested stack to reach the
   * CREATE_COMPLETE state. 
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): NestedStack {
    if(_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
    return cdkBuilder.build()
  }
}
