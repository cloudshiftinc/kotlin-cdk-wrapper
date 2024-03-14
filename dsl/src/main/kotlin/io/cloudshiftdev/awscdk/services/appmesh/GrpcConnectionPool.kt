package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Unit

public interface GrpcConnectionPool {
  public fun maxRequests(): Number

  public interface Builder {
    public fun maxRequests(maxRequests: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool.builder()

    public override fun maxRequests(maxRequests: Number) {
      cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool,
  ) : GrpcConnectionPool {
    public override fun maxRequests(): Number = unwrap(this).getMaxRequests()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool):
        GrpcConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcConnectionPool):
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool = (wrapped as Wrapper).cdkObject
  }
}
