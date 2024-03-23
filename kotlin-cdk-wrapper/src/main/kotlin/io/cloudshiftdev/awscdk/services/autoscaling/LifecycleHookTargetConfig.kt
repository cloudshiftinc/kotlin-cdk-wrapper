@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Result of binding a lifecycle hook to a target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * LifecycleHookTargetConfig lifecycleHookTargetConfig = LifecycleHookTargetConfig.builder()
 * .createdRole(role)
 * .notificationTargetArn("notificationTargetArn")
 * .build();
 * ```
 */
public interface LifecycleHookTargetConfig {
  /**
   * The IRole that was used to bind the lifecycle hook to the target.
   */
  public fun createdRole(): IRole

  /**
   * The targetArn that the lifecycle hook was bound to.
   */
  public fun notificationTargetArn(): String

  /**
   * A builder for [LifecycleHookTargetConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createdRole The IRole that was used to bind the lifecycle hook to the target. 
     */
    public fun createdRole(createdRole: IRole)

    /**
     * @param notificationTargetArn The targetArn that the lifecycle hook was bound to. 
     */
    public fun notificationTargetArn(notificationTargetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig.Builder =
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig.builder()

    /**
     * @param createdRole The IRole that was used to bind the lifecycle hook to the target. 
     */
    override fun createdRole(createdRole: IRole) {
      cdkBuilder.createdRole(createdRole.let(IRole::unwrap))
    }

    /**
     * @param notificationTargetArn The targetArn that the lifecycle hook was bound to. 
     */
    override fun notificationTargetArn(notificationTargetArn: String) {
      cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig,
  ) : CdkObject(cdkObject), LifecycleHookTargetConfig {
    /**
     * The IRole that was used to bind the lifecycle hook to the target.
     */
    override fun createdRole(): IRole = unwrap(this).getCreatedRole().let(IRole::wrap)

    /**
     * The targetArn that the lifecycle hook was bound to.
     */
    override fun notificationTargetArn(): String = unwrap(this).getNotificationTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleHookTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig):
        LifecycleHookTargetConfig = CdkObjectWrappers.wrap(cdkObject) as? LifecycleHookTargetConfig
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LifecycleHookTargetConfig):
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
  }
}
