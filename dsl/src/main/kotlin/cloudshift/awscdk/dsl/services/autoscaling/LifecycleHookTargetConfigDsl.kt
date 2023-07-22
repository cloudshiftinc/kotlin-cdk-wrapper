@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
import software.amazon.awscdk.services.iam.IRole

/**
 * Result of binding a lifecycle hook to a target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * LifecycleHookTargetConfig lifecycleHookTargetConfig = LifecycleHookTargetConfig.builder()
 * .createdRole(role)
 * .notificationTargetArn("notificationTargetArn")
 * .build();
 * ```
 */
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
