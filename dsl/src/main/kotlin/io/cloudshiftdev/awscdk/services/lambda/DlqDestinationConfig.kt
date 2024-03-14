package io.cloudshiftdev.awscdk.services.lambda

import kotlin.String
import kotlin.Unit

public interface DlqDestinationConfig {
  public fun destination(): String

  public interface Builder {
    public fun destination(destination: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.DlqDestinationConfig.Builder =
        software.amazon.awscdk.services.lambda.DlqDestinationConfig.builder()

    public override fun destination(destination: String) {
      cdkBuilder.destination(destination)
    }

    public fun build(): software.amazon.awscdk.services.lambda.DlqDestinationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.DlqDestinationConfig,
  ) : DlqDestinationConfig {
    public override fun destination(): String = unwrap(this).getDestination()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DlqDestinationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.DlqDestinationConfig):
        DlqDestinationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DlqDestinationConfig):
        software.amazon.awscdk.services.lambda.DlqDestinationConfig = (wrapped as Wrapper).cdkObject
  }
}
