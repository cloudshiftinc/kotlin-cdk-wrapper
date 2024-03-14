package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.Unit

public interface CfnAutoScalingReplacingUpdate {
  public fun willReplace(): Boolean? = unwrap(this).getWillReplace()

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.CfnAutoScalingReplacingUpdate,
  ) : CfnAutoScalingReplacingUpdate {
    override fun willReplace(): Boolean? = unwrap(this).getWillReplace()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingReplacingUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingReplacingUpdate):
        CfnAutoScalingReplacingUpdate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingReplacingUpdate):
        software.amazon.awscdk.CfnAutoScalingReplacingUpdate = (wrapped as Wrapper).cdkObject
  }
}
