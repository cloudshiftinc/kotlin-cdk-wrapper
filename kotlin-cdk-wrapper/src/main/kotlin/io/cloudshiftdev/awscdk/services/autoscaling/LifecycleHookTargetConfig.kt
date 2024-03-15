@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface LifecycleHookTargetConfig {
  public fun createdRole(): IRole

  public fun notificationTargetArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun createdRole(createdRole: IRole)

    public fun notificationTargetArn(notificationTargetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig.Builder =
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig.builder()

    override fun createdRole(createdRole: IRole) {
      cdkBuilder.createdRole(createdRole.let(IRole::unwrap))
    }

    override fun notificationTargetArn(notificationTargetArn: String) {
      cdkBuilder.notificationTargetArn(notificationTargetArn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig,
  ) : CdkObject(cdkObject), LifecycleHookTargetConfig {
    override fun createdRole(): IRole = unwrap(this).getCreatedRole().let(IRole::wrap)

    override fun notificationTargetArn(): String = unwrap(this).getNotificationTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleHookTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig):
        LifecycleHookTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LifecycleHookTargetConfig):
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.LifecycleHookTargetConfig
  }
}
