package io.cloudshiftdev.awscdk.services.lambda

import kotlin.Unit

public interface DestinationOptions {
  public fun type(): DestinationType

  public interface Builder {
    public fun type(type: DestinationType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DestinationOptions.Builder =
        software.amazon.awscdk.services.lambda.DestinationOptions.builder()

    override fun type(type: DestinationType) {
      cdkBuilder.type(type.let(DestinationType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.DestinationOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.DestinationOptions,
  ) : DestinationOptions {
    override fun type(): DestinationType = unwrap(this).getType().let(DestinationType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DestinationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DestinationOptions):
        DestinationOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DestinationOptions):
        software.amazon.awscdk.services.lambda.DestinationOptions = (wrapped as Wrapper).cdkObject
  }
}
