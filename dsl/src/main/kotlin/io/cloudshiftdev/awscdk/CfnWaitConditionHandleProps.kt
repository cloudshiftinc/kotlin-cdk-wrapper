package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface CfnWaitConditionHandleProps {
  /**
   * A builder for [CfnWaitConditionHandleProps]
   */
  @CdkDslMarker
  public interface Builder

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnWaitConditionHandleProps.Builder =
        software.amazon.awscdk.CfnWaitConditionHandleProps.builder()

    public fun build(): software.amazon.awscdk.CfnWaitConditionHandleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnWaitConditionHandleProps,
  ) : CdkObject(cdkObject), CfnWaitConditionHandleProps

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWaitConditionHandleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnWaitConditionHandleProps):
        CfnWaitConditionHandleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWaitConditionHandleProps):
        software.amazon.awscdk.CfnWaitConditionHandleProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnWaitConditionHandleProps
  }
}
