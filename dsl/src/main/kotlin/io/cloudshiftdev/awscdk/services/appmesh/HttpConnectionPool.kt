package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface HttpConnectionPool {
  /**
   * The maximum connections in the pool.
   *
   * Default: - none
   */
  public fun maxConnections(): Number

  /**
   * The maximum pending requests in the pool.
   *
   * Default: - none
   */
  public fun maxPendingRequests(): Number

  /**
   * A builder for [HttpConnectionPool]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxConnections The maximum connections in the pool. 
     */
    public fun maxConnections(maxConnections: Number)

    /**
     * @param maxPendingRequests The maximum pending requests in the pool. 
     */
    public fun maxPendingRequests(maxPendingRequests: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.HttpConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.HttpConnectionPool.builder()

    /**
     * @param maxConnections The maximum connections in the pool. 
     */
    override fun maxConnections(maxConnections: Number) {
      cdkBuilder.maxConnections(maxConnections)
    }

    /**
     * @param maxPendingRequests The maximum pending requests in the pool. 
     */
    override fun maxPendingRequests(maxPendingRequests: Number) {
      cdkBuilder.maxPendingRequests(maxPendingRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.HttpConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpConnectionPool,
  ) : HttpConnectionPool {
    /**
     * The maximum connections in the pool.
     *
     * Default: - none
     */
    override fun maxConnections(): Number = unwrap(this).getMaxConnections()

    /**
     * The maximum pending requests in the pool.
     *
     * Default: - none
     */
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
