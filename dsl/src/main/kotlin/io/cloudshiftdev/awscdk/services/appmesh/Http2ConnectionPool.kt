package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface Http2ConnectionPool {
  /**
   * The maximum requests in the pool.
   *
   * Default: - none
   */
  public fun maxRequests(): Number

  /**
   * A builder for [Http2ConnectionPool]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxRequests The maximum requests in the pool. 
     */
    public fun maxRequests(maxRequests: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.Http2ConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.Http2ConnectionPool.builder()

    /**
     * @param maxRequests The maximum requests in the pool. 
     */
    override fun maxRequests(maxRequests: Number) {
      cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.Http2ConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.Http2ConnectionPool,
  ) : CdkObject(cdkObject), Http2ConnectionPool {
    /**
     * The maximum requests in the pool.
     *
     * Default: - none
     */
    override fun maxRequests(): Number = unwrap(this).getMaxRequests()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Http2ConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Http2ConnectionPool):
        Http2ConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Http2ConnectionPool):
        software.amazon.awscdk.services.appmesh.Http2ConnectionPool = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.Http2ConnectionPool
  }
}
