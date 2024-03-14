package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit

public interface TcpConnectionPool {
  public fun maxConnections(): Number

  public interface Builder {
    public fun maxConnections(maxConnections: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.TcpConnectionPool.builder()

    public override fun maxConnections(maxConnections: Number) {
      cdkBuilder.maxConnections(maxConnections)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TcpConnectionPool,
  ) : TcpConnectionPool {
    public override fun maxConnections(): Number = unwrap(this).getMaxConnections()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TcpConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpConnectionPool):
        TcpConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpConnectionPool):
        software.amazon.awscdk.services.appmesh.TcpConnectionPool = (wrapped as Wrapper).cdkObject
  }
}
