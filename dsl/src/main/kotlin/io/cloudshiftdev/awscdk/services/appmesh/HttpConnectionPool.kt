package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit

public interface HttpConnectionPool {
  public fun maxConnections(): Number

  public fun maxPendingRequests(): Number

  public interface Builder {
    public fun maxConnections(maxConnections: Number)

    public fun maxPendingRequests(maxPendingRequests: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.HttpConnectionPool.builder()

    override fun maxConnections(maxConnections: Number) {
      cdkBuilder.maxConnections(maxConnections)
    }

    override fun maxPendingRequests(maxPendingRequests: Number) {
      cdkBuilder.maxPendingRequests(maxPendingRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpConnectionPool,
  ) : HttpConnectionPool {
    override fun maxConnections(): Number = unwrap(this).getMaxConnections()

    override fun maxPendingRequests(): Number = unwrap(this).getMaxPendingRequests()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpConnectionPool):
        HttpConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpConnectionPool):
        software.amazon.awscdk.services.appmesh.HttpConnectionPool = (wrapped as Wrapper).cdkObject
  }
}
