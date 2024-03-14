package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface GrpcConnectionPool {
  /**
   * The maximum requests in the pool.
   *
   * Default: - none
   */
  public fun maxRequests(): Number

  /**
   * A builder for [GrpcConnectionPool]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxRequests The maximum requests in the pool. 
     */
    public fun maxRequests(maxRequests: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool.builder()

    /**
     * @param maxRequests The maximum requests in the pool. 
     */
    override fun maxRequests(maxRequests: Number) {
      cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool,
  ) : CdkObject(cdkObject), GrpcConnectionPool {
    /**
     * The maximum requests in the pool.
     *
     * Default: - none
     */
    override fun maxRequests(): Number = unwrap(this).getMaxRequests()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool):
        GrpcConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcConnectionPool):
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GrpcConnectionPool
  }
}
