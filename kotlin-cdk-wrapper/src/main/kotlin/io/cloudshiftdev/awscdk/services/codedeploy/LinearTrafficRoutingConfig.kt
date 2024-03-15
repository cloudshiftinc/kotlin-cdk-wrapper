@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface LinearTrafficRoutingConfig {
  public fun linearInterval(): Number

  public fun linearPercentage(): Number

  @CdkDslMarker
  public interface Builder {
    public fun linearInterval(linearInterval: Number)

    public fun linearPercentage(linearPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig.Builder =
        software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig.builder()

    override fun linearInterval(linearInterval: Number) {
      cdkBuilder.linearInterval(linearInterval)
    }

    override fun linearPercentage(linearPercentage: Number) {
      cdkBuilder.linearPercentage(linearPercentage)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig,
  ) : CdkObject(cdkObject), LinearTrafficRoutingConfig {
    override fun linearInterval(): Number = unwrap(this).getLinearInterval()

    override fun linearPercentage(): Number = unwrap(this).getLinearPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LinearTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig):
        LinearTrafficRoutingConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinearTrafficRoutingConfig):
        software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig
  }
}
