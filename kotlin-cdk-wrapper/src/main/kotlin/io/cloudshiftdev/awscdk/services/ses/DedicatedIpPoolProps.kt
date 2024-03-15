@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DedicatedIpPoolProps {
  public fun dedicatedIpPoolName(): String? = unwrap(this).getDedicatedIpPoolName()

  public fun scalingMode(): ScalingMode? = unwrap(this).getScalingMode()?.let(ScalingMode::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String)

    public fun scalingMode(scalingMode: ScalingMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DedicatedIpPoolProps.Builder =
        software.amazon.awscdk.services.ses.DedicatedIpPoolProps.builder()

    override fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
      cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    override fun scalingMode(scalingMode: ScalingMode) {
      cdkBuilder.scalingMode(scalingMode.let(ScalingMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DedicatedIpPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPoolProps,
  ) : CdkObject(cdkObject), DedicatedIpPoolProps {
    override fun dedicatedIpPoolName(): String? = unwrap(this).getDedicatedIpPoolName()

    override fun scalingMode(): ScalingMode? = unwrap(this).getScalingMode()?.let(ScalingMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DedicatedIpPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPoolProps):
        DedicatedIpPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DedicatedIpPoolProps):
        software.amazon.awscdk.services.ses.DedicatedIpPoolProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.DedicatedIpPoolProps
  }
}
