package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface TcpTimeout {
  public fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)

  public interface Builder {
    public fun idle(idle: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpTimeout.Builder =
        software.amazon.awscdk.services.appmesh.TcpTimeout.builder()

    public override fun idle(idle: Duration) {
      cdkBuilder.idle(idle.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpTimeout = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TcpTimeout,
  ) : TcpTimeout {
    public override fun idle(): Duration? = unwrap(this).getIdle()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TcpTimeout {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpTimeout): TcpTimeout =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpTimeout): software.amazon.awscdk.services.appmesh.TcpTimeout =
        (wrapped as Wrapper).cdkObject
  }
}
