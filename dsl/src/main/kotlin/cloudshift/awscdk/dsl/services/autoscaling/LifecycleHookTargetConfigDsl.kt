@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class LifecycleHookTargetConfigDsl {
  private val cdkBuilder: LifecycleHookTargetConfig.Builder = LifecycleHookTargetConfig.builder()

  /**
   * @param createdRole The IRole that was used to bind the lifecycle hook to the target. 
   */
  public fun createdRole(createdRole: IRole) {
    cdkBuilder.createdRole(createdRole)
  }

  /**
   * @param notificationTargetArn The targetArn that the lifecycle hook was bound to. 
   */
  public fun notificationTargetArn(notificationTargetArn: String) {
    cdkBuilder.notificationTargetArn(notificationTargetArn)
  }

  public fun build(): LifecycleHookTargetConfig = cdkBuilder.build()
}
