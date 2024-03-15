@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface RequestCountScalingProps : BaseTargetTrackingProps {
  public fun requestsPerTarget(): Number

  public fun targetGroup(): ApplicationTargetGroup

  @CdkDslMarker
  public interface Builder {
    public fun disableScaleIn(disableScaleIn: Boolean)

    public fun policyName(policyName: String)

    public fun requestsPerTarget(requestsPerTarget: Number)

    public fun scaleInCooldown(scaleInCooldown: Duration)

    public fun scaleOutCooldown(scaleOutCooldown: Duration)

    public fun targetGroup(targetGroup: ApplicationTargetGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RequestCountScalingProps.Builder =
        software.amazon.awscdk.services.ecs.RequestCountScalingProps.builder()

    override fun disableScaleIn(disableScaleIn: Boolean) {
      cdkBuilder.disableScaleIn(disableScaleIn)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun requestsPerTarget(requestsPerTarget: Number) {
      cdkBuilder.requestsPerTarget(requestsPerTarget)
    }

    override fun scaleInCooldown(scaleInCooldown: Duration) {
      cdkBuilder.scaleInCooldown(scaleInCooldown.let(Duration::unwrap))
    }

    override fun scaleOutCooldown(scaleOutCooldown: Duration) {
      cdkBuilder.scaleOutCooldown(scaleOutCooldown.let(Duration::unwrap))
    }

    override fun targetGroup(targetGroup: ApplicationTargetGroup) {
      cdkBuilder.targetGroup(targetGroup.let(ApplicationTargetGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RequestCountScalingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.RequestCountScalingProps,
  ) : CdkObject(cdkObject), RequestCountScalingProps {
    override fun disableScaleIn(): Boolean? = unwrap(this).getDisableScaleIn()

    override fun policyName(): String? = unwrap(this).getPolicyName()

    override fun requestsPerTarget(): Number = unwrap(this).getRequestsPerTarget()

    override fun scaleInCooldown(): Duration? =
        unwrap(this).getScaleInCooldown()?.let(Duration::wrap)

    override fun scaleOutCooldown(): Duration? =
        unwrap(this).getScaleOutCooldown()?.let(Duration::wrap)

    override fun targetGroup(): ApplicationTargetGroup =
        unwrap(this).getTargetGroup().let(ApplicationTargetGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestCountScalingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RequestCountScalingProps):
        RequestCountScalingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestCountScalingProps):
        software.amazon.awscdk.services.ecs.RequestCountScalingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.RequestCountScalingProps
  }
}
