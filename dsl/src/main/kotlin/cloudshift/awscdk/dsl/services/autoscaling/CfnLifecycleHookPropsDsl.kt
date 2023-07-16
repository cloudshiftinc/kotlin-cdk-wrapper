@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps

@CdkDslMarker
public class CfnLifecycleHookPropsDsl {
  private val cdkBuilder: CfnLifecycleHookProps.Builder = CfnLifecycleHookProps.builder()

  public fun autoScalingGroupName(autoScalingGroupName: String) {
    cdkBuilder.autoScalingGroupName(autoScalingGroupName)
  }

  public fun defaultResult(defaultResult: String) {
    cdkBuilder.defaultResult(defaultResult)
  }

  public fun heartbeatTimeout(heartbeatTimeout: Number) {
    cdkBuilder.heartbeatTimeout(heartbeatTimeout)
  }

  public fun lifecycleHookName(lifecycleHookName: String) {
    cdkBuilder.lifecycleHookName(lifecycleHookName)
  }

  public fun lifecycleTransition(lifecycleTransition: String) {
    cdkBuilder.lifecycleTransition(lifecycleTransition)
  }

  public fun notificationMetadata(notificationMetadata: String) {
    cdkBuilder.notificationMetadata(notificationMetadata)
  }

  public fun notificationTargetArn(notificationTargetArn: String) {
    cdkBuilder.notificationTargetArn(notificationTargetArn)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnLifecycleHookProps = cdkBuilder.build()
}
