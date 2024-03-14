package io.cloudshiftdev.awscdk.services.autoscaling

import kotlin.Number
import kotlin.Unit

public interface RenderSignalsOptions {
  public fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public interface Builder {
    public fun desiredCapacity(desiredCapacity: Number)

    public fun minCapacity(minCapacity: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.RenderSignalsOptions.Builder
        = software.amazon.awscdk.services.autoscaling.RenderSignalsOptions.builder()

    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.RenderSignalsOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.RenderSignalsOptions,
  ) : RenderSignalsOptions {
    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RenderSignalsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.RenderSignalsOptions):
        RenderSignalsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RenderSignalsOptions):
        software.amazon.awscdk.services.autoscaling.RenderSignalsOptions = (wrapped as
        Wrapper).cdkObject
  }
}
