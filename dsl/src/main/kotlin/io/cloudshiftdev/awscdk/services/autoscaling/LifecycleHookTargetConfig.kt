package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig,
  ) : LifecycleHookTargetConfig {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleHookTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig):
        LifecycleHookTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LifecycleHookTargetConfig):
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig = (wrapped as
        Wrapper).cdkObject
  }
}
