@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface HttpConnectionPool {
  public fun maxConnections(): Number

  public fun maxPendingRequests(): Number

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.HttpConnectionPool,
  ) : CdkObject(cdkObject), HttpConnectionPool {
    override fun maxConnections(): Number = unwrap(this).getMaxConnections()

    override fun maxPendingRequests(): Number = unwrap(this).getMaxPendingRequests()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpConnectionPool):
        HttpConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpConnectionPool):
        software.amazon.awscdk.services.appmesh.HttpConnectionPool = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.HttpConnectionPool
  }
}
