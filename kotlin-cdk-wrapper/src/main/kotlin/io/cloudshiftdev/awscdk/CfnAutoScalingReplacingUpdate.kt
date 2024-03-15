@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface CfnAutoScalingReplacingUpdate {
  public fun willReplace(): Boolean? = unwrap(this).getWillReplace()

  @CdkDslMarker
  public interface Builder {
    public fun willReplace(willReplace: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingReplacingUpdate.Builder =
        software.amazon.awscdk.CfnAutoScalingReplacingUpdate.builder()

    override fun willReplace(willReplace: Boolean) {
      cdkBuilder.willReplace(willReplace)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingReplacingUpdate = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnAutoScalingReplacingUpdate,
  ) : CdkObject(cdkObject), CfnAutoScalingReplacingUpdate {
    override fun willReplace(): Boolean? = unwrap(this).getWillReplace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingReplacingUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingReplacingUpdate):
        CfnAutoScalingReplacingUpdate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingReplacingUpdate):
        software.amazon.awscdk.CfnAutoScalingReplacingUpdate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnAutoScalingReplacingUpdate
  }
}
