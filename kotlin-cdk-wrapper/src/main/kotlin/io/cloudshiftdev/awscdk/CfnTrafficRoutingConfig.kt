@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTrafficRoutingConfig {
  public fun timeBasedCanary(): CfnTrafficRoutingTimeBasedCanary? =
      unwrap(this).getTimeBasedCanary()?.let(CfnTrafficRoutingTimeBasedCanary::wrap)

  public fun timeBasedLinear(): CfnTrafficRoutingTimeBasedLinear? =
      unwrap(this).getTimeBasedLinear()?.let(CfnTrafficRoutingTimeBasedLinear::wrap)

  public fun type(): CfnTrafficRoutingType

  @CdkDslMarker
  public interface Builder {
    public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2f18a4c00dee6b1717fe36ccb423739ed976d7942ee012bb49626ecfa8f6d32")
    public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary.Builder.() -> Unit)

    public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4673ccdf5a8b5ba95ef4c0e7c337fca978ab5873ea1eddbdc5b40984ac4bbb70")
    public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear.Builder.() -> Unit)

    public fun type(type: CfnTrafficRoutingType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingConfig.Builder =
        software.amazon.awscdk.CfnTrafficRoutingConfig.builder()

    override fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary) {
      cdkBuilder.timeBasedCanary(timeBasedCanary.let(CfnTrafficRoutingTimeBasedCanary::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2f18a4c00dee6b1717fe36ccb423739ed976d7942ee012bb49626ecfa8f6d32")
    override
        fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary.Builder.() -> Unit):
        Unit = timeBasedCanary(CfnTrafficRoutingTimeBasedCanary(timeBasedCanary))

    override fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear) {
      cdkBuilder.timeBasedLinear(timeBasedLinear.let(CfnTrafficRoutingTimeBasedLinear::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4673ccdf5a8b5ba95ef4c0e7c337fca978ab5873ea1eddbdc5b40984ac4bbb70")
    override
        fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear.Builder.() -> Unit):
        Unit = timeBasedLinear(CfnTrafficRoutingTimeBasedLinear(timeBasedLinear))

    override fun type(type: CfnTrafficRoutingType) {
      cdkBuilder.type(type.let(CfnTrafficRoutingType::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoutingConfig,
  ) : CdkObject(cdkObject), CfnTrafficRoutingConfig {
    override fun timeBasedCanary(): CfnTrafficRoutingTimeBasedCanary? =
        unwrap(this).getTimeBasedCanary()?.let(CfnTrafficRoutingTimeBasedCanary::wrap)

    override fun timeBasedLinear(): CfnTrafficRoutingTimeBasedLinear? =
        unwrap(this).getTimeBasedLinear()?.let(CfnTrafficRoutingTimeBasedLinear::wrap)

    override fun type(): CfnTrafficRoutingType =
        unwrap(this).getType().let(CfnTrafficRoutingType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingConfig):
        CfnTrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficRoutingConfig):
        software.amazon.awscdk.CfnTrafficRoutingConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnTrafficRoutingConfig
  }
}
