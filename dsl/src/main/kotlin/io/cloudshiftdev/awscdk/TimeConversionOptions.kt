package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.Unit

public interface TimeConversionOptions {
  public fun integral(): Boolean? = unwrap(this).getIntegral()

  public interface Builder {
    public fun integral(integral: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.TimeConversionOptions.Builder =
        software.amazon.awscdk.TimeConversionOptions.builder()

    override fun integral(integral: Boolean) {
      cdkBuilder.integral(integral)
    }

    public fun build(): software.amazon.awscdk.TimeConversionOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.TimeConversionOptions,
  ) : TimeConversionOptions {
    override fun integral(): Boolean? = unwrap(this).getIntegral()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TimeConversionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TimeConversionOptions):
        TimeConversionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TimeConversionOptions):
        software.amazon.awscdk.TimeConversionOptions = (wrapped as Wrapper).cdkObject
  }
}
