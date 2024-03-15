@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnWarmPoolProps {
  public fun autoScalingGroupName(): String

  public fun instanceReusePolicy(): Any? = unwrap(this).getInstanceReusePolicy()

  public fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

  public fun minSize(): Number? = unwrap(this).getMinSize()

  public fun poolState(): String? = unwrap(this).getPoolState()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroupName(autoScalingGroupName: String)

    public fun instanceReusePolicy(instanceReusePolicy: IResolvable)

    public fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6bd20e8652b52081e4492fc4dc86ded7d930526eadd04129a45fc8495b9aed")
    public
        fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty.Builder.() -> Unit)

    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number)

    public fun minSize(minSize: Number)

    public fun poolState(poolState: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps.builder()

    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    override fun instanceReusePolicy(instanceReusePolicy: IResolvable) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(IResolvable::unwrap))
    }

    override fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(CfnWarmPool.InstanceReusePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6bd20e8652b52081e4492fc4dc86ded7d930526eadd04129a45fc8495b9aed")
    override
        fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty.Builder.() -> Unit):
        Unit = instanceReusePolicy(CfnWarmPool.InstanceReusePolicyProperty(instanceReusePolicy))

    override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun poolState(poolState: String) {
      cdkBuilder.poolState(poolState)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps,
  ) : CdkObject(cdkObject), CfnWarmPoolProps {
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    override fun instanceReusePolicy(): Any? = unwrap(this).getInstanceReusePolicy()

    override fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

    override fun minSize(): Number? = unwrap(this).getMinSize()

    override fun poolState(): String? = unwrap(this).getPoolState()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWarmPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps):
        CfnWarmPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWarmPoolProps):
        software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps
  }
}
