package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface TcpConnectionPool {
  /**
   * The maximum connections in the pool.
   *
   * Default: - none
   */
  public fun maxConnections(): Number

  /**
   * A builder for [TcpConnectionPool]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxConnections The maximum connections in the pool. 
     */
    public fun maxConnections(maxConnections: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.TcpConnectionPool.builder()

    /**
     * @param maxConnections The maximum connections in the pool. 
     */
    override fun maxConnections(maxConnections: Number) {
      cdkBuilder.maxConnections(maxConnections)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.TcpConnectionPool,
  ) : TcpConnectionPool {
    /**
     * The maximum connections in the pool.
     *
     * Default: - none
     */
    override fun maxConnections(): Number = unwrap(this).getMaxConnections()
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
