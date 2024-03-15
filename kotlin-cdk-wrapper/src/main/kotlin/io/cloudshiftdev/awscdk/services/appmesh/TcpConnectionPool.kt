@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Connection pool properties for TCP listeners.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * TcpConnectionPool tcpConnectionPool = TcpConnectionPool.builder()
 * .maxConnections(123)
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TcpConnectionPool,
  ) : CdkObject(cdkObject), TcpConnectionPool {
    /**
     * The maximum connections in the pool.
     *
     * Default: - none
     */
    override fun maxConnections(): Number = unwrap(this).getMaxConnections()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TcpConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpConnectionPool):
        TcpConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpConnectionPool):
        software.amazon.awscdk.services.appmesh.TcpConnectionPool = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.TcpConnectionPool
  }
}
