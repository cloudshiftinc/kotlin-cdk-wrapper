@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.BasicLifecycleHookProps
import software.amazon.awscdk.services.autoscaling.DefaultResult
import software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
import software.amazon.awscdk.services.autoscaling.LifecycleTransition
import software.amazon.awscdk.services.iam.IRole

/**
 * Basic properties for a lifecycle hook.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.iam.*;
 * ILifecycleHookTarget lifecycleHookTarget;
 * Role role;
 * BasicLifecycleHookProps basicLifecycleHookProps = BasicLifecycleHookProps.builder()
 * .lifecycleTransition(LifecycleTransition.INSTANCE_LAUNCHING)
 * // the properties below are optional
 * .defaultResult(DefaultResult.CONTINUE)
 * .heartbeatTimeout(Duration.minutes(30))
 * .lifecycleHookName("lifecycleHookName")
 * .notificationMetadata("notificationMetadata")
 * .notificationTarget(lifecycleHookTarget)
 * .role(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class BasicLifecycleHookPropsDsl {
  private val cdkBuilder: BasicLifecycleHookProps.Builder = BasicLifecycleHookProps.builder()

  /**
   * @param defaultResult The action the Auto Scaling group takes when the lifecycle hook timeout
   * elapses or if an unexpected failure occurs.
   */
  public fun defaultResult(defaultResult: DefaultResult) {
    cdkBuilder.defaultResult(defaultResult)
  }

  /**
   * @param heartbeatTimeout Maximum time between calls to RecordLifecycleActionHeartbeat for the
   * hook.
   * If the lifecycle hook times out, perform the action in DefaultResult.
   */
  public fun heartbeatTimeout(heartbeatTimeout: Duration) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  /**
   * @param lifecycleHookName Name of the lifecycle hook.
   */
  public fun lifecycleHookName(lifecycleHookName: String) {
    cdkBuilder.lifecycleHookName(lifecycleHookName)
  }

  /**
   * @param lifecycleTransition The state of the Amazon EC2 instance to which you want to attach the
   * lifecycle hook. 
   */
  public fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
    cdkBuilder.lifecycleTransition(lifecycleTransition)
  }

  /**
   * @param notificationMetadata Additional data to pass to the lifecycle hook target.
   */
  public fun notificationMetadata(notificationMetadata: String) {
    cdkBuilder.notificationMetadata(notificationMetadata)
  }

  /**
   * @param notificationTarget The target of the lifecycle hook.
   */
  public fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
    cdkBuilder.notificationTarget(notificationTarget)
  }

  /**
   * @param role The role that allows publishing to the notification target.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): BasicLifecycleHookProps = cdkBuilder.build()
}
