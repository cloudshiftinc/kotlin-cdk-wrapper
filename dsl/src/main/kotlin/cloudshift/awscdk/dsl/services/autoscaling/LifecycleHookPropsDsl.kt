@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.DefaultResult
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.ILifecycleHookTarget
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps
import software.amazon.awscdk.services.autoscaling.LifecycleTransition
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class LifecycleHookPropsDsl {
  private val cdkBuilder: LifecycleHookProps.Builder = LifecycleHookProps.builder()

  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

  public fun defaultResult(defaultResult: DefaultResult) {
    cdkBuilder.defaultResult(defaultResult)
  }

  public fun heartbeatTimeout(heartbeatTimeout: Duration) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  public fun lifecycleHookName(lifecycleHookName: String) {
    cdkBuilder.lifecycleHookName(lifecycleHookName)
  }

  public fun lifecycleTransition(lifecycleTransition: LifecycleTransition) {
    cdkBuilder.lifecycleTransition(lifecycleTransition)
  }

  public fun notificationMetadata(notificationMetadata: String) {
    cdkBuilder.notificationMetadata(notificationMetadata)
  }

  public fun notificationTarget(notificationTarget: ILifecycleHookTarget) {
    cdkBuilder.notificationTarget(notificationTarget)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): LifecycleHookProps = cdkBuilder.build()
}
