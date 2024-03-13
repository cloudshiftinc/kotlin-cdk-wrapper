package io.cloudshiftdev.awscdk.services.logs

import kotlin.String
import kotlin.Unit

public interface StreamOptions {
  public fun logStreamName(): String? = unwrap(this).getLogStreamName()

  public interface Builder {
    public fun logStreamName(logStreamName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.StreamOptions.Builder =
        software.amazon.awscdk.services.logs.StreamOptions.builder()

    public override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): software.amazon.awscdk.services.logs.StreamOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.StreamOptions,
  ) : StreamOptions {
    public override fun logStreamName(): String? = unwrap(this).getLogStreamName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StreamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.StreamOptions): StreamOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamOptions): software.amazon.awscdk.services.logs.StreamOptions
        = (wrapped as Wrapper).cdkObject
  }
}
