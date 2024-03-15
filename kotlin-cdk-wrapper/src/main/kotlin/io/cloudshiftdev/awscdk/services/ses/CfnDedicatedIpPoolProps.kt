@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDedicatedIpPoolProps {
  public fun poolName(): String? = unwrap(this).getPoolName()

  public fun scalingMode(): String? = unwrap(this).getScalingMode()

  @CdkDslMarker
  public interface Builder {
    public fun poolName(poolName: String)

    public fun scalingMode(scalingMode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps.Builder =
        software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps.builder()

    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    override fun scalingMode(scalingMode: String) {
      cdkBuilder.scalingMode(scalingMode)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps,
  ) : CdkObject(cdkObject), CfnDedicatedIpPoolProps {
    override fun poolName(): String? = unwrap(this).getPoolName()

    override fun scalingMode(): String? = unwrap(this).getScalingMode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDedicatedIpPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps):
        CfnDedicatedIpPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDedicatedIpPoolProps):
        software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps
  }
}
