@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface CanaryTrafficRoutingConfig {
  public fun canaryInterval(): Number

  public fun canaryPercentage(): Number

  @CdkDslMarker
  public interface Builder {
    public fun canaryInterval(canaryInterval: Number)

    public fun canaryPercentage(canaryPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig.Builder =
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig.builder()

    override fun canaryInterval(canaryInterval: Number) {
      cdkBuilder.canaryInterval(canaryInterval)
    }

    override fun canaryPercentage(canaryPercentage: Number) {
      cdkBuilder.canaryPercentage(canaryPercentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig,
  ) : CdkObject(cdkObject), CanaryTrafficRoutingConfig {
    override fun canaryInterval(): Number = unwrap(this).getCanaryInterval()

    override fun canaryPercentage(): Number = unwrap(this).getCanaryPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CanaryTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig):
        CanaryTrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CanaryTrafficRoutingConfig):
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig
  }
}
