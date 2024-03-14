package io.cloudshiftdev.awscdk

import kotlin.Unit

public interface SizeConversionOptions {
  public fun rounding(): SizeRoundingBehavior? =
      unwrap(this).getRounding()?.let(SizeRoundingBehavior::wrap)

  public interface Builder {
    public fun rounding(rounding: SizeRoundingBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.SizeConversionOptions.Builder =
        software.amazon.awscdk.SizeConversionOptions.builder()

    override fun rounding(rounding: SizeRoundingBehavior) {
      cdkBuilder.rounding(rounding.let(SizeRoundingBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.SizeConversionOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.SizeConversionOptions,
  ) : SizeConversionOptions {
    override fun rounding(): SizeRoundingBehavior? =
        unwrap(this).getRounding()?.let(SizeRoundingBehavior::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SizeConversionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SizeConversionOptions):
        SizeConversionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SizeConversionOptions):
        software.amazon.awscdk.SizeConversionOptions = (wrapped as Wrapper).cdkObject
  }
}
