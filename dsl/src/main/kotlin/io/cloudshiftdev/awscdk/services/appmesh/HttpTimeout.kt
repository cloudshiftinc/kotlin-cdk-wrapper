package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface HttpTimeout {
  public fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

  public fun perRequest(): Duration? = unwrap(this).getPerRequest()?.let(Duration::wrap)

  public interface Builder {
    public fun idle(idle: Duration)

    public fun perRequest(perRequest: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpTimeout.Builder =
        software.amazon.awscdk.services.appmesh.HttpTimeout.builder()

    override fun idle(idle: Duration) {
      cdkBuilder.idle(idle.let(Duration::unwrap))
    }

    override fun perRequest(perRequest: Duration) {
      cdkBuilder.perRequest(perRequest.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpTimeout = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpTimeout,
  ) : HttpTimeout {
    override fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

    override fun perRequest(): Duration? = unwrap(this).getPerRequest()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpTimeout {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpTimeout): HttpTimeout =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpTimeout): software.amazon.awscdk.services.appmesh.HttpTimeout =
        (wrapped as Wrapper).cdkObject
  }
}
