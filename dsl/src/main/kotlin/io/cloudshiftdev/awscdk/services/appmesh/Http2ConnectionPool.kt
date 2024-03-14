package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit

public interface Http2ConnectionPool {
  public fun maxRequests(): Number

  public interface Builder {
    public fun maxRequests(maxRequests: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.Http2ConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.Http2ConnectionPool.builder()

    public override fun maxRequests(maxRequests: Number) {
      cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.Http2ConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.Http2ConnectionPool,
  ) : Http2ConnectionPool {
    public override fun maxRequests(): Number = unwrap(this).getMaxRequests()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Http2ConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Http2ConnectionPool):
        Http2ConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Http2ConnectionPool):
        software.amazon.awscdk.services.appmesh.Http2ConnectionPool = (wrapped as Wrapper).cdkObject
  }
}
